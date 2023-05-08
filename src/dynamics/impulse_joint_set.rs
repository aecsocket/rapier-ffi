use crate::prelude::*;

pub struct RprImpulseJointSet(pub ImpulseJointSet);

#[no_mangle]
pub extern "C" fn RprImpulseJointSet_new() -> *mut RprImpulseJointSet {
    leak_ptr(RprImpulseJointSet(ImpulseJointSet::new()))
}

#[no_mangle]
pub unsafe extern "C" fn RprImpulseJointSet_drop(this: *mut RprImpulseJointSet) {
    drop_ptr(this)
}
