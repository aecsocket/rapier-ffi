package rapier.shape;

import rapier.math.*;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public final class Triangle extends Shape {
    protected Triangle(MemorySegment memory) {
        super(memory);
    }

    public static Triangle at(MemorySegment memory) {
        return new Triangle(memory);
    }

    public static Triangle create(SegmentAllocator alloc, {{ realVec }} a, {{ realVec }} b, {{ realVec }} c) {
        var memory = {{ sys }}.RprTriangle.allocate(alloc);
        {{ sys }}.RprTriangle.a$slice(memory).copyFrom(a.memory());
        {{ sys }}.RprTriangle.b$slice(memory).copyFrom(b.memory());
        {{ sys }}.RprTriangle.c$slice(memory).copyFrom(c.memory());
        return at(memory);
    }

    public {{ realVec }} getA() {
        return {{ realVec }}.at({{ sys }}.RprTriangle.a$slice(self));
    }

    public void setA({{ realVec }} a) {
        {{ sys }}.RprTriangle.a$slice(self).copyFrom(a.memory());
    }

    public {{ realVec }} getB() {
        return {{ realVec }}.at({{ sys }}.RprTriangle.b$slice(self));
    }

    public void setB({{ realVec }} b) {
        {{ sys }}.RprTriangle.b$slice(self).copyFrom(b.memory());
    }

    public {{ realVec }} getC() {
        return {{ realVec }}.at({{ sys }}.RprTriangle.c$slice(self));
    }

    public void setC({{ realVec }} c) {
        {{ sys }}.RprTriangle.c$slice(self).copyFrom(c.memory());
    }
}
