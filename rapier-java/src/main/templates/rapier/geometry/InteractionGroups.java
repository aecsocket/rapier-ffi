package rapier.geometry;

import rapier.sys.RprInteractionGroups;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record InteractionGroups(
        int memberships,
        int filter
) {
    public static long sizeof() {
        return RprInteractionGroups.sizeof();
    }

    public static MemorySegment alloc(SegmentAllocator alloc) {
        return RprInteractionGroups.allocate(alloc);
    }

    public static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return RprInteractionGroups.allocateArray(len, alloc);
    }

    public MemorySegment allocInto(SegmentAllocator alloc) {
        var memory = alloc(alloc);
        into(memory);
        return memory;
    }

    public static MemorySegment allocSliceInto(SegmentAllocator alloc, InteractionGroups... objs) {
        var memory = allocSlice(alloc, objs.length);
        for (int i = 0; i < objs.length; i++) {
            objs[i].into(memory.asSlice(sizeof() * i));
        }
        return memory;
    }

    public void into(MemorySegment memory) {
        RprInteractionGroups.memberships$set(memory, memberships);
        RprInteractionGroups.filter$set(memory, filter);
    }

    public static InteractionGroups from(MemorySegment memory) {
        return new InteractionGroups(
                RprInteractionGroups.memberships$get(memory),
                RprInteractionGroups.filter$get(memory)
        );
    }
}
