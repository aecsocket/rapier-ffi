use crate::prelude::*;

pub struct RprIslandManager(pub IslandManager);

#[no_mangle]
pub extern "C" fn RprIslandManager_new() -> *mut RprIslandManager {
    leak_ptr(RprIslandManager(IslandManager::new()))
}

#[no_mangle]
pub unsafe extern "C" fn RprIslandManager_drop(this: *mut RprIslandManager) {
    drop_ptr(this)
}

/// cbindgen:ptrs-as-arrays=[[out_data;]]
#[no_mangle]
pub unsafe extern "C" fn RprIslandManager_active_kinematic_bodies(
    this: *const RprIslandManager,
    out_data: *mut *const RprRigidBodyHandle,
    out_len: *mut usize,
) {
    let slice = this.get().0.active_kinematic_bodies();
    *out_data = slice.as_ptr() as *const RprRigidBodyHandle;
    *out_len = slice.len();
}

#[no_mangle]
pub unsafe extern "C" fn RprIslandManager_active_dynamic_bodies(
    this: *const RprIslandManager,
    out_data: *mut *const RprRigidBodyHandle,
    out_len: *mut usize,
) {
    let slice = this.get().0.active_dynamic_bodies();
    *out_data = slice.as_ptr() as *const RprRigidBodyHandle;
    *out_len = slice.len();
}
