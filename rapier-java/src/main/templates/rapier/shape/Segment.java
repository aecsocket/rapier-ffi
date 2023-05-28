package rapier.shape;

import rapier.math.*;
import rapier.sys.RprSegment;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public final class Segment extends Shape {
    private Segment(MemorySegment memory) {
        super(memory);
    }

    public static Segment at(MemorySegment memory) {
        return new Segment(memory);
    }

    public static Segment of(SegmentAllocator alloc, Vector a, Vector b) {
        var memory = {{ sys }}.RprSegment.allocate(alloc);
        {{ sys }}.RprSegment.a$slice(memory).copyFrom(a.memory());
        {{ sys }}.RprSegment.b$slice(memory).copyFrom(b.memory());
        return at(memory);
    }

    public Vector getA() {
        return Vector.at({{ sys }}.RprSegment.a$slice(self));
    }

    public void setA(Vector a) {
        {{ sys }}.RprSegment.a$slice(self).copyFrom(a.memory());
    }

    public Vector getB() {
        return Vector.at({{ sys }}.RprSegment.b$slice(self));
    }

    public void setB(Vector b) {
        {{ sys }}.RprSegment.b$slice(self).copyFrom(b.memory());
    }
}
