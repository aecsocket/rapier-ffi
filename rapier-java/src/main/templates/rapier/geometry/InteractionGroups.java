package rapier.geometry;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record InteractionGroups(
        int memberships,
        int filter
) {
    public static long sizeof() {
        return rapier.sys.RprInteractionGroups.sizeof();
    }

    public static MemorySegment alloc(SegmentAllocator alloc) {
        return rapier.sys.RprInteractionGroups.allocate(alloc);
    }

    public static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return rapier.sys.RprInteractionGroups.allocateArray(len, alloc);
    }

    public MemorySegment allocInto(SegmentAllocator alloc) {
        var memory = alloc(alloc);
        into(memory);
        return memory;
    }

    public static MemorySegment allocIntoSlice(SegmentAllocator alloc, InteractionGroups... objs) {
        var memory = allocSlice(alloc, objs.length);
        for (int i = 0; i < objs.length; i++) {
            objs[i].into(memory.asSlice(sizeof() * i));
        }
        return memory;
    }

    public void into(MemorySegment memory) {
        rapier.sys.RprInteractionGroups.memberships$set(memory, memberships);
        rapier.sys.RprInteractionGroups.filter$set(memory, filter);
    }

    public static InteractionGroups from(MemorySegment memory) {
        return new InteractionGroups(
                rapier.sys.RprInteractionGroups.memberships$get(memory),
                rapier.sys.RprInteractionGroups.filter$get(memory)
        );
    }
}
