use crate::prelude::*;

pub type RprRigidBodyHandle = RprArenaKey;

pub struct RprRigidBodyVec<'a>(pub Vec<(RigidBodyHandle, &'a RigidBody)>);

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodyVec_drop(this: *mut RprRigidBodyVec) {
    drop_ptr(this)
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodyVec_len(this: *const RprRigidBodyVec) -> usize {
    this.get().0.len()
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodyVec_handle(
    this: *const RprRigidBodyVec,
    index: usize,
) -> RprRigidBodyHandle {
    RprRigidBodyHandle::from_raw(this.get().0[index].0 .0)
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodyVec_value(
    this: *const RprRigidBodyVec,
    index: usize,
) -> *const RprRigidBody {
    this.get().0[index].1 as *const RigidBody as *const RprRigidBody
}

pub struct RprRigidBodySet(pub RigidBodySet);

#[no_mangle]
pub extern "C" fn RprRigidBodySet_new() -> *mut RprRigidBodySet {
    leak_ptr(RprRigidBodySet(RigidBodySet::new()))
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodySet_drop(this: *mut RprRigidBodySet) {
    drop_ptr(this)
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodySet_len(this: *const RprRigidBodySet) -> usize {
    this.get().0.len()
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodySet_is_empty(this: *const RprRigidBodySet) -> bool {
    this.get().0.is_empty()
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodySet_all<'a>(
    this: *const RprRigidBodySet,
) -> *mut RprRigidBodyVec<'a> {
    let vec: Vec<(RigidBodyHandle, &RigidBody)> = this.get().0.iter().collect();
    leak_ptr(RprRigidBodyVec(vec))
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodySet_contains(
    this: *const RprRigidBodySet,
    handle: RprRigidBodyHandle,
) -> bool {
    this.get().0.contains(RigidBodyHandle(handle.into_raw()))
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodySet_insert(
    this: *mut RprRigidBodySet,
    rb: *mut RprRigidBody,
) -> RprRigidBodyHandle {
    RprRigidBodyHandle::from_raw(this.get_mut().0.insert(rb.read().0).0)
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodySet_remove(
    this: *mut RprRigidBodySet,
    handle: RprRigidBodyHandle,
    islands: *mut RprIslandManager,
    colliders: *mut RprColliderSet,
    impulse_joints: *mut RprImpulseJointSet,
    multibody_joints: *mut RprMultibodyJointSet,
    remove_attached_colliders: bool,
) -> *mut RprRigidBody {
    match this.get_mut().0.remove(
        RigidBodyHandle(handle.into_raw()),
        &mut islands.get_mut().0,
        &mut colliders.get_mut().0,
        &mut impulse_joints.get_mut().0,
        &mut multibody_joints.get_mut().0,
        remove_attached_colliders,
    ) {
        Some(t) => leak_ptr(RprRigidBody(t)),
        None => std::ptr::null_mut(),
    }
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodySet_get(
    this: *const RprRigidBodySet,
    handle: RprRigidBodyHandle,
) -> *const RprRigidBody {
    match this.get().0.get(RigidBodyHandle(handle.into_raw())) {
        Some(t) => t as *const RigidBody as *const RprRigidBody,
        None => std::ptr::null(),
    }
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodySet_get_mut(
    this: *mut RprRigidBodySet,
    handle: RprRigidBodyHandle,
) -> *mut RprRigidBody {
    match this.get_mut().0.get_mut(RigidBodyHandle(handle.into_raw())) {
        Some(t) => t as *mut RigidBody as *mut RprRigidBody,
        None => std::ptr::null_mut(),
    }
}
