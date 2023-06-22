package rapier.pipeline;

import rapier.data.ArenaKey;
import rapier.math.Vector;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record TOI(
        {{ real }} toi,
        Vector witness1,
        Vector witness2,
        Vector normal1,
        Vector normal2,
        TOIStatus status
) {
    public static TOI from(MemorySegment memory) {
        return new TOI(
                {{ sys }}.RprTOI.toi$get(memory),
                Vector.from({{ sys }}.RprTOI.witness1$slice(memory)),
                Vector.from({{ sys }}.RprTOI.witness2$slice(memory)),
                Vector.from({{ sys }}.RprTOI.normal1$slice(memory)),
                Vector.from({{ sys }}.RprTOI.normal2$slice(memory)),
                TOIStatus.values()[{{ sys }}.RprTOI.status$get(memory)]
        );
    }

    public static MemorySegment allocate(SegmentAllocator alloc) {
        var memory = {{ sys }}.RprTOI.allocate(alloc);
        return memory;
    }
}
