use crate::prelude::*;

pub struct RprCollider(pub Collider);

#[no_mangle]
pub unsafe extern "C" fn RprCollider_drop(this: *mut RprCollider) {
    drop_ptr(this)
}

pub struct RprColliderBuilder(pub ColliderBuilder);

#[no_mangle]
pub extern "C" fn RprColliderBuilder_ball(radius: RprReal) -> *mut RprColliderBuilder {
    leak_ptr(RprColliderBuilder(ColliderBuilder::ball(radius)))
}

#[no_mangle]
pub extern "C" fn RprColliderBuilder_cuboid(
    hx: RprReal,
    hy: RprReal,
    hz: RprReal,
) -> *mut RprColliderBuilder {
    leak_ptr(RprColliderBuilder(ColliderBuilder::cuboid(hx, hy, hz)))
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderBuilder_drop(this: *mut RprColliderBuilder) {
    drop_ptr(this)
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderBuilder_build(
    this: *mut RprColliderBuilder,
) -> *mut RprCollider {
    leak_ptr(RprCollider(this.get_mut().0.build()))
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderBuilder_restitution(
    this: *mut RprColliderBuilder,
    restitution: RprReal,
) {
    this.rewrite(|t| RprColliderBuilder(t.0.restitution(restitution)))
}
