package rapier.math;

import rapier.BaseNative;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

public final class Vector3F extends BaseNative {
    protected Vector3F(MemorySegment memory) {
        super(memory);
    }

    public static Vector3F at(MemorySegment memory) {
        return new Vector3F(memory);
    }

    public static Vector3F create(SegmentAllocator alloc, float x, float y, float z) {
        return at(alloc.allocateArray(ValueLayout.JAVA_FLOAT, x, y, z));
    }
}
