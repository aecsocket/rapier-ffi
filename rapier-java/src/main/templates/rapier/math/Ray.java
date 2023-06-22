package rapier.math;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record Ray(
        Vector origin,
        Vector dir
) {
    public static Ray from(MemorySegment memory) {
        return new Ray(
                Vector.from({{ sys }}.RprRay.origin$slice(memory)),
                Vector.from({{ sys }}.RprRay.dir$slice(memory))
        );
    }

    public void into(MemorySegment memory) {
        origin.into({{ sys }}.RprRay.origin$slice(memory));
        dir.into({{ sys }}.RprRay.dir$slice(memory));
    }

    public MemorySegment allocate(SegmentAllocator alloc) {
        var memory = {{ sys }}.RprRay.allocate(alloc);
        into(memory);
        return memory;
    }

    public static MemorySegment allocateArray(SegmentAllocator alloc, Ray... objs) {
        var memory = {{ sys }}.RprRay.allocateArray(objs.length, alloc);
        for (int i = 0; i < objs.length; i++) {
            objs[i].into(memory.asSlice({{ sys }}.RprRay.sizeof() * i));
        }
        return memory;
    }

    @Override
    public String toString() {
        return "Ray[%s -> %s]".formatted(origin, dir);
    }
}
