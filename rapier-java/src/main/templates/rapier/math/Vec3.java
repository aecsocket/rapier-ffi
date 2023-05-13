package rapier.math;

import rapier.Native;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

public final class Vec3 extends Native {
    protected Vec3(MemorySegment memory) {
        super(memory);
    }

    public static Vec3 at(MemorySegment memory) {
        return new Vec3(memory);
    }

    public static Vec3 of(SegmentAllocator alloc, {{ real }} x, {{ real }} y, {{ real }} z) {
        return at(alloc.allocateArray({{ realLayout }}, x, y, z));
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

    @Override
    public String toString() {
        return "(%f, %f, %f)".formatted(getX(), getY(), getZ());
    }
}
