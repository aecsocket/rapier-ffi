package rapier.math;

import rapier.Native;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

public final class Vector2 extends Native {
    protected Vector2(MemorySegment memory) {
        super(memory);
    }

    public static Vector2 at(MemorySegment memory) {
        return new Vector2(memory);
    }

    public static Vector2 create(SegmentAllocator alloc, {{ real }} x, {{ real }} y) {
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
}
