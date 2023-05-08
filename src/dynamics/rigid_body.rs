use crate::prelude::*;

pub struct RprRigidBody(pub RigidBody);

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_drop(this: *mut RprRigidBody) {
    drop_ptr(this)
}

/// cbindgen:ptrs-as-arrays=[[out; 2]]
#[no_mangle]
#[cfg(feature = "dim2")]
pub unsafe extern "C" fn RprRigidBody_translation(this: *const RprRigidBody, out: *mut RprReal) {
    write_rvec(this.get().0.translation(), out);
}

/// cbindgen:ptrs-as-arrays=[[out; 3]]
#[no_mangle]
#[cfg(feature = "dim3")]
pub unsafe extern "C" fn RprRigidBody_translation(this: *const RprRigidBody, out: *mut RprReal) {
    write_rvec(this.get().0.translation(), out);
}

pub struct RprRigidBodyBuilder(pub RigidBodyBuilder);

#[no_mangle]
pub extern "C" fn RprRigidBodyBuilder_fixed() -> *mut RprRigidBodyBuilder {
    leak_ptr(RprRigidBodyBuilder(RigidBodyBuilder::fixed()))
}

#[no_mangle]
pub extern "C" fn RprRigidBodyBuilder_dynamic() -> *mut RprRigidBodyBuilder {
    leak_ptr(RprRigidBodyBuilder(RigidBodyBuilder::dynamic()))
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodyBuilder_drop(this: *mut RprRigidBodyBuilder) {
    drop_ptr(this)
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodyBuilder_build(
    this: *const RprRigidBodyBuilder,
) -> *mut RprRigidBody {
    leak_ptr(RprRigidBody(this.get().0.build()))
}

/// cbindgen:ptrs-as-arrays=[[translation; 2]]
#[no_mangle]
#[cfg(feature = "dim2")]
pub unsafe extern "C" fn RprRigidBodyBuilder_translation(
    this: *mut RprRigidBodyBuilder,
    translation: *const RprReal,
) {
    this.rewrite(|t| RprRigidBodyBuilder(t.0.translation(read_rvec(translation))))
}

/// cbindgen:ptrs-as-arrays=[[translation; 3]]
#[no_mangle]
#[cfg(feature = "dim3")]
pub unsafe extern "C" fn RprRigidBodyBuilder_translation(
    this: *mut RprRigidBodyBuilder,
    translation: *const RprReal,
) {
    this.rewrite(|t| RprRigidBodyBuilder(t.0.translation(read_rvec(translation))))
}
