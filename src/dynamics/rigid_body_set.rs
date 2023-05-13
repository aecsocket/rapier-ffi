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

    pub fn none_if_invalid(self) -> Option<RigidBodyHandle> {
        match self {
            RprRigidBodyHandle {
                index: u32::MAX,
                generation: u32::MAX,
            } => None,
            t => Some(t.into_raw()),
        }
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
pub unsafe extern "C" fn RprRigidBodySet_len(this: *const RprRigidBodySet) -> usize {
    this.get().0.len()
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodySet_is_empty(this: *const RprRigidBodySet) -> bool {
    this.get().0.is_empty()
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodySet_contains(
    this: *const RprRigidBodySet,
    handle: RprRigidBodyHandle,
) -> bool {
    this.get().0.contains(handle.into_raw())
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodySet_insert(
    this: *mut RprRigidBodySet,
    rb: *mut RprRigidBody,
) -> RprRigidBodyHandle {
    RprRigidBodyHandle::from_raw(this.get_mut().0.insert(rb.read().0))
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodySet_remove(
    this: *mut RprRigidBodySet,
    handle: RprRigidBodyHandle,
    islands: *mut RprIslandManager,
    colliders: *mut RprColliderSet,
    impulse_joints: *mut RprImpulseJointSet,
    multibody_joints: *mut RprMultibodyJointSet,
    remove_attached_colliders: bool,
) -> *mut RprRigidBody {
    match this.get_mut().0.remove(
        handle.into_raw(),
        &mut islands.get_mut().0,
        &mut colliders.get_mut().0,
        &mut impulse_joints.get_mut().0,
        &mut multibody_joints.get_mut().0,
        remove_attached_colliders,
    ) {
        Some(t) => &mut RprRigidBody(t) as *mut RprRigidBody,
        None => std::ptr::null_mut(),
    }
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodySet_get(
    this: *const RprRigidBodySet,
    handle: RprRigidBodyHandle,
) -> *const RprRigidBody {
    match this.get().0.get(handle.into_raw()) {
        Some(t) => t as *const RigidBody as *const RprRigidBody,
        None => std::ptr::null(),
    }
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodySet_get_mut(
    this: *mut RprRigidBodySet,
    handle: RprRigidBodyHandle,
) -> *mut RprRigidBody {
    match this.get_mut().0.get_mut(handle.into_raw()) {
        Some(t) => t as *mut RigidBody as *mut RprRigidBody,
        None => std::ptr::null_mut(),
    }
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
