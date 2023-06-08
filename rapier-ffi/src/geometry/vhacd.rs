use rapier::parry::transformation::{
    vhacd::{VHACDParameters, VHACD},
    voxelization::FillMode,
};

use crate::prelude::*;

/// Controls how the voxelization determines which voxel needs
/// to be considered empty, and which ones will be considered full.
#[repr(C)]
pub enum RprFillMode {
    /// Only consider full the voxels intersecting the surface of the
    /// shape being voxelized.
    SurfaceOnly,
    /// Use a flood-fill technique to consider fill the voxels intersecting
    /// the surface of the shape being voxelized, as well as all the voxels
    /// bounded of them.
    FloodFill {
        /// Detects holes inside of a solid contour.
        detect_cavities: bool,
        /// Attempts to properly handle self-intersections.
        #[cfg(feature = "dim2")]
        detect_self_intersections: bool,
    },
    // RaycastFill
}

impl RprFillMode {
    pub fn from_raw(raw: &FillMode) -> Self {
        match raw {
            FillMode::SurfaceOnly => Self::SurfaceOnly,
            #[cfg(feature = "dim2")]
            FillMode::FloodFill {
                detect_cavities,
                detect_self_intersections,
            } => Self::FloodFill {
                detect_cavities: *detect_cavities,
                detect_self_intersections: *detect_self_intersections,
            },
            #[cfg(feature = "dim3")]
            FillMode::FloodFill { detect_cavities } => Self::FloodFill {
                detect_cavities: *detect_cavities,
            },
        }
    }

    pub fn into_raw(&self) -> FillMode {
        match self {
            Self::SurfaceOnly => FillMode::SurfaceOnly,
            #[cfg(feature = "dim2")]
            Self::FloodFill {
                detect_cavities,
                detect_self_intersections,
            } => FillMode::FloodFill {
                detect_cavities: *detect_cavities,
                detect_self_intersections: *detect_self_intersections,
            },
            #[cfg(feature = "dim3")]
            Self::FloodFill { detect_cavities } => FillMode::FloodFill {
                detect_cavities: *detect_cavities,
            },
        }
    }
}

/// Parameters controlling the VHACD convex decomposition.
///
/// See https://github.com/Unity-Technologies/VHACD#parameters for details.
#[repr(C)]
pub struct RprVHACDParameters {
    /// Maximum concavity.
    ///
    /// Default: 0.1 (in 2D), 0.01 (in 3D).
    /// Valid range `[0.0, 1.0]`.
    pub concavity: Real,
    /// Controls the bias toward clipping along symmetry planes.
    ///
    /// Default: 0.05.
    /// Valid Range: `[0.0, 1.0]`.
    pub alpha: Real,
    /// Controls the bias toward clipping along revolution planes.
    ///
    /// Default: 0.05.
    /// Valid Range: `[0.0, 1.0]`.
    pub beta: Real,
    /// Resolution used during the voxelization stage.
    ///
    /// Default: 256 (in 2D), 64 (in 3D).
    pub resolution: u32,
    /// Controls the granularity of the search for the best
    /// clipping plane during the decomposition.
    ///
    /// Default: 4
    pub plane_downsampling: u32,
    /// Controls the precision of the convex-hull generation
    /// process during the clipping plane selection stage.
    ///
    /// Default: 4
    pub convex_hull_downsampling: u32,
    /// Controls the way the input mesh or polyline is being
    /// voxelized.
    ///
    /// Default: `FillMode::FloodFill { detect_cavities: false, detect_self_intersections: false }`
    pub fill_mode: RprFillMode,
    /// Controls whether the convex-hull should be approximated during the decomposition stage.
    /// Setting this to `true` increases performances with a slight degradation of the decomposition
    /// quality.
    ///
    /// Default: true
    pub convex_hull_approximation: bool,
    /// Controls the max number of convex-hull generated by the convex decomposition.
    ///
    /// Default: 1024
    pub max_convex_hulls: u32,
}

impl RprVHACDParameters {
    pub fn from_raw(raw: &VHACDParameters) -> Self {
        Self {
            concavity: raw.concavity,
            alpha: raw.alpha,
            beta: raw.beta,
            resolution: raw.resolution,
            plane_downsampling: raw.plane_downsampling,
            convex_hull_downsampling: raw.convex_hull_downsampling,
            fill_mode: RprFillMode::from_raw(&raw.fill_mode),
            convex_hull_approximation: raw.convex_hull_approximation,
            max_convex_hulls: raw.max_convex_hulls,
        }
    }

    pub fn into_raw(&self) -> VHACDParameters {
        VHACDParameters {
            concavity: self.concavity,
            alpha: self.alpha,
            beta: self.beta,
            resolution: self.resolution,
            plane_downsampling: self.plane_downsampling,
            convex_hull_downsampling: self.convex_hull_downsampling,
            fill_mode: self.fill_mode.into_raw(),
            convex_hull_approximation: self.convex_hull_approximation,
            max_convex_hulls: self.max_convex_hulls,
        }
    }
}

impl Default for RprVHACDParameters {
    fn default() -> Self {
        Self::from_raw(&VHACDParameters::default())
    }
}

#[no_mangle]
pub extern "C" fn RprVHACDParameters_default() -> RprVHACDParameters {
    RprVHACDParameters::default()
}

pub struct RprVHACD(pub VHACD);

/// cbindgen:ptrs-as-array=[[points_data;], [indices_data;]]
#[no_mangle]
pub unsafe extern "C" fn RprVHACD_decompose(
    params: *const RprVHACDParameters,
    points_data: *const RprVector,
    points_len: usize,
    indices_data: *const u32,
    indices_len: usize, // len of slice of slices
    keep_voxel_to_primitives_map: bool,
) -> *mut RprVHACD {
    let params = &(*params).into_raw();
    let points = std::slice::from_raw_parts(points_data as *const Point<Real>, points_len);
    let indices = std::slice::from_raw_parts(indices_data as *const [u32; DIM], indices_len);
    leak_ptr(RprVHACD(VHACD::decompose(
        params,
        points,
        indices,
        keep_voxel_to_primitives_map,
    )))
}

#[no_mangle]
pub unsafe extern "C" fn RprVHACD_drop(this: *mut RprVHACD) {
    drop_ptr(this)
}

// TODO I suppose the RprVHACD should have some actual functions to access its data?
