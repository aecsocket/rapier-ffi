package rapier.data;

import rapier.sys.RprArenaKey;

import java.lang.foreign.*;

public record ArenaKey(
        int index,
        int generation
) {
    public static final ArenaKey INVALID = new ArenaKey(0xffffffff, 0xffffffff);

    public static long sizeof() {
        return RprArenaKey.sizeof();
    }

    public static MemorySegment alloc(SegmentAllocator alloc) {
        return RprArenaKey.allocate(alloc);
    }

    public static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return RprArenaKey.allocateArray(len, alloc);
    }

    public void into(MemorySegment memory) {
        RprArenaKey.index$set(memory, index);
        RprArenaKey.generation$set(memory, generation);
    }

    public MemorySegment allocInto(SegmentAllocator alloc) {
        var memory = alloc(alloc);
        into(memory);
        return memory;
    }

    public static MemorySegment allocIntoSlice(SegmentAllocator alloc, ArenaKey... objs) {
        var memory = allocSlice(alloc, objs.length);
        for (int i = 0; i < objs.length; i++) {
            objs[i].into(memory.asSlice(sizeof() * i));
        }
        return memory;
    }

    public static ArenaKey from(MemorySegment memory) {
        return new ArenaKey(
                RprArenaKey.index$get(memory),
                RprArenaKey.generation$get(memory)
        );
    }

    public static ArenaKey[] fromSlice(MemoryAddress data, int len) {
        var res = new ArenaKey[len];
        // TODO: we won't need to do this in Java 20 i dont think
        try (var arena = MemorySession.openConfined()) {
            for (int i = 0; i < len; i++) {
                // SAFETY: lo;l
                var elem = MemorySegment.ofAddress(data.addOffset(sizeof() * i), sizeof(), arena);
                res[i] = ArenaKey.from(elem);
            }
        }
        return res;
    }

    public boolean isValid() {
        return !equals(INVALID);
    }

    @Override
    public String toString() {
        return index + "/" + generation;
    }
}
