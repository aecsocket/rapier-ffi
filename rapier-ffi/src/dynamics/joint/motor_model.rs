use crate::prelude::*;

/// The spring-like model used for constraints resolution.
#[repr(C)]
#[derive(Debug, Clone, Copy)]
pub enum RprMotorModel {
    /// The solved spring-like equation is:
    /// `acceleration = stiffness * (pos - target_pos) + damping * (vel - target_vel)`
    AccelerationBased,
    /// The solved spring-like equation is:
    /// `force = stiffness * (pos - target_pos) + damping * (vel - target_vel)`
    ForceBased,
}

impl RprMotorModel {
    pub fn into_raw(self) -> MotorModel {
        match self {
            Self::AccelerationBased => MotorModel::AccelerationBased,
            Self::ForceBased => MotorModel::ForceBased,
        }
    }

    pub fn from_raw(raw: MotorModel) -> Self {
        match raw {
            MotorModel::AccelerationBased => Self::AccelerationBased,
            MotorModel::ForceBased => Self::ForceBased,
        }
    }
}
