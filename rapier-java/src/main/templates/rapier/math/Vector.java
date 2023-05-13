package rapier.math;

import rapier.Native;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

public final class Vector extends Native {
    protected Vector(MemorySegment memory) {
        super(memory);
    }

    public static Vector at(MemorySegment memory) {
        return new Vector(memory);
    }

{% if dim2 %}
    public static Vector of(SegmentAllocator alloc, {{ real }} x, {{ real }} y) {
        return at(alloc.allocateArray({{ realLayout }}, x, y));
    }

    @Override
    public String toString() {
        return "(%f, %f)".formatted(getX(), getY());
    }
{% elseif dim3 %}
    public static Vector of(SegmentAllocator alloc, {{ real }} x, {{ real }} y, {{ real }} z) {
        return at(alloc.allocateArray({{ realLayout }}, x, y, z));
    }

    @Override
    public String toString() {
        return "(%f, %f, %f)".formatted(getX(), getY(), getZ());
    }
{% endif %}

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

{% if dim3 %}
    public {{ real }} getZ() {
        return self.getAtIndex({{ realLayout }}, 2);
    }

    public void setZ({{ real }} z) {
        self.setAtIndex({{ realLayout }}, 2, z);
    }
{% endif %}
}
