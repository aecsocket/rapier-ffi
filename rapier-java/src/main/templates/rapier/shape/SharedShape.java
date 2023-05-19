package rapier.shape;

import rapier.BaseNative;
import rapier.RefCounted;

import java.lang.foreign.MemorySegment;

import static rapier.sys.RapierC.*;

public final class SharedShape extends BaseNative implements RefCounted {
    protected SharedShape(MemorySegment memory) {
        super(memory);
    }

    public static SharedShape at(MemorySegment memory) {
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

    // TODO cylinder, cone

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
