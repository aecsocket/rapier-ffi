use crate::prelude::*;

#[repr(C)]
#[derive(Debug, Clone, Copy, bytemuck::Pod, bytemuck::Zeroable)]
#[cfg(feature = "dim2")]
pub struct RprVector(pub [Real; 2]);

#[repr(C)]
#[derive(Debug, Clone, Copy, bytemuck::Pod, bytemuck::Zeroable)]
#[cfg(feature = "dim3")]
pub struct RprVector(pub [Real; 3]);

impl RprVector {
    pub fn from_raw(vec: Vector<Real>) -> Self {
        Self(cast(vec))
    }

    pub fn from_point(pt: Point<Real>) -> Self {
        Self(cast(pt))
    }

    pub fn from_translation(tl: Translation<Real>) -> Self {
        Self(cast(tl))
    }

    pub fn into_raw(self) -> Vector<Real> {
        cast(self.0)
    }

    pub fn into_point(self) -> Point<Real> {
        cast(self.0)
    }
}

#[repr(C)]
#[derive(Debug, Clone, Copy, bytemuck::Pod, bytemuck::Zeroable)]
#[cfg(feature = "dim2")]
pub struct RprAngVector(pub [Real; 1]);

#[repr(C)]
#[derive(Debug, Clone, Copy, bytemuck::Pod, bytemuck::Zeroable)]
#[cfg(feature = "dim3")]
pub struct RprAngVector(pub [Real; 3]);

impl RprAngVector {
    pub fn from_raw(vec: AngVector<Real>) -> Self {
        Self(cast(vec))
    }

    pub fn into_raw(self) -> AngVector<Real> {
        cast(self.0)
    }
}

#[repr(C)]
#[derive(Debug, Clone, Copy, bytemuck::Pod, bytemuck::Zeroable)]
#[cfg(feature = "dim2")]
pub struct RprRotation(pub [Real; 2]);

#[repr(C)]
#[derive(Debug, Clone, Copy, bytemuck::Pod, bytemuck::Zeroable)]
#[cfg(feature = "dim3")]
pub struct RprRotation(pub [Real; 4]);

#[cfg(feature = "dim2")]
impl RprRotation {
    pub fn from_raw(raw: Rotation<Real>) -> Self {
        Self([raw.re, raw.im])
    }

    pub fn into_raw(self) -> Rotation<Real> {
        use rapier::parry::na::{Complex, Unit};
        Unit::from_complex(Complex::new(self.0[0], self.0[1]))
    }
}

#[cfg(feature = "dim3")]
impl RprRotation {
    pub fn from_raw(raw: Rotation<Real>) -> Self {
        Self(cast(raw))
    }

    pub fn into_raw(self) -> Rotation<Real> {
        cast(self.0)
    }
}

#[repr(C)]
#[derive(Debug, Clone, Copy, bytemuck::Pod, bytemuck::Zeroable)]
pub struct RprIsometry {
    pub rotation: RprRotation,
    pub translation: RprVector,
}

impl RprIsometry {
    pub fn from_raw(raw: Isometry<Real>) -> Self {
        Self {
            rotation: RprRotation::from_raw(raw.rotation),
            translation: RprVector::from_translation(raw.translation),
        }
    }
    
    pub fn into_raw(self) -> Isometry<Real> {
        Isometry {
            rotation: self.rotation.into_raw(),
            translation: Translation {
                vector: self.translation.into_raw(),
            },
        }
    }
}

#[repr(C)]
#[derive(Debug, Clone, Copy, bytemuck::Pod, bytemuck::Zeroable)]
pub struct RprAabb {
    pub min: RprVector,
    pub max: RprVector,
}

impl RprAabb {
    pub fn from_raw(raw: Aabb) -> Self {
        Self {
            min: RprVector::from_point(raw.mins),
            max: RprVector::from_point(raw.maxs),
        }
    }

    pub fn into_raw(self) -> Aabb {
        Aabb {
            mins: self.min.into_point(),
            maxs: self.max.into_point(),
        }
    }
}
