package rapier.pipeline;

import rapier.data.ArenaKey;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record ShapeCast(
        long collider,
        TOI toi
) {
    public static ShapeCast from(MemorySegment memory) {
        return new ShapeCast(
                ArenaKey.pack({{ sys }}.RprShapeCast.collider$slice(memory)),
                TOI.from({{ sys }}.RprShapeCast.toi$slice(memory))
        );
    }

    public static MemorySegment allocate(SegmentAllocator alloc) {
        var memory = {{ sys }}.RprShapeCast.allocate(alloc);
        return memory;
    }
}
