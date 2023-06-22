package rapier.pipeline;

import rapier.data.ArenaKey;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record SimpleRayResult(
        long collider,
        {{ real }} toi
) {
    public static SimpleRayResult from(MemorySegment memory) {
        return new SimpleRayResult(
                ArenaKey.pack({{ sys }}.RprSimpleRayResult.collider$slice(memory)),
                {{ sys }}.RprSimpleRayResult.toi$get(memory)
        );
    }

    public static MemorySegment allocate(SegmentAllocator alloc) {
        var memory = {{ sys }}.RprSimpleRayResult.allocate(alloc);
        return memory;
    }
}
