use crate::prelude::*;

#[repr(C)]
#[derive(Debug, Clone, Copy)]
pub struct RprColliderHandle {
    pub index: u32,
    pub generation: u32,
}

impl RprColliderHandle {
    pub fn from_raw(handle: ColliderHandle) -> Self {
        let (index, generation) = handle.into_raw_parts();
        Self { index, generation }
    }

    pub fn invalid() -> Self {
        Self {
            index: INVALID_U32,
            generation: INVALID_U32,
        }
    }

    pub fn is_valid(self) -> bool {
        self.index != INVALID_U32 || self.generation != INVALID_U32
    }

    pub fn into_raw(self) -> ColliderHandle {
        ColliderHandle::from_raw_parts(self.index, self.generation)
    }

    pub fn none_if_invalid(self) -> Option<ColliderHandle> {
        match self {
            RprColliderHandle {
                index: INVALID_U32,
                generation: INVALID_U32,
            } => None,
            t => Some(t.into_raw()),
        }
    }
}

#[no_mangle]
pub extern "C" fn RprColliderHandle_is_valid(this: RprColliderHandle) -> bool {
    this.is_valid()
}

#[no_mangle]
pub extern "C" fn RprColliderHandle_invalid() -> RprColliderHandle {
    RprColliderHandle::invalid()
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
pub unsafe extern "C" fn RprColliderSet_contains(
    this: *const RprColliderSet,
    handle: RprColliderHandle,
) -> bool {
    this.get().0.contains(handle.into_raw())
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderSet_insert(
    this: *mut RprColliderSet,
    coll: *mut RprCollider,
) -> RprColliderHandle {
    RprColliderHandle::from_raw(this.get_mut().0.insert(coll.read().0))
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderSet_insert_with_parent(
    this: *mut RprColliderSet,
    coll: *mut RprCollider,
    parent_handle: RprRigidBodyHandle,
    bodies: *mut RprRigidBodySet,
) -> RprColliderHandle {
    RprColliderHandle::from_raw(this.get_mut().0.insert_with_parent(
        coll.read().0,
        parent_handle.into_raw(),
        &mut bodies.get_mut().0,
    ))
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderSet_set_parent(
    this: *mut RprColliderSet,
    handle: RprColliderHandle,
    new_parent_handle: RprRigidBodyHandle,
    bodies: *mut RprRigidBodySet,
) {
    this.get_mut().0.set_parent(
        handle.into_raw(),
        new_parent_handle.none_if_invalid(),
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
        handle.into_raw(),
        &mut islands.get_mut().0,
        &mut bodies.get_mut().0,
        wake_up,
    ) {
        Some(t) => &mut RprCollider(t) as *mut RprCollider,
        None => std::ptr::null_mut(),
    }
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderSet_get(
    this: *const RprColliderSet,
    handle: RprColliderHandle,
) -> *const RprCollider {
    match this.get().0.get(handle.into_raw()) {
        Some(t) => t as *const Collider as *const RprCollider,
        None => std::ptr::null(),
    }
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderSet_get_mut(
    this: *mut RprColliderSet,
    handle: RprColliderHandle,
) -> *mut RprCollider {
    match this.get_mut().0.get_mut(handle.into_raw()) {
        Some(t) => t as *mut Collider as *mut RprCollider,
        None => std::ptr::null_mut(),
    }
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderSet_index(
    this: *const RprColliderSet,
    index: RprColliderHandle,
) -> *const RprCollider {
    (&this.get().0[index.into_raw()]) as *const Collider as *const RprCollider
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderSet_index_mut(
    this: *mut RprColliderSet,
    index: RprColliderHandle,
) -> *const RprCollider {
    (&mut this.get_mut().0[index.into_raw()]) as *mut Collider as *mut RprCollider
}
