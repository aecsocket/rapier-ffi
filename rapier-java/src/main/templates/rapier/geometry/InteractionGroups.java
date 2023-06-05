package rapier.geometry;

import rapier.ValNative;
import rapier.sys.RprInteractionGroups;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public final class InteractionGroups extends ValNative {
    private InteractionGroups(MemorySegment memory) {
        super(memory);
    }

    public static InteractionGroups at(MemorySegment memory) {
        return new InteractionGroups(memory);
    }

    public static InteractionGroups of(SegmentAllocator alloc, int memberships, int filter) {
        var memory = RprInteractionGroups.allocate(alloc);
        RprInteractionGroups.memberships$set(memory, memberships);
        RprInteractionGroups.filter$set(memory, filter);
        return at(memory);
    }

    public int getMemberships() {
        return RprInteractionGroups.memberships$get(self);
    }

    public void setMemberships(int value) {
        RprInteractionGroups.memberships$set(self, value);
    }

    public int getFilter() {
        return RprInteractionGroups.filter$get(self);
    }

    public void setFilter(int value) {
        RprInteractionGroups.filter$set(self, value);
    }
}
