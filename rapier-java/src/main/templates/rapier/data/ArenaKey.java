package rapier.data;

import java.lang.foreign.*;

public final class ArenaKey {
    private ArenaKey() {}

    public static final long INVALID_KEY = 0xffffffff_ffffffffL;

    public static long pack(Addressable memory, long index) {
        // RprArenaKey only guarantees alignment to 8 bytes; reading a JAVA_LONG requires 16-byte alignment
        // therefore we read in two separate passes
        long kIndex = memory.address().getAtIndex(ValueLayout.JAVA_INT, index * 2);
        long kGen = memory.address().getAtIndex(ValueLayout.JAVA_INT, index * 2 + 1);
        return kIndex | (kGen << 32);
    }

    public static long pack(Addressable memory) {
        return pack(memory, 0);
    }

    public static MemorySegment unpack(SegmentAllocator alloc, long key) {
        return alloc.allocate(ValueLayout.JAVA_LONG, key);
    }

    public static boolean isValid(long key) {
        return key != INVALID_KEY;
    }

    public static int index(long key) {
        // bottom 32 bits
        return (int) key;
    }

    public static int generation(long key) {
        // upper 32 bits
        return (int) (key >> 32);
    }

    public static String asString(long key) {
        return index(key) + "/" + generation(key);
    }
}
