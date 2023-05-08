package rapier.math;

import rapier.Native;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

public final class Vector3 extends Native {
    protected Vector3(MemorySegment memory) {
        super(memory);
    }

    public static Vector3 at(MemorySegment memory) {
        return new Vector3(memory);
    }

    public static Vector3 create(SegmentAllocator alloc, {{ real }} x, {{ real }} y, {{ real }} z) {
        return at(alloc.allocateArray({{ realLayout }}, x, y, z));
    }

    public static Vector3 create(SegmentAllocator alloc) {
        return create(alloc, {{ realZero }}, {{ realZero }}, {{ realZero }});
    }

    public {{ real }} getX() {
        return self.getAtIndex({{ realLayout }}, 0);
    }

    public void setX({{ real }} x) {
        self.setAtIndex({{ realLayout }}, 0, x);
    }

    public {{ real }} getY() {
        return self.getAtIndex({{ realLayout }}, 1);
    }

    public void setY({{ real }} y) {
        self.setAtIndex({{ realLayout }}, 1, y);
    }

    public {{ real }} getZ() {
        return self.getAtIndex({{ realLayout }}, 2);
    }

    public void setZ({{ real }} z) {
        self.setAtIndex({{ realLayout }}, 2, z);
    }
}
