package control;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record CharacterAutostep(
        CharacterLength maxHeight,
        CharacterLength minWidth,
        boolean includeDynamicBodies
) {
    public static long sizeof() {
        return rapier.sys.RprCharacterAutostep.sizeof();
    }

    public static MemorySegment alloc(SegmentAllocator alloc) {
        return rapier.sys.RprCharacterAutostep.allocate(alloc);
    }

    public static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return rapier.sys.RprCharacterAutostep.allocateArray(len, alloc);
    }

    public void into(MemorySegment memory) {
        maxHeight.into(rapier.sys.RprCharacterAutostep.max_height$slice(memory));
        minWidth.into(rapier.sys.RprCharacterAutostep.min_width$slice(memory));
        rapier.sys.RprCharacterAutostep.include_dynamic_bodies$set(memory, includeDynamicBodies);
    }

    public MemorySegment allocInto(SegmentAllocator alloc) {
        var memory = alloc(alloc);
        into(memory);
        return memory;
    }

    public static CharacterAutostep from(MemorySegment memory) {
        return new CharacterAutostep(
                CharacterLength.from(rapier.sys.RprCharacterAutostep.max_height$slice(memory)),
                CharacterLength.from(rapier.sys.RprCharacterAutostep.min_width$slice(memory)),
                rapier.sys.RprCharacterAutostep.include_dynamic_bodies$get(memory)
        );
    }
}
