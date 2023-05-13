package rapier.math;

import rapier.Native;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

public final class AngVector extends Native {
    protected AngVector(MemorySegment memory) {
        super(memory);
    }

    public static AngVector at(MemorySegment memory) {
        return new AngVector(memory);
    }

{% if dim2 %}
    public static AngVector of(SegmentAllocator alloc, {{ real }} a) {
        return at(alloc.allocateArray({{ realLayout }}, a));
    }

    public {{ real }} get() {
        return self.get({{ realLayout }}, 0);
    }

    public void set({{ real }} a) {
        self.set({{ realLayout }}, 0, a);
    }

    @Override
    public String toString() {
        return "(%f)".formatted(get());
    }
{% elseif dim3 %}
    public static AngVector of(SegmentAllocator alloc, {{ real }} x, {{ real }} y, {{ real }} z) {
        return at(alloc.allocateArray({{ realLayout }}, x, y, z));
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

    @Override
    public String toString() {
        return "(%f, %f, %f)".formatted(getX(), getY(), getZ());
    }
{% endif %}
}
