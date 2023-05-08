use crate::prelude::*;

pub struct RprNarrowPhase(pub NarrowPhase);

#[no_mangle]
pub extern "C" fn RprNarrowPhase_new() -> *mut RprNarrowPhase {
    leak_ptr(RprNarrowPhase(NarrowPhase::new()))
}

#[no_mangle]
pub unsafe extern "C" fn RprNarrowPhase_drop(this: *mut RprNarrowPhase) {
    drop_ptr(this)
}
