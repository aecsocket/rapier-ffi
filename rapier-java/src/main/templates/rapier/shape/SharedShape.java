package rapier.shape;

import rapier.Native;
import rapier.RefCounted;
import rapier.RefNative;
import rapier.geometry.VHACDParameters;
import rapier.math.Vector;
import rapier.sys.RapierC;

import javax.annotation.Nullable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.util.Arrays;

import static rapier.sys.RapierC.*;

public final class SharedShape extends RefNative implements RefCounted {
    private SharedShape(MemoryAddress memory) {
        super(memory);
    }

    public static SharedShape at(MemoryAddress memory) {
        return new SharedShape(memory);
    }

    public static SharedShape compound(CompoundChild... shapes) {
        if (shapes.length == 0)
            throw new IllegalArgumentException("Shapes must not be empty");

        try (var arena = MemorySession.openConfined()) {
            var nShapes = CompoundChild.allocateArray(arena, shapes);
            var memory = {{ sys }}.RapierC.RprSharedShape_compound(nShapes, shapes.length);
            return at(memory);
        }
    }

    public static SharedShape ball({{ real }} radius) {
        return at({{ sys }}.RapierC.RprSharedShape_ball(radius));
    }

    public static SharedShape halfspace(Vector outwardNormal) {
        return at({{ sys }}.RapierC.RprSharedShape_halfspace(outwardNormal.memory()));
    }

    public static SharedShape capsule(Vector a, Vector b, {{ real }} radius) {
        return at({{ sys }}.RapierC.RprSharedShape_capsule(a.memory(), b.memory(), radius));
    }

    public static SharedShape segment(Vector a, Vector b) {
        return at({{ sys }}.RapierC.RprSharedShape_segment(a.memory(), b.memory()));
    }

    public static SharedShape triangle(Vector a, Vector b, Vector c) {
        return at({{ sys }}.RapierC.RprSharedShape_triangle(a.memory(), b.memory(), c.memory()));
    }

    public static SharedShape roundTriangle(Vector a, Vector b, Vector c, {{ real }} borderRadius) {
        return at({{ sys }}.RapierC.RprSharedShape_round_triangle(a.memory(), b.memory(), c.memory(), borderRadius));
    }

    public static SharedShape polyline(Vector[] vertices, int[][] indices) {
        try (var arena = MemorySession.openConfined()) {
            var nVertices = Vector.allocateArray(arena, vertices);
            var nIndices = arena.allocateArray(C_INT, Arrays.stream(indices).flatMapToInt(Arrays::stream).toArray());
            var memory = {{ sys }}.RapierC.RprSharedShape_polyline(
                    nVertices,
                    vertices.length,
                    nIndices,
                    indices.length
            );
            return at(memory);
        }
    }

    public static SharedShape trimesh(Vector[] vertices, int[][] indices, byte flags) {
        try (var arena = MemorySession.openConfined()) {
            var nVertices = Vector.allocateArray(arena, vertices);
            var nIndices = arena.allocateArray(C_INT, Arrays.stream(indices).flatMapToInt(Arrays::stream).toArray());
            var memory = {{ sys }}.RapierC.RprSharedShape_trimesh(
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
        try (var arena = MemorySession.openConfined()) {
            var nVertices = Vector.allocateArray(arena, vertices);
            var nIndices = arena.allocateArray(C_INT, Arrays.stream(indices).flatMapToInt(Arrays::stream).toArray());
            var memory = {{ sys }}.RapierC.RprSharedShape_convex_decomposition_with_params(
                    nVertices,
                    vertices.length,
                    nIndices,
                    indices.length,
                    params.memory()
            );
            return at(memory);
        }
    }

    public static SharedShape convexDecomposition(Vector[] vertices, int[][] indices) {
        try (var arena = MemorySession.openConfined()) {
            var nVertices = Vector.allocateArray(arena, vertices);
            var nIndices = arena.allocateArray(C_INT, Arrays.stream(indices).flatMapToInt(Arrays::stream).toArray());
            var memory = {{ sys }}.RapierC.RprSharedShape_convex_decomposition(
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
            {{ real }} borderRadius
    ) {
        try (var arena = MemorySession.openConfined()) {
            var nVertices = Vector.allocateArray(arena, vertices);
            var nIndices = arena.allocateArray(C_INT, Arrays.stream(indices).flatMapToInt(Arrays::stream).toArray());
            var memory = {{ sys }}.RapierC.RprSharedShape_round_convex_decomposition_with_params(
                    nVertices,
                    vertices.length,
                    nIndices,
                    indices.length,
                    params.memory(),
                    borderRadius
            );
            return at(memory);
        }
    }

    public static SharedShape roundConvexDecomposition(
            Vector[] vertices,
            int[][] indices,
            {{ real }} borderRadius
    ) {
        try (var arena = MemorySession.openConfined()) {
            var nVertices = Vector.allocateArray(arena, vertices);
            var nIndices = arena.allocateArray(C_INT, Arrays.stream(indices).flatMapToInt(Arrays::stream).toArray());
            var memory = {{ sys }}.RapierC.RprSharedShape_round_convex_decomposition(
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
        try (var arena = MemorySession.openConfined()) {
            var nPoints = Vector.allocateArray(arena, points);
            var memory = {{ sys }}.RapierC.RprSharedShape_convex_hull(nPoints, points.length);
            return memory.equals(MemoryAddress.NULL) ? null : SharedShape.at(memory);
        }
    }

    public static @Nullable SharedShape roundConvexHull(Vector[] points, {{ real }} borderRadius) {
        try (var arena = MemorySession.openConfined()) {
            var nPoints = Vector.allocateArray(arena, points);
            var memory = {{ sys }}.RapierC.RprSharedShape_round_convex_hull(nPoints, points.length, borderRadius);
            return memory.equals(MemoryAddress.NULL) ? null : SharedShape.at(memory);
        }
    }

{% if dim2 %}
    public static SharedShape cuboid({{ real }} hx, {{ real }} hy) {
        return at({{ sys }}.RapierC.RprSharedShape_cuboid(hx, hy));
    }

    public static SharedShape roundCuboid({{ real }} hx, {{ real }} hy, {{ real }} borderRadius) {
        return at({{ sys }}.RapierC.RprSharedShape_round_cuboid(hx, hy, borderRadius));
    }
{% else %}
    public static SharedShape cylinder({{ real }} halfHeight, {{ real }} radius) {
        return at({{ sys }}.RapierC.RprSharedShape_cylinder(halfHeight, radius));
    }

    public static SharedShape roundCylinder({{ real }} halfHeight, {{ real }} radius, {{ real }} borderRadius) {
        return at({{ sys }}.RapierC.RprSharedShape_round_cylinder(halfHeight, radius, borderRadius));
    }
    public static SharedShape cone({{ real }} halfHeight, {{ real }} radius) {
        return at({{ sys }}.RapierC.RprSharedShape_cone(halfHeight, radius));
    }

    public static SharedShape roundCone({{ real }} halfHeight, {{ real }} radius, {{ real }} borderRadius) {
        return at({{ sys }}.RapierC.RprSharedShape_round_cone(halfHeight, radius, borderRadius));
    }

    public static SharedShape cuboid({{ real }} hx, {{ real }} hy, {{ real }} hz) {
        return at({{ sys }}.RapierC.RprSharedShape_cuboid(hx, hy, hz));
    }

    public static SharedShape roundCuboid({{ real }} hx, {{ real }} hy, {{ real }} hz, {{ real }} borderRadius) {
        return at({{ sys }}.RapierC.RprSharedShape_round_cuboid(hx, hy, hz, borderRadius));
    }

    public static @Nullable SharedShape convexMesh(Vector[] points, int[][] indices) {
        try (var arena = MemorySession.openConfined()) {
            var nPoints = Vector.allocateArray(arena, points);
            var nIndices = arena.allocateArray(C_INT, Arrays.stream(indices).flatMapToInt(Arrays::stream).toArray());
            var memory = {{ sys }}.RapierC.RprSharedShape_convex_mesh(
                    nPoints,
                    points.length,
                    nIndices,
                    indices.length
            );
            return memory.equals(MemoryAddress.NULL) ? null : SharedShape.at(memory);
        }
    }

    public static @Nullable SharedShape roundConvexMesh(Vector[] points, int[][] indices, {{ real }} borderRadius) {
        try (var arena = MemorySession.openConfined()) {
            var nPoints = Vector.allocateArray(arena, points);
            var nIndices = arena.allocateArray(C_INT, Arrays.stream(indices).flatMapToInt(Arrays::stream).toArray());
            var memory = {{ sys }}.RapierC.RprSharedShape_round_convex_mesh(
                    nPoints,
                    points.length,
                    nIndices,
                    indices.length,
                    borderRadius
            );
            return memory.equals(MemoryAddress.NULL) ? null : SharedShape.at(memory);
        }
    }
{% endif %}

    @Override
    public MemoryAddress refData() {
        return RprSharedShape_data(self);
    }

    @Override
    public long strongCount() {
        return RprSharedShape_strong_count(self);
    }

    @Override
    public void acquire() {
        RprSharedShape_acquire(self);
    }

    @Override
    public void release() {
        RprSharedShape_release(self);
    }
}
