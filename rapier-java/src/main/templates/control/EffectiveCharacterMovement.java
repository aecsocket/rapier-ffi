package control;

import rapier.math.Vector;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record EffectiveCharacterMovement(
        Vector translation,
        boolean grounded
) {
    public static long sizeof() {
        return rapier.sys.RprEffectiveCharacterMovement.sizeof();
    }

    public static MemorySegment alloc(SegmentAllocator alloc) {
        return rapier.sys.RprEffectiveCharacterMovement.allocate(alloc);
    }

    public static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return rapier.sys.RprEffectiveCharacterMovement.allocateArray(len, alloc);
    }

    public void into(MemorySegment memory) {
        translation.into(rapier.sys.RprEffectiveCharacterMovement.translation$slice(memory));
        rapier.sys.RprEffectiveCharacterMovement.grounded$set(memory, grounded);
    }

    public MemorySegment allocInto(SegmentAllocator alloc) {
        var memory = alloc(alloc);
        into(memory);
        return memory;
    }

    public static EffectiveCharacterMovement from(MemorySegment memory) {
        return new EffectiveCharacterMovement(
                Vector.from(rapier.sys.RprEffectiveCharacterMovement.translation$slice(memory)),
                rapier.sys.RprEffectiveCharacterMovement.grounded$get(memory)
        );
    }
}
