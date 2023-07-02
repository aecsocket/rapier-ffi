package rapier.data;

import java.lang.foreign.*;

public record ArenaKey(
        int index,
        int generation
) {
    public static long sizeof() {
        return rapier.sys.RprArenaKey.sizeof();
    }

    public static MemorySegment alloc(SegmentAllocator alloc) {
        return rapier.sys.RprArenaKey.allocate(alloc);
    }

    public static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return rapier.sys.RprArenaKey.allocateArray(len, alloc);
    }

    public void into(MemorySegment memory) {
        rapier.sys.RprArenaKey.index$set(memory, index);
        rapier.sys.RprArenaKey.generation$set(memory, generation);
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
                rapier.sys.RprArenaKey.index$get(memory),
                rapier.sys.RprArenaKey.generation$get(memory)
        );
    }

    public static ArenaKey[] fromSlice(MemorySegment data, int len) {
        var res = new ArenaKey[len];
        for (int i = 0; i < len; i++) {
            res[i] = ArenaKey.from(data.asSlice(sizeof() * i));
        }
        return res;
    }

    public static final ArenaKey INVALID = new ArenaKey(0xffffffff, 0xffffffff);

    public boolean isValid() {
        return !equals(INVALID);
    }

    @Override
    public String toString() {
        return index + "/" + generation;
    }
}
