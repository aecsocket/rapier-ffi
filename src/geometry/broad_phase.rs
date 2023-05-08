use crate::prelude::*;

pub struct RprBroadPhase(pub BroadPhase);

#[no_mangle]
pub extern "C" fn RprBroadPhase_new() -> *mut RprBroadPhase {
    leak_ptr(RprBroadPhase(BroadPhase::new()))
}

#[no_mangle]
pub unsafe extern "C" fn RprBroadPhase_drop(this: *mut RprBroadPhase) {
    drop_ptr(this)
}
