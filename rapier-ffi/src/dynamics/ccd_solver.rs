use crate::prelude::*;
pub struct RprCCDSolver(pub CCDSolver);

#[no_mangle]
pub extern "C" fn RprCCDSolver_new() -> *mut RprCCDSolver {
    leak_ptr(RprCCDSolver(CCDSolver::new()))
}

#[no_mangle]
pub unsafe extern "C" fn RprCCDSolver_drop(this: *mut RprCCDSolver) {
    drop_ptr(this)
}
