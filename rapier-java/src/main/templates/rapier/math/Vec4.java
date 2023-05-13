package rapier.math;

import rapier.Native;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

public final class Vec4 extends Native {
    protected Vec4(MemorySegment memory) {
        super(memory);
    }

    public static Vec4 at(MemorySegment memory) {
        return new Vec4(memory);
    }

    public static Vec4 of(SegmentAllocator alloc, {{ real }} x, {{ real }} y, {{ real }} z, {{ real }} w) {
        return at(alloc.allocateArray({{ realLayout }}, x, y, z, w));
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

    public {{ real }} getW() {
        return self.getAtIndex({{ realLayout }}, 3);
    }

    public void setW({{ real }} w) {
        self.setAtIndex({{ realLayout }}, 3, w);
    }

    @Override
    public String toString() {
        return "(%f, %f, %f, %f)".formatted(getX(), getY(), getZ(), getW());
    }
}
