package rapier.math;

import rapier.BaseNative;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

public final class Rotation extends BaseNative {
    protected Rotation(MemorySegment memory) {
        super(memory);
    }

    public static Rotation at(MemorySegment memory) {
        return new Rotation(memory);
    }

{% if dim2 %}
    public static Rotation of(SegmentAllocator alloc, {{ real }} re, {{ real }} im) {
        return at(alloc.allocateArray({{ realLayout }}, re, im));
    }

    public {{ real }} getRe() {
        return self.getAtIndex({{ realLayout }}, 0);
    }

    public void setRe({{ real }} re) {
        self.setAtIndex({{ realLayout }}, 0, re);
    }

    public {{ real }} getIm() {
        return self.getAtIndex({{ realLayout }}, 1);
    }

    public void setIm({{ real }} im) {
        self.setAtIndex({{ realLayout }}, 1, im);
    }

    @Override
    public String toString() {
        return "(%f + %fi)".formatted(getRe(), getIm());
    }
{% elseif dim3 %}
    public static Rotation of(SegmentAllocator alloc, {{ real }} x, {{ real }} y, {{ real }} z, {{ real }} w) {
        return at(alloc.allocateArray({{ realLayout }}, x, y, z, w));
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

    public {{ real }} getZ() {
        return self.getAtIndex({{ realLayout }}, 2);
    }

    public void setZ({{ real }} z) {
        self.setAtIndex({{ realLayout }}, 2, z);
    }

    public {{ real }} getW() {
        return self.getAtIndex({{ realLayout }}, 3);
    }

    public void setW({{ real }} w) {
        self.setAtIndex({{ realLayout }}, 3, w);
    }

    @Override
    public String toString() {
        return "(%f + %fi + %fj + %fk)".formatted(getW(), getX(), getY(), getZ());
    }
{% endif %}
}
