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

    public static Vector2 create(SegmentAllocator alloc, float x, float y) {
        return at(alloc.allocateArray(ValueLayout.JAVA_FLOAT, x, y));
    }

    public float getX() {
        return self.getAtIndex(ValueLayout.JAVA_FLOAT, 0);
    }

    public void setX(float x) {
        self.setAtIndex(ValueLayout.JAVA_FLOAT, 0, x);
    }

    public float getY() {
        return self.getAtIndex(ValueLayout.JAVA_FLOAT, 1);
    }

    public void setY(float y) {
        self.setAtIndex(ValueLayout.JAVA_FLOAT, 1, y);
    }
}
