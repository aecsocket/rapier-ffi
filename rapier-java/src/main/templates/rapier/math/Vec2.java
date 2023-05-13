package rapier.math;

import rapier.Native;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

public final class Vec2 extends Native {
    protected Vec2(MemorySegment memory) {
        super(memory);
    }

    public static Vec2 at(MemorySegment memory) {
        return new Vec2(memory);
    }

    public static Vec2 of(SegmentAllocator alloc, {{ real }} x, {{ real }} y) {
        return at(alloc.allocateArray({{ realLayout }}, x, y));
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

    @Override
    public String toString() {
        return "(%f, %f)".formatted(getX(), getY());
    }
}
