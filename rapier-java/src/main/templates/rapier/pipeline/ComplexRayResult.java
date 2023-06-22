package rapier.pipeline;

import rapier.data.ArenaKey;
import rapier.math.Vector;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record ComplexRayResult(
        long collider,
        {{ real }} toi,
        Vector normal,
        FeatureId feature
) {
    public static ComplexRayResult from(MemorySegment memory) {
        return new ComplexRayResult(
                ArenaKey.pack({{ sys }}.RprComplexRayResult.collider$slice(memory)),
                {{ sys }}.RprComplexRayResult.toi$get(memory),
                Vector.from({{ sys }}.RprComplexRayResult.normal$slice(memory)),
                FeatureId.from({{ sys }}.RprComplexRayResult.feature$slice(memory))
        );
    }

    public static MemorySegment allocate(SegmentAllocator alloc) {
        var memory = {{ sys }}.RprComplexRayResult.allocate(alloc);
        return memory;
    }
}
