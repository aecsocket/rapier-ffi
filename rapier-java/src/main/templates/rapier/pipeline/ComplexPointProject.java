package rapier.pipeline;

import rapier.data.ArenaKey;
import rapier.math.Vector;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record ComplexPointProject(
        long collider,
        boolean isInside,
        Vector point,
        FeatureId feature
) {
    public static ComplexPointProject from(MemorySegment memory) {
        return new ComplexPointProject(
                ArenaKey.pack({{ sys }}.RprComplexPointProject.collider$slice(memory)),
                {{ sys }}.RprComplexPointProject.is_inside$get(memory),
                Vector.from({{ sys }}.RprComplexPointProject.point$slice(memory)),
                FeatureId.from({{ sys }}.RprComplexPointProject.feature$slice(memory))
        );
    }

    public static MemorySegment allocate(SegmentAllocator alloc) {
        var memory = {{ sys }}.RprComplexPointProject.allocate(alloc);
        return memory;
    }
}
