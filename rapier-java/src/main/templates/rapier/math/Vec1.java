package rapier.math;

import rapier.Native;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

public final class Vec1 extends Native {
    protected Vec1(MemorySegment memory) {
        super(memory);
    }

    public static Vec1 at(MemorySegment memory) {
        return new Vec1(memory);
    }

    public static Vec1 of(SegmentAllocator alloc, {{ real }} x) {
        return at(alloc.allocateArray({{ realLayout }}, x));
    }

    public {{ real }} getX() {
        return self.getAtIndex({{ realLayout }}, 0);
    }

    public void setX({{ real }} x) {
        self.setAtIndex({{ realLayout }}, 0, x);
    }

    @Override
    public String toString() {
        return "(%f)".formatted(getX());
    }
}
