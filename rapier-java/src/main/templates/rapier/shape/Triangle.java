package rapier.shape;

import rapier.math.*;
import rapier.sys.RprTriangle;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public final class Triangle extends Shape {
    private Triangle(MemorySegment memory) {
        super(memory);
    }

    public static Triangle at(MemorySegment memory) {
        return new Triangle(memory);
    }

    public static Triangle create(SegmentAllocator alloc, Vector a, Vector b, Vector c) {
        var memory = {{ sys }}.RprTriangle.allocate(alloc);
        {{ sys }}.RprTriangle.a$slice(memory).copyFrom(a.memory());
        {{ sys }}.RprTriangle.b$slice(memory).copyFrom(b.memory());
        {{ sys }}.RprTriangle.c$slice(memory).copyFrom(c.memory());
        return at(memory);
    }

    public Vector getA() {
        return Vector.at({{ sys }}.RprTriangle.a$slice(self));
    }

    public void setA(Vector a) {
        {{ sys }}.RprTriangle.a$slice(self).copyFrom(a.memory());
    }

    public Vector getB() {
        return Vector.at({{ sys }}.RprTriangle.b$slice(self));
    }

    public void setB(Vector b) {
        {{ sys }}.RprTriangle.b$slice(self).copyFrom(b.memory());
    }

    public Vector getC() {
        return Vector.at({{ sys }}.RprTriangle.c$slice(self));
    }

    public void setC(Vector c) {
        {{ sys }}.RprTriangle.c$slice(self).copyFrom(c.memory());
    }
}
