package rapier.math;

import rapier.BaseNative;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

public final class Vector3D extends BaseNative {
    protected Vector3D(MemorySegment memory) {
        super(memory);
    }

    public static Vector3D at(MemorySegment memory) {
        return new Vector3D(memory);
    }

    public static Vector3D create(SegmentAllocator alloc, double x, double y, double z) {
        return at(alloc.allocateArray(ValueLayout.JAVA_DOUBLE, x, y, z));
    }
}
