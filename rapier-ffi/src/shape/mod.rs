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

#[no_mangle]
pub extern "C" fn RprSharedShape_ball(radius: Real) -> *mut RprSharedShape {
    leak_ptr(RprSharedShape(SharedShape::ball(radius)))
}

#[no_mangle]
pub extern "C" fn RprSharedShape_halfspace(outward_normal: RprVector) -> *mut RprSharedShape {
    leak_ptr(RprSharedShape(SharedShape::halfspace(
        outward_normal.into_unit(),
    )))
}

#[no_mangle]
#[cfg(feature = "dim3")]
pub extern "C" fn RprSharedShape_cylinder(half_height: Real, radius: Real) -> *mut RprSharedShape {
    leak_ptr(RprSharedShape(SharedShape::cylinder(half_height, radius)))
}

#[no_mangle]
#[cfg(feature = "dim3")]
pub extern "C" fn RprSharedShape_round_cylinder(
    half_height: Real,
    radius: Real,
    border_radius: Real,
) -> *mut RprSharedShape {
    leak_ptr(RprSharedShape(SharedShape::round_cylinder(
        half_height,
        radius,
        border_radius,
    )))
}

#[no_mangle]
#[cfg(feature = "dim3")]
pub extern "C" fn RprSharedShape_cone(half_height: Real, radius: Real) -> *mut RprSharedShape {
    leak_ptr(RprSharedShape(SharedShape::cone(half_height, radius)))
}

#[no_mangle]
#[cfg(feature = "dim3")]
pub extern "C" fn RprSharedShape_round_cone(
    half_height: Real,
    radius: Real,
    border_radius: Real,
) -> *mut RprSharedShape {
    leak_ptr(RprSharedShape(SharedShape::round_cone(
        half_height,
        radius,
        border_radius,
    )))
}

#[no_mangle]
#[cfg(feature = "dim2")]
pub extern "C" fn RprSharedShape_cuboid(hx: Real, hy: Real) -> *mut RprSharedShape {
    leak_ptr(RprSharedShape(SharedShape::cuboid(hx, hy)))
}

#[no_mangle]
#[cfg(feature = "dim2")]
pub extern "C" fn RprSharedShape_round_cuboid(
    hx: Real,
    hy: Real,
    border_radius: Real,
) -> *mut RprSharedShape {
    leak_ptr(RprSharedShape(SharedShape::round_cuboid(
        hx,
        hy,
        border_radius,
    )))
}

#[no_mangle]
#[cfg(feature = "dim3")]
pub extern "C" fn RprSharedShape_cuboid(hx: Real, hy: Real, hz: Real) -> *mut RprSharedShape {
    leak_ptr(RprSharedShape(SharedShape::cuboid(hx, hy, hz)))
}

#[no_mangle]
#[cfg(feature = "dim3")]
pub extern "C" fn RprSharedShape_round_cuboid(
    hx: Real,
    hy: Real,
    hz: Real,
    border_radius: Real,
) -> *mut RprSharedShape {
    leak_ptr(RprSharedShape(SharedShape::round_cuboid(
        hx,
        hy,
        hz,
        border_radius,
    )))
}

#[no_mangle]
pub extern "C" fn RprSharedShape_capsule(
    a: RprVector,
    b: RprVector,
    radius: Real,
) -> *mut RprSharedShape {
    leak_ptr(RprSharedShape(SharedShape::capsule(
        a.into_point(),
        b.into_point(),
        radius,
    )))
}

#[no_mangle]
pub extern "C" fn RprSharedShape_segment(a: RprVector, b: RprVector) -> *mut RprSharedShape {
    leak_ptr(RprSharedShape(SharedShape::segment(
        a.into_point(),
        b.into_point(),
    )))
}

#[no_mangle]
pub extern "C" fn RprSharedShape_triangle(
    a: RprVector,
    b: RprVector,
    c: RprVector,
) -> *mut RprSharedShape {
    leak_ptr(RprSharedShape(SharedShape::triangle(
        a.into_point(),
        b.into_point(),
        c.into_point(),
    )))
}

#[no_mangle]
pub extern "C" fn RprSharedShape_round_triangle(
    a: RprVector,
    b: RprVector,
    c: RprVector,
    border_radius: Real,
) -> *mut RprSharedShape {
    leak_ptr(RprSharedShape(SharedShape::round_triangle(
        a.into_point(),
        b.into_point(),
        c.into_point(),
        border_radius,
    )))
}

/// cbindgen:ptrs-as-arrays=[[vertices_data;], [indices_data;]]
#[no_mangle]
pub unsafe extern "C" fn RprSharedShape_polyline(
    vertices_data: *const RprVector,
    vertices_len: usize,
    indices_data: *const u32,
    indices_len: usize,
) -> *mut RprSharedShape {
    let vertices: Vec<Point<Real>> =
        std::slice::from_raw_parts(vertices_data as *const Point<Real>, vertices_len).to_vec();
    let indices: Option<Vec<[u32; 2]>> = indices_data.as_ref().map(|t| {
        std::slice::from_raw_parts(t as *const u32 as *const [u32; 2], indices_len).to_vec()
    });
    leak_ptr(RprSharedShape(SharedShape::polyline(vertices, indices)))
}

/// cbindgen:ptrs-as-arrays=[[vertices_data;], [indices_data;]]
#[no_mangle]
pub unsafe extern "C" fn RprSharedShape_trimesh(
    vertices_data: *const RprVector,
    vertices_len: usize,
    indices_data: *const u32,
    indices_len: usize,
    flags: RprTriMeshFlags,
) -> *mut RprSharedShape {
    let vertices: Vec<Point<Real>> =
        std::slice::from_raw_parts(vertices_data as *const Point<Real>, vertices_len).to_vec();
    let indices: Vec<[u32; 3]> =
        std::slice::from_raw_parts(indices_data as *const u32 as *const [u32; 3], indices_len)
            .to_vec();
    leak_ptr(RprSharedShape(SharedShape::trimesh_with_flags(
        vertices,
        indices,
        trimesh_flags_from(flags),
    )))
}

/// cbindgen:ptrs-as-arrays=[[vertices_data;], [indices_data;]]
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

/// cbindgen:ptrs-as-arrays=[[vertices_data;], [indices_data;]]
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

/// cbindgen:ptrs-as-arrays=[[vertices_data;], [indices_data;]]
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

/// cbindgen:ptrs-as-arrays=[[vertices_data;], [indices_data;]]
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
        Some(t) => leak_ptr(RprSharedShape(t)),
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
        Some(t) => leak_ptr(RprSharedShape(t)),
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
        Some(t) => leak_ptr(RprSharedShape(t)),
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
        Some(t) => leak_ptr(RprSharedShape(t)),
    }
}

// TODO heightfield
