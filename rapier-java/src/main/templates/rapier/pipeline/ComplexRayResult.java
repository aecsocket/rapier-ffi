package rapier.pipeline;

import rapier.__real;
import rapier.data.ArenaKey;
import rapier.math.Vector;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record ComplexRayResult(
        ArenaKey collider,
        __real toi,
        Vector normal,
        FeatureId feature
) {
    public static long sizeof() {
        return rapier.sys.RprComplexRayResult.sizeof();
    }

    public static MemorySegment alloc(SegmentAllocator alloc) {
        return rapier.sys.RprComplexRayResult.allocate(alloc);
    }

    public static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return rapier.sys.RprComplexRayResult.allocateArray(len, alloc);
    }

    public static ComplexRayResult from(MemorySegment memory) {
        return new ComplexRayResult(
                ArenaKey.from(rapier.sys.RprComplexRayResult.collider$slice(memory)),
                rapier.sys.RprComplexRayResult.toi$get(memory),
                Vector.from(rapier.sys.RprComplexRayResult.normal$slice(memory)),
                FeatureId.from(rapier.sys.RprComplexRayResult.feature$slice(memory))
        );
    }
}
