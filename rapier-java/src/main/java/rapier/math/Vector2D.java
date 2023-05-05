package rapier.math;

import rapier.BaseNative;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

public final class Vector2D extends BaseNative {
    protected Vector2D(MemorySegment memory) {
        super(memory);
    }

    public static Vector2D at(MemorySegment memory) {
        return new Vector2D(memory);
    }

    public static Vector2D create(SegmentAllocator alloc, double x, double y) {
        return at(alloc.allocateArray(ValueLayout.JAVA_DOUBLE, x, y));
    }
}
