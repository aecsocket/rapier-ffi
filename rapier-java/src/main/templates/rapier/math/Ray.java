package rapier.math;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record Ray(
        Vector origin,
        Vector dir
) {
    public static long sizeof() {
        return rapier.sys.RprRay.sizeof();
    }

    public static MemorySegment alloc(SegmentAllocator alloc) {
        return rapier.sys.RprRay.allocate(alloc);
    }

    public static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return rapier.sys.RprRay.allocateArray(len, alloc);
    }

    public void into(MemorySegment memory) {
        origin.into(rapier.sys.RprRay.origin$slice(memory));
        dir.into(rapier.sys.RprRay.dir$slice(memory));
    }

    public MemorySegment allocInto(SegmentAllocator alloc) {
        var memory = alloc(alloc);
        into(memory);
        return memory;
    }

    public static MemorySegment allocIntoSlice(SegmentAllocator alloc, Ray... objs) {
        var memory = allocSlice(alloc, objs.length);
        for (int i = 0; i < objs.length; i++) {
            objs[i].into(memory.asSlice(sizeof() * i));
        }
        return memory;
    }

    public static Ray from(MemorySegment memory) {
        return new Ray(
                Vector.from(rapier.sys.RprRay.origin$slice(memory)),
                Vector.from(rapier.sys.RprRay.dir$slice(memory))
        );
    }

    @Override
    public String toString() {
        return "Ray[%s -> %s]".formatted(origin, dir);
    }
}
