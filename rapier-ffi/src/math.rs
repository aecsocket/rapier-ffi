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

    pub fn into_unit(self) -> UnitVector<Real> {
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
pub struct RprSpacialVector {
    pub x: Real,
    pub y: Real,
    pub z: Real,
}

#[repr(C)]
#[derive(Debug, Clone, Copy, bytemuck::Pod, bytemuck::Zeroable)]
#[cfg(feature = "dim3")]
pub struct RprSpacialVector {
    pub x: Real,
    pub y: Real,
    pub z: Real,
    pub w: Real,
    pub a: Real,
    pub b: Real,
}

impl RprSpacialVector {
    pub fn from_raw(raw: SpacialVector<Real>) -> Self {
        cast(raw)
    }

    pub fn into_raw(self) -> SpacialVector<Real> {
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

#[repr(C)]
#[derive(Debug, Clone, Copy, bytemuck::Pod, bytemuck::Zeroable)]
pub struct RprRay {
    pub origin: RprVector,
    pub dir: RprVector,
}

impl RprRay {
    pub fn from_raw(raw: Ray) -> Self {
        Self {
            origin: RprVector::from_point(raw.origin),
            dir: RprVector::from_raw(raw.dir),
        }
    }

    pub fn into_raw(self) -> Ray {
        Ray {
            origin: self.origin.into_point(),
            dir: self.dir.into_raw(),
        }
    }
}

#[repr(C)]
#[cfg(feature = "dim2")]
#[derive(Debug, Clone, Copy, bytemuck::Pod, bytemuck::Zeroable)]
pub struct RprAngularInertia {
    pub x: Real,
}

#[repr(C)]
#[cfg(feature = "dim3")]
#[derive(Debug, Clone, Copy, bytemuck::Pod, bytemuck::Zeroable)]
pub struct RprAngularInertia {
    /// The component at the first row and first column of this matrix.
    pub m11: Real,
    /// The component at the first row and second column of this matrix.
    pub m12: Real,
    /// The component at the first row and third column of this matrix.
    pub m13: Real,
    /// The component at the second row and second column of this matrix.
    pub m22: Real,
    /// The component at the second row and third column of this matrix.
    pub m23: Real,
    /// The component at the third row and third column of this matrix.
    pub m33: Real,
}

#[cfg(feature = "dim2")]
impl RprAngularInertia {
    pub fn from_raw(raw: AngularInertia<Real>) -> Self {
        Self { x: raw }
    }

    pub fn into_raw(self) -> AngularInertia<Real> {
        self.x
    }
}

#[cfg(feature = "dim3")]
impl RprAngularInertia {
    pub fn from_raw(raw: AngularInertia<Real>) -> Self {
        Self {
            m11: raw.m11,
            m12: raw.m12,
            m13: raw.m13,
            m22: raw.m22,
            m23: raw.m23,
            m33: raw.m33,
        }
    }

    pub fn into_raw(self) -> AngularInertia<Real> {
        AngularInertia::new(self.m11, self.m12, self.m13, self.m22, self.m23, self.m33)
    }
}
