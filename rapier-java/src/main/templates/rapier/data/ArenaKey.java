package rapier.data;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

public final class ArenaKey {
    private ArenaKey() {}

    public static final long INVALID_KEY = 0xffffffff_ffffffffL;

    public static long pack(MemorySegment memory) {
        return memory.getAtIndex(ValueLayout.JAVA_LONG, 0);
    }

    public static MemorySegment unpack(SegmentAllocator alloc, long key) {
        return alloc.allocate(ValueLayout.JAVA_LONG, key);
    }

    public static boolean isValid(long key) {
        return key != INVALID_KEY;
    }

    public static int index(long key) {
        // upper 32 bits
        return (int) (key >> 32);
    }

    public static int generation(long key) {
        // bottom 32 bits
        return (int) key;
    }

    public static String asString(long key) {
        return index(key) + "/" + generation(key);
    }
}
