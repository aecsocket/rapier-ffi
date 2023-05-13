package rapier.geometry;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

import static rapier.sys.RapierC.*;

public final class ColliderHandle {
    private ColliderHandle() {}

    public static long pack(MemorySegment memory) {
        return memory.getAtIndex(ValueLayout.JAVA_LONG, 0);
    }

    public static MemorySegment unpack(SegmentAllocator alloc, long handle) {
        return alloc.allocate(ValueLayout.JAVA_LONG, handle);
    }

    public static boolean isValid(long handle) {
        try (var arena = Arena.openConfined()) {
            return RprColliderHandle_is_valid(unpack(arena, handle));
        }
    }
}
