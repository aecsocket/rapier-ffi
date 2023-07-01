package rapier.pipeline;

import rapier.__real;
import rapier.data.ArenaKey;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record SimpleRayResult(
        ArenaKey collider,
        __real toi
) {
    public static long sizeof() {
        return rapier.sys.RprSimpleRayResult.sizeof();
    }

    public static MemorySegment alloc(SegmentAllocator alloc) {
        return rapier.sys.RprSimpleRayResult.allocate(alloc);
    }

    public static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return rapier.sys.RprSimpleRayResult.allocateArray(len, alloc);
    }

    public void into(MemorySegment memory) {
        collider.into(rapier.sys.RprSimpleRayResult.collider$slice(memory));
        rapier.sys.RprSimpleRayResult.toi$set(memory, toi);
    }

    public static SimpleRayResult from(MemorySegment memory) {
        return new SimpleRayResult(
                ArenaKey.from(rapier.sys.RprSimpleRayResult.collider$slice(memory)),
                rapier.sys.RprSimpleRayResult.toi$get(memory)
        );
    }
}
