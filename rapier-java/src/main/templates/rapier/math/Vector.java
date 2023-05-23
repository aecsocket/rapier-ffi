package rapier.math;

import rapier.ValNative;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

public final class Vector extends ValNative {
    private Vector(MemorySegment memory) {
        super(memory);
    }

    public static Vector at(MemorySegment memory) {
        return new Vector(memory);
    }

{% if dim2 %}
    public static Vector of(SegmentAllocator alloc, {{ real }} x, {{ real }} y) {
        var memory = {{ sys }}.RprVector.allocate(alloc);
        {{ sys }}.RprVector.x$set(memory, x);
        {{ sys }}.RprVector.y$set(memory, y);
        return at(memory);
    }

    @Override
    public String toString() {
        return "(%f, %f)".formatted(getX(), getY());
    }
{% elseif dim3 %}
    public static Vector of(SegmentAllocator alloc, {{ real }} x, {{ real }} y, {{ real }} z) {
        var memory = {{ sys }}.RprVector.allocate(alloc);
        System.out.println(">> size = " + memory.byteSize());
        {{ sys }}.RprVector.x$set(memory, x);
        {{ sys }}.RprVector.y$set(memory, y);
        {{ sys }}.RprVector.z$set(memory, z);
        return at(memory);
    }

    @Override
    public String toString() {
        return "(%f, %f, %f)".formatted(getX(), getY(), getZ());
    }
{% endif %}

    public {{ real }} getX() {
        return {{ sys }}.RprVector.x$get(self);
    }

    public void setX({{ real }} x) {
        {{ sys }}.RprVector.x$set(self, x);
    }

    public {{ real }} getY() {
        return {{ sys }}.RprVector.y$get(self);
    }

    public void setY({{ real }} y) {
        {{ sys }}.RprVector.y$set(self, y);
    }

{% if dim3 %}
    public {{ real }} getZ() {
        return {{ sys }}.RprVector.z$get(self);
    }

    public void setZ({{ real }} z) {
        {{ sys }}.RprVector.z$set(self, z);
    }
{% endif %}
}
