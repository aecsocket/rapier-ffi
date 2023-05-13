use std::sync::Arc;

use crate::prelude::*;

pub struct RprSharedShape(pub SharedShape);

/// A segment shape.
#[repr(C)]
#[derive(Debug, Clone, Copy, bytemuck::Pod, bytemuck::Zeroable)]
pub struct RprSegment {
    /// The segment first point.
    pub a: RprVector,
    /// The segment second point.
    pub b: RprVector,
}

/// A cuboid shape.
#[repr(C)]
#[derive(Debug, Clone, Copy, bytemuck::Pod, bytemuck::Zeroable)]
pub struct RprCuboid {
    /// The half-extents of the cuboid.
    pub half_extents: RprVector,
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

/// A ball shape.
#[repr(C)]
#[derive(Debug, Clone, Copy, bytemuck::Pod, bytemuck::Zeroable)]
pub struct RprBall {
    /// The radius of the ball.
    pub radius: Real,
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

/// A cylinder shape with its principal axis aligned with the `y` axis.
#[repr(C)]
#[derive(Debug, Clone, Copy, bytemuck::Pod, bytemuck::Zeroable)]
pub struct RprCylinder {
    /// The half-height of the cylinder.
    pub half_height: Real,
    /// The radius of the cylinder.
    pub radius: Real,
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
pub extern "C" fn RprSharedShape_segment(segment: RprSegment) -> *mut RprSharedShape {
    leak_ptr(RprSharedShape(SharedShape(Arc::new(cast::<_, Segment>(
        segment,
    )))))
}

#[no_mangle]
pub extern "C" fn RprSharedShape_cuboid(cuboid: RprCuboid) -> *mut RprSharedShape {
    leak_ptr(RprSharedShape(SharedShape(Arc::new(cast::<_, Cuboid>(
        cuboid,
    )))))
}

#[no_mangle]
pub extern "C" fn RprSharedShape_triangle(triangle: RprTriangle) -> *mut RprSharedShape {
    leak_ptr(RprSharedShape(SharedShape(Arc::new(cast::<_, Triangle>(
        triangle,
    )))))
}

#[no_mangle]
pub extern "C" fn RprSharedShape_ball(ball: RprBall) -> *mut RprSharedShape {
    leak_ptr(RprSharedShape(SharedShape(Arc::new(cast::<_, Ball>(ball)))))
}

#[no_mangle]
pub extern "C" fn RprSharedShape_capsule(capsule: RprCapsule) -> *mut RprSharedShape {
    leak_ptr(RprSharedShape(SharedShape(Arc::new(cast::<_, Capsule>(
        capsule,
    )))))
}

#[no_mangle]
#[cfg(feature = "dim3")]
pub extern "C" fn RprSharedShape_cylinder(cylinder: RprCylinder) -> *mut RprSharedShape {
    leak_ptr(RprSharedShape(SharedShape(Arc::new(cast::<_, Cylinder>(
        cylinder,
    )))))
}

#[no_mangle]
#[cfg(feature = "dim3")]
pub extern "C" fn RprSharedShape_cone(cone: RprCone) -> *mut RprSharedShape {
    leak_ptr(RprSharedShape(SharedShape(Arc::new(cast::<_, Cone>(cone)))))
}

#[no_mangle]
pub unsafe extern "C" fn RprSharedShape_drop(this: *mut RprSharedShape) {
    drop_ptr(this)
}
