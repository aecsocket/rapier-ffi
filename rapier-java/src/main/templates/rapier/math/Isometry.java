package rapier.math;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record Isometry(
        Rotation rotation,
        Vector translation
) {
    public static long sizeof() {
        return rapier.sys.RprIsometry.sizeof();
    }

    public static MemorySegment alloc(SegmentAllocator alloc) {
        return rapier.sys.RprIsometry.allocate(alloc);
    }

    public static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return rapier.sys.RprIsometry.allocateArray(len, alloc);
    }

    public void into(MemorySegment memory) {
        rotation.into(rapier.sys.RprIsometry.rotation$slice(memory));
        translation.into(rapier.sys.RprIsometry.translation$slice(memory));
    }

    public MemorySegment allocInto(SegmentAllocator alloc) {
        var memory = alloc(alloc);
        into(memory);
        return memory;
    }

    public static MemorySegment allocIntoSlice(SegmentAllocator alloc, Isometry... objs) {
        var memory = allocSlice(alloc, objs.length);
        for (int i = 0; i < objs.length; i++) {
            objs[i].into(memory.asSlice(sizeof() * i));
        }
        return memory;
    }

    public static Isometry from(MemorySegment memory) {
        return new Isometry(
                Rotation.from(rapier.sys.RprIsometry.rotation$slice(memory)),
                Vector.from(rapier.sys.RprIsometry.translation$slice(memory))
        );
    }

    public static Isometry identity() {
        return new Isometry(
                Rotation.identity(),
                Vector.zero()
        );
    }

    @Override
    public String toString() {
        return "Isometry[%s, %s]".formatted(rotation, translation);
    }
}
