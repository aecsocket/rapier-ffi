package rapier.shape;

import rapier.RefCounted;
import rapier.RefNative;

import java.lang.foreign.MemoryAddress;

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

{% if dim3 %}
    public static SharedShape of(Cylinder shape) {
        return at({{ sys }}.RapierC.RprSharedShape_cylinder(shape.memory()));
    }

    public static SharedShape of(Cone shape) {
        return at({{ sys }}.RapierC.RprSharedShape_cone(shape.memory()));
    }
{% endif %}

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
