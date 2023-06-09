use crate::prelude::*;

pub type RprColliderHandle = RprArenaKey;

pub struct RprColliderVec<'a>(pub Vec<(ColliderHandle, &'a Collider)>);

#[no_mangle]
pub unsafe extern "C" fn RprColliderVec_drop(this: *mut RprColliderVec) {
    drop_ptr(this)
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderVec_len(this: *const RprColliderVec) -> usize {
    this.get().0.len()
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderVec_handle(
    this: *const RprColliderVec,
    index: usize,
) -> RprColliderHandle {
    RprColliderHandle::from_raw(this.get().0[index].0 .0)
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderVec_value(
    this: *const RprColliderVec,
    index: usize,
) -> *const RprCollider {
    this.get().0[index].1 as *const Collider as *const RprCollider
}

pub struct RprColliderSet(pub ColliderSet);

#[no_mangle]
pub extern "C" fn RprColliderSet_new() -> *mut RprColliderSet {
    leak_ptr(RprColliderSet(ColliderSet::new()))
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderSet_drop(this: *mut RprColliderSet) {
    drop_ptr(this)
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderSet_len(this: *const RprColliderSet) -> usize {
    this.get().0.len()
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderSet_is_empty(this: *const RprColliderSet) -> bool {
    this.get().0.is_empty()
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderSet_all<'a>(
    this: *const RprColliderSet,
) -> *mut RprColliderVec<'a> {
    let vec: Vec<(ColliderHandle, &Collider)> = this.get().0.iter().collect();
    leak_ptr(RprColliderVec(vec))
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderSet_all_enabled<'a>(
    this: *const RprColliderSet,
) -> *mut RprColliderVec<'a> {
    let vec: Vec<(ColliderHandle, &Collider)> = this.get().0.iter_enabled().collect();
    leak_ptr(RprColliderVec(vec))
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderSet_contains(
    this: *const RprColliderSet,
    handle: RprColliderHandle,
) -> bool {
    this.get().0.contains(ColliderHandle(handle.into_raw()))
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderSet_insert(
    this: *mut RprColliderSet,
    coll: *mut RprCollider,
) -> RprColliderHandle {
    RprColliderHandle::from_raw(this.get_mut().0.insert(coll.read().0).0)
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderSet_insert_with_parent(
    this: *mut RprColliderSet,
    coll: *mut RprCollider,
    parent_handle: RprRigidBodyHandle,
    bodies: *mut RprRigidBodySet,
) -> RprColliderHandle {
    RprColliderHandle::from_raw(
        this.get_mut()
            .0
            .insert_with_parent(
                coll.read().0,
                RigidBodyHandle(parent_handle.into_raw()),
                &mut bodies.get_mut().0,
            )
            .0,
    )
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderSet_set_parent(
    this: *mut RprColliderSet,
    handle: RprColliderHandle,
    new_parent_handle: RprRigidBodyHandle,
    bodies: *mut RprRigidBodySet,
) {
    this.get_mut().0.set_parent(
        ColliderHandle(handle.into_raw()),
        new_parent_handle
            .none_if_invalid()
            .map(|t| RigidBodyHandle(t)),
        &mut bodies.get_mut().0,
    )
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderSet_remove(
    this: *mut RprColliderSet,
    handle: RprColliderHandle,
    islands: *mut RprIslandManager,
    bodies: *mut RprRigidBodySet,
    wake_up: bool,
) -> *mut RprCollider {
    match this.get_mut().0.remove(
        ColliderHandle(handle.into_raw()),
        &mut islands.get_mut().0,
        &mut bodies.get_mut().0,
        wake_up,
    ) {
        Some(t) => leak_ptr(RprCollider(t)),
        None => std::ptr::null_mut(),
    }
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderSet_get(
    this: *const RprColliderSet,
    handle: RprColliderHandle,
) -> *const RprCollider {
    match this.get().0.get(ColliderHandle(handle.into_raw())) {
        Some(t) => t as *const Collider as *const RprCollider,
        None => std::ptr::null(),
    }
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderSet_get_mut(
    this: *mut RprColliderSet,
    handle: RprColliderHandle,
) -> *mut RprCollider {
    match this.get_mut().0.get_mut(ColliderHandle(handle.into_raw())) {
        Some(t) => t as *mut Collider as *mut RprCollider,
        None => std::ptr::null_mut(),
    }
}
