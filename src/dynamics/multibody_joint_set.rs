use crate::prelude::*;

pub struct RprMultibodyJointSet(pub MultibodyJointSet);

#[no_mangle]
pub extern "C" fn RprMultibodyJointSet_new() -> *mut RprMultibodyJointSet {
    leak_ptr(RprMultibodyJointSet(MultibodyJointSet::new()))
}

#[no_mangle]
pub unsafe extern "C" fn RprMultibodyJointSet_drop(this: *mut RprMultibodyJointSet) {
    drop_ptr(this)
}
