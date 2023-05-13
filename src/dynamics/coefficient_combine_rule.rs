use crate::prelude::*;

/// Rules used to combine two coefficients.
///
/// This is used to determine the effective restitution and
/// friction coefficients for a contact between two colliders.
/// Each collider has its combination rule of type
/// `CoefficientCombineRule`. And the rule
/// actually used is given by `max(first_combine_rule as usize, second_combine_rule as usize)`.
#[repr(C)]
#[derive(Copy, Clone, Debug, PartialEq, Eq)]
pub enum RprCoefficientCombineRule {
    /// The two coefficients are averaged.
    Average = 0,
    /// The smallest coefficient is chosen.
    Min,
    /// The two coefficients are multiplied.
    Multiply,
    /// The greatest coefficient is chosen.
    Max,
}

impl RprCoefficientCombineRule {
    pub fn into_raw(self) -> CoefficientCombineRule {
        match self {
            Self::Average => CoefficientCombineRule::Average,
            Self::Min => CoefficientCombineRule::Min,
            Self::Multiply => CoefficientCombineRule::Multiply,
            Self::Max => CoefficientCombineRule::Max,
        }
    }
}
