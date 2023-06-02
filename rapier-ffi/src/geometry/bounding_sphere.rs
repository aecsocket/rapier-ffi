use crate::prelude::*;

use rapier::parry::bounding_volume::BoundingSphere;

#[repr(C)]
#[derive(Debug, Clone, Copy, bytemuck::Pod, bytemuck::Zeroable)]
pub struct RprBoundingSphere {
    pub center: RprVector,
    pub radius: Real,
}

impl RprBoundingSphere {
    pub fn from_raw(raw: BoundingSphere) -> Self {
        Self {
            center: RprVector::from_point(raw.center),
            radius: raw.radius,
        }
    }

    pub fn into_raw(self) -> BoundingSphere {
        BoundingSphere {
            center: self.center.into_point(),
            radius: self.radius,
        }
    }
}
