use rapier::parry::query::NonlinearRigidMotion;
use rapier::parry::query::TOIStatus;

use crate::prelude::*;

pub type RprQueryFilterFlags = u32;

pub fn query_filter_flags_from(rpr: RprQueryFilterFlags) -> QueryFilterFlags {
    QueryFilterFlags::from_bits(rpr).expect("invalid flags")
}

/// Exclude from the query any collider attached to a fixed rigid-body and colliders with no rigid-body attached.
pub const RprQueryFilterFlags_EXCLUDE_FIXED: u32 = 1 << 1;
/// Exclude from the query any collider attached to a dynamic rigid-body.
pub const RprQueryFilterFlags_EXCLUDE_KINEMATIC: u32 = 1 << 2;
/// Exclude from the query any collider attached to a kinematic rigid-body.
pub const RprQueryFilterFlags_EXCLUDE_DYNAMIC: u32 = 1 << 3;
/// Exclude from the query any collider that is a sensor.
pub const RprQueryFilterFlags_EXCLUDE_SENSORS: u32 = 1 << 4;
/// Exclude from the query any collider that is not a sensor.
pub const RprQueryFilterFlags_EXCLUDE_SOLIDS: u32 = 1 << 5;
/// Excludes all colliders not attached to a dynamic rigid-body.
pub const RprQueryFilterFlags_ONLY_DYNAMIC: u32 =
    RprQueryFilterFlags_EXCLUDE_FIXED | RprQueryFilterFlags_EXCLUDE_KINEMATIC;
/// Excludes all colliders not attached to a kinematic rigid-body.
pub const RprQueryFilterFlags_ONLY_KINEMATIC: u32 =
    RprQueryFilterFlags_EXCLUDE_DYNAMIC | RprQueryFilterFlags_EXCLUDE_FIXED;
/// Exclude all colliders attached to a non-fixed rigid-body
/// (this will not exclude colliders not attached to any rigid-body).
pub const RprQueryFilterFlags_ONLY_FIXED: u32 =
    RprQueryFilterFlags_EXCLUDE_DYNAMIC | RprQueryFilterFlags_EXCLUDE_KINEMATIC;

#[repr(C)]
#[derive(Debug, Clone, Copy)]
pub struct RprQueryFilter {
    pub flags: RprQueryFilterFlags,
    pub has_groups: bool,
    pub groups: RprInteractionGroups,
    pub has_exclude_collider: bool,
    pub exclude_collider: RprColliderHandle,
    pub has_exclude_rigid_body: bool,
    pub exclude_rigid_body: RprRigidBodyHandle,
    pub predicate: *const extern "C" fn(RprColliderHandle, *const RprCollider) -> bool,
}

// haha this is so complicated
impl RprQueryFilter {
    pub unsafe fn predicate(&self) -> Option<Box<dyn Fn(ColliderHandle, &Collider) -> bool>> {
        match self.predicate.as_ref() {
            None => None,
            Some(t) => {
                let predicate = (*t).clone();
                Some(Box::new(move |handle, coll| {
                    (predicate)(
                        RprColliderHandle::from_raw(handle.0),
                        coll as *const Collider as *const RprCollider,
                    )
                }))
            }
        }
    }

    pub fn into_raw<'a>(
        &'a self,
        predicate: &'a Option<Box<dyn Fn(ColliderHandle, &Collider) -> bool>>,
    ) -> QueryFilter {
        QueryFilter {
            flags: query_filter_flags_from(self.flags),
            groups: match self.has_groups {
                false => None,
                true => Some(self.groups.into_raw()),
            },
            exclude_collider: match self.has_exclude_collider {
                false => None,
                true => Some(ColliderHandle(self.exclude_collider.into_raw())),
            },
            exclude_rigid_body: match self.has_exclude_rigid_body {
                false => None,
                true => Some(RigidBodyHandle(self.exclude_rigid_body.into_raw())),
            },
            predicate: predicate.as_ref().map(|b| b.as_ref()),
        }
    }
}

impl Default for RprQueryFilter {
    fn default() -> Self {
        Self {
            flags: 0,
            has_groups: false,
            groups: RprInteractionGroups::default(),
            has_exclude_collider: false,
            exclude_collider: RprColliderHandle::invalid(),
            has_exclude_rigid_body: false,
            exclude_rigid_body: RprRigidBodyHandle::invalid(),
            predicate: std::ptr::null(),
        }
    }
}

#[no_mangle]
pub unsafe extern "C" fn RprQueryFilter_default() -> RprQueryFilter {
    RprQueryFilter::default()
}

#[repr(C)]
#[derive(Debug, Clone, Copy)]
pub struct RprSimpleRayResult {
    pub collider: RprColliderHandle,
    pub toi: Real,
}

impl RprSimpleRayResult {
    pub fn from_raw(raw: (ColliderHandle, Real)) -> Self {
        Self {
            collider: RprColliderHandle::from_raw(raw.0 .0),
            toi: raw.1,
        }
    }
}

#[repr(C)]
#[derive(Debug, Clone, Copy)]
pub enum RprFeatureId {
    Vertex { id: u32 },
    #[cfg(feature = "dim3")]
    Edge { id: u32 },
    Face { id: u32 },
    Unknown,
}

impl RprFeatureId {
    pub fn from_raw(raw: FeatureId) -> Self {
        match raw {
            FeatureId::Vertex(id) => RprFeatureId::Vertex { id },
            #[cfg(feature = "dim3")]
            FeatureId::Edge(id) => RprFeatureId::Edge { id },
            FeatureId::Face(id) => RprFeatureId::Face { id },
            FeatureId::Unknown => RprFeatureId::Unknown,
        }
    }
}

#[repr(C)]
#[derive(Debug, Clone, Copy)]
pub struct RprComplexRayResult {
    pub collider: RprColliderHandle,
    pub toi: Real,
    pub normal: RprVector,
    pub feature: RprFeatureId,
}

impl RprComplexRayResult {
    pub fn from_raw(raw: (ColliderHandle, RayIntersection)) -> Self {
        Self {
            collider: RprColliderHandle::from_raw(raw.0 .0),
            toi: raw.1.toi,
            normal: RprVector::from_raw(raw.1.normal),
            feature: RprFeatureId::from_raw(raw.1.feature),
        }
    }
}

#[repr(C)]
#[derive(Debug, Clone, Copy)]
pub struct RprSimplePointProject {
    pub collider: RprColliderHandle,
    pub is_inside: bool,
    pub point: RprVector,
}

impl RprSimplePointProject {
    pub fn from_raw(raw: (ColliderHandle, PointProjection)) -> Self {
        Self {
            collider: RprColliderHandle::from_raw(raw.0 .0),
            is_inside: raw.1.is_inside,
            point: RprVector::from_point(raw.1.point),
        }
    }
}

#[repr(C)]
#[derive(Debug, Clone, Copy)]
pub struct RprComplexPointProject {
    pub collider: RprColliderHandle,
    pub is_inside: bool,
    pub point: RprVector,
    pub feature: RprFeatureId,
}

impl RprComplexPointProject {
    pub fn from_raw(raw: (ColliderHandle, PointProjection, FeatureId)) -> Self {
        Self {
            collider: RprColliderHandle::from_raw(raw.0 .0),
            is_inside: raw.1.is_inside,
            point: RprVector::from_point(raw.1.point),
            feature: RprFeatureId::from_raw(raw.2),
        }
    }
}

/// The status of the time-of-impact computation algorithm.
#[repr(C)]
#[derive(Copy, Clone, Debug, PartialEq, Eq)]
pub enum RprTOIStatus {
    /// The TOI algorithm ran out of iterations before achieving convergence.
    ///
    /// The content of the `TOI` will still be a conservative approximation of the actual result so
    /// it is often fine to interpret this case as a success.
    OutOfIterations,
    /// The TOI algorithm converged successfully.
    Converged,
    /// Something went wrong during the TOI computation, likely due to numerical instabilities.
    ///
    /// The content of the `TOI` will still be a conservative approximation of the actual result so
    /// it is often fine to interpret this case as a success.
    Failed,
    /// The two shape already overlap at the time 0.
    ///
    /// The witness points and normals provided by the `TOI` will have undefined values.
    Penetrating,
}

impl RprTOIStatus {
    pub fn from_raw(raw: TOIStatus) -> Self {
        match raw {
            TOIStatus::OutOfIterations => Self::OutOfIterations,
            TOIStatus::Converged => Self::Converged,
            TOIStatus::Failed => Self::Failed,
            TOIStatus::Penetrating => Self::Penetrating,
        }
    }
}

/// The result of a time-of-impact (TOI) computation.
#[repr(C)]
#[derive(Debug, Clone, Copy)]
pub struct RprTOI {
    /// The time at which the objects touch.
    pub toi: Real,
    /// The local-space closest point on the first shape at the time of impact.
    ///
    /// Undefined if `status` is `Penetrating`.
    pub witness1: RprVector,
    /// The local-space closest point on the second shape at the time of impact.
    ///
    /// Undefined if `status` is `Penetrating`.
    pub witness2: RprVector,
    /// The local-space outward normal on the first shape at the time of impact.
    ///
    /// Undefined if `status` is `Penetrating`.
    pub normal1: RprVector,
    /// The local-space outward normal on the second shape at the time of impact.
    ///
    /// Undefined if `status` is `Penetrating`.
    pub normal2: RprVector,
    /// The way the time-of-impact computation algorithm terminated.
    pub status: RprTOIStatus,
}

impl RprTOI {
    pub fn from_raw(raw: TOI) -> Self {
        Self {
            toi: raw.toi,
            witness1: RprVector::from_point(raw.witness1),
            witness2: RprVector::from_point(raw.witness2),
            normal1: RprVector::from_raw(*raw.normal1),
            normal2: RprVector::from_raw(*raw.normal2),
            status: RprTOIStatus::from_raw(raw.status),
        }
    }
}

#[repr(C)]
#[derive(Debug, Clone, Copy)]
pub struct RprShapeCast {
    pub collider: RprColliderHandle,
    pub toi: RprTOI,
}

impl RprShapeCast {
    pub fn from_raw(raw: (ColliderHandle, TOI)) -> Self {
        Self {
            collider: RprColliderHandle::from_raw(raw.0 .0),
            toi: RprTOI::from_raw(raw.1),
        }
    }
}

/// A nonlinear motion from a starting isometry traveling at constant translational and rotational velocity.
#[repr(C)]
#[derive(Debug, Clone, Copy)]
pub struct RprNonlinearRigidMotion {
    /// The starting isometry at `t = 0`.
    pub start: RprIsometry,
    /// The local-space point at which the rotational part of this motion is applied.
    pub local_center: RprVector,
    /// The translational velocity of this motion.
    pub linvel: RprVector,
    /// The angular velocity of this motion.
    pub angvel: RprAngVector,
}

impl RprNonlinearRigidMotion {
    pub fn into_raw(self) -> NonlinearRigidMotion {
        NonlinearRigidMotion {
            start: self.start.into_raw(),
            local_center: self.local_center.into_point(),
            linvel: self.linvel.into_raw(),
            #[cfg(feature = "dim2")]
            angvel: self.angvel.x,
            #[cfg(feature = "dim3")]
            angvel: self.angvel.into_raw(),
        }
    }
}

pub struct RprQueryPipeline(pub QueryPipeline);

#[no_mangle]
pub extern "C" fn RprQueryPipeline_new() -> *mut RprQueryPipeline {
    leak_ptr(RprQueryPipeline(QueryPipeline::new()))
}

#[no_mangle]
pub unsafe extern "C" fn RprQueryPipeline_drop(this: *mut RprQueryPipeline) {
    drop_ptr(this)
}

#[no_mangle]
pub unsafe extern "C" fn RprQueryPipeline_cast_ray(
    this: *const RprQueryPipeline,
    bodies: *const RprRigidBodySet,
    colliders: *const RprColliderSet,
    ray: RprRay,
    max_toi: Real,
    solid: bool,
    filter: RprQueryFilter,
    out: *mut RprSimpleRayResult,
) -> bool {
    let predicate = filter.predicate();
    match this.get().0.cast_ray(
        &bodies.get().0,
        &colliders.get().0,
        &ray.into_raw(),
        max_toi,
        solid,
        filter.into_raw(&predicate),
    ) {
        None => false,
        Some(t) => {
            *out = RprSimpleRayResult::from_raw(t);
            true
        }
    }
}

#[no_mangle]
pub unsafe extern "C" fn RprQueryPipeline_cast_ray_and_get_normal(
    this: *const RprQueryPipeline,
    bodies: *const RprRigidBodySet,
    colliders: *const RprColliderSet,
    ray: RprRay,
    max_toi: Real,
    solid: bool,
    filter: RprQueryFilter,
    out: *mut RprComplexRayResult,
) -> bool {
    let predicate = filter.predicate();
    match this.get().0.cast_ray_and_get_normal(
        &bodies.get().0,
        &colliders.get().0,
        &ray.into_raw(),
        max_toi,
        solid,
        filter.into_raw(&predicate),
    ) {
        None => false,
        Some(t) => {
            *out = RprComplexRayResult::from_raw(t);
            true
        }
    }
}

#[no_mangle]
pub unsafe extern "C" fn RprQueryPipeline_intersection_with_ray(
    this: *const RprQueryPipeline,
    bodies: *const RprRigidBodySet,
    colliders: *const RprColliderSet,
    ray: RprRay,
    max_toi: Real,
    solid: bool,
    filter: RprQueryFilter,
    callback: extern "C" fn(RprComplexRayResult) -> bool,
) {
    let predicate = filter.predicate();
    this.get().0.intersections_with_ray(
        &bodies.get().0,
        &colliders.get().0,
        &ray.into_raw(),
        max_toi,
        solid,
        filter.into_raw(&predicate),
        |handle, isect| (callback)(RprComplexRayResult::from_raw((handle, isect))),
    )
}

#[no_mangle]
pub unsafe extern "C" fn RprQueryPipeline_intersection_with_shape(
    this: *const RprQueryPipeline,
    bodies: *const RprRigidBodySet,
    colliders: *const RprColliderSet,
    shape_pos: RprIsometry,
    shape: *const RprSharedShape,
    filter: RprQueryFilter,
    out: *mut RprColliderHandle,
) -> bool {
    let predicate = filter.predicate();
    match this.get().0.intersection_with_shape(
        &bodies.get().0,
        &colliders.get().0,
        &shape_pos.into_raw(),
        shape.get().0 .0.as_ref(),
        filter.into_raw(&predicate),
    ) {
        None => false,
        Some(t) => {
            *out = RprColliderHandle::from_raw(t.0);
            true
        }
    }
}

#[no_mangle]
pub unsafe extern "C" fn RprQueryPipeline_project_point(
    this: *const RprQueryPipeline,
    bodies: *const RprRigidBodySet,
    colliders: *const RprColliderSet,
    point: RprVector,
    solid: bool,
    filter: RprQueryFilter,
    out: *mut RprSimplePointProject,
) -> bool {
    let predicate = filter.predicate();
    match this.get().0.project_point(
        &bodies.get().0,
        &colliders.get().0,
        &point.into_point(),
        solid,
        filter.into_raw(&predicate),
    ) {
        None => false,
        Some(t) => {
            *out = RprSimplePointProject::from_raw(t);
            true
        }
    }
}

#[no_mangle]
pub unsafe extern "C" fn RprQueryPipeline_intersections_with_point(
    this: *const RprQueryPipeline,
    bodies: *const RprRigidBodySet,
    colliders: *const RprColliderSet,
    point: RprVector,
    filter: RprQueryFilter,
    callback: extern "C" fn(RprColliderHandle) -> bool,
) {
    let predicate = filter.predicate();
    this.get().0.intersections_with_point(
        &bodies.get().0,
        &colliders.get().0,
        &point.into_point(),
        filter.into_raw(&predicate),
        |handle| (callback)(RprColliderHandle::from_raw(handle.0)),
    )
}

#[no_mangle]
pub unsafe extern "C" fn RprQueryPipeline_project_point_and_get_feature(
    this: *const RprQueryPipeline,
    bodies: *const RprRigidBodySet,
    colliders: *const RprColliderSet,
    point: RprVector,
    filter: RprQueryFilter,
    out: *mut RprComplexPointProject,
) -> bool {
    let predicate = filter.predicate();
    match this.get().0.project_point_and_get_feature(
        &bodies.get().0,
        &colliders.get().0,
        &point.into_point(),
        filter.into_raw(&predicate),
    ) {
        None => false,
        Some(t) => {
            *out = RprComplexPointProject::from_raw(t);
            true
        }
    }
}

#[no_mangle]
pub unsafe extern "C" fn RprQueryPipeline_colliders_with_aabb_intersecting_aabb(
    this: *const RprQueryPipeline,
    aabb: RprAabb,
    callback: extern "C" fn(RprColliderHandle) -> bool,
) {
    this.get()
        .0
        .colliders_with_aabb_intersecting_aabb(&aabb.into_raw(), |handle| {
            (callback)(RprColliderHandle::from_raw(handle.0))
        })
}

#[no_mangle]
pub unsafe extern "C" fn RprQueryPipeline_cast_shape(
    this: *const RprQueryPipeline,
    bodies: *const RprRigidBodySet,
    colliders: *const RprColliderSet,
    shape_pos: RprIsometry,
    shape_vel: RprVector,
    shape: *const RprSharedShape,
    max_toi: Real,
    stop_at_penetration: bool,
    filter: RprQueryFilter,
    out: *mut RprShapeCast,
) -> bool {
    let predicate = filter.predicate();
    match this.get().0.cast_shape(
        &bodies.get().0,
        &colliders.get().0,
        &shape_pos.into_raw(),
        &shape_vel.into_raw(),
        shape.get().0 .0.as_ref(),
        max_toi,
        stop_at_penetration,
        filter.into_raw(&predicate),
    ) {
        None => false,
        Some(t) => {
            *out = RprShapeCast::from_raw(t);
            true
        }
    }
}

#[no_mangle]
pub unsafe extern "C" fn RprQueryPipeline_nonlinear_cast_shape(
    this: *const RprQueryPipeline,
    bodies: *const RprRigidBodySet,
    colliders: *const RprColliderSet,
    shape_motion: RprNonlinearRigidMotion,
    shape: *const RprSharedShape,
    start_time: Real,
    end_time: Real,
    stop_at_penetration: bool,
    filter: RprQueryFilter,
    out: *mut RprShapeCast,
) -> bool {
    let predicate = filter.predicate();
    match this.get().0.nonlinear_cast_shape(
        &bodies.get().0,
        &colliders.get().0,
        &shape_motion.into_raw(),
        shape.get().0 .0.as_ref(),
        start_time,
        end_time,
        stop_at_penetration,
        filter.into_raw(&predicate),
    ) {
        None => false,
        Some(t) => {
            *out = RprShapeCast::from_raw(t);
            true
        }
    }
}

#[no_mangle]
pub unsafe extern "C" fn RprQueryPipeline_intersections_with_shape(
    this: *const RprQueryPipeline,
    bodies: *const RprRigidBodySet,
    colliders: *const RprColliderSet,
    shape_pos: RprIsometry,
    shape: *const RprSharedShape,
    filter: RprQueryFilter,
    callback: extern "C" fn(RprColliderHandle) -> bool,
) {
    let predicate = filter.predicate();
    this.get().0.intersections_with_shape(
        &bodies.get().0,
        &colliders.get().0,
        &shape_pos.into_raw(),
        shape.get().0 .0.as_ref(),
        filter.into_raw(&predicate),
        |handle| (callback)(RprColliderHandle::from_raw(handle.0)),
    );
}
