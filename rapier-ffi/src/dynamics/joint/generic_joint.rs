use crate::prelude::*;

pub type RprJointAxesMask = u8;

fn joint_axes_mask_from(axes: RprJointAxesMask) -> JointAxesMask {
    JointAxesMask::from_bits(axes).expect("invalid axes mask")
}

/// Identifiers of degrees of freedoms of a joint.
#[repr(C)]
#[derive(Debug, Clone, Copy)]
pub enum RprJointAxis {
    /// The translational degree of freedom along the joint’s local X axis.
    X = 0,
    /// The translational degree of freedom along the joint’s local Y axis.
    Y,
    /// The translational degree of freedom along the joint’s local Z axis.
    #[cfg(feature = "dim3")]
    Z,
    /// The rotational degree of freedom along the joint’s local X axis.
    AngX,
    /// The rotational degree of freedom along the joint’s local Y axis.
    #[cfg(feature = "dim3")]
    AngY,
    /// The rotational degree of freedom along the joint’s local Z axis.
    #[cfg(feature = "dim3")]
    AngZ,
}

impl RprJointAxis {
    pub fn into_raw(self) -> JointAxis {
        match self {
            Self::X => JointAxis::X,
            Self::Y => JointAxis::Y,
            #[cfg(feature = "dim3")]
            Self::Z => JointAxis::Z,
            Self::AngX => JointAxis::AngX,
            #[cfg(feature = "dim3")]
            Self::AngY => JointAxis::AngY,
            #[cfg(feature = "dim3")]
            Self::AngZ => JointAxis::AngZ,
        }
    }

    pub fn from_raw(raw: JointAxis) -> Self {
        match raw {
            JointAxis::X => Self::X,
            JointAxis::Y => Self::Y,
            #[cfg(feature = "dim3")]
            JointAxis::Z => Self::Z,
            JointAxis::AngX => Self::AngX,
            #[cfg(feature = "dim3")]
            JointAxis::AngY => Self::AngY,
            #[cfg(feature = "dim3")]
            JointAxis::AngZ => Self::AngZ,
        }
    }
}

/// The translational degree of freedom along the local X axis of a joint.
#[cfg(feature = "dim2")]
pub const RprJointAxesMask_X: u8 = 0x1;
/// The translational degree of freedom along the local Y axis of a joint.
#[cfg(feature = "dim2")]
pub const RprJointAxesMask_Y: u8 = 0x2;
/// The angular degree of freedom along the local X axis of a joint.
#[cfg(feature = "dim2")]
pub const RprJointAxesMask_ANG_X: u8 = 0x4;
/// The set of degrees of freedom locked by a revolute joint.
#[cfg(feature = "dim2")]
pub const RprJointAxesMask_LOCKED_REVOLUTE_AXES: u8 = RprJointAxesMask_X | RprJointAxesMask_Y;
/// The set of degrees of freedom locked by a prismatic joint.
#[cfg(feature = "dim2")]
pub const RprJointAxesMask_LOCKED_PRISMATIC_AXES: u8 = RprJointAxesMask_Y | RprJointAxesMask_ANG_X;
/// The set of degrees of freedom locked by a fixed joint.
#[cfg(feature = "dim2")]
pub const RprJointAxesMask_LOCKED_FIXED_AXES: u8 =
    RprJointAxesMask_X | RprJointAxesMask_Y | RprJointAxesMask_ANG_X;
/// The set of degrees of freedom left free by a revolute joint.
#[cfg(feature = "dim2")]
pub const RprJointAxesMask_FREE_REVOLUTE_AXES: u8 = RprJointAxesMask_ANG_X;
/// The set of degrees of freedom left free by a prismatic joint.
#[cfg(feature = "dim2")]
pub const RprJointAxesMask_FREE_PRISMATIC_AXES: u8 = RprJointAxesMask_X;
/// The set of degrees of freedom left free by a fixed joint.
#[cfg(feature = "dim2")]
pub const RprJointAxesMask_FREE_FIXED_AXES: u8 = 0;
/// The set of all translational degrees of freedom.
#[cfg(feature = "dim2")]
pub const RprJointAxesMask_LIN_AXES: u8 = RprJointAxesMask_X | RprJointAxesMask_Y;
/// The set of all angular degrees of freedom.
#[cfg(feature = "dim2")]
pub const RprJointAxesMask_ANG_AXES: u8 = RprJointAxesMask_ANG_X;

/// The translational degree of freedom along the local X axis of a joint.
#[cfg(feature = "dim3")]
pub const RprJointAxesMask_X: u8 = 0x1;
/// The translational degree of freedom along the local Y axis of a joint.
#[cfg(feature = "dim3")]
pub const RprJointAxesMask_Y: u8 = 0x2;
/// The translational degree of freedom along the local Z axis of a joint.
#[cfg(feature = "dim3")]
pub const RprJointAxesMask_Z: u8 = 0x4;
/// The angular degree of freedom along the local X axis of a joint.
#[cfg(feature = "dim3")]
pub const RprJointAxesMask_ANG_X: u8 = 0x8;
/// The angular degree of freedom along the local Y axis of a joint.
#[cfg(feature = "dim3")]
pub const RprJointAxesMask_ANG_Y: u8 = 0x10;
/// The angular degree of freedom along the local Z axis of a joint.
#[cfg(feature = "dim3")]
pub const RprJointAxesMask_ANG_Z: u8 = 0x20;
/// The set of degrees of freedom locked by a revolute joint.
#[cfg(feature = "dim3")]
pub const RprJointAxesMask_LOCKED_REVOLUTE_AXES: u8 = RprJointAxesMask_X
    | RprJointAxesMask_Y
    | RprJointAxesMask_Z
    | RprJointAxesMask_ANG_Y
    | RprJointAxesMask_ANG_Z;
/// The set of degrees of freedom locked by a prismatic joint.
#[cfg(feature = "dim3")]
pub const RprJointAxesMask_LOCKED_PRISMATIC_AXES: u8 = RprJointAxesMask_Y
    | RprJointAxesMask_Z
    | RprJointAxesMask_ANG_X
    | RprJointAxesMask_ANG_Y
    | RprJointAxesMask_ANG_Z;
/// The set of degrees of freedom locked by a fixed joint.
#[cfg(feature = "dim3")]
pub const RprJointAxesMask_LOCKED_FIXED_AXES: u8 = RprJointAxesMask_X
    | RprJointAxesMask_Y
    | RprJointAxesMask_Z
    | RprJointAxesMask_ANG_X
    | RprJointAxesMask_ANG_Y
    | RprJointAxesMask_ANG_Z;
/// The set of degrees of freedom locked by a spherical joint.
#[cfg(feature = "dim3")]
pub const RprJointAxesMask_LOCKED_SPHERICAL_AXES: u8 =
    RprJointAxesMask_X | RprJointAxesMask_Y | RprJointAxesMask_Z;
/// The set of degrees of freedom left free by a revolute joint.
#[cfg(feature = "dim3")]
pub const RprJointAxesMask_FREE_REVOLUTE_AXES: u8 = RprJointAxesMask_ANG_X;
/// The set of degrees of freedom left free by a prismatic joint.
#[cfg(feature = "dim3")]
pub const RprJointAxesMask_FREE_PRISMATIC_AXES: u8 = RprJointAxesMask_X;
/// The set of degrees of freedom left free by a fixed joint.
#[cfg(feature = "dim3")]
pub const RprJointAxesMask_FREE_FIXED_AXES: u8 = 0;
/// The set of degrees of freedom left free by a spherical joint.
#[cfg(feature = "dim3")]
pub const RprJointAxesMask_FREE_SPHERICAL_AXES: u8 =
    RprJointAxesMask_ANG_X | RprJointAxesMask_ANG_Y | RprJointAxesMask_ANG_Z;
/// The set of all translational degrees of freedom.
#[cfg(feature = "dim3")]
pub const RprJointAxesMask_LIN_AXES: u8 =
    RprJointAxesMask_X | RprJointAxesMask_Y | RprJointAxesMask_Z;
/// The set of all angular degrees of freedom.
#[cfg(feature = "dim3")]
pub const RprJointAxesMask_ANG_AXES: u8 =
    RprJointAxesMask_ANG_X | RprJointAxesMask_ANG_Y | RprJointAxesMask_ANG_Z;

/// The limits of a joint along one of its degrees of freedom.
#[repr(C)]
#[derive(Debug, Clone, Copy)]
pub struct RprJointLimits {
    /// The minimum bound of the joint limit.
    pub min: Real,
    /// The maximum bound of the joint limit.
    pub max: Real,
    /// The impulse applied to enforce the joint’s limit.
    pub impulse: Real,
}

impl RprJointLimits {
    pub fn from_raw(raw: JointLimits<Real>) -> Self {
        Self {
            min: raw.min,
            max: raw.max,
            impulse: raw.impulse,
        }
    }

    pub fn into_raw(&self) -> JointLimits<Real> {
        JointLimits {
            min: self.min,
            max: self.max,
            impulse: self.impulse,
        }
    }
}

impl Default for RprJointLimits {
    fn default() -> Self {
        Self::from_raw(JointLimits::default())
    }
}

#[no_mangle]
pub extern "C" fn RprJointLimits_default() -> RprJointLimits {
    RprJointLimits::default()
}

/// A joint’s motor along one of its degrees of freedom.
#[repr(C)]
#[derive(Debug, Clone, Copy)]
pub struct RprJointMotor {
    /// The target velocity of the motor.
    pub target_vel: Real,
    /// The target position of the motor.
    pub target_pos: Real,
    /// The stiffness coefficient of the motor’s spring-like equation.
    pub stiffness: Real,
    /// The damping coefficient of the motor’s spring-like equation.
    pub damping: Real,
    /// The maximum force this motor can deliver.
    pub max_force: Real,
    /// The impulse applied by this motor.
    pub impulse: Real,
    /// The spring-like model used for simulating this motor.
    pub model: RprMotorModel,
}

impl RprJointMotor {
    pub fn from_raw(raw: JointMotor) -> Self {
        Self {
            target_vel: raw.target_vel,
            target_pos: raw.target_pos,
            stiffness: raw.stiffness,
            damping: raw.damping,
            max_force: raw.max_force,
            impulse: raw.impulse,
            model: RprMotorModel::from_raw(raw.model),
        }
    }

    pub fn into_raw(&self) -> JointMotor {
        JointMotor {
            target_vel: self.target_vel,
            target_pos: self.target_pos,
            stiffness: self.stiffness,
            damping: self.damping,
            max_force: self.max_force,
            impulse: self.impulse,
            model: self.model.into_raw(),
        }
    }
}

impl Default for RprJointMotor {
    fn default() -> Self {
        Self::from_raw(JointMotor::default())
    }
}

#[no_mangle]
pub extern "C" fn RprJointMotor_default() -> RprJointMotor {
    RprJointMotor::from_raw(JointMotor::default())
}

pub struct RprGenericJoint(pub GenericJoint);

#[no_mangle]
pub unsafe extern "C" fn RprGenericJoint_new(
    locked_axes: RprJointAxesMask,
) -> *mut RprGenericJoint {
    leak_ptr(RprGenericJoint(GenericJoint::new(joint_axes_mask_from(
        locked_axes,
    ))))
}

#[no_mangle]
pub unsafe extern "C" fn RprGenericJoint_drop(this: *mut RprGenericJoint) {
    drop_ptr(this)
}

#[no_mangle]
pub unsafe extern "C" fn RprGenericJoint_locked_axes(
    this: *mut RprGenericJoint,
) -> RprJointAxesMask {
    this.get_mut().0.locked_axes.bits()
}

#[no_mangle]
pub unsafe extern "C" fn RprGenericJoint_is_enabled(this: *const RprGenericJoint) -> bool {
    this.get().0.is_enabled()
}

#[no_mangle]
pub unsafe extern "C" fn RprGenericJoint_set_enabled(this: *mut RprGenericJoint, enabled: bool) {
    this.get_mut().0.set_enabled(enabled)
}

#[no_mangle]
pub unsafe extern "C" fn RprGenericJoint_lock_axes(
    this: *mut RprGenericJoint,
    axes: RprJointAxesMask,
) {
    this.get_mut().0.lock_axes(joint_axes_mask_from(axes));
}

#[no_mangle]
pub unsafe extern "C" fn RprGenericJoint_local_frame1(this: *const RprGenericJoint) -> RprIsometry {
    RprIsometry::from_raw(this.get().0.local_frame1)
}

#[no_mangle]
pub unsafe extern "C" fn RprGenericJoint_set_local_frame1(
    this: *mut RprGenericJoint,
    local_frame: RprIsometry,
) {
    this.get_mut().0.set_local_frame1(local_frame.into_raw());
}

#[no_mangle]
pub unsafe extern "C" fn RprGenericJoint_local_frame2(this: *const RprGenericJoint) -> RprIsometry {
    RprIsometry::from_raw(this.get().0.local_frame2)
}

#[no_mangle]
pub unsafe extern "C" fn RprGenericJoint_set_local_frame2(
    this: *mut RprGenericJoint,
    local_frame: RprIsometry,
) {
    this.get_mut().0.set_local_frame2(local_frame.into_raw());
}

#[no_mangle]
pub unsafe extern "C" fn RprGenericJoint_local_axis1(this: *const RprGenericJoint) -> RprVector {
    RprVector::from_raw(*this.get().0.local_axis1())
}

#[no_mangle]
pub unsafe extern "C" fn RprGenericJoint_set_local_axis1(
    this: *mut RprGenericJoint,
    local_axis: RprVector,
) {
    this.get_mut().0.set_local_axis1(local_axis.into_unit());
}

#[no_mangle]
pub unsafe extern "C" fn RprGenericJoint_local_axis2(this: *const RprGenericJoint) -> RprVector {
    RprVector::from_raw(*this.get().0.local_axis2())
}

#[no_mangle]
pub unsafe extern "C" fn RprGenericJoint_set_local_axis2(
    this: *mut RprGenericJoint,
    local_axis: RprVector,
) {
    this.get_mut().0.set_local_axis2(local_axis.into_unit());
}

#[no_mangle]
pub unsafe extern "C" fn RprGenericJoint_local_anchor1(this: *const RprGenericJoint) -> RprVector {
    RprVector::from_point(this.get().0.local_anchor1())
}

#[no_mangle]
pub unsafe extern "C" fn RprGenericJoint_set_local_anchor1(
    this: *mut RprGenericJoint,
    local_anchor: RprVector,
) {
    this.get_mut()
        .0
        .set_local_anchor1(local_anchor.into_point());
}

#[no_mangle]
pub unsafe extern "C" fn RprGenericJoint_local_anchor2(this: *const RprGenericJoint) -> RprVector {
    RprVector::from_point(this.get().0.local_anchor2())
}

#[no_mangle]
pub unsafe extern "C" fn RprGenericJoint_set_local_anchor2(
    this: *mut RprGenericJoint,
    local_anchor: RprVector,
) {
    this.get_mut()
        .0
        .set_local_anchor2(local_anchor.into_point());
}

#[no_mangle]
pub unsafe extern "C" fn RprGenericJoint_contacts_enabled(this: *const RprGenericJoint) -> bool {
    this.get().0.contacts_enabled()
}

#[no_mangle]
pub unsafe extern "C" fn RprGenericJoint_set_contacts_enabled(
    this: *mut RprGenericJoint,
    enabled: bool,
) {
    this.get_mut().0.set_contacts_enabled(enabled);
}

#[no_mangle]
pub unsafe extern "C" fn RprGenericJoint_limits(
    this: *const RprGenericJoint,
    axis: RprJointAxis,
    out: *mut RprJointLimits,
) -> bool {
    match this.get().0.limits(axis.into_raw()) {
        Some(t) => {
            out.write(RprJointLimits::from_raw(*t));
            true
        }
        None => false,
    }
}

#[no_mangle]
pub unsafe extern "C" fn RprGenericJoint_set_limits(
    this: *mut RprGenericJoint,
    axis: RprJointAxis,
    min: Real,
    max: Real,
) {
    this.get_mut().0.set_limits(axis.into_raw(), [min, max]);
}

#[no_mangle]
pub unsafe extern "C" fn RprGenericJoint_motor_model(
    this: *const RprGenericJoint,
    axis: RprJointAxis,
    out: *mut RprMotorModel,
) -> bool {
    match this.get().0.motor_model(axis.into_raw()) {
        Some(t) => {
            out.write(RprMotorModel::from_raw(t));
            true
        }
        None => false,
    }
}

#[no_mangle]
pub unsafe extern "C" fn RprGenericJoint_set_motor_model(
    this: *mut RprGenericJoint,
    axis: RprJointAxis,
    model: RprMotorModel,
) {
    this.get_mut()
        .0
        .set_motor_model(axis.into_raw(), model.into_raw());
}

#[no_mangle]
pub unsafe extern "C" fn RprGenericJoint_set_motor_velocity(
    this: *mut RprGenericJoint,
    axis: RprJointAxis,
    target_vel: Real,
    factor: Real,
) {
    this.get_mut()
        .0
        .set_motor_velocity(axis.into_raw(), target_vel, factor);
}

#[no_mangle]
pub unsafe extern "C" fn RprGenericJoint_set_motor_position(
    this: *mut RprGenericJoint,
    axis: RprJointAxis,
    target_pos: Real,
    stiffness: Real,
    damping: Real,
) {
    this.get_mut()
        .0
        .set_motor_position(axis.into_raw(), target_pos, stiffness, damping);
}

#[no_mangle]
pub unsafe extern "C" fn RprGenericJoint_set_motor_max_force(
    this: *mut RprGenericJoint,
    axis: RprJointAxis,
    max_force: Real,
) {
    this.get_mut()
        .0
        .set_motor_max_force(axis.into_raw(), max_force);
}

#[no_mangle]
pub unsafe extern "C" fn RprGenericJoint_motor(
    this: *const RprGenericJoint,
    axis: RprJointAxis,
    out: *mut RprJointMotor,
) -> bool {
    match this.get().0.motor(axis.into_raw()) {
        Some(t) => {
            out.write(RprJointMotor::from_raw(*t));
            true
        }
        None => false,
    }
}

#[no_mangle]
pub unsafe extern "C" fn RprGenericJoint_set_motor(
    this: *mut RprGenericJoint,
    axis: RprJointAxis,
    target_pos: Real,
    target_vel: Real,
    stiffness: Real,
    damping: Real,
) {
    this.get_mut()
        .0
        .set_motor(axis.into_raw(), target_pos, target_vel, stiffness, damping);
}
