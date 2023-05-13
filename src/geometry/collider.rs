use crate::prelude::*;

pub struct RprCollider(pub Collider);

#[no_mangle]
pub unsafe extern "C" fn RprCollider_drop(this: *mut RprCollider) {
    drop_ptr(this)
}

pub struct RprColliderBuilder(pub ColliderBuilder);

#[no_mangle]
pub unsafe extern "C" fn RprColliderBuilder_new(
    shape: *mut RprSharedShape,
) -> *mut RprColliderBuilder {
    leak_ptr(RprColliderBuilder(ColliderBuilder::new(shape.read().0)))
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
pub unsafe extern "C" fn RprColliderBuilder_sensor(this: *mut RprColliderBuilder, sensor: bool) {
    this.rewrite(|t| RprColliderBuilder(t.0.sensor(sensor)))
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderBuilder_friction(
    this: *mut RprColliderBuilder,
    friction: Real,
) {
    this.rewrite(|t| RprColliderBuilder(t.0.friction(friction)))
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderBuilder_friction_combine_rule(
    this: *mut RprColliderBuilder,
    rule: RprCoefficientCombineRule,
) {
    this.rewrite(|t| RprColliderBuilder(t.0.friction_combine_rule(rule.into_raw())))
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderBuilder_restitution(
    this: *mut RprColliderBuilder,
    restitution: Real,
) {
    this.rewrite(|t| RprColliderBuilder(t.0.restitution(restitution)))
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderBuilder_restitution_combine_rule(
    this: *mut RprColliderBuilder,
    rule: RprCoefficientCombineRule,
) {
    this.rewrite(|t| RprColliderBuilder(t.0.restitution_combine_rule(rule.into_raw())))
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderBuilder_density(this: *mut RprColliderBuilder, density: Real) {
    this.rewrite(|t| RprColliderBuilder(t.0.density(density)))
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderBuilder_mass(this: *mut RprColliderBuilder, mass: Real) {
    this.rewrite(|t| RprColliderBuilder(t.0.mass(mass)))
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderBuilder_contact_force_event_threshold(
    this: *mut RprColliderBuilder,
    threshold: Real,
) {
    this.rewrite(|t| RprColliderBuilder(t.0.contact_force_event_threshold(threshold)))
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderBuilder_translation(
    this: *mut RprColliderBuilder,
    translation: RprVec,
) {
    this.rewrite(|t| RprColliderBuilder(t.0.translation(translation.into_raw())))
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderBuilder_rotation(
    this: *mut RprColliderBuilder,
    rotation: RprAngVec,
) {
    this.rewrite(|t| RprColliderBuilder(t.0.rotation(rotation.into_raw())))
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderBuilder_position(
    this: *mut RprColliderBuilder,
    position: RprIso,
) {
    this.rewrite(|t| RprColliderBuilder(t.0.position(position.into_raw())))
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderBuilder_enabled(this: *mut RprColliderBuilder, enabled: bool) {
    this.rewrite(|t| RprColliderBuilder(t.0.enabled(enabled)))
}
