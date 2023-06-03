package rapier.shape;

import rapier.sys.RapierC;

public final class TriMeshFlags {
    private TriMeshFlags() {}

    public static final int HALF_EDGE_TOPOLOGY = RapierC.RprTriMeshFlags_HALF_EDGE_TOPOLOGY();

    public static final int CONNECTED_COMPONENTS = RapierC.RprTriMeshFlags_CONNECTED_COMPONENTS();

    public static final int DELETE_BAD_TOPOLOGY_TRIANGLES = RapierC.RprTriMeshFlags_DELETE_BAD_TOPOLOGY_TRIANGLES();

    public static final int ORIENTED = RapierC.RprTriMeshFlags_ORIENTED();

    public static final int MERGE_DUPLICATE_VERTICES = RapierC.RprTriMeshFlags_MERGE_DUPLICATE_VERTICES();

    public static final int DELETE_DEGENERATE_TRIANGLES = RapierC.RprTriMeshFlags_DELETE_DEGENERATE_TRIANGLES();

    public static final int DELETE_DUPLICATE_TRIANGLES = RapierC.RprTriMeshFlags_DELETE_DUPLICATE_TRIANGLES();
}
