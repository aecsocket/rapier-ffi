use crate::prelude::*;

pub type RprLockedAxes = u8;

pub fn locked_axes_from(rpr: RprLockedAxes) -> LockedAxes {
    LockedAxes::from_bits(rpr).expect("invalid flags")
}

/// Flag indicating that the rigid-body cannot translate along the `X` axis.
pub const RprLockedAxes_TRANSLATION_LOCKED_X: u8 = 1 << 0;
/// Flag indicating that the rigid-body cannot translate along the `Y` axis.
pub const RprLockedAxes_TRANSLATION_LOCKED_Y: u8 = 1 << 1;
/// Flag indicating that the rigid-body cannot translate along the `Z` axis.
pub const RprLockedAxes_TRANSLATION_LOCKED_Z: u8 = 1 << 2;
/// Flag indicating that the rigid-body cannot translate along any direction.
pub const RprLockedAxes_TRANSLATION_LOCKED: u8 = RprLockedAxes_TRANSLATION_LOCKED_X | RprLockedAxes_TRANSLATION_LOCKED_Y | RprLockedAxes_TRANSLATION_LOCKED_Z;
/// Flag indicating that the rigid-body cannot rotate along the `X` axis.
pub const RprLockedAxes_ROTATION_LOCKED_X: u8 = 1 << 3;
/// Flag indicating that the rigid-body cannot rotate along the `Y` axis.
pub const RprLockedAxes_ROTATION_LOCKED_Y: u8 = 1 << 4;
/// Flag indicating that the rigid-body cannot rotate along the `Z` axis.
pub const RprLockedAxes_ROTATION_LOCKED_Z: u8 = 1 << 5;
/// Combination of flags indicating that the rigid-body cannot rotate along any axis.
pub const RprLockedAxes_ROTATION_LOCKED: u8 = RprLockedAxes_ROTATION_LOCKED_X | RprLockedAxes_ROTATION_LOCKED_Y | RprLockedAxes_ROTATION_LOCKED_Z;

/// The status of a body, governing the way it is affected by external forces.
#[repr(C)]
#[derive(Debug, Clone, Copy)]
pub enum RprRigidBodyType {
    /// A `RigidBodyType::Dynamic` body can be affected by all external forces.
    Dynamic = 0,
    /// A `RigidBodyType::Fixed` body cannot be affected by external forces.
    Fixed = 1,
    /// A `RigidBodyType::KinematicPositionBased` body cannot be affected by any external forces but can be controlled
    /// by the user at the position level while keeping realistic one-way interaction with dynamic bodies.
    ///
    /// One-way interaction means that a kinematic body can push a dynamic body, but a kinematic body
    /// cannot be pushed by anything. In other words, the trajectory of a kinematic body can only be
    /// modified by the user and is independent from any contact or joint it is involved in.
    KinematicPositionBased = 2,
    /// A `RigidBodyType::KinematicVelocityBased` body cannot be affected by any external forces but can be controlled
    /// by the user at the velocity level while keeping realistic one-way interaction with dynamic bodies.
    ///
    /// One-way interaction means that a kinematic body can push a dynamic body, but a kinematic body
    /// cannot be pushed by anything. In other words, the trajectory of a kinematic body can only be
    /// modified by the user and is independent from any contact or joint it is involved in.
    KinematicVelocityBased = 3,
}

impl RprRigidBodyType {
    pub fn into_raw(self) -> RigidBodyType {
        match self {
            Self::Dynamic => RigidBodyType::Dynamic,
            Self::Fixed => RigidBodyType::Fixed,
            Self::KinematicPositionBased => RigidBodyType::KinematicPositionBased,
            Self::KinematicVelocityBased => RigidBodyType::KinematicVelocityBased,
        }
    }

    pub fn from_raw(raw: RigidBodyType) -> Self {
        match raw {
            RigidBodyType::Dynamic => Self::Dynamic,
            RigidBodyType::Fixed => Self::Fixed,
            RigidBodyType::KinematicPositionBased => Self::KinematicPositionBased,
            RigidBodyType::KinematicVelocityBased => Self::KinematicVelocityBased,
        }
    }
}

pub struct RprRigidBodyActivation(pub RigidBodyActivation);

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodyActivation_linear_threshold(this: *const RprRigidBodyActivation) -> Real {
    this.get().0.linear_threshold
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodyActivation_set_linear_threshold(this: *mut RprRigidBodyActivation, value: Real) {
    this.get_mut().0.linear_threshold = value;
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodyActivation_angular_threshold(this: *const RprRigidBodyActivation) -> Real {
    this.get().0.angular_threshold
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodyActivation_set_angular_threshold(this: *mut RprRigidBodyActivation, value: Real) {
    this.get_mut().0.angular_threshold = value;
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodyActivation_time_until_sleep(this: *const RprRigidBodyActivation) -> Real {
    this.get().0.time_until_sleep
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodyActivation_set_time_until_sleep(this: *mut RprRigidBodyActivation, value: Real) {
    this.get_mut().0.time_until_sleep = value;
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodyActivation_time_since_can_sleep(this: *const RprRigidBodyActivation) -> Real {
    this.get().0.time_since_can_sleep
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodyActivation_set_time_since_can_sleep(this: *mut RprRigidBodyActivation, value: Real) {
    this.get_mut().0.time_since_can_sleep = value;
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodyActivation_sleeping(this: *const RprRigidBodyActivation) -> bool {
    this.get().0.sleeping
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodyActivation_set_sleeping(this: *mut RprRigidBodyActivation, value: bool) {
    this.get_mut().0.sleeping = value;
}

pub struct RprRigidBody(pub RigidBody);

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_drop(this: *mut RprRigidBody) {
    drop_ptr(this)
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_activation(this: *const RprRigidBody) -> *const RprRigidBodyActivation {
    this.get().0.activation() as *const RigidBodyActivation as *const RprRigidBodyActivation
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_activation_mut(this: *mut RprRigidBody) -> *mut RprRigidBodyActivation {
    this.get_mut().0.activation_mut() as *mut RigidBodyActivation as *mut RprRigidBodyActivation
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_is_enabled(this: *const RprRigidBody) -> bool {
    this.get().0.is_enabled()
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_set_enabled(this: *mut RprRigidBody, enabled: bool) {
    this.get_mut().0.set_enabled(enabled)
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_linear_damping(this: *const RprRigidBody) -> Real {
    this.get().0.linear_damping()
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_set_linear_damping(this: *mut RprRigidBody, damping: Real) {
    this.get_mut().0.set_linear_damping(damping)
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_angular_damping(this: *const RprRigidBody) -> Real {
    this.get().0.angular_damping()
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_set_angular_damping(this: *mut RprRigidBody, damping: Real) {
    this.get_mut().0.set_angular_damping(damping)
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_body_type(this: *const RprRigidBody) -> RprRigidBodyType {
    RprRigidBodyType::from_raw(this.get().0.body_type())
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_set_body_type(
    this: *mut RprRigidBody,
    status: RprRigidBodyType,
    wake_up: bool,
) {
    this.get_mut().0.set_body_type(status.into_raw(), wake_up)
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_center_of_mass(this: *const RprRigidBody) -> RprVector {
    RprVector::from_point(*this.get().0.center_of_mass())
}

// TODO mass_properties

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_effective_dominance_group(this: *const RprRigidBody) -> i16 {
    this.get().0.effective_dominance_group()
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_set_locked_axes(this: *mut RprRigidBody, locked_axes: RprLockedAxes, wake_up: bool) {
    this.get_mut().0.set_locked_axes(locked_axes_from(locked_axes), wake_up)
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_locked_axes(this: *const RprRigidBody) -> RprLockedAxes {
    this.get().0.locked_axes().bits()
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_lock_rotations(this: *mut RprRigidBody, locked: bool, wake_up: bool) {
    this.get_mut().0.lock_rotations(locked, wake_up)
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_set_enabled_rotations(
    this: *mut RprRigidBody,
    allow_rotations_x: bool,
    allow_rotations_y: bool,
    allow_rotations_z: bool,
    wake_up: bool,
) {
    this.get_mut().0.set_enabled_rotations(
        allow_rotations_x,
        allow_rotations_y,
        allow_rotations_z,
        wake_up,
    )
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_lock_translations(
    this: *mut RprRigidBody,
    locked: bool,
    wake_up: bool,
) {
    this.get_mut().0.lock_translations(locked, wake_up)
}

#[no_mangle]
#[cfg(feature = "dim2")]
pub unsafe extern "C" fn RprRigidBody_set_enabled_translations(
    this: *mut RprRigidBody,
    allow_translation_x: bool,
    allow_translation_y: bool,
    wake_up: bool,
) {
    this.get_mut()
        .0
        .set_enabled_translations(allow_translation_x, allow_translation_y, wake_up)
}

#[no_mangle]
#[cfg(feature = "dim3")]
pub unsafe extern "C" fn RprRigidBody_set_enabled_translations(
    this: *mut RprRigidBody,
    allow_translation_x: bool,
    allow_translation_y: bool,
    allow_translation_z: bool,
    wake_up: bool,
) {
    this.get_mut().0.set_enabled_translations(
        allow_translation_x,
        allow_translation_y,
        allow_translation_z,
        wake_up,
    )
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_is_translation_locked(this: *const RprRigidBody) -> bool {
    this.get().0.is_translation_locked()
}

#[no_mangle]
#[cfg(feature = "dim2")]
pub unsafe extern "C" fn RprRigidBody_is_rotation_locked(
    this: *const RprRigidBody,
    out: *mut [bool; 1],
) {
    out.get_mut()[0] = this.get().0.is_rotation_locked()
}

#[no_mangle]
#[cfg(feature = "dim3")]
pub unsafe extern "C" fn RprRigidBody_is_rotation_locked(
    this: *const RprRigidBody,
    out: *mut [bool; 3],
) {
    out.get_mut()
        .copy_from_slice(&this.get().0.is_rotation_locked())
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_enable_ccd(this: *mut RprRigidBody, enabled: bool) {
    this.get_mut().0.enable_ccd(enabled)
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_is_ccd_enabled(this: *const RprRigidBody) -> bool {
    this.get().0.is_ccd_enabled()
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_is_ccd_active(this: *const RprRigidBody) -> bool {
    this.get().0.is_ccd_active()
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_recompute_mass_properties_from_colliders(
    this: *mut RprRigidBody,
    colliders: *const RprColliderSet,
) {
    this.get_mut()
        .0
        .recompute_mass_properties_from_colliders(&colliders.get().0)
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_set_additional_mass(
    this: *mut RprRigidBody,
    additional_mass: Real,
    wake_up: bool,
) {
    this.get_mut()
        .0
        .set_additional_mass(additional_mass, wake_up)
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_colliders(
    this: *const RprRigidBody,
    out_data: *mut *const RprColliderHandle,
    out_len: *mut usize,
) {
    let slice = this.get().0.colliders();
    *out_data = slice.as_ptr() as *const RprColliderHandle;
    *out_len = slice.len();
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_is_dynamic(this: *const RprRigidBody) -> bool {
    this.get().0.is_dynamic()
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_is_kinematic(this: *const RprRigidBody) -> bool {
    this.get().0.is_kinematic()
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_is_fixed(this: *const RprRigidBody) -> bool {
    this.get().0.is_fixed()
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_mass(this: *const RprRigidBody) -> Real {
    this.get().0.mass()
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_next_position(this: *const RprRigidBody) -> RprIsometry {
    RprIsometry::from_raw(*this.get().0.next_position())
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_gravity_scale(this: *const RprRigidBody) -> Real {
    this.get().0.gravity_scale()
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_set_gravity_scale(
    this: *mut RprRigidBody,
    scale: Real,
    wake_up: bool,
) {
    this.get_mut().0.set_gravity_scale(scale, wake_up)
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_dominance_group(this: *const RprRigidBody) -> i8 {
    this.get().0.dominance_group()
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_set_dominance_group(this: *mut RprRigidBody, dominance: i8) {
    this.get_mut().0.set_dominance_group(dominance)
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_sleep(this: *mut RprRigidBody) {
    this.get_mut().0.sleep()
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_wake_up(this: *mut RprRigidBody, strong: bool) {
    this.get_mut().0.wake_up(strong)
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_is_sleeping(this: *const RprRigidBody) -> bool {
    this.get().0.is_sleeping()
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_linvel(this: *const RprRigidBody) -> RprVector {
    RprVector::from_raw(*this.get().0.linvel())
}

#[no_mangle]
#[cfg(feature = "dim2")]
pub unsafe extern "C" fn RprRigidBody_angvel(this: *const RprRigidBody) -> RprAngVector {
    RprAngVector {
        x: this.get().0.angvel(),
    }
}

#[no_mangle]
#[cfg(feature = "dim3")]
pub unsafe extern "C" fn RprRigidBody_angvel(this: *const RprRigidBody) -> RprAngVector {
    RprAngVector::from_raw(*this.get().0.angvel())
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_set_linvel(
    this: *mut RprRigidBody,
    linvel: RprVector,
    wake_up: bool,
) {
    this.get_mut().0.set_linvel(linvel.into_raw(), wake_up)
}

#[no_mangle]
#[cfg(feature = "dim2")]
pub unsafe extern "C" fn RprRigidBody_set_angvel(
    this: *mut RprRigidBody,
    angvel: RprVector,
    wake_up: bool,
) {
    this.get_mut().0.set_angvel(angvel.x, wake_up)
}

#[no_mangle]
#[cfg(feature = "dim3")]
pub unsafe extern "C" fn RprRigidBody_set_angvel(
    this: *mut RprRigidBody,
    angvel: RprVector,
    wake_up: bool,
) {
    this.get_mut().0.set_angvel(angvel.into_raw(), wake_up)
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_position(this: *const RprRigidBody) -> RprIsometry {
    RprIsometry::from_raw(*this.get().0.position())
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_translation(this: *const RprRigidBody) -> RprVector {
    RprVector::from_raw(*this.get().0.translation())
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_set_translation(
    this: *mut RprRigidBody,
    translation: RprVector,
    wake_up: bool,
) {
    this.get_mut()
        .0
        .set_translation(translation.into_raw(), wake_up)
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_rotation(this: *const RprRigidBody) -> RprRotation {
    RprRotation::from_raw(*this.get().0.rotation())
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_set_rotation(
    this: *mut RprRigidBody,
    rotation: RprRotation,
    wake_up: bool,
) {
    this.get_mut().0.set_rotation(rotation.into_raw(), wake_up)
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_set_position(
    this: *mut RprRigidBody,
    pos: RprIsometry,
    wake_up: bool,
) {
    this.get_mut().0.set_position(pos.into_raw(), wake_up)
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_set_next_kinematic_rotation(
    this: *mut RprRigidBody,
    rotation: RprRotation,
) {
    this.get_mut()
        .0
        .set_next_kinematic_rotation(rotation.into_raw())
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_set_next_kinematic_translation(
    this: *mut RprRigidBody,
    translation: RprVector,
) {
    this.get_mut()
        .0
        .set_next_kinematic_translation(translation.into_raw())
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_set_next_kinematic_position(
    this: *mut RprRigidBody,
    pos: RprIsometry,
) {
    this.get_mut().0.set_next_kinematic_position(pos.into_raw())
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_predict_position_using_velocity_and_forces(
    this: *const RprRigidBody,
    dt: Real,
) -> RprIsometry {
    RprIsometry::from_raw(this.get().0.predict_position_using_velocity_and_forces(dt))
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_reset_forces(this: *mut RprRigidBody, wake_up: bool) {
    this.get_mut().0.reset_forces(wake_up)
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_reset_torques(this: *mut RprRigidBody, wake_up: bool) {
    this.get_mut().0.reset_torques(wake_up)
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_add_force(
    this: *mut RprRigidBody,
    force: RprVector,
    wake_up: bool,
) {
    this.get_mut().0.add_force(force.into_raw(), wake_up)
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_add_torque(
    this: *mut RprRigidBody,
    torque: RprAngVector,
    wake_up: bool,
) {
    this.get_mut().0.add_torque(torque.into_raw(), wake_up)
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_add_force_at_point(
    this: *mut RprRigidBody,
    force: RprVector,
    point: RprVector,
    wake_up: bool,
) {
    this.get_mut()
        .0
        .add_force_at_point(force.into_raw(), point.into_point(), wake_up)
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_apply_impulse(
    this: *mut RprRigidBody,
    impulse: RprVector,
    wake_up: bool,
) {
    this.get_mut().0.apply_impulse(impulse.into_raw(), wake_up)
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_apply_torque_impulse(
    this: *mut RprRigidBody,
    torque_impulse: RprAngVector,
    wake_up: bool,
) {
    this.get_mut()
        .0
        .apply_torque_impulse(torque_impulse.into_raw(), wake_up)
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_apply_impulse_at_point(
    this: *mut RprRigidBody,
    impulse: RprVector,
    point: RprVector,
    wake_up: bool,
) {
    this.get_mut()
        .0
        .apply_impulse_at_point(impulse.into_raw(), point.into_point(), wake_up)
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_user_force(this: *const RprRigidBody) -> RprVector {
    RprVector::from_raw(this.get().0.user_force())
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_user_torque(this: *const RprRigidBody) -> RprAngVector {
    RprAngVector::from_raw(this.get().0.user_torque())
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_velocity_at_point(
    this: *const RprRigidBody,
    point: RprVector,
) -> RprVector {
    RprVector::from_raw(this.get().0.velocity_at_point(&point.into_point()))
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_kinetic_energy(this: *const RprRigidBody) -> Real {
    this.get().0.kinetic_energy()
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBody_gravitational_potential_energy(
    this: *const RprRigidBody,
    dt: Real,
    gravity: RprVector,
) -> Real {
    this.get()
        .0
        .gravitational_potential_energy(dt, gravity.into_raw())
}

pub struct RprRigidBodyBuilder(pub RigidBodyBuilder);

#[no_mangle]
pub extern "C" fn RprRigidBodyBuilder_new(body_type: RprRigidBodyType) -> *mut RprRigidBodyBuilder {
    leak_ptr(RprRigidBodyBuilder(RigidBodyBuilder::new(
        body_type.into_raw(),
    )))
}

#[no_mangle]
pub extern "C" fn RprRigidBodyBuilder_fixed() -> *mut RprRigidBodyBuilder {
    leak_ptr(RprRigidBodyBuilder(RigidBodyBuilder::fixed()))
}

#[no_mangle]
pub extern "C" fn RprRigidBodyBuilder_kinematic_velocity_based() -> *mut RprRigidBodyBuilder {
    leak_ptr(RprRigidBodyBuilder(
        RigidBodyBuilder::kinematic_velocity_based(),
    ))
}

#[no_mangle]
pub extern "C" fn RprRigidBodyBuilder_kinematic_position_based() -> *mut RprRigidBodyBuilder {
    leak_ptr(RprRigidBodyBuilder(
        RigidBodyBuilder::kinematic_position_based(),
    ))
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

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodyBuilder_gravity_scale(
    this: *mut RprRigidBodyBuilder,
    scale_factor: Real,
) {
    this.rewrite(|t| RprRigidBodyBuilder(t.0.gravity_scale(scale_factor)))
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodyBuilder_dominance_group(
    this: *mut RprRigidBodyBuilder,
    group: i8,
) {
    this.rewrite(|t| RprRigidBodyBuilder(t.0.dominance_group(group)))
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodyBuilder_translation(
    this: *mut RprRigidBodyBuilder,
    translation: RprVector,
) {
    this.rewrite(|t| RprRigidBodyBuilder(t.0.translation(translation.into_raw())))
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodyBuilder_rotation(
    this: *mut RprRigidBodyBuilder,
    rotation: RprAngVector,
) {
    this.rewrite(|t| RprRigidBodyBuilder(t.0.rotation(rotation.into_raw())))
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodyBuilder_position(
    this: *mut RprRigidBodyBuilder,
    position: RprIsometry,
) {
    this.rewrite(|t| RprRigidBodyBuilder(t.0.position(position.into_raw())))
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodyBuilder_additional_mass(
    this: *mut RprRigidBodyBuilder,
    mass: Real,
) {
    this.rewrite(|t| RprRigidBodyBuilder(t.0.additional_mass(mass)))
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodyBuilder_linear_damping(
    this: *mut RprRigidBodyBuilder,
    factor: Real,
) {
    this.rewrite(|t| RprRigidBodyBuilder(t.0.linear_damping(factor)))
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodyBuilder_angular_damping(
    this: *mut RprRigidBodyBuilder,
    factor: Real,
) {
    this.rewrite(|t| RprRigidBodyBuilder(t.0.angular_damping(factor)))
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodyBuilder_linvel(
    this: *mut RprRigidBodyBuilder,
    linvel: RprVector,
) {
    this.rewrite(|t| RprRigidBodyBuilder(t.0.linvel(linvel.into_raw())))
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodyBuilder_angvel(
    this: *mut RprRigidBodyBuilder,
    angvel: RprAngVector,
) {
    this.rewrite(|t| RprRigidBodyBuilder(t.0.angvel(angvel.into_raw())))
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodyBuilder_can_sleep(
    this: *mut RprRigidBodyBuilder,
    can_sleep: bool,
) {
    this.rewrite(|t| RprRigidBodyBuilder(t.0.can_sleep(can_sleep)))
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodyBuilder_ccd_enabled(
    this: *mut RprRigidBodyBuilder,
    enabled: bool,
) {
    this.rewrite(|t| RprRigidBodyBuilder(t.0.ccd_enabled(enabled)))
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodyBuilder_sleeping(
    this: *mut RprRigidBodyBuilder,
    sleeping: bool,
) {
    this.rewrite(|t| RprRigidBodyBuilder(t.0.sleeping(sleeping)))
}

#[no_mangle]
pub unsafe extern "C" fn RprRigidBodyBuilder_enabled(
    this: *mut RprRigidBodyBuilder,
    enabled: bool,
) {
    this.rewrite(|t| RprRigidBodyBuilder(t.0.enabled(enabled)))
}
