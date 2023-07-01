package rapier.control;

import rapier.__real;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public sealed interface CharacterLength {
    record Relative(
            __real value
    ) implements CharacterLength {
        @Override
        public void into(MemorySegment memory) {
            rapier.sys.RprCharacterLength.tag$set(memory, rapier.sys.RapierC.Relative());
            rapier.sys.RprCharacterLength.relative$set(memory, value);
        }
    }

    record Absolute(
            __real value
    ) implements CharacterLength {
        @Override
        public void into(MemorySegment memory) {
            rapier.sys.RprCharacterLength.tag$set(memory, rapier.sys.RapierC.Absolute());
            rapier.sys.RprCharacterLength.absolute$set(memory, value);
        }
    }

    static long sizeof() {
        return rapier.sys.RprCharacterLength.sizeof();
    }

    static MemorySegment alloc(SegmentAllocator alloc) {
        return rapier.sys.RprCharacterLength.allocate(alloc);
    }

    static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return rapier.sys.RprCharacterLength.allocateArray(len, alloc);
    }

    void into(MemorySegment memory);

    default MemorySegment allocInto(SegmentAllocator alloc) {
        var memory = alloc(alloc);
        into(memory);
        return memory;
    }

    static CharacterLength from(MemorySegment memory) {
        var tag = rapier.sys.RprCharacterLength.tag$get(memory);
        return switch (tag) {
            case 0 -> new Relative(
                    rapier.sys.RprCharacterLength.relative$get(memory)
            );
            case 1 -> new Absolute(
                    rapier.sys.RprCharacterLength.absolute$get(memory)
            );
            default -> throw new IllegalArgumentException("Invalid tag " + tag);
        };
    }
}
