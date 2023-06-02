package rapier.shape;

import rapier.Native;
import rapier.RefCounted;
import rapier.RefNative;
import rapier.math.Vector;

import javax.annotation.Nullable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;

import static rapier.sys.RapierC.*;

public final class SharedShape extends RefNative implements RefCounted {
    private SharedShape(MemoryAddress memory) {
        super(memory);
    }

    public static SharedShape at(MemoryAddress memory) {
        return new SharedShape(memory);
    }

    public static SharedShape of(Segment shape) {
        return at({{ sys }}.RapierC.RprSharedShape_segment(shape.memory()));
    }

    public static SharedShape of(Cuboid shape) {
        return at({{ sys }}.RapierC.RprSharedShape_cuboid(shape.memory()));
    }

    public static SharedShape of(Triangle shape) {
        return at({{ sys }}.RapierC.RprSharedShape_triangle(shape.memory()));
    }

    public static SharedShape of(Ball shape) {
        return at({{ sys }}.RapierC.RprSharedShape_ball(shape.memory()));
    }

    public static SharedShape of(Capsule shape) {
        return at({{ sys }}.RapierC.RprSharedShape_capsule(shape.memory()));
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

    public static @Nullable SharedShape convexHull(Vector... points) {
        try (var arena = MemorySession.openConfined()) {
            var nPoints = Vector.allocateArray(arena, points);
            var memory = {{ sys }}.RapierC.RprSharedShape_convex_hull(nPoints, points.length);
            return memory.equals(MemoryAddress.NULL) ? null : SharedShape.at(memory);
        }
    }

    public static @Nullable SharedShape roundConvexHull({{ real }} borderRadius, Vector... points) {
        try (var arena = MemorySession.openConfined()) {
            var nPoints = Vector.allocateArray(arena, points);
            var memory = {{ sys }}.RapierC.RprSharedShape_round_convex_hull(nPoints, points.length, borderRadius);
            return memory.equals(MemoryAddress.NULL) ? null : SharedShape.at(memory);
        }
    }

{% if dim3 %}
    public static SharedShape of(Cylinder shape) {
        return at({{ sys }}.RapierC.RprSharedShape_cylinder(shape.memory()));
    }

    public static SharedShape of(Cone shape) {
        return at({{ sys }}.RapierC.RprSharedShape_cone(shape.memory()));
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
