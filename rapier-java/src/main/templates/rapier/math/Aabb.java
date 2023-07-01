package rapier.math;

import rapier.sys.RprAabb;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record Aabb(
        Vector min,
        Vector max
) {
        /*
        public static long sizeof() {
        return RprArenaKey.sizeof();
    }

    public static MemorySegment alloc(SegmentAllocator alloc) {
        return RprArenaKey.allocate(alloc);
    }

    public static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return RprArenaKey.allocateArray(len, alloc);
    }

    public void into(MemorySegment memory) {
        RprArenaKey.index$set(memory, index);
        RprArenaKey.generation$set(memory, generation);
    }

    public MemorySegment allocInto(SegmentAllocator alloc) {
        var memory = alloc(alloc);
        into(memory);
        return memory;
    }

    public static MemorySegment allocInto(SegmentAllocator alloc, ArenaKey... objs) {
        var memory = allocSlice(alloc, objs.length);
        for (int i = 0; i < objs.length; i++) {
            objs[i].into(memory.asSlice(sizeof() * i));
        }
        return memory;
    }

    public static ArenaKey from(MemorySegment memory) {
        return new ArenaKey(
                RprArenaKey.index$get(memory),
                RprArenaKey.generation$get(memory)
        );
    }
     */

    public static long sizeof() {
        return {{ sys }}.RprAabb.sizeof();
    }

    public static MemorySegment alloc(SegmentAllocator alloc) {
        return {{ sys }}.RprAabb.allocate(alloc);
    }

    public static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return RprAabb.allocateArray(len, alloc);
    }

    public void into(MemorySegment memory) {
        min.into({{ sys }}.RprAabb.min$slice(memory));
        max.into({{ sys }}.RprAabb.max$slice(memory));
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
                Vector.from({{ sys }}.RprAabb.min$slice(memory)),
                Vector.from({{ sys }}.RprAabb.max$slice(memory))
        );
    }

    public MemorySegment allocateInto(SegmentAllocator alloc) {
        var memory = alloc(alloc);
        into(memory);
        return memory;
    }

    public static MemorySegment allocateInto(SegmentAllocator alloc, Aabb... objs) {
        var memory = allocSlice(alloc, objs.length);
        for (int i = 0; i < objs.length; i++) {
            objs[i].into(memory.asSlice(sizeof() * i));
        }
        return memory;
    }

    @Override
    public String toString() {
        return "Aabb[%s .. %s]".formatted(min, max);
    }
}
