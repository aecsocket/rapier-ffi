use crate::prelude::*;

pub struct RprImpulseJoint(pub ImpulseJoint);

#[no_mangle]
pub unsafe extern "C" fn RprImpulseJoint_body1(this: *const RprImpulseJoint) -> RprRigidBodyHandle {
    RprRigidBodyHandle::from_raw(this.get().0.body1.0)
}

#[no_mangle]
pub unsafe extern "C" fn RprImpulseJoint_set_body1(
    this: *mut RprImpulseJoint,
    body1: RprRigidBodyHandle,
) {
    this.get_mut().0.body1 = RigidBodyHandle(body1.into_raw())
}

#[no_mangle]
pub unsafe extern "C" fn RprImpulseJoint_body2(this: *const RprImpulseJoint) -> RprRigidBodyHandle {
    RprRigidBodyHandle::from_raw(this.get().0.body2.0)
}

#[no_mangle]
pub unsafe extern "C" fn RprImpulseJoint_set_body2(
    this: *mut RprImpulseJoint,
    body2: RprRigidBodyHandle,
) {
    this.get_mut().0.body2 = RigidBodyHandle(body2.into_raw())
}

#[no_mangle]
pub unsafe extern "C" fn RprImpulseJoint_data(
    this: *const RprImpulseJoint,
) -> *const RprGenericJoint {
    &this.get().0.data as *const GenericJoint as *const RprGenericJoint
}

#[no_mangle]
pub unsafe extern "C" fn RprImpulseJoint_set_data(
    this: *mut RprImpulseJoint,
    data: *mut RprGenericJoint,
) {
    this.get_mut().0.data = data.read().0;
}

#[no_mangle]
pub unsafe extern "C" fn RprImpulseJoint_impulses(
    this: *const RprImpulseJoint,
) -> RprSpacialVector {
    RprSpacialVector::from_raw(this.get().0.impulses)
}

#[no_mangle]
pub unsafe extern "C" fn RprImpulseJoint_set_impulses(
    this: *mut RprImpulseJoint,
    impulses: RprSpacialVector,
) {
    this.get_mut().0.impulses = impulses.into_raw()
}

#[no_mangle]
pub unsafe extern "C" fn RprImpulseJoint_retain_data(
    this: *mut RprImpulseJoint,
) -> *mut RprGenericJoint {
    let data = this.get_mut().0.data;
    drop(this);
    leak_ptr(RprGenericJoint(data))
}
