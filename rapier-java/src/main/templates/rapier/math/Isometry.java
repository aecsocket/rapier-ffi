package rapier.math;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record Isometry(
        Rotation rotation,
        Vector translation
) {
    public static Isometry identity() {
        return new Isometry(
                Rotation.identity(),
                Vector.zero()
        );
    }

    public static Isometry from(MemorySegment memory) {
        return new Isometry(
                Rotation.from({{ sys }}.RprIsometry.rotation$slice(memory)),
                Vector.from({{ sys }}.RprIsometry.translation$slice(memory))
        );
    }

    public void into(MemorySegment memory) {
        rotation.into({{ sys }}.RprIsometry.rotation$slice(memory));
        translation.into({{ sys }}.RprIsometry.translation$slice(memory));
    }

    public MemorySegment allocate(SegmentAllocator alloc) {
        var memory = {{ sys }}.RprIsometry.allocate(alloc);
        into(memory);
        return memory;
    }

    public static MemorySegment allocateArray(SegmentAllocator alloc, Isometry... objs) {
        var memory = {{ sys }}.RprIsometry.allocateArray(objs.length, alloc);
        for (int i = 0; i < objs.length; i++) {
            objs[i].into(memory.asSlice({{ sys }}.RprIsometry.sizeof() * i));
        }
        return memory;
    }

    @Override
    public String toString() {
        return "Isometry[%s, %s]".formatted(rotation, translation);
    }
}
