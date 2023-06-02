use std::{convert::TryInto, sync::Arc};

use crate::prelude::*;

pub mod trimesh;

pub struct RprSharedShape(pub SharedShape);

// each RprSharedShape instance will probably be unique, since that's the point of using Arc's.
// however the data stored inside an Arc is not unique, and that data (or at least a ptr to it)
// might be useful for a caller, to e.g. key by a shape.
#[no_mangle]
pub unsafe extern "C" fn RprSharedShape_data(this: *const RprSharedShape) -> *const () {
    Arc::as_ptr(&this.get().0 .0) as *const ()
}

#[no_mangle]
pub unsafe extern "C" fn RprSharedShape_strong_count(this: *const RprSharedShape) -> usize {
    Arc::strong_count(&this.get().0 .0)
}

#[no_mangle]
pub unsafe extern "C" fn RprSharedShape_acquire(this: *const RprSharedShape) {
    std::mem::forget(this.get().0 .0.clone())
}

#[no_mangle]
pub unsafe extern "C" fn RprSharedShape_release(this: *const RprSharedShape) {
    drop(this.read())
}

/// A segment shape.
#[repr(C)]
#[derive(Debug, Clone, Copy, bytemuck::Pod, bytemuck::Zeroable)]
pub struct RprSegment {
    /// The segment first point.
    pub a: RprVector,
    /// The segment second point.
    pub b: RprVector,
}

#[no_mangle]
pub extern "C" fn RprSharedShape_segment(segment: RprSegment) -> *mut RprSharedShape {
    leak_ptr(RprSharedShape(SharedShape(Arc::new(cast::<_, Segment>(
        segment,
    )))))
}

/// A cuboid shape.
#[repr(C)]
#[derive(Debug, Clone, Copy, bytemuck::Pod, bytemuck::Zeroable)]
pub struct RprCuboid {
    /// The half-extents of the cuboid.
    pub half_extents: RprVector,
}

#[no_mangle]
pub extern "C" fn RprSharedShape_cuboid(cuboid: RprCuboid) -> *mut RprSharedShape {
    leak_ptr(RprSharedShape(SharedShape(Arc::new(cast::<_, Cuboid>(
        cuboid,
    )))))
}

/// A triangle shape.
#[repr(C)]
#[derive(Debug, Clone, Copy, bytemuck::Pod, bytemuck::Zeroable)]
pub struct RprTriangle {
    /// The triangle first point.
    pub a: RprVector,
    /// The triangle second point.
    pub b: RprVector,
    /// The triangle third point.
    pub c: RprVector,
}

#[no_mangle]
pub extern "C" fn RprSharedShape_triangle(triangle: RprTriangle) -> *mut RprSharedShape {
    leak_ptr(RprSharedShape(SharedShape(Arc::new(cast::<_, Triangle>(
        triangle,
    )))))
}

/// A ball shape.
#[repr(C)]
#[derive(Debug, Clone, Copy, bytemuck::Pod, bytemuck::Zeroable)]
pub struct RprBall {
    /// The radius of the ball.
    pub radius: Real,
}

#[no_mangle]
pub extern "C" fn RprSharedShape_ball(ball: RprBall) -> *mut RprSharedShape {
    leak_ptr(RprSharedShape(SharedShape(Arc::new(cast::<_, Ball>(ball)))))
}

/// A capsule shape defined as a round segment.
#[repr(C)]
#[derive(Debug, Clone, Copy, bytemuck::Pod, bytemuck::Zeroable)]
pub struct RprCapsule {
    /// The axis and endpoint of the capsule.
    pub segment: RprSegment,
    /// The radius of the capsule.
    pub radius: Real,
}

#[no_mangle]
pub extern "C" fn RprSharedShape_capsule(capsule: RprCapsule) -> *mut RprSharedShape {
    leak_ptr(RprSharedShape(SharedShape(Arc::new(cast::<_, Capsule>(
        capsule,
    )))))
}

/// A cylinder shape with its principal axis aligned with the `y` axis.
#[repr(C)]
#[derive(Debug, Clone, Copy, bytemuck::Pod, bytemuck::Zeroable)]
pub struct RprCylinder {
    /// The half-height of the cylinder.
    pub half_height: Real,
    /// The radius of the cylinder.
    pub radius: Real,
}

#[no_mangle]
#[cfg(feature = "dim3")]
pub extern "C" fn RprSharedShape_cylinder(cylinder: RprCylinder) -> *mut RprSharedShape {
    leak_ptr(RprSharedShape(SharedShape(Arc::new(cast::<_, Cylinder>(
        cylinder,
    )))))
}

/// A cone shape with its principal axis aligned with the `y` axis.
#[repr(C)]
#[derive(Debug, Clone, Copy, bytemuck::Pod, bytemuck::Zeroable)]
pub struct RprCone {
    /// The half-height of the cone.
    pub half_height: Real,
    /// The base radius of the cone.
    pub radius: Real,
}

#[no_mangle]
#[cfg(feature = "dim3")]
pub extern "C" fn RprSharedShape_cone(cone: RprCone) -> *mut RprSharedShape {
    leak_ptr(RprSharedShape(SharedShape(Arc::new(cast::<_, Cone>(cone)))))
}

#[repr(C)]
pub struct RprCompoundChild {
    pub delta: RprIsometry,
    pub shape: *mut RprSharedShape,
}

/// cbindgen:ptrs-as-arrays=[[shapes_data;]]
#[no_mangle]
pub unsafe extern "C" fn RprSharedShape_compound(
    shapes_data: *const RprCompoundChild,
    shapes_len: usize,
) -> *mut RprSharedShape {
    let mut shapes: Vec<(Isometry<Real>, SharedShape)> = Vec::new();
    for i in 0..shapes_len {
        let i: isize = i.try_into().unwrap();
        let shape = shapes_data.offset(i).read();
        shapes.push((shape.delta.into_raw(), shape.shape.read().0))
    }
    leak_ptr(RprSharedShape(SharedShape::compound(shapes)))
}

/// cbindgen:ptrs-as-arrays=[[vertices_data;], [indices_data;]]
#[no_mangle]
pub unsafe extern "C" fn RprSharedShape_trimesh_with_flags(
    vertices_data: *const RprVector,
    vertices_len: usize,
    indices_data: *const u32,
    indices_len: usize,
    flags: RprTriMeshFlags,
) -> *mut RprSharedShape {
    let mut vertices: Vec<Point<Real>> = Vec::with_capacity(vertices_len);
    for i in 0..vertices_len {
        let i: isize = i.try_into().unwrap();
        let vertex = vertices_data.offset(i).read();
        vertices.push(vertex.into_point());
    }

    let mut indices: Vec<[u32; 3]> = Vec::with_capacity(indices_len);
    for i in 0..indices_len {
        let i: isize = i.try_into().unwrap();
        let index_tri = [
            indices_data.offset(i * 3).read(),
            indices_data.offset(i * 3 + 1).read(),
            indices_data.offset(i * 3 + 2).read(),
        ];
        indices.push(index_tri);
    }

    leak_ptr(RprSharedShape(SharedShape::trimesh_with_flags(
        vertices,
        indices,
        tri_mesh_flags_from(flags),
    )))
}

/// cbindgen:ptrs-as-arrays=[[vertices_data;], [indices_data;]]
#[no_mangle]
pub unsafe extern "C" fn RprSharedShape_trimesh(
    vertices_data: *const RprVector,
    vertices_len: usize,
    indices_data: *const u32,
    indices_len: usize,
) -> *mut RprSharedShape {
    let mut vertices: Vec<Point<Real>> = Vec::with_capacity(vertices_len);
    for i in 0..vertices_len {
        let i: isize = i.try_into().unwrap();
        let vertex = vertices_data.offset(i).read();
        vertices.push(vertex.into_point());
    }

    let mut indices: Vec<[u32; 3]> = Vec::with_capacity(indices_len);
    for i in 0..indices_len {
        let i: isize = i.try_into().unwrap();
        let index_tri = [
            indices_data.offset(i * 3).read(),
            indices_data.offset(i * 3 + 1).read(),
            indices_data.offset(i * 3 + 2).read(),
        ];
        indices.push(index_tri);
    }

    leak_ptr(RprSharedShape(SharedShape::trimesh(
        vertices,
        indices,
    )))
}

#[no_mangle]
pub unsafe extern "C" fn RprSharedShape_convex_decomposition(
    vertices_data: *const RprVector,
    vertices_len: usize,
    indices_data: *const u32,
    indices_len: usize, // len of slice of slices
) -> *mut RprSharedShape {
    let vertices = std::slice::from_raw_parts(vertices_data as *const Point<Real>, vertices_len);
    let indices = std::slice::from_raw_parts(indices_data as *const [u32; DIM], indices_len);
    leak_ptr(RprSharedShape(SharedShape::convex_decomposition(
        vertices, indices,
    )))
}

#[no_mangle]
pub unsafe extern "C" fn RprSharedShape_round_convex_decomposition(
    vertices_data: *const RprVector,
    vertices_len: usize,
    indices_data: *const u32,
    indices_len: usize, // len of slice of slices
    border_radius: Real,
) -> *mut RprSharedShape {
    let vertices = std::slice::from_raw_parts(vertices_data as *const Point<Real>, vertices_len);
    let indices = std::slice::from_raw_parts(indices_data as *const [u32; DIM], indices_len);
    leak_ptr(RprSharedShape(SharedShape::round_convex_decomposition(
        vertices,
        indices,
        border_radius,
    )))
}

#[no_mangle]
pub unsafe extern "C" fn RprSharedShape_convex_decomposition_with_params(
    vertices_data: *const RprVector,
    vertices_len: usize,
    indices_data: *const u32,
    indices_len: usize, // len of slice of slices
    params: *const RprVHACDParameters,
) -> *mut RprSharedShape {
    let vertices = std::slice::from_raw_parts(vertices_data as *const Point<Real>, vertices_len);
    let indices = std::slice::from_raw_parts(indices_data as *const [u32; DIM], indices_len);
    let params = &(*params).into_raw();
    leak_ptr(RprSharedShape(
        SharedShape::convex_decomposition_with_params(vertices, indices, params),
    ))
}

#[no_mangle]
pub unsafe extern "C" fn RprSharedShape_round_convex_decomposition_with_params(
    vertices_data: *const RprVector,
    vertices_len: usize,
    indices_data: *const u32,
    indices_len: usize, // len of slice of slices
    params: *const RprVHACDParameters,
    border_radius: Real,
) -> *mut RprSharedShape {
    let vertices = std::slice::from_raw_parts(vertices_data as *const Point<Real>, vertices_len);
    let indices = std::slice::from_raw_parts(indices_data as *const [u32; DIM], indices_len);
    let params = &(*params).into_raw();
    leak_ptr(RprSharedShape(
        SharedShape::round_convex_decomposition_with_params(
            vertices,
            indices,
            params,
            border_radius,
        ),
    ))
}

/// cbindgen:ptrs-as-arrays=[[points_data;]]
#[no_mangle]
pub unsafe extern "C" fn RprSharedShape_convex_hull(
    points_data: *const RprVector,
    points_len: usize,
) -> *mut RprSharedShape {
    let points = std::slice::from_raw_parts(points_data as *const Point<Real>, points_len);
    match SharedShape::convex_hull(points) {
        None => std::ptr::null_mut(),
        Some(t) => leak_ptr(RprSharedShape(t))
    }
}

/// cbindgen:ptrs-as-arrays=[[points_data;]]
#[no_mangle]
pub unsafe extern "C" fn RprSharedShape_round_convex_hull(
    points_data: *const RprVector,
    points_len: usize,
    border_radius: Real,
) -> *mut RprSharedShape {
    let points = std::slice::from_raw_parts(points_data as *const Point<Real>, points_len);
    match SharedShape::round_convex_hull(points, border_radius) {
        None => std::ptr::null_mut(),
        Some(t) => leak_ptr(RprSharedShape(t))
    }
}

/// cbindgen:ptrs-as-arrays=[[vertices_data;], [indices_data;]]
#[no_mangle]
#[cfg(feature = "dim3")]
pub unsafe extern "C" fn RprSharedShape_convex_mesh(
    points_data: *const RprVector,
    points_len: usize,
    indices_data: *const u32,
    indices_len: usize,
) -> *mut RprSharedShape {
    let points = std::slice::from_raw_parts(points_data as *const Point<Real>, points_len).to_vec();
    let indices = std::slice::from_raw_parts(indices_data as *const [u32; 3], indices_len);
    match SharedShape::convex_mesh(points, indices) {
        None => std::ptr::null_mut(),
        Some(t) => leak_ptr(RprSharedShape(t))
    }
}

/// cbindgen:ptrs-as-arrays=[[vertices_data;], [indices_data;]]
#[no_mangle]
#[cfg(feature = "dim3")]
pub unsafe extern "C" fn RprSharedShape_round_convex_mesh(
    points_data: *const RprVector,
    points_len: usize,
    indices_data: *const u32,
    indices_len: usize,
    border_radius: Real,
) -> *mut RprSharedShape {
    let points = std::slice::from_raw_parts(points_data as *const Point<Real>, points_len).to_vec();
    let indices = std::slice::from_raw_parts(indices_data as *const [u32; 3], indices_len);
    match SharedShape::round_convex_mesh(points, indices, border_radius) {
        None => std::ptr::null_mut(),
        Some(t) => leak_ptr(RprSharedShape(t))
    }
}

// TODO heightfield
