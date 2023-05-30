package rapier.math;

import rapier.ValNative;
import rapier.sys.RprSpacialVector;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public final class SpacialVector extends ValNative {
    private SpacialVector(MemorySegment memory) {
        super(memory);
    }

    public static SpacialVector at(MemorySegment memory) {
        return new SpacialVector(memory);
    }

{% if dim2 %}
    public static SpacialVector of(SegmentAllocator alloc, {{ real }} x, {{ real }} y, {{ real }} z) {
        var memory = {{ sys }}.RprSpacialVector.allocate(alloc);
        {{ sys }}.RprSpacialVector.x$set(memory, x);
        {{ sys }}.RprSpacialVector.y$set(memory, y);
        {{ sys }}.RprSpacialVector.z$set(memory, z);
        return at(memory);
    }

    public static MemorySegment allocateArray(SegmentAllocator alloc, SpacialVector... objs) {
        var memory = {{ sys }}.RprSpacialVector.allocateArray(objs.length, alloc);
        for (int i = 0; i < objs.length; i++) {
            var obj = objs[i];
            {{ sys }}.RprSpacialVector.x$set(memory, i, obj.getX());
            {{ sys }}.RprSpacialVector.y$set(memory, i, obj.getY());
            {{ sys }}.RprSpacialVector.z$set(memory, i, obj.getZ());
        }
        return memory;
    }

    @Override
    public String toString() {
        return "(%f, %f, %f)".formatted(getX(), getY(), getZ());
    }
{% elseif dim3 %}
    public static SpacialVector of(SegmentAllocator alloc, {{ real }} x, {{ real }} y, {{ real }} z, {{ real }} w, {{ real }} a, {{ real }} b) {
        var memory = {{ sys }}.RprSpacialVector.allocate(alloc);
        {{ sys }}.RprSpacialVector.x$set(memory, x);
        {{ sys }}.RprSpacialVector.y$set(memory, y);
        {{ sys }}.RprSpacialVector.z$set(memory, z);
        {{ sys }}.RprSpacialVector.w$set(memory, w);
        {{ sys }}.RprSpacialVector.a$set(memory, a);
        {{ sys }}.RprSpacialVector.b$set(memory, b);
        return at(memory);
    }

    public static MemorySegment allocateArray(SegmentAllocator alloc, SpacialVector... objs) {
        var memory = {{ sys }}.RprSpacialVector.allocateArray(objs.length, alloc);
        for (int i = 0; i < objs.length; i++) {
            var obj = objs[i];
            {{ sys }}.RprSpacialVector.x$set(memory, i, obj.getX());
            {{ sys }}.RprSpacialVector.y$set(memory, i, obj.getY());
            {{ sys }}.RprSpacialVector.z$set(memory, i, obj.getZ());
            {{ sys }}.RprSpacialVector.w$set(memory, i, obj.getW());
            {{ sys }}.RprSpacialVector.a$set(memory, i, obj.getA());
            {{ sys }}.RprSpacialVector.b$set(memory, i, obj.getB());
        }
        return memory;
    }

    @Override
    public String toString() {
        return "(%f, %f, %f, %f, %f, %f)".formatted(getX(), getY(), getZ(), getW(), getA(), getB());
    }
{% endif %}

    public {{ real }} getX() {
        return {{ sys }}.RprSpacialVector.x$get(self);
    }

    public void setX({{ real }} x) {
        {{ sys }}.RprSpacialVector.x$set(self, x);
    }

    public {{ real }} getY() {
        return {{ sys }}.RprSpacialVector.y$get(self);
    }

    public void setY({{ real }} y) {
        {{ sys }}.RprSpacialVector.y$set(self, y);
    }

    public {{ real }} getZ() {
        return {{ sys }}.RprSpacialVector.z$get(self);
    }

    public void setZ({{ real }} z) {
        {{ sys }}.RprSpacialVector.z$set(self, z);
    }

{% if dim3 %}
    public {{ real }} getW() {
        return {{ sys }}.RprSpacialVector.w$get(self);
    }

    public void setW({{ real }} w) {
        {{ sys }}.RprSpacialVector.w$set(self, w);
    }

    public {{ real }} getA() {
        return {{ sys }}.RprSpacialVector.a$get(self);
    }

    public void setA({{ real }} a) {
        {{ sys }}.RprSpacialVector.a$set(self, a);
    }

    public {{ real }} getB() {
        return {{ sys }}.RprSpacialVector.b$get(self);
    }

    public void setB({{ real }} b) {
        {{ sys }}.RprSpacialVector.b$set(self, b);
    }
{% endif %}
}
