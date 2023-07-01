package rapier.pipeline;

import rapier.data.ArenaKey;
import rapier.math.Vector;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record ComplexPointProject(
        ArenaKey collider,
        boolean isInside,
        Vector point,
        FeatureId feature
) {
    public static long sizeof() {
        return rapier.sys.RprComplexPointProject.sizeof();
    }

    public static MemorySegment alloc(SegmentAllocator alloc) {
        return rapier.sys.RprComplexPointProject.allocate(alloc);
    }

    public static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return rapier.sys.RprComplexPointProject.allocateArray(len, alloc);
    }

    public static ComplexPointProject from(MemorySegment memory) {
        return new ComplexPointProject(
                ArenaKey.from(rapier.sys.RprComplexPointProject.collider$slice(memory)),
                rapier.sys.RprComplexPointProject.is_inside$get(memory),
                Vector.from(rapier.sys.RprComplexPointProject.point$slice(memory)),
                FeatureId.from(rapier.sys.RprComplexPointProject.feature$slice(memory))
        );
    }
}
