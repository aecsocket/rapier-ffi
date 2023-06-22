package rapier.math;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record Aabb(
        Vector min,
        Vector max
) {
    public static Aabb from(MemorySegment memory) {
        return new Aabb(
                Vector.from({{ sys }}.RprAabb.min$slice(memory)),
                Vector.from({{ sys }}.RprAabb.max$slice(memory))
        );
    }

    public void into(MemorySegment memory) {
        min.into({{ sys }}.RprAabb.min$slice(memory));
        max.into({{ sys }}.RprAabb.max$slice(memory));
    }

    public MemorySegment allocate(SegmentAllocator alloc) {
        var memory = {{ sys }}.RprAabb.allocate(alloc);
        into(memory);
        return memory;
    }

    public static MemorySegment allocateArray(SegmentAllocator alloc, Aabb... objs) {
        var memory = {{ sys }}.RprAabb.allocateArray(objs.length, alloc);
        for (int i = 0; i < objs.length; i++) {
            objs[i].into(memory.asSlice({{ sys }}.RprAabb.sizeof() * i));
        }
        return memory;
    }

    @Override
    public String toString() {
        return "Aabb[%s .. %s]".formatted(min, max);
    }
}
