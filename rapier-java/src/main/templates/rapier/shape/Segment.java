package rapier.shape;

import rapier.math.*;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public final class Segment extends Shape {
    protected Segment(MemorySegment memory) {
        super(memory);
    }

    public static Segment at(MemorySegment memory) {
        return new Segment(memory);
    }

    public static Segment of(SegmentAllocator alloc, {{ realVec }} a, {{ realVec }} b) {
        var memory = {{ sys }}.RprSegment.allocate(alloc);
        {{ sys }}.RprSegment.a$slice(memory).copyFrom(a.memory());
        {{ sys }}.RprSegment.b$slice(memory).copyFrom(b.memory());
        return at(memory);
    }

    public {{ realVec }} getA() {
        return {{ realVec }}.at({{ sys }}.RprSegment.a$slice(self));
    }

    public void setA({{ realVec }} a) {
        {{ sys }}.RprSegment.a$slice(self).copyFrom(a.memory());
    }

    public {{ realVec }} getB() {
        return {{ realVec }}.at({{ sys }}.RprSegment.b$slice(self));
    }

    public void setB({{ realVec }} b) {
        {{ sys }}.RprSegment.b$slice(self).copyFrom(b.memory());
    }
}
