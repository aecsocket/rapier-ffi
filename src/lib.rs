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
    pub use rapier::prelude::*;

    pub use crate::dynamics::{
        ccd_solver::*, impulse_joint_set::*, integration_parameters::*, island_manager::*,
        multibody_joint_set::*, rigid_body::*, rigid_body_set::*, rigid_body_set::*,
    };
    pub use crate::geometry::{broad_phase::*, collider::*, collider_set::*, narrow_phase::*};
    pub use crate::pipeline::{physics_pipeline::*, query_pipeline::*};

    pub type RprReal = Real;

    #[cfg(feature = "dim2")]
    pub unsafe fn read_rvec(ptr: *const RprReal) -> Vector<Real> {
        vector![*ptr.offset(0).get(), *ptr.offset(1).get()]
    }

    #[cfg(feature = "dim3")]
    pub unsafe fn read_rvec(ptr: *const RprReal) -> Vector<Real> {
        vector![
            *ptr.offset(0).get(),
            *ptr.offset(1).get(),
            *ptr.offset(2).get()
        ]
    }

    pub unsafe fn write_rvec(vec: &Vector<Real>, out: *mut RprReal) {
        (out as *mut Vector<Real>).get_mut().copy_from(vec);
    }
}

pub mod dynamics;
pub mod geometry;
pub mod pipeline;
