use crate::prelude::*;

/// Parameters affecting the physical behavior of a wheel.
#[repr(C)]
#[derive(Clone, Copy, Debug)]
pub struct RprWheelTuning {
    /// The suspension stiffness.
    ///
    /// Increase this value if the suspension appears to not push the vehicle strong enough.
    pub suspension_stiffness: Real,
    /// The suspension’s damping when it is being compressed.
    pub suspension_compression: Real,
    /// The suspension’s damping when it is being released.
    ///
    /// Increase this value if the suspension appears to overshoot.
    pub suspension_damping: Real,
    /// The maximum distance the suspension can travel before and after its resting length.
    pub max_suspension_travel: Real,
    /// Parameter controlling how much traction the tire his.
    ///
    /// The larger the value, the more instantaneous braking will happen (with the risk of
    /// causing the vehicle to flip if it’s too strong).
    pub friction_slip: Real,
    /// The maximum force applied by the suspension.
    pub max_suspension_force: Real,
}

impl RprWheelTuning {
    pub fn from_raw(raw: WheelTuning) -> Self {
        Self {
            suspension_stiffness: raw.suspension_stiffness,
            suspension_compression: raw.suspension_compression,
            suspension_damping: raw.suspension_damping,
            max_suspension_travel: raw.max_suspension_travel,
            friction_slip: raw.friction_slip,
            max_suspension_force: raw.max_suspension_force,
        }
    }

    pub fn into_raw(self) -> WheelTuning {
        WheelTuning {
            suspension_stiffness: self.suspension_stiffness,
            suspension_compression: self.suspension_compression,
            suspension_damping: self.suspension_damping,
            max_suspension_travel: self.max_suspension_travel,
            friction_slip: self.friction_slip,
            max_suspension_force: self.max_suspension_force,
        }
    }
}

impl Default for RprWheelTuning {
    fn default() -> Self {
        Self::from_raw(WheelTuning::default())
    }
}

#[no_mangle]
pub extern "C" fn RprWheelTuning_default() -> RprWheelTuning {
    RprWheelTuning::default()
}

pub struct RprWheel(pub Wheel);

#[no_mangle]
pub unsafe extern "C" fn RprWheel_chassis_connection_point_cs(
    this: *const RprWheel,
) -> RprVector {
    RprVector::from_point(this.get().0.chassis_connection_point_cs)
}

#[no_mangle]
pub unsafe extern "C" fn RprWheel_set_chassis_connection_point_cs(
    this: *mut RprWheel,
    value: RprVector,
) {
    this.get_mut().0.chassis_connection_point_cs = value.into_point()
}

#[no_mangle]
pub unsafe extern "C" fn RprWheel_direction_cs(
    this: *const RprWheel,
) -> RprVector {
    RprVector::from_raw(this.get().0.direction_cs)
}

#[no_mangle]
pub unsafe extern "C" fn RprWheel_set_direction_cs(
    this: *mut RprWheel,
    value: RprVector,
) {
    this.get_mut().0.direction_cs = value.into_raw()
}

#[no_mangle]
pub unsafe extern "C" fn RprWheel_axle_cs(
    this: *const RprWheel,
) -> RprVector {
    RprVector::from_raw(this.get().0.axle_cs)
}

#[no_mangle]
pub unsafe extern "C" fn RprWheel_set_axle_cs(
    this: *mut RprWheel,
    value: RprVector,
) {
    this.get_mut().0.axle_cs = value.into_raw()
}

#[no_mangle]
pub unsafe extern "C" fn RprWheel_suspension_rest_length(
    this: *const RprWheel,
) -> Real {
    this.get().0.suspension_rest_length
}

#[no_mangle]
pub unsafe extern "C" fn RprWheel_set_suspension_rest_length(
    this: *mut RprWheel,
    value: Real,
) {
    this.get_mut().0.suspension_rest_length = value
}

#[no_mangle]
pub unsafe extern "C" fn RprWheel_max_suspension_travel(
    this: *const RprWheel,
) -> Real {
    this.get().0.max_suspension_travel
}

#[no_mangle]
pub unsafe extern "C" fn RprWheel_set_max_suspension_travel(
    this: *mut RprWheel,
    value: Real,
) {
    this.get_mut().0.max_suspension_travel = value
}

#[no_mangle]
pub unsafe extern "C" fn RprWheel_radius(
    this: *const RprWheel,
) -> Real {
    this.get().0.radius
}

#[no_mangle]
pub unsafe extern "C" fn RprWheel_set_radius(
    this: *mut RprWheel,
    value: Real,
) {
    this.get_mut().0.radius = value
}

#[no_mangle]
pub unsafe extern "C" fn RprWheel_suspension_stiffness(
    this: *const RprWheel,
) -> Real {
    this.get().0.suspension_stiffness
}

#[no_mangle]
pub unsafe extern "C" fn RprWheel_set_suspension_stiffness(
    this: *mut RprWheel,
    value: Real,
) {
    this.get_mut().0.suspension_stiffness = value
}

#[no_mangle]
pub unsafe extern "C" fn RprWheel_damping_compression(
    this: *const RprWheel,
) -> Real {
    this.get().0.damping_compression
}

#[no_mangle]
pub unsafe extern "C" fn RprWheel_set_damping_compression(
    this: *mut RprWheel,
    value: Real,
) {
    this.get_mut().0.damping_compression = value
}

#[no_mangle]
pub unsafe extern "C" fn RprWheel_damping_relaxation(
    this: *const RprWheel,
) -> Real {
    this.get().0.damping_relaxation
}

#[no_mangle]
pub unsafe extern "C" fn RprWheel_set_damping_relaxation(
    this: *mut RprWheel,
    value: Real,
) {
    this.get_mut().0.damping_relaxation = value
}

#[no_mangle]
pub unsafe extern "C" fn RprWheel_rotation(
    this: *const RprWheel,
) -> Real {
    this.get().0.rotation
}

#[no_mangle]
pub unsafe extern "C" fn RprWheel_set_rotation(
    this: *mut RprWheel,
    value: Real,
) {
    this.get_mut().0.rotation = value
}

#[no_mangle]
pub unsafe extern "C" fn RprWheel_max_suspension_force(
    this: *const RprWheel,
) -> Real {
    this.get().0.max_suspension_force
}

#[no_mangle]
pub unsafe extern "C" fn RprWheel_set_max_suspension_force(
    this: *mut RprWheel,
    value: Real,
) {
    this.get_mut().0.max_suspension_force = value
}

#[no_mangle]
pub unsafe extern "C" fn RprWheel_forward_impulse(
    this: *const RprWheel,
) -> Real {
    this.get().0.forward_impulse
}

#[no_mangle]
pub unsafe extern "C" fn RprWheel_set_forward_impulse(
    this: *mut RprWheel,
    value: Real,
) {
    this.get_mut().0.forward_impulse = value
}

#[no_mangle]
pub unsafe extern "C" fn RprWheel_side_impulse(
    this: *const RprWheel,
) -> Real {
    this.get().0.side_impulse
}

#[no_mangle]
pub unsafe extern "C" fn RprWheel_set_side_impulse(
    this: *mut RprWheel,
    value: Real,
) {
    this.get_mut().0.side_impulse = value
}

#[no_mangle]
pub unsafe extern "C" fn RprWheel_steering(
    this: *const RprWheel,
) -> Real {
    this.get().0.steering
}

#[no_mangle]
pub unsafe extern "C" fn RprWheel_set_steering(
    this: *mut RprWheel,
    value: Real,
) {
    this.get_mut().0.steering = value
}

#[no_mangle]
pub unsafe extern "C" fn RprWheel_engine_force(
    this: *const RprWheel,
) -> Real {
    this.get().0.engine_force
}

#[no_mangle]
pub unsafe extern "C" fn RprWheel_set_engine_force(
    this: *mut RprWheel,
    value: Real,
) {
    this.get_mut().0.engine_force = value
}

#[no_mangle]
pub unsafe extern "C" fn RprWheel_brake(
    this: *const RprWheel,
) -> Real {
    this.get().0.brake
}

#[no_mangle]
pub unsafe extern "C" fn RprWheel_set_brake(
    this: *mut RprWheel,
    value: Real,
) {
    this.get_mut().0.brake = value
}

#[no_mangle]
pub unsafe extern "C" fn RprWheel_wheel_suspension_force(
    this: *const RprWheel,
) -> Real {
    this.get().0.wheel_suspension_force
}

#[no_mangle]
pub unsafe extern "C" fn RprWheel_set_wheel_suspension_force(
    this: *mut RprWheel,
    value: Real,
) {
    this.get_mut().0.wheel_suspension_force = value
}

#[no_mangle]
pub unsafe extern "C" fn RprWheel_center(this: *const RprWheel) -> RprVector {
    RprVector::from_point(this.get().0.center())
}

#[no_mangle]
pub unsafe extern "C" fn RprWheel_suspension(this: *const RprWheel) -> RprVector {
    RprVector::from_raw(this.get().0.suspension())
}

#[no_mangle]
pub unsafe extern "C" fn RprWheel_axle(this: *const RprWheel) -> RprVector {
    RprVector::from_raw(this.get().0.axle())
}

pub struct RprDynamicRayCastVehicleController(pub DynamicRayCastVehicleController);

#[no_mangle]
pub extern "C" fn RprDynamicRayCastVehicleController_new(
    chassis: RprRigidBodyHandle,
) -> *mut RprDynamicRayCastVehicleController {
    leak_ptr(RprDynamicRayCastVehicleController(DynamicRayCastVehicleController::new(
        RigidBodyHandle(chassis.into_raw()),
    )))
}

#[no_mangle]
pub unsafe extern "C" fn RprDynamicRayCastVehicleController_drop(this: *mut RprDynamicRayCastVehicleController) {
    drop_ptr(this)
}

#[no_mangle]
pub unsafe extern "C" fn RprDynamicRayCastVehicleController_current_vehicle_speed(
    this: *const RprDynamicRayCastVehicleController,
) -> Real {
    this.get().0.current_vehicle_speed
}

#[no_mangle]
pub unsafe extern "C" fn RprDynamicRayCastVehicleController_chassis(
    this: *const RprDynamicRayCastVehicleController,
) -> RprRigidBodyHandle {
    RprRigidBodyHandle::from_raw(this.get().0.chassis.0)
}

#[no_mangle]
pub unsafe extern "C" fn RprDynamicRayCastVehicleController_set_chassis(
    this: *mut RprDynamicRayCastVehicleController,
    value: RprRigidBodyHandle,
) {
    this.get_mut().0.chassis = RigidBodyHandle(value.into_raw())
}

#[no_mangle]
pub unsafe extern "C" fn RprDynamicRayCastVehicleController_index_up_axis(
    this: *const RprDynamicRayCastVehicleController,
) -> usize {
    this.get().0.index_up_axis
}

#[no_mangle]
pub unsafe extern "C" fn RprDynamicRayCastVehicleController_set_index_up_axis(
    this: *mut RprDynamicRayCastVehicleController,
    value: usize,
) {
    this.get_mut().0.index_up_axis = value
}

#[no_mangle]
pub unsafe extern "C" fn RprDynamicRayCastVehicleController_index_forward_axis(
    this: *const RprDynamicRayCastVehicleController,
) -> usize {
    this.get().0.index_forward_axis
}

#[no_mangle]
pub unsafe extern "C" fn RprDynamicRayCastVehicleController_set_index_forward_axis(
    this: *mut RprDynamicRayCastVehicleController,
    value: usize,
) {
    this.get_mut().0.index_forward_axis = value
}

#[no_mangle]
pub unsafe extern "C" fn RprDynamicRayCastVehicleController_add_wheel(
    this: *mut RprDynamicRayCastVehicleController,
    chassis_connection_cs: RprVector,
    direction_cs: RprVector,
    axle_cs: RprVector,
    suspension_rest_length: Real,
    radius: Real,
    tuning: RprWheelTuning,
) -> *mut RprWheel {
    this.get_mut().0.add_wheel(
        chassis_connection_cs.into_point(),
        direction_cs.into_raw(),
        axle_cs.into_raw(),
        suspension_rest_length,
        radius,
        &tuning.into_raw(),
    ) as *mut Wheel as *mut RprWheel
}

#[no_mangle]
pub unsafe extern "C" fn RprDynamicRayCastVehicleController_update_vehicle(
    this: *mut RprDynamicRayCastVehicleController,
    dt: Real,
    bodies: *mut RprRigidBodySet,
    colliders: *const RprColliderSet,
    queries: *const RprQueryPipeline,
    filter: RprQueryFilter,
) {
    let predicate = filter.predicate();
    this.get_mut().0.update_vehicle(
        dt,
        &mut bodies.get_mut().0,
        &colliders.get().0,
        &queries.get().0,
        filter.into_raw(&predicate),
    )
}

#[no_mangle]
pub unsafe extern "C" fn RprDynamicRayCastVehicleController_wheels(
    this: *const RprDynamicRayCastVehicleController,
    out_data: *mut *const RprWheel,
    out_len: *mut usize,
) {
    let slice = this.get().0.wheels();
    *out_data = slice.as_ptr() as *const RprWheel;
    *out_len = slice.len();
}

#[no_mangle]
pub unsafe extern "C" fn RprDynamicRayCastVehicleController_wheels_mut(
    this: *mut RprDynamicRayCastVehicleController,
    out_data: *mut *mut RprWheel,
    out_len: *mut usize,
) {
    let slice = this.get_mut().0.wheels_mut();
    *out_data = slice.as_ptr() as *mut RprWheel;
    *out_len = slice.len();
}
