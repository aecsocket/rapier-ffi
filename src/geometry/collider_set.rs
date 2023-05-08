use crate::prelude::*;

pub struct RprColliderSet(pub ColliderSet);

#[repr(C)]
#[derive(Debug, Clone, Copy)]
pub struct RprColliderHandle {
    index: u32,
    generation: u32,
}

impl RprColliderHandle {
    pub fn into_raw(self) -> ColliderHandle {
        ColliderHandle::from_raw_parts(self.index, self.generation)
    }

    pub fn from_raw(handle: ColliderHandle) -> Self {
        let (index, generation) = handle.into_raw_parts();
        Self { index, generation }
    }
}

#[no_mangle]
pub extern "C" fn RprColliderSet_new() -> *mut RprColliderSet {
    leak_ptr(RprColliderSet(ColliderSet::new()))
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderSet_drop(this: *mut RprColliderSet) {
    drop_ptr(this)
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
