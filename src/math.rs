use crate::prelude::*;

#[repr(C)]
#[derive(Debug, Clone, Copy, bytemuck::Pod, bytemuck::Zeroable)]
#[cfg(feature = "dim2")]
pub struct RprVec(pub [Real; 2]);

#[repr(C)]
#[derive(Debug, Clone, Copy, bytemuck::Pod, bytemuck::Zeroable)]
#[cfg(feature = "dim3")]
pub struct RprVec(pub [Real; 3]);

impl RprVec {
    pub fn into_raw(self) -> Vector<Real> {
        cast(self.0)
    }

    pub fn into_point(self) -> Point<Real> {
        cast(self.0)
    }

    pub fn from_raw(vec: Vector<Real>) -> Self {
        Self(cast(vec))
    }

    pub fn from_point(pt: Point<Real>) -> Self {
        Self(cast(pt))
    }

    pub fn from_translation(tl: Translation<Real>) -> Self {
        Self(cast(tl))
    }
}

#[repr(C)]
#[derive(Debug, Clone, Copy, bytemuck::Pod, bytemuck::Zeroable)]
#[cfg(feature = "dim2")]
pub struct RprAngVec(pub [Real; 1]);

#[repr(C)]
#[derive(Debug, Clone, Copy, bytemuck::Pod, bytemuck::Zeroable)]
#[cfg(feature = "dim3")]
pub struct RprAngVec(pub [Real; 3]);

impl RprAngVec {
    pub fn into_raw(self) -> AngVector<Real> {
        cast(self.0)
    }

    pub fn from_raw(vec: AngVector<Real>) -> Self {
        Self(cast(vec))
    }
}

#[repr(C)]
#[derive(Debug, Clone, Copy, bytemuck::Pod, bytemuck::Zeroable)]
#[cfg(feature = "dim2")]
pub struct RprRot(pub [Real; 2]);

#[repr(C)]
#[derive(Debug, Clone, Copy, bytemuck::Pod, bytemuck::Zeroable)]
#[cfg(feature = "dim3")]
pub struct RprRot(pub [Real; 4]);

#[cfg(feature = "dim2")]
impl RprRot {
    pub fn into_raw(self) -> Rotation<Real> {
        use rapier::parry::na::{Complex, Unit};
        Unit::from_complex(Complex::new(self.0[0], self.0[1]))
    }

    pub fn from_raw(raw: Rotation<Real>) -> Self {
        Self([raw.re, raw.im])
    }
}

#[cfg(feature = "dim3")]
impl RprRot {
    pub fn into_raw(self) -> Rotation<Real> {
        cast(self.0)
    }

    pub fn from_raw(raw: Rotation<Real>) -> Self {
        Self(cast(raw))
    }
}

#[repr(C)]
#[derive(Debug, Clone, Copy, bytemuck::Pod, bytemuck::Zeroable)]
pub struct RprIso {
    pub rotation: RprRot,
    pub translation: RprVec,
}

impl RprIso {
    pub fn into_raw(self) -> Isometry<Real> {
        Isometry {
            rotation: self.rotation.into_raw(),
            translation: Translation {
                vector: self.translation.into_raw(),
            },
        }
    }

    pub fn from_raw(raw: Isometry<Real>) -> Self {
        Self {
            rotation: RprRot::from_raw(raw.rotation),
            translation: RprVec::from_translation(raw.translation),
        }
    }
}

// #[repr(C)]
// #[derive(Debug, Clone, Copy, bytemuck::Pod, bytemuck::Zeroable)]
// #[cfg(feature = "dim2")]
// pub struct RprIso {
//     pub rotation: [Real; 2],
//     pub translation: [Real; 2],
// }

// #[repr(C)]
// #[derive(Debug, Clone, Copy, bytemuck::Pod, bytemuck::Zeroable)]
// #[cfg(feature = "dim3")]
// pub struct RprIso {
//     pub rotation: [Real; 4],
//     pub translation: [Real; 3],
// }

// #[cfg(feature = "dim2")]
// impl RprIso {
//     pub fn into_raw(self) -> Isometry<Real> {
//         use rapier::parry::na::{Complex, Unit};
//         Isometry {
//             // `rotation` is a Complex, which doesn't implement Pod
//             rotation: Unit::from_complex(Complex::new(self.rotation[0], self.rotation[1])),
//             translation: cast(self.translation),
//         }
//     }

//     pub fn from_raw(pos: Isometry<Real>) -> Self {
//         Self {
//             rotation: [pos.rotation.re, pos.rotation.im],
//             translation: cast(pos.translation),
//         }
//     }
// }

// #[cfg(feature = "dim3")]
// impl RprIso {
//     pub fn into_raw(self) -> Isometry<Real> {
//         Isometry {
//             rotation: cast(self.rotation),
//             translation: cast(self.translation),
//         }
//     }

//     pub fn from_raw(pos: Isometry<Real>) -> Self {
//         Self {
//             rotation: cast(pos.rotation),
//             translation: cast(pos.translation),
//         }
//     }
// }
