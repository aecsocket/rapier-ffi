package rapier.math;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record Aabb(
        Vector min,
        Vector max
) {
    public static long sizeof() {
        return rapier.sys.RprAabb.sizeof();
    }

    public static MemorySegment alloc(SegmentAllocator alloc) {
        return rapier.sys.RprAabb.allocate(alloc);
    }

    public static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return rapier.sys.RprAabb.allocateArray(len, alloc);
    }

    public void into(MemorySegment memory) {
        min.into(rapier.sys.RprAabb.min$slice(memory));
        max.into(rapier.sys.RprAabb.max$slice(memory));
    }

    public MemorySegment allocInto(SegmentAllocator alloc) {
        var memory = alloc(alloc);
        into(memory);
        return memory;
    }

    public static MemorySegment allocInto(SegmentAllocator alloc, Aabb... objs) {
        var memory = allocSlice(alloc, objs.length);
        for (int i = 0; i < objs.length; i++) {
            objs[i].into(memory.asSlice(sizeof() * i));
        }
        return memory;
    }

    public static Aabb from(MemorySegment memory) {
        return new Aabb(
                Vector.from(rapier.sys.RprAabb.min$slice(memory)),
                Vector.from(rapier.sys.RprAabb.max$slice(memory))
        );
    }

    @Override
    public String toString() {
        return "Aabb[%s .. %s]".formatted(min, max);
    }
}
