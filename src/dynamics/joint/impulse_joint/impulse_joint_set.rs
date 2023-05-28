use crate::prelude::*;

pub type RprImpulseJointHandle = RprArenaKey;

pub struct RprImpulseJointSet(pub ImpulseJointSet);

#[no_mangle]
pub extern "C" fn RprImpulseJointSet_new() -> *mut RprImpulseJointSet {
    leak_ptr(RprImpulseJointSet(ImpulseJointSet::new()))
}

#[no_mangle]
pub unsafe extern "C" fn RprImpulseJointSet_drop(this: *mut RprImpulseJointSet) {
    drop_ptr(this)
}

#[no_mangle]
pub unsafe extern "C" fn RprImpulseJointSet_len(this: *const RprImpulseJointSet) -> usize {
    this.get().0.len()
}

#[no_mangle]
pub unsafe extern "C" fn RprImpulseJointSet_is_empty(this: *const RprImpulseJointSet) -> bool {
    this.get().0.is_empty()
}

// TODO joint_graph

// TODO joints_between

// TODO attached_joints

// TODO map_attached_joints_mut

// TODO attached_enabled_joints

#[no_mangle]
pub unsafe extern "C" fn RprImpulseJointSet_contains(
    this: *const RprImpulseJointSet,
    handle: RprImpulseJointHandle,
) -> bool {
    this.get().0.contains(ImpulseJointHandle(handle.into_raw()))
}

#[no_mangle]
pub unsafe extern "C" fn RprImpulseJointSet_get(
    this: *const RprImpulseJointSet,
    handle: RprImpulseJointHandle,
) -> *const RprImpulseJoint {
    match this.get().0.get(ImpulseJointHandle(handle.into_raw())) {
        Some(t) => t as *const ImpulseJoint as *const RprImpulseJoint,
        None => std::ptr::null(),
    }
}

#[no_mangle]
pub unsafe extern "C" fn RprImpulseJointSet_get_mut(
    this: *mut RprImpulseJointSet,
    handle: RprImpulseJointHandle,
) -> *mut RprImpulseJoint {
    match this
        .get_mut()
        .0
        .get_mut(ImpulseJointHandle(handle.into_raw()))
    {
        Some(t) => t as *mut ImpulseJoint as *mut RprImpulseJoint,
        None => std::ptr::null_mut(),
    }
}

// ...

#[no_mangle]
pub unsafe extern "C" fn RprImpulseJointSet_insert(
    this: *mut RprImpulseJointSet,
    body1: RprRigidBodyHandle,
    body2: RprRigidBodyHandle,
    data: *const RprGenericJoint,
    wake_up: bool,
) -> RprImpulseJointHandle {
    RprImpulseJointHandle::from_raw(
        this.get_mut()
            .0
            .insert(
                RigidBodyHandle(body1.into_raw()),
                RigidBodyHandle(body2.into_raw()),
                data.read().0,
                wake_up,
            )
            .0,
    )
}

#[no_mangle]
pub unsafe extern "C" fn RprImpulseJointSet_remove(
    this: *mut RprImpulseJointSet,
    handle: RprImpulseJointHandle,
    wake_up: bool,
) -> *mut RprImpulseJoint {
    match this
        .get_mut()
        .0
        .remove(ImpulseJointHandle(handle.into_raw()), wake_up)
    {
        // TODO I think this would return a dangling ptr, since the `t` would be dropped
        Some(t) => &mut RprImpulseJoint(t),
        None => std::ptr::null_mut(),
    }
}