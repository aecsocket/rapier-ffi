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
