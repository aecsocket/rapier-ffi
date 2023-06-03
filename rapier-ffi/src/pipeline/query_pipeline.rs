use crate::prelude::*;

pub type RprQueryFiltersFlags = u32;

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
pub const RprQueryFilterFlags_ONLY_DYNAMIC: u32 = RprQueryFilterFlags_EXCLUDE_FIXED | RprQueryFilterFlags_EXCLUDE_KINEMATIC;
/// Excludes all colliders not attached to a kinematic rigid-body.
pub const RprQueryFilterFlags_ONLY_KINEMATIC: u32 = RprQueryFilterFlags_EXCLUDE_DYNAMIC | RprQueryFilterFlags_EXCLUDE_FIXED;
/// Exclude all colliders attached to a non-fixed rigid-body
/// (this will not exclude colliders not attached to any rigid-body).
pub const RprQueryFilterFlags_ONLY_FIXED: u32 = RprQueryFilterFlags_EXCLUDE_DYNAMIC | RprQueryFilterFlags_EXCLUDE_KINEMATIC;

pub struct RprQueryPipeline(pub QueryPipeline);

#[no_mangle]
pub extern "C" fn RprQueryPipeline_new() -> *mut RprQueryPipeline {
    leak_ptr(RprQueryPipeline(QueryPipeline::new()))
}

#[no_mangle]
pub unsafe extern "C" fn RprQueryPipeline_drop(this: *mut RprQueryPipeline) {
    drop_ptr(this)
}
