package rapier.pipeline;

import rapier.data.ArenaKey;
import rapier.geometry.Collider;
import rapier.geometry.InteractionGroups;

import javax.annotation.Nullable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record QueryFilter(
        int flags,
        @Nullable InteractionGroups groups,
        @Nullable ArenaKey excludeCollider,
        @Nullable ArenaKey excludeRigidBody,
        @Nullable Predicate predicate
) {
    public interface Predicate {
        boolean test(ArenaKey handle, Collider coll);
    }

    public static long sizeof() {
        return rapier.sys.RprQueryFilter.sizeof();
    }

    public static MemorySegment alloc(SegmentAllocator alloc) {
        return rapier.sys.RprQueryFilter.allocate(alloc);
    }

    public static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return rapier.sys.RprQueryFilter.allocateArray(len, alloc);
    }

    public void into(MemorySegment memory) {
        rapier.sys.RprQueryFilter.flags$set(memory, flags);
        if (groups == null) {
            rapier.sys.RprQueryFilter.has_groups$set(memory, false);
        } else {
            rapier.sys.RprQueryFilter.has_groups$set(memory, true);
            groups.into(rapier.sys.RprQueryFilter.groups$slice(memory));
        }
        if (excludeCollider == null) {
            rapier.sys.RprQueryFilter.has_exclude_collider$set(memory, false);
        } else {
            rapier.sys.RprQueryFilter.has_exclude_collider$set(memory, true);
            excludeCollider.into(rapier.sys.RprQueryFilter.exclude_collider$slice(memory));
        }
        if (excludeRigidBody == null) {
            rapier.sys.RprQueryFilter.has_exclude_rigid_body$set(memory, false);
        } else {
            rapier.sys.RprQueryFilter.has_exclude_rigid_body$set(memory, true);
            excludeRigidBody.into(rapier.sys.RprQueryFilter.exclude_rigid_body$slice(memory));
        }
        if (predicate == null) {
            rapier.sys.RprQueryFilter.predicate$set(memory, MemoryAddress.NULL);
        } else {
            rapier.sys.RprQueryFilter.predicate$set(memory, rapier.sys.RprQueryFilter.predicate.allocate(
                    (handle,
                     coll
                    ) -> predicate.test(
                             ArenaKey.from(handle),
                            Collider.at(coll)
                    ), memory.session()).address());
        }
    }

    public MemorySegment allocInto(SegmentAllocator alloc) {
        var memory = alloc(alloc);
        into(memory);
        return memory;
    }
}
