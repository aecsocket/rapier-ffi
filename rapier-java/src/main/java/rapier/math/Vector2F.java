package rapier.math;

import rapier.BaseNative;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

public final class Vector2F extends BaseNative {
    protected Vector2F(MemorySegment memory) {
        super(memory);
    }

    public static Vector2F at(MemorySegment memory) {
        return new Vector2F(memory);
    }

    public static Vector2F create(SegmentAllocator alloc, float x, float y) {
        return at(alloc.allocateArray(ValueLayout.JAVA_FLOAT, x, y));
    }
}
