package rapier.pipeline;

import rapier.__real;
import rapier.math.Vector;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record TOI(
        __real toi,
        Vector witness1,
        Vector witness2,
        Vector normal1,
        Vector normal2,
        TOIStatus status
) {
    public static long sizeof() {
        return rapier.sys.RprTOI.sizeof();
    }

    public static MemorySegment alloc(SegmentAllocator alloc) {
        return rapier.sys.RprTOI.allocate(alloc);
    }

    public static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return rapier.sys.RprTOI.allocateArray(len, alloc);
    }

    public void into(MemorySegment memory) {
        rapier.sys.RprTOI.toi$set(memory, toi);
        witness1.into(rapier.sys.RprTOI.witness1$slice(memory));
        witness2.into(rapier.sys.RprTOI.witness2$slice(memory));
        normal1.into(rapier.sys.RprTOI.normal1$slice(memory));
        normal2.into(rapier.sys.RprTOI.normal2$slice(memory));
        rapier.sys.RprTOI.status$set(memory, status.ordinal());
    }

    public static TOI from(MemorySegment memory) {
        return new TOI(
                rapier.sys.RprTOI.toi$get(memory),
                Vector.from(rapier.sys.RprTOI.witness1$slice(memory)),
                Vector.from(rapier.sys.RprTOI.witness2$slice(memory)),
                Vector.from(rapier.sys.RprTOI.normal1$slice(memory)),
                Vector.from(rapier.sys.RprTOI.normal2$slice(memory)),
                TOIStatus.values()[rapier.sys.RprTOI.status$get(memory)]
        );
    }
}
