package rapier.pipeline;

import rapier.data.ArenaKey;
import rapier.math.Vector;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record SimplePointProject(
        ArenaKey collider,
        boolean isInside,
        Vector point
) {
    public static long sizeof() {
        return rapier.sys.RprSimplePointProject.sizeof();
    }

    public static MemorySegment alloc(SegmentAllocator alloc) {
        return rapier.sys.RprSimplePointProject.allocate(alloc);
    }

    public static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return rapier.sys.RprSimplePointProject.allocateArray(len, alloc);
    }

    public void into(MemorySegment memory) {
        collider.into(rapier.sys.RprSimplePointProject.collider$slice(memory));
        rapier.sys.RprSimplePointProject.is_inside$set(memory, isInside);
        point.into(rapier.sys.RprSimplePointProject.point$slice(memory));
    }

    public MemorySegment allocInto(SegmentAllocator alloc) {
        var memory = alloc(alloc);
        into(memory);
        return memory;
    }

    public static SimplePointProject from(MemorySegment memory) {
        return new SimplePointProject(
                ArenaKey.from(rapier.sys.RprSimplePointProject.collider$slice(memory)),
                rapier.sys.RprSimplePointProject.is_inside$get(memory),
                Vector.from(rapier.sys.RprSimplePointProject.point$slice(memory))
        );
    }
}
