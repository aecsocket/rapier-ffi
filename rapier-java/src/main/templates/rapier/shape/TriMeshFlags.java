package rapier.shape;

public final class TriMeshFlags {
    private TriMeshFlags() {}

    public static final int HALF_EDGE_TOPOLOGY = rapier.sys.RapierC.RprTriMeshFlags_HALF_EDGE_TOPOLOGY();

    public static final int CONNECTED_COMPONENTS = rapier.sys.RapierC.RprTriMeshFlags_CONNECTED_COMPONENTS();

    public static final int DELETE_BAD_TOPOLOGY_TRIANGLES = rapier.sys.RapierC.RprTriMeshFlags_DELETE_BAD_TOPOLOGY_TRIANGLES();

    public static final int ORIENTED = rapier.sys.RapierC.RprTriMeshFlags_ORIENTED();

    public static final int MERGE_DUPLICATE_VERTICES = rapier.sys.RapierC.RprTriMeshFlags_MERGE_DUPLICATE_VERTICES();

    public static final int DELETE_DEGENERATE_TRIANGLES = rapier.sys.RapierC.RprTriMeshFlags_DELETE_DEGENERATE_TRIANGLES();

    public static final int DELETE_DUPLICATE_TRIANGLES = rapier.sys.RapierC.RprTriMeshFlags_DELETE_DUPLICATE_TRIANGLES();
}
