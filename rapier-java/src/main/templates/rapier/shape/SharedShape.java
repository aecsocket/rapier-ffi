package rapier.shape;

import rapier.Real;
import rapier.RefCounted;
import rapier.RefNative;
import rapier.__real;
import rapier.geometry.VHACDParameters;
import rapier.math.Vector;

import javax.annotation.Nullable;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.Arena;
import java.lang.foreign.ValueLayout;
import java.util.Arrays;

public final class SharedShape extends RefNative implements RefCounted {
    private SharedShape(MemorySegment memory) {
        super(memory);
    }

    public static SharedShape at(MemorySegment memory) {
        return new SharedShape(memory);
    }

    public static SharedShape compound(CompoundChild... shapes) {
        if (shapes.length == 0)
            throw new IllegalArgumentException("Shapes must not be empty");

        try (var arena = Arena.openConfined()) {
            var nShapes = CompoundChild.allocIntoSlice(arena, shapes);
            var memory = rapier.sys.RapierC.RprSharedShape_compound(nShapes, shapes.length);
            return at(memory);
        }
    }

    public static SharedShape ball(__real radius) {
        return at(rapier.sys.RapierC.RprSharedShape_ball(radius));
    }

    public static SharedShape halfspace(Vector outwardNormal) {
        try (var arena = Arena.openConfined()) {
            return at(rapier.sys.RapierC.RprSharedShape_halfspace(outwardNormal.allocInto(arena)));
        }
    }

    public static SharedShape capsule(Vector a, Vector b, __real radius) {
        try (var arena = Arena.openConfined()) {
            return at(rapier.sys.RapierC.RprSharedShape_capsule(a.allocInto(arena), b.allocInto(arena), radius));
        }
    }

    public static SharedShape segment(Vector a, Vector b) {
        try (var arena = Arena.openConfined()) {
            return at(rapier.sys.RapierC.RprSharedShape_segment(a.allocInto(arena), b.allocInto(arena)));
        }
    }

    public static SharedShape triangle(Vector a, Vector b, Vector c) {
        try (var arena = Arena.openConfined()) {
            return at(rapier.sys.RapierC.RprSharedShape_triangle(a.allocInto(arena), b.allocInto(arena), c.allocInto(arena)));
        }
    }

    public static SharedShape roundTriangle(Vector a, Vector b, Vector c, __real borderRadius) {
        try (var arena = Arena.openConfined()) {
            return at(rapier.sys.RapierC.RprSharedShape_round_triangle(a.allocInto(arena), b.allocInto(arena), c.allocInto(arena), borderRadius));
        }
    }

    public static SharedShape polyline(Vector[] vertices, int[][] indices) {
        try (var arena = Arena.openConfined()) {
            var nVertices = Vector.allocIntoSlice(arena, vertices);
            var nIndices = arena.allocateArray(ValueLayout.JAVA_INT, Arrays.stream(indices).flatMapToInt(Arrays::stream).toArray());
            var memory = rapier.sys.RapierC.RprSharedShape_polyline(
                    nVertices,
                    vertices.length,
                    nIndices,
                    indices.length
            );
            return at(memory);
        }
    }

    public static SharedShape trimesh(Vector[] vertices, int[][] indices, byte flags) {
        try (var arena = Arena.openConfined()) {
            var nVertices = Vector.allocIntoSlice(arena, vertices);
            var nIndices = arena.allocateArray(ValueLayout.JAVA_INT, Arrays.stream(indices).flatMapToInt(Arrays::stream).toArray());
            var memory = rapier.sys.RapierC.RprSharedShape_trimesh(
                    nVertices,
                    vertices.length,
                    nIndices,
                    indices.length,
                    flags
            );
            return at(memory);
        }
    }

    public static SharedShape trimesh(Vector[] vertices, int[][] indices) {
        return trimesh(vertices, indices, (byte) 0);
    }

    public static SharedShape convexDecomposition(
            Vector[] vertices,
            int[][] indices,
            VHACDParameters params
    ) {
        try (var arena = Arena.openConfined()) {
            var nVertices = Vector.allocIntoSlice(arena, vertices);
            var nIndices = arena.allocateArray(ValueLayout.JAVA_INT, Arrays.stream(indices).flatMapToInt(Arrays::stream).toArray());
            var memory = rapier.sys.RapierC.RprSharedShape_convex_decomposition_with_params(
                    nVertices,
                    vertices.length,
                    nIndices,
                    indices.length,
                    params.allocInto(arena)
            );
            return at(memory);
        }
    }

    public static SharedShape convexDecomposition(Vector[] vertices, int[][] indices) {
        try (var arena = Arena.openConfined()) {
            var nVertices = Vector.allocIntoSlice(arena, vertices);
            var nIndices = arena.allocateArray(ValueLayout.JAVA_INT, Arrays.stream(indices).flatMapToInt(Arrays::stream).toArray());
            var memory = rapier.sys.RapierC.RprSharedShape_convex_decomposition(
                    nVertices,
                    vertices.length,
                    nIndices,
                    indices.length
            );
            return at(memory);
        }
    }

    public static SharedShape roundConvexDecomposition(
            Vector[] vertices,
            int[][] indices,
            VHACDParameters params,
            __real borderRadius
    ) {
        try (var arena = Arena.openConfined()) {
            var nVertices = Vector.allocIntoSlice(arena, vertices);
            var nIndices = arena.allocateArray(ValueLayout.JAVA_INT, Arrays.stream(indices).flatMapToInt(Arrays::stream).toArray());
            var memory = rapier.sys.RapierC.RprSharedShape_round_convex_decomposition_with_params(
                    nVertices,
                    vertices.length,
                    nIndices,
                    indices.length,
                    params.allocInto(arena),
                    borderRadius
            );
            return at(memory);
        }
    }

    public static SharedShape roundConvexDecomposition(
            Vector[] vertices,
            int[][] indices,
            __real borderRadius
    ) {
        try (var arena = Arena.openConfined()) {
            var nVertices = Vector.allocIntoSlice(arena, vertices);
            var nIndices = arena.allocateArray(ValueLayout.JAVA_INT, Arrays.stream(indices).flatMapToInt(Arrays::stream).toArray());
            var memory = rapier.sys.RapierC.RprSharedShape_round_convex_decomposition(
                    nVertices,
                    vertices.length,
                    nIndices,
                    indices.length,
                    borderRadius
            );
            return at(memory);
        }
    }

    public static @Nullable SharedShape convexHull(Vector... points) {
        try (var arena = Arena.openConfined()) {
            var nPoints = Vector.allocIntoSlice(arena, points);
            var memory = rapier.sys.RapierC.RprSharedShape_convex_hull(nPoints, points.length);
            return memory.equals(MemorySegment.NULL) ? null : SharedShape.at(memory);
        }
    }

    public static @Nullable SharedShape roundConvexHull(Vector[] points, __real borderRadius) {
        try (var arena = Arena.openConfined()) {
            var nPoints = Vector.allocIntoSlice(arena, points);
            var memory = rapier.sys.RapierC.RprSharedShape_round_convex_hull(nPoints, points.length, borderRadius);
            return memory.equals(MemorySegment.NULL) ? null : SharedShape.at(memory);
        }
    }

/*{% if dim2 %}*/
    public static SharedShape cuboid(__real hx, __real hy) {
        return at(rapier.sys_dim2.RapierC.RprSharedShape_cuboid(hx, hy));
    }

    public static SharedShape roundCuboid(__real hx, __real hy, __real borderRadius) {
        return at(rapier.sys_dim2.RapierC.RprSharedShape_round_cuboid(hx, hy, borderRadius));
    }

    public static SharedShape heightfield(__real[] heights, Vector scale) {
        try (var arena = Arena.openConfined()) {
            var nHeightsData = arena.allocateArray(Real.layout(), heights);
            return SharedShape.at(rapier.sys_dim2.RapierC.RprSharedShape_heightfield(heights.length, nHeightsData, scale.allocInto(arena)));
        }
    }
/*{% else %}*/
    public static SharedShape cylinder(__real halfHeight, __real radius) {
        return at(rapier.sys_dim3.RapierC.RprSharedShape_cylinder(halfHeight, radius));
    }

    public static SharedShape roundCylinder(__real halfHeight, __real radius, __real borderRadius) {
        return at(rapier.sys_dim3.RapierC.RprSharedShape_round_cylinder(halfHeight, radius, borderRadius));
    }
    public static SharedShape cone(__real halfHeight, __real radius) {
        return at(rapier.sys_dim3.RapierC.RprSharedShape_cone(halfHeight, radius));
    }

    public static SharedShape roundCone(__real halfHeight, __real radius, __real borderRadius) {
        return at(rapier.sys_dim3.RapierC.RprSharedShape_round_cone(halfHeight, radius, borderRadius));
    }

    public static SharedShape cuboid(__real hx, __real hy, __real hz) {
        return at(rapier.sys_dim3.RapierC.RprSharedShape_cuboid(hx, hy, hz));
    }

    public static SharedShape roundCuboid(__real hx, __real hy, __real hz, __real borderRadius) {
        return at(rapier.sys_dim3.RapierC.RprSharedShape_round_cuboid(hx, hy, hz, borderRadius));
    }

    public static @Nullable SharedShape convexMesh(Vector[] points, int[][] indices) {
        try (var arena = Arena.openConfined()) {
            var nPoints = Vector.allocIntoSlice(arena, points);
            var nIndices = arena.allocateArray(ValueLayout.JAVA_INT, Arrays.stream(indices).flatMapToInt(Arrays::stream).toArray());
            var memory = rapier.sys_dim3.RapierC.RprSharedShape_convex_mesh(
                    nPoints,
                    points.length,
                    nIndices,
                    indices.length
            );
            return memory.equals(MemorySegment.NULL) ? null : SharedShape.at(memory);
        }
    }

    public static @Nullable SharedShape roundConvexMesh(Vector[] points, int[][] indices, __real borderRadius) {
        try (var arena = Arena.openConfined()) {
            var nPoints = Vector.allocIntoSlice(arena, points);
            var nIndices = arena.allocateArray(ValueLayout.JAVA_INT, Arrays.stream(indices).flatMapToInt(Arrays::stream).toArray());
            var memory = rapier.sys_dim3.RapierC.RprSharedShape_round_convex_mesh(
                    nPoints,
                    points.length,
                    nIndices,
                    indices.length,
                    borderRadius
            );
            return memory.equals(MemorySegment.NULL) ? null : SharedShape.at(memory);
        }
    }

    public static SharedShape heightfield(
            int heightsRows,
            int heightsCols,
            __real[] heightsData,
            Vector scale
    ) {
        if (heightsRows * heightsCols != heightsData.length)
            throw new IllegalArgumentException("heightsRows * heightsCols must equal heightsData.length");
        try (var arena = Arena.openConfined()) {
            var nHeightsData = arena.allocateArray(Real.layout(), heightsData);
            return SharedShape.at(rapier.sys.RapierC.RprSharedShape_heightfield(heightsRows, heightsCols, nHeightsData, scale.allocInto(arena)));
        }
    }
/*{% endif %}*/

    @Override
    public MemorySegment refData() {
        return rapier.sys.RapierC.RprSharedShape_data(self);
    }

    @Override
    public long strongCount() {
        return rapier.sys.RapierC.RprSharedShape_strong_count(self);
    }

    @Override
    public void acquire() {
        rapier.sys.RapierC.RprSharedShape_acquire(self);
    }

    @Override
    public void release() {
        rapier.sys.RapierC.RprSharedShape_release(self);
    }
}
