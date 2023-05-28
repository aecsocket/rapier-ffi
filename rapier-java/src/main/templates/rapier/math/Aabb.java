package rapier.math;

import rapier.ValNative;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public final class Aabb extends ValNative {
    private Aabb(MemorySegment memory) {
        super(memory);
    }

    public static Aabb at(MemorySegment memory) {
        return new Aabb(memory);
    }

    public static Aabb of(SegmentAllocator alloc, Vector min, Vector max) {
        var memory = {{ sys }}.RprAabb.allocate(alloc);
        {{ sys }}.RprAabb.min$slice(memory).copyFrom(min.memory());
        {{ sys }}.RprAabb.max$slice(memory).copyFrom(max.memory());
        return at(memory);
    }

    public Vector getMin() {
        return Vector.at({{ sys }}.RprAabb.min$slice(self));
    }

    public void setMin(Vector min) {
        {{ sys }}.RprAabb.min$slice(self).copyFrom(min.memory());
    }

    public Vector getMax() {
        return Vector.at({{ sys }}.RprAabb.max$slice(self));
    }

    public void setMax(Vector max) {
        {{ sys }}.RprAabb.max$slice(self).copyFrom(max.memory());
    }

    @Override
    public String toString() {
        return "[%s .. %s]".formatted(getMin(), getMax());
    }
}
