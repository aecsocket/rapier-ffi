use crate::prelude::*;

pub struct RprRigidBodySet(pub RigidBodySet);

#[repr(C)]
#[derive(Debug, Clone, Copy)]
pub struct RprRigidBodyHandle {
    index: u32,
    generation: u32,
}

impl RprRigidBodyHandle {
    pub fn into_raw(self) -> RigidBodyHandle {
        RigidBodyHandle::from_raw_parts(self.index, self.generation)
    }

    pub fn from_raw(handle: RigidBodyHandle) -> Self {
        let (index, generation) = handle.into_raw_parts();
        Self { index, generation }
    }
}

#[no_mangle]
pub extern "C" fn RprRigidBodySet_new() -> *mut RprRigidBodySet {
    leak_ptr(RprRigidBodySet(RigidBodySet::new()))
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodySet_drop(this: *mut RprRigidBodySet) {
    drop_ptr(this)
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodySet_insert(
    this: *mut RprRigidBodySet,
    rb: *mut RprRigidBody,
) -> RprRigidBodyHandle {
    RprRigidBodyHandle::from_raw(this.get_mut().0.insert(rb.read().0))
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodySet_index(
    this: *const RprRigidBodySet,
    index: RprRigidBodyHandle,
) -> *const RprRigidBody {
    (&this.get().0[index.into_raw()]) as *const RigidBody as *const RprRigidBody
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodySet_index_mut(
    this: *mut RprRigidBodySet,
    index: RprRigidBodyHandle,
) -> *mut RprRigidBody {
    (&mut this.get_mut().0[index.into_raw()]) as *mut RigidBody as *mut RprRigidBody
}
