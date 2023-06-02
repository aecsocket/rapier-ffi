package rapier;

import javax.annotation.Nullable;
import java.lang.foreign.Addressable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static rapier.sys.RapierC.C_POINTER;

public interface Native {
    Addressable memory();

    static Addressable memoryOrNull(@Nullable Native obj) {
        return obj == null ? MemoryAddress.NULL : obj.memory();
    }

    static MemorySegment allocatePtrArray(SegmentAllocator alloc, Native... objs) {
        var memory = alloc.allocateArray(C_POINTER, objs.length);
        for (int i = 0; i < objs.length; i++) {
            memory.setAtIndex(C_POINTER, i, memoryOrNull(objs[i]));
        }
        return memory;
    }
}
