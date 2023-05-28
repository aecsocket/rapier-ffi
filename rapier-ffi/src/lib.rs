#![allow(non_upper_case_globals)]

pub(crate) mod ffi;

#[cfg(not(any(feature = "dim2", feature = "dim3")))]
compile_error!("must enable a feature that enables at least one of `dim2` or `dim3`");
#[cfg(not(any(feature = "f32", feature = "f64")))]
compile_error!("must enable a feature that enables at least one of `f32` or `f64`");

#[cfg(all(feature = "dim2", feature = "f32"))]
extern crate rapier2d as rapier;
#[cfg(all(feature = "dim2", feature = "f64"))]
extern crate rapier2d_f64 as rapier;
#[cfg(all(feature = "dim3", feature = "f32"))]
extern crate rapier3d as rapier;
#[cfg(all(feature = "dim3", feature = "f64"))]
extern crate rapier3d_f64 as rapier;

pub(crate) mod prelude {
    pub use super::ffi::*;
    pub use bytemuck::cast;
    pub use rapier::prelude::*;

    pub use crate::data::arena::*;
    pub use crate::dynamics::{
        ccd_solver::*,
        coefficient_combine_rule::*,
        integration_parameters::*,
        island_manager::*,
        joint::{
            generic_joint::*,
            impulse_joint::{impulse_joint::*, impulse_joint_set::*},
            motor_model::*,
            multibody_joint::{multibody_joint::*, multibody_joint_set::*},
        },
        rigid_body::*,
        rigid_body_set::*,
        rigid_body_set::*,
    };
    pub use crate::geometry::{broad_phase::*, collider::*, collider_set::*, narrow_phase::*};
    pub use crate::math::*;
    pub use crate::pipeline::{physics_pipeline::*, query_pipeline::*};
    pub use crate::shape::*;

    pub(crate) const INVALID_U32: u32 = u32::MAX;
}

pub mod data;
pub mod dynamics;
pub mod geometry;
pub mod math;
pub mod pipeline;
pub mod shape;
