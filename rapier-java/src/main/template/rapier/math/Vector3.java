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

    public static Vector3 create(SegmentAllocator alloc, float x, float y, float z) {
        return at(alloc.allocateArray(ValueLayout.ValueLayout.JAVA_FLOAT, x, y, z));
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

    public float getZ() {
        return self.getAtIndex(ValueLayout.JAVA_FLOAT, 2);
    }

    public void setZ(float z) {
        self.setAtIndex(ValueLayout.JAVA_FLOAT, 2, z);
    }
}
