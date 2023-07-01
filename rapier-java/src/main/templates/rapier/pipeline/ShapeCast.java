package rapier.pipeline;

import rapier.data.ArenaKey;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record ShapeCast(
        ArenaKey collider,
        TOI toi
) {
    public static long sizeof() {
        return rapier.sys.RprShapeCast.sizeof();
    }

    public static MemorySegment alloc(SegmentAllocator alloc) {
        return rapier.sys.RprShapeCast.allocate(alloc);
    }

    public static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return rapier.sys.RprShapeCast.allocateArray(len, alloc);
    }

    public void into(MemorySegment memory) {
        collider.into(rapier.sys.RprShapeCast.collider$slice(memory));
        toi.into(rapier.sys.RprShapeCast.toi$slice(memory));
    }

    public MemorySegment allocInto(SegmentAllocator alloc) {
        var memory = alloc(alloc);
        into(memory);
        return memory;
    }

    public static ShapeCast from(MemorySegment memory) {
        return new ShapeCast(
                ArenaKey.from(rapier.sys.RprShapeCast.collider$slice(memory)),
                TOI.from(rapier.sys.RprShapeCast.toi$slice(memory))
        );
    }
}
