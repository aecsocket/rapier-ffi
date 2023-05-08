pub(crate) mod ffi;

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
