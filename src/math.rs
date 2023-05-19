use crate::prelude::*;

#[repr(C)]
#[derive(Debug, Clone, Copy, bytemuck::Pod, bytemuck::Zeroable)]
#[cfg(feature = "dim2")]
pub struct RprVector {
    pub x: Real,
    pub y: Real,
}

#[repr(C)]
#[derive(Debug, Clone, Copy, bytemuck::Pod, bytemuck::Zeroable)]
#[cfg(feature = "dim3")]
pub struct RprVector {
    pub x: Real,
    pub y: Real,
    pub z: Real,
}

impl RprVector {
    pub fn from_raw(vec: Vector<Real>) -> Self {
        cast(vec)
    }

    pub fn from_point(pt: Point<Real>) -> Self {
        cast(pt)
    }

    pub fn from_translation(tl: Translation<Real>) -> Self {
        cast(tl)
    }

    pub fn into_raw(self) -> Vector<Real> {
        cast(self)
    }

    pub fn into_point(self) -> Point<Real> {
        cast(self)
    }
}

#[repr(C)]
#[derive(Debug, Clone, Copy, bytemuck::Pod, bytemuck::Zeroable)]
#[cfg(feature = "dim2")]
pub struct RprAngVector {
    pub x: Real,
}

#[repr(C)]
#[derive(Debug, Clone, Copy, bytemuck::Pod, bytemuck::Zeroable)]
#[cfg(feature = "dim3")]
pub struct RprAngVector {
    pub x: Real,
    pub y: Real,
    pub z: Real,
}

impl RprAngVector {
    pub fn from_raw(vec: AngVector<Real>) -> Self {
        cast(vec)
    }

    pub fn into_raw(self) -> AngVector<Real> {
        cast(self)
    }
}

#[repr(C)]
#[derive(Debug, Clone, Copy, bytemuck::Pod, bytemuck::Zeroable)]
#[cfg(feature = "dim2")]
pub struct RprRotation {
    pub re: Real,
    pub im: Real,
}

#[repr(C)]
#[derive(Debug, Clone, Copy, bytemuck::Pod, bytemuck::Zeroable)]
#[cfg(feature = "dim3")]
pub struct RprRotation {
    pub x: Real,
    pub y: Real,
    pub z: Real,
    pub w: Real,
}

#[cfg(feature = "dim2")]
impl RprRotation {
    pub fn from_raw(raw: Rotation<Real>) -> Self {
        Self {
            re: raw.re,
            im: raw.im,
        }
    }

    pub fn into_raw(self) -> Rotation<Real> {
        use rapier::parry::na::{Complex, Unit};
        Unit::from_complex(Complex::new(self.re, self.im))
    }
}

#[cfg(feature = "dim3")]
impl RprRotation {
    pub fn from_raw(raw: Rotation<Real>) -> Self {
        cast(raw)
    }

    pub fn into_raw(self) -> Rotation<Real> {
        cast(self)
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
