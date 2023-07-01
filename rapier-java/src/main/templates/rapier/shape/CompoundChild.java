package rapier.shape;

import rapier.math.Isometry;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record CompoundChild(
        Isometry delta,
        SharedShape shape
) {
    public static long sizeof() {
        return rapier.sys.RprCompoundChild.sizeof();
    }

    public static MemorySegment alloc(SegmentAllocator alloc) {
        return rapier.sys.RprCompoundChild.allocate(alloc);
    }

    public static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return rapier.sys.RprCompoundChild.allocateArray(len, alloc);
    }

    public void into(MemorySegment memory) {
        delta.into(rapier.sys.RprCompoundChild.delta$slice(memory));
        rapier.sys.RprCompoundChild.shape$set(memory, shape.memory());
    }

    public MemorySegment allocInto(SegmentAllocator alloc) {
        var memory = alloc(alloc);
        into(memory);
        return memory;
    }

    public static MemorySegment allocIntoSlice(SegmentAllocator alloc, CompoundChild... objs) {
        var memory = allocSlice(alloc, objs.length);
        for (int i = 0; i < objs.length; i++) {
            objs[i].into(memory.asSlice(sizeof() * i));
        }
        return memory;
    }

    public static CompoundChild from(MemorySegment memory) {
        return new CompoundChild(
                Isometry.from(rapier.sys.RprCompoundChild.delta$slice(memory)),
                SharedShape.at(rapier.sys.RprCompoundChild.shape$get(memory))
        );
    }
}
