package rapier.shape;

import rapier.DroppableNative;

import java.lang.foreign.MemorySegment;

import static rapier.sys.RapierC.*;

public final class SharedShape extends DroppableNative {
    protected SharedShape(MemorySegment memory) {
        super(memory);
    }

    public static SharedShape at(MemorySegment memory) {
        return new SharedShape(memory);
    }

    public static SharedShape of(Segment shape) {
        return at(RprSharedShape_segment(shape.memory()));
    }

    public static SharedShape of(Cuboid shape) {
        return at(RprSharedShape_cuboid(shape.memory()));
    }

    public static SharedShape of(Triangle shape) {
        return at(RprSharedShape_triangle(shape.memory()));
    }

    public static SharedShape of(Ball shape) {
        return at(RprSharedShape_ball(shape.memory()));
    }

    public static SharedShape of(Capsule shape) {
        return at(RprSharedShape_capsule(shape.memory()));
    }

    // TODO cylinder, cone

    @Override
    protected void dropInternal() {
        RprSharedShape_drop(self);
    }
}
