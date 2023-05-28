use crate::prelude::*;

pub type RprMultibodyJointHandle = RprArenaKey;

pub struct RprMultibodyJointSet(pub MultibodyJointSet);

#[no_mangle]
pub extern "C" fn RprMultibodyJointSet_new() -> *mut RprMultibodyJointSet {
    leak_ptr(RprMultibodyJointSet(MultibodyJointSet::new()))
}

#[no_mangle]
pub unsafe extern "C" fn RprMultibodyJointSet_drop(this: *mut RprMultibodyJointSet) {
    drop_ptr(this)
}

#[no_mangle]
pub unsafe extern "C" fn RprMultibodyJointSet_insert(
    this: *mut RprMultibodyJointSet,
    body1: RprRigidBodyHandle,
    body2: RprRigidBodyHandle,
    data: *mut RprGenericJoint,
    wake_up: bool,
    out: *mut RprMultibodyJointHandle,
) -> bool {
    match this.get_mut().0.insert(
        RigidBodyHandle(body1.into_raw()),
        RigidBodyHandle(body2.into_raw()),
        data.read().0,
        wake_up,
    ) {
        Some(t) => {
            out.write(RprMultibodyJointHandle::from_raw(t.0));
            true
        }
        None => false,
    }
}

#[no_mangle]
pub unsafe extern "C" fn RprMultibodyJointSet_remove(
    this: *mut RprMultibodyJointSet,
    handle: RprMultibodyJointHandle,
    wake_up: bool,
) {
    this.get_mut()
        .0
        .remove(MultibodyJointHandle(handle.into_raw()), wake_up)
}

#[no_mangle]
pub unsafe extern "C" fn RprMultibodyJointSet_remove_multibody_articulations(
    this: *mut RprMultibodyJointSet,
    handle: RprRigidBodyHandle,
    wake_up: bool,
) {
    this.get_mut()
        .0
        .remove_multibody_articulations(RigidBodyHandle(handle.into_raw()), wake_up)
}

#[no_mangle]
pub unsafe extern "C" fn RprMultibodyJointSet_remove_joints_attached_to_rigid_body(
    this: *mut RprMultibodyJointSet,
    rb_to_remove: RprRigidBodyHandle,
) {
    this.get_mut()
        .0
        .remove_joints_attached_to_rigid_body(RigidBodyHandle(rb_to_remove.into_raw()))
}

// TODO get
