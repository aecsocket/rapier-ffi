package rapier.pipeline;

import rapier.data.ArenaKey;
import rapier.math.Vector;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record SimplePointProject(
        long collider,
        boolean isInside,
        Vector point
) {
    public static SimplePointProject from(MemorySegment memory) {
        return new SimplePointProject(
                ArenaKey.pack({{ sys }}.RprSimplePointProject.collider$slice(memory)),
                {{ sys }}.RprSimplePointProject.is_inside$get(memory),
                Vector.from({{ sys }}.RprSimplePointProject.point$slice(memory))
        );
    }

    public static MemorySegment allocate(SegmentAllocator alloc) {
        var memory = {{ sys }}.RprSimplePointProject.allocate(alloc);
        return memory;
    }
}
