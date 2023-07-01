use crate::prelude::*;

/// Parameters for a time-step of the physics engine.
#[repr(C)]
#[derive(Clone, Copy, Debug)]
pub struct RprIntegrationParameters {
    /// The timestep length (default: `1.0 / 60.0`)
    pub dt: Real,
    /// Minimum timestep size when using CCD with multiple substeps (default `1.0 / 60.0 / 100.0`)
    ///
    /// When CCD with multiple substeps is enabled, the timestep is subdivided
    /// into smaller pieces. This timestep subdivision won't generate timestep
    /// lengths smaller than `min_ccd_dt`.
    ///
    /// Setting this to a large value will reduce the opportunity to performing
    /// CCD substepping, resulting in potentially more time dropped by the
    /// motion-clamping mechanism. Setting this to an very small value may lead
    /// to numerical instabilities.
    pub min_ccd_dt: Real,

    /// 0-1: multiplier for how much of the constraint violation (e.g. contact penetration)
    /// will be compensated for during the velocity solve.
    /// (default `0.8`).
    pub erp: Real,
    /// 0-1: the damping ratio used by the springs for Baumgarte constraints stabilization.
    /// Lower values make the constraints more compliant (more "springy", allowing more visible penetrations
    /// before stabilization).
    /// (default `0.25`).
    pub damping_ratio: Real,

    /// 0-1: multiplier for how much of the joint violation
    /// will be compensated for during the velocity solve.
    /// (default `1.0`).
    pub joint_erp: Real,

    /// The fraction of critical damping applied to the joint for constraints regularization.
    /// (default `0.25`).
    pub joint_damping_ratio: Real,

    /// Amount of penetration the engine wont attempt to correct (default: `0.001m`).
    pub allowed_linear_error: Real,
    /// Maximum amount of penetration the solver will attempt to resolve in one timestep.
    pub max_penetration_correction: Real,
    /// The maximal distance separating two objects that will generate predictive contacts (default: `0.002`).
    pub prediction_distance: Real,
    /// Maximum number of iterations performed to solve non-penetration and joint constraints (default: `4`).
    pub max_velocity_iterations: usize,
    /// Maximum number of iterations performed to solve friction constraints (default: `8`).
    pub max_velocity_friction_iterations: usize,
    /// Maximum number of iterations performed to remove the energy introduced by penetration corrections  (default: `1`).
    pub max_stabilization_iterations: usize,
    /// If `false`, friction and non-penetration constraints will be solved in the same loop. Otherwise,
    /// non-penetration constraints are solved first, and friction constraints are solved after (default: `true`).
    pub interleave_restitution_and_friction_resolution: bool,
    /// Minimum number of dynamic bodies in each active island (default: `128`).
    pub min_island_size: usize,
    /// Maximum number of substeps performed by the  solver (default: `1`).
    pub max_ccd_substeps: usize,
}

impl RprIntegrationParameters {
    pub fn from_raw(raw: IntegrationParameters) -> Self {
        Self {
            dt: raw.dt,
            min_ccd_dt: raw.min_ccd_dt,
            erp: raw.erp,
            damping_ratio: raw.damping_ratio,
            joint_erp: raw.joint_erp,
            joint_damping_ratio: raw.joint_damping_ratio,
            allowed_linear_error: raw.allowed_linear_error,
            max_penetration_correction: raw.max_penetration_correction,
            prediction_distance: raw.prediction_distance,
            max_velocity_iterations: raw.max_velocity_iterations,
            max_velocity_friction_iterations: raw.max_velocity_friction_iterations,
            max_stabilization_iterations: raw.max_stabilization_iterations,
            interleave_restitution_and_friction_resolution: raw
                .interleave_restitution_and_friction_resolution,
            min_island_size: raw.min_island_size,
            max_ccd_substeps: raw.max_ccd_substeps,
        }
    }

    pub fn into_raw(self) -> IntegrationParameters {
        IntegrationParameters {
            dt: self.dt,
            min_ccd_dt: self.min_ccd_dt,
            erp: self.erp,
            damping_ratio: self.damping_ratio,
            joint_erp: self.joint_erp,
            joint_damping_ratio: self.joint_damping_ratio,
            allowed_linear_error: self.allowed_linear_error,
            max_penetration_correction: self.max_penetration_correction,
            prediction_distance: self.prediction_distance,
            max_velocity_iterations: self.max_velocity_iterations,
            max_velocity_friction_iterations: self.max_velocity_friction_iterations,
            max_stabilization_iterations: self.max_stabilization_iterations,
            interleave_restitution_and_friction_resolution: self
                .interleave_restitution_and_friction_resolution,
            min_island_size: self.min_island_size,
            max_ccd_substeps: self.max_ccd_substeps,
        }
    }
}

impl Default for RprIntegrationParameters {
    fn default() -> Self {
        Self::from_raw(IntegrationParameters::default())
    }
}

#[no_mangle]
pub extern "C" fn RprIntegrationParameters_default() -> RprIntegrationParameters {
    RprIntegrationParameters::default()
}
