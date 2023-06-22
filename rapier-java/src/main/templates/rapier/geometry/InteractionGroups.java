package rapier.geometry;

import rapier.sys.RprInteractionGroups;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record InteractionGroups(
        int memberships,
        int filter
) {
    public static InteractionGroups from(MemorySegment memory) {
        return new InteractionGroups(
                RprInteractionGroups.memberships$get(memory),
                RprInteractionGroups.filter$get(memory)
        );
    }

    public void into(MemorySegment memory) {
        RprInteractionGroups.memberships$set(memory, memberships);
        RprInteractionGroups.filter$set(memory, filter);
    }

    public MemorySegment allocate(SegmentAllocator alloc) {
        var memory = RprInteractionGroups.allocate(alloc);
        into(memory);
        return memory;
    }
}
