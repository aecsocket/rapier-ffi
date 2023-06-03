use crate::prelude::*;

pub type RprActiveHooks = u32;

pub fn active_hooks_from(rpr: RprActiveHooks) -> ActiveHooks {
    ActiveHooks::from_bits(rpr).expect("invalid flags")
}

/// If set, Rapier will call `PhysicsHooks::filter_contact_pair` whenever relevant.
pub const RprActiveHooks_FILTER_CONTACT_PAIRS: u32 = 0b0001;
/// If set, Rapier will call `PhysicsHooks::filter_intersection_pair` whenever relevant.
pub const RprActiveHooks_FILTER_INTERSECTION_PAIR: u32 = 0b0010;
/// If set, Rapier will call `PhysicsHooks::modify_solver_contact` whenever relevant.
pub const RprActiveHooks_MODIFY_SOLVER_CONTACTS: u32 = 0b0100;

pub type RprActiveEvents = u32;

pub fn active_events_from(rpr: RprActiveEvents) -> ActiveEvents {
    ActiveEvents::from_bits(rpr).expect("invalid flags")
}

/// If set, Rapier will call `EventHandler::handle_collision_event`
/// whenever relevant for this collider.
pub const RprActiveEvents_COLLISION_EVENTS: u32 = 0b0001;
/// If set, Rapier will call `EventHandler::handle_contact_force_event`
/// whenever relevant for this collider.
pub const RprActiveEvents_CONTACT_FORCE_EVENTS: u32 = 0b0010;

pub type RprActiveCollisionTypes = u16;

pub fn active_collision_types_from(rpr: RprActiveCollisionTypes) -> ActiveCollisionTypes {
    ActiveCollisionTypes::from_bits(rpr).expect("invalid flags")
}

/// Enable collision-detection between a collider attached to a dynamic body
/// and another collider attached to a dynamic body.
pub const RprActiveCollisionTypes_DYNAMIC_DYNAMIC: u16 = 0b0000_0000_0000_0001;
/// Enable collision-detection between a collider attached to a dynamic body
/// and another collider attached to a kinematic body.
pub const RprActiveCollisionTypes_DYNAMIC_KINEMATIC: u16 = 0b0000_0000_0000_1100;
/// Enable collision-detection between a collider attached to a dynamic body
/// and another collider attached to a fixed body (or not attached to any body).
pub const RprActiveCollisionTypes_DYNAMIC_FIXED: u16 = 0b0000_0000_0000_0010;
/// Enable collision-detection between a collider attached to a kinematic body
/// and another collider attached to a kinematic body.
pub const RprActiveCollisionTypes_KINEMATIC_KINEMATIC: u16 = 0b1100_1100_0000_0000;

/// Enable collision-detection between a collider attached to a kinematic body
/// and another collider attached to a fixed body (or not attached to any body).
pub const RprActiveCollisionTypes_KINEMATIC_FIXED: u16 = 0b0010_0010_0000_0000;

/// Enable collision-detection between a collider attached to a fixed body (or
/// not attached to any body) and another collider attached to a fixed body (or
/// not attached to any body).
pub const RprActiveCollisionTypes_FIXED_FIXED: u16 = 0b0000_0000_0010_0000;

/// The constraints solver-related properties of this collider (friction, restitution, etc.)
#[repr(C)]
#[derive(Debug, Clone, Copy)]
pub struct RprColliderMaterial {
    /// The friction coefficient of this collider.
    ///
    /// The greater the value, the stronger the friction forces will be.
    /// Should be `>= 0`.
    pub friction: Real,
    /// The restitution coefficient of this collider.
    ///
    /// Increase this value to make contacts with this collider more "bouncy".
    /// Should be `>= 0` and should generally not be greater than `1` (perfectly elastic
    /// collision).
    pub restitution: Real,
    /// The rule applied to combine the friction coefficients of two colliders in contact.
    pub friction_combine_rule: RprCoefficientCombineRule,
    /// The rule applied to combine the restitution coefficients of two colliders.
    pub restitution_combine_rule: RprCoefficientCombineRule,
}

impl RprColliderMaterial {
    pub fn from_raw(raw: ColliderMaterial) -> Self {
        Self {
            friction: raw.friction,
            restitution: raw.restitution,
            friction_combine_rule: RprCoefficientCombineRule::from_raw(raw.friction_combine_rule),
            restitution_combine_rule: RprCoefficientCombineRule::from_raw(
                raw.restitution_combine_rule,
            ),
        }
    }

    pub fn into_raw(self) -> ColliderMaterial {
        ColliderMaterial {
            friction: self.friction,
            restitution: self.restitution,
            friction_combine_rule: self.friction_combine_rule.into_raw(),
            restitution_combine_rule: self.restitution_combine_rule.into_raw(),
        }
    }
}

impl Default for RprColliderMaterial {
    fn default() -> Self {
        Self::from_raw(ColliderMaterial::default())
    }
}

#[no_mangle]
pub extern "C" fn RprColliderMaterial_default() -> RprColliderMaterial {
    RprColliderMaterial::default()
}

pub struct RprCollider(pub Collider);

#[no_mangle]
pub unsafe extern "C" fn RprCollider_drop(this: *mut RprCollider) {
    drop_ptr(this)
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_parent(this: *const RprCollider) -> RprRigidBodyHandle {
    match this.get().0.parent() {
        Some(t) => RprRigidBodyHandle::from_raw(t.0),
        None => RprRigidBodyHandle::invalid(),
    }
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_is_sensor(this: *const RprCollider) -> bool {
    this.get().0.is_sensor()
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_active_hooks(this: *const RprCollider) -> RprActiveHooks {
    this.get().0.active_hooks().bits()
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_set_active_hooks(
    this: *mut RprCollider,
    active_hooks: RprActiveHooks,
) {
    this.get_mut()
        .0
        .set_active_hooks(active_hooks_from(active_hooks))
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_active_events(this: *const RprCollider) -> RprActiveEvents {
    this.get().0.active_events().bits()
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_set_active_events(
    this: *mut RprCollider,
    active_events: RprActiveEvents,
) {
    this.get_mut()
        .0
        .set_active_events(active_events_from(active_events))
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_active_collision_types(
    this: *const RprCollider,
) -> RprActiveCollisionTypes {
    this.get().0.active_collision_types().bits()
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_set_active_collision_types(
    this: *mut RprCollider,
    active_collision_types: RprActiveCollisionTypes,
) {
    this.get_mut()
        .0
        .set_active_collision_types(active_collision_types_from(active_collision_types))
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_friction(this: *const RprCollider) -> Real {
    this.get().0.friction()
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_set_friction(this: *mut RprCollider, coefficient: Real) {
    this.get_mut().0.set_friction(coefficient)
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_friction_combine_rule(
    this: *const RprCollider,
) -> RprCoefficientCombineRule {
    RprCoefficientCombineRule::from_raw(this.get().0.friction_combine_rule())
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_set_friction_combine_rule(
    this: *mut RprCollider,
    rule: RprCoefficientCombineRule,
) {
    this.get_mut().0.set_friction_combine_rule(rule.into_raw())
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_restitution(this: *const RprCollider) -> Real {
    this.get().0.restitution()
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_set_restitution(this: *mut RprCollider, coefficient: Real) {
    this.get_mut().0.set_restitution(coefficient)
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_restitution_combine_rule(
    this: *const RprCollider,
) -> RprCoefficientCombineRule {
    RprCoefficientCombineRule::from_raw(this.get().0.restitution_combine_rule())
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_set_restitution_combine_rule(
    this: *mut RprCollider,
    rule: RprCoefficientCombineRule,
) {
    this.get_mut()
        .0
        .set_restitution_combine_rule(rule.into_raw())
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_set_contact_force_event_threshold(
    this: *mut RprCollider,
    threshold: Real,
) {
    this.get_mut()
        .0
        .set_contact_force_event_threshold(threshold)
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_set_sensor(this: *mut RprCollider, is_sensor: bool) {
    this.get_mut().0.set_sensor(is_sensor)
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_is_enabled(this: *const RprCollider) -> bool {
    this.get().0.is_enabled()
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_set_enabled(this: *mut RprCollider, enabled: bool) {
    this.get_mut().0.set_enabled(enabled)
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_set_translation(
    this: *mut RprCollider,
    translation: RprVector,
) {
    this.get_mut().0.set_translation(translation.into_raw())
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_set_rotation(this: *mut RprCollider, rotation: RprRotation) {
    this.get_mut().0.set_rotation(rotation.into_raw())
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_set_position(this: *mut RprCollider, position: RprIsometry) {
    this.get_mut().0.set_position(position.into_raw())
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_position(this: *const RprCollider) -> RprIsometry {
    RprIsometry::from_raw(*this.get().0.position())
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_translation(this: *const RprCollider) -> RprVector {
    RprVector::from_raw(*this.get().0.translation())
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_rotation(this: *const RprCollider) -> RprRotation {
    RprRotation::from_raw(*this.get().0.rotation())
}

// SAFETY: this can only be called if the collider has a parent
#[no_mangle]
pub unsafe extern "C" fn RprCollider_position_wrt_parent(this: *const RprCollider) -> RprIsometry {
    RprIsometry::from_raw(
        *this
            .get()
            .0
            .position_wrt_parent()
            .expect("cannot access position_wrt_parent of collider without parent"),
    )
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_set_translation_wrt_parent(
    this: *mut RprCollider,
    translation: RprVector,
) {
    this.get_mut()
        .0
        .set_translation_wrt_parent(translation.into_raw())
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_set_rotation_wrt_parent(
    this: *mut RprCollider,
    rotation: RprAngVector,
) {
    this.get_mut()
        .0
        .set_rotation_wrt_parent(rotation.into_raw())
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_set_position_wrt_parent(
    this: *mut RprCollider,
    pos_wrt_parent: RprIsometry,
) {
    this.get_mut()
        .0
        .set_position_wrt_parent(pos_wrt_parent.into_raw())
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_collision_groups(this: *const RprCollider) -> RprInteractionGroups {
    RprInteractionGroups::from_raw(this.get().0.collision_groups())
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_set_collision_groups(this: *mut RprCollider, groups: RprInteractionGroups) {
    this.get_mut().0.set_collision_groups(groups.into_raw())
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_solver_groups(this: *const RprCollider) -> RprInteractionGroups {
    RprInteractionGroups::from_raw(this.get().0.solver_groups())
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_set_solver_groups(this: *mut RprCollider, groups: RprInteractionGroups) {
    this.get_mut().0.set_solver_groups(groups.into_raw())
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_material(this: *const RprCollider) -> RprColliderMaterial {
    RprColliderMaterial::from_raw(*this.get().0.material())
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_volume(this: *const RprCollider) -> Real {
    this.get().0.volume()
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_density(this: *const RprCollider) -> Real {
    this.get().0.density()
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_mass(this: *const RprCollider) -> Real {
    this.get().0.mass()
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_set_density(this: *mut RprCollider, density: Real) {
    this.get_mut().0.set_density(density)
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_set_mass(this: *mut RprCollider, mass: Real) {
    this.get_mut().0.set_mass(mass)
}

// TODO set_mass_properties

#[no_mangle]
pub unsafe extern "C" fn RprCollider_shape(this: *const RprCollider) -> *const RprSharedShape {
    this.get().0.shared_shape() as *const SharedShape as *const RprSharedShape
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_set_shape(this: *mut RprCollider, shape: *mut RprSharedShape) {
    this.get_mut().0.set_shape(shape.read().0)
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_compute_aabb(this: *const RprCollider) -> RprAabb {
    RprAabb::from_raw(this.get().0.compute_aabb())
}

#[no_mangle]
pub unsafe extern "C" fn RprCollider_compute_swept_aabb(
    this: *const RprCollider,
    next_position: RprIsometry,
) -> RprAabb {
    RprAabb::from_raw(this.get().0.compute_swept_aabb(&next_position.into_raw()))
}

// TODO mass_properties

#[no_mangle]
pub unsafe extern "C" fn RprCollider_contact_force_event_threshold(
    this: *const RprCollider,
) -> Real {
    this.get().0.contact_force_event_threshold()
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
pub unsafe extern "C" fn RprColliderBuilder_collision_groups(this: *mut RprColliderBuilder, groups: RprInteractionGroups) {
    this.rewrite(|t| RprColliderBuilder(t.0.collision_groups(groups.into_raw())))
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderBuilder_solver_groups(this: *mut RprColliderBuilder, groups: RprInteractionGroups) {
    this.rewrite(|t| RprColliderBuilder(t.0.solver_groups(groups.into_raw())))
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderBuilder_sensor(this: *mut RprColliderBuilder, sensor: bool) {
    this.rewrite(|t| RprColliderBuilder(t.0.sensor(sensor)))
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderBuilder_active_hooks(
    this: *mut RprColliderBuilder,
    active_hooks: RprActiveHooks,
) {
    this.rewrite(|t| RprColliderBuilder(t.0.active_hooks(active_hooks_from(active_hooks))))
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderBuilder_active_events(
    this: *mut RprColliderBuilder,
    active_events: RprActiveEvents,
) {
    this.rewrite(|t| RprColliderBuilder(t.0.active_events(active_events_from(active_events))))
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderBuilder_active_collision_types(
    this: *mut RprColliderBuilder,
    active_collision_types: RprActiveCollisionTypes,
) {
    this.rewrite(|t| {
        RprColliderBuilder(
            t.0.active_collision_types(active_collision_types_from(active_collision_types)),
        )
    })
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
    translation: RprVector,
) {
    this.rewrite(|t| RprColliderBuilder(t.0.translation(translation.into_raw())))
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderBuilder_rotation(
    this: *mut RprColliderBuilder,
    rotation: RprAngVector,
) {
    this.rewrite(|t| RprColliderBuilder(t.0.rotation(rotation.into_raw())))
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderBuilder_position(
    this: *mut RprColliderBuilder,
    position: RprIsometry,
) {
    this.rewrite(|t| RprColliderBuilder(t.0.position(position.into_raw())))
}

#[no_mangle]
pub unsafe extern "C" fn RprColliderBuilder_enabled(this: *mut RprColliderBuilder, enabled: bool) {
    this.rewrite(|t| RprColliderBuilder(t.0.enabled(enabled)))
}
