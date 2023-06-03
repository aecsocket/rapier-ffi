use crate::prelude::*;

pub struct RprTriMesh(pub TriMesh);

pub type RprTriMeshFlags = u8;

pub fn trimesh_flags_from(rpr: RprTriMeshFlags) -> TriMeshFlags {
    TriMeshFlags::from_bits(rpr).expect("invalid flags")
}

/// If set, the half-edge topology of the trimesh will be computed if possible.
pub const RprTriMeshFlags_HALF_EDGE_TOPOLOGY: u8 = 0b0000_0001;
/// If set, the half-edge topology and connected components of the trimesh will be computed if possible.
///
/// Because of the way it is currently implemented, connected components can only be computed on
/// a mesh where the half-edge topology computation succeeds. It will no longer be the case in the
/// future once we decouple the computations.
pub const RprTriMeshFlags_CONNECTED_COMPONENTS: u8 = 0b0000_0010;
/// If set, any triangle that results in a failing half-hedge topology computation will be deleted.
pub const RprTriMeshFlags_DELETE_BAD_TOPOLOGY_TRIANGLES: u8 = 0b0000_0100;
/// If set, the trimesh will be assumed to be oriented (with outward normals).
///
/// The pseudo-normals of its vertices and edges will be computed.
pub const RprTriMeshFlags_ORIENTED: u8 = 0b0000_1000;
/// If set, the duplicate vertices of the trimesh will be merged.
///
/// Two vertices with the exact same coordinates will share the same entry on the
/// vertex buffer and the index buffer is adjusted accordingly.
pub const RprTriMeshFlags_MERGE_DUPLICATE_VERTICES: u8 = 0b0001_0000;
/// If set, the triangles sharing two vertices with identical index values will be removed.
///
/// Because of the way it is currently implemented, this methods implies that duplicate
/// vertices will be merged. It will no longer be the case in the future once we decouple
/// the computations.
pub const RprTriMeshFlags_DELETE_DEGENERATE_TRIANGLES: u8 = 0b0010_0000;
/// If set, two triangles sharing three vertices with identical index values (in any order) will be removed.
///
/// Because of the way it is currently implemented, this methods implies that duplicate
/// vertices will be merged. It will no longer be the case in the future once we decouple
/// the computations.
pub const RprTriMeshFlags_DELETE_DUPLICATE_TRIANGLES: u8 = 0b0100_0000;
