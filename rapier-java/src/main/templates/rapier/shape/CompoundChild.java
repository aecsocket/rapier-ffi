package rapier.shape;

import rapier.ValNative;
import rapier.math.Isometry;
import rapier.sys.RprCompoundChild;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record CompoundChild(
        Isometry delta,
        SharedShape shape
) {
    public static CompoundChild from(MemorySegment memory) {
        return new CompoundChild(
                Isometry.from({{ sys }}.RprCompoundChild.delta$slice(memory)),
                SharedShape.at({{ sys }}.RprCompoundChild.shape$get(memory))
        );
    }

    public void into(MemorySegment memory) {
        delta.into({{ sys }}.RprCompoundChild.delta$slice(memory));
        {{ sys }}.RprCompoundChild.shape$set(memory, shape.memory());
    }

    public MemorySegment allocate(SegmentAllocator alloc) {
        var memory = {{ sys }}.RprCompoundChild.allocate(alloc);
        into(memory);
        return memory;
    }

    public static MemorySegment allocateArray(SegmentAllocator alloc, CompoundChild... objs) {
        var memory = {{ sys }}.RprCompoundChild.allocateArray(objs.length, alloc);
        for (int i = 0; i < objs.length; i++) {
            objs[i].into(memory.asSlice({{ sys }}.RprCompoundChild.sizeof() * i));
        }
        return memory;
    }
}
