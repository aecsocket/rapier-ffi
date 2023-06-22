package rapier.pipeline;

import rapier.ValNative;
import rapier.data.ArenaKey;
import rapier.geometry.Collider;
import rapier.geometry.InteractionGroups;
import rapier.sys.RprQueryFilter;

import javax.annotation.Nullable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemorySession;

import static rapier.sys.RapierC.*;

public final class QueryFilter extends ValNative {
    public interface Predicate {
        boolean predicate(long handle, Collider coll);
    }

    private QueryFilter(MemorySegment memory) {
        super(memory);
    }

    public static QueryFilter at(MemorySegment memory) {
        return new QueryFilter(memory);
    }

    // todo MemorySession -> SegmentAllocator
    public static QueryFilter of(MemorySession alloc, @Nullable Predicate predicate) {
        var memory = RprQueryFilter_default(alloc);
        if (predicate == null) {
            RprQueryFilter.predicate$set(memory, MemoryAddress.NULL);
        } else {
            RprQueryFilter.predicate$set(memory, RprQueryFilter.predicate.allocate((handle, coll) -> {
                return predicate.predicate(ArenaKey.pack(handle), Collider.at(coll));
            }, alloc).address());
        }
        return at(RprQueryFilter_default(alloc));
    }

    public int getFlags() {
        return RprQueryFilter.flags$get(self);
    }

    public void setFlags(int value) {
        RprQueryFilter.flags$set(self, value);
    }

    public @Nullable InteractionGroups getGroups() {
        return RprQueryFilter.has_groups$get(self)
                ? InteractionGroups.from(RprQueryFilter.groups$slice(self))
                : null;
    }

    public void setGroups(@Nullable InteractionGroups value) {
        if (value == null) {
            RprQueryFilter.has_groups$set(self, false);
        } else {
            RprQueryFilter.has_groups$set(self, true);
            value.into(RprQueryFilter.groups$slice(self));
        }
    }

    public @Nullable Long getExcludeCollider() {
        return RprQueryFilter.has_exclude_collider$get(self)
                ? ArenaKey.pack(RprQueryFilter.exclude_collider$slice(self))
                : null;
    }

    public void setExcludeCollider(@Nullable Long value) {
        if (value == null) {
            RprQueryFilter.has_exclude_collider$set(self, false);
        } else {
            RprQueryFilter.has_exclude_collider$set(self, true);
            try (var arena = MemorySession.openConfined()) {
                RprQueryFilter.exclude_collider$slice(self).copyFrom(ArenaKey.unpack(arena, value));
            }
        }
    }

    public @Nullable Long getExcludeRigidBody() {
        return RprQueryFilter.has_exclude_rigid_body$get(self)
                ? ArenaKey.pack(RprQueryFilter.exclude_rigid_body$slice(self))
                : null;
    }

    public void setExcludeRigidBody(@Nullable Long value) {
        if (value == null) {
            RprQueryFilter.has_exclude_rigid_body$set(self, false);
        } else {
            RprQueryFilter.has_exclude_rigid_body$set(self, true);
            try (var arena = MemorySession.openConfined()) {
                RprQueryFilter.exclude_rigid_body$slice(self).copyFrom(ArenaKey.unpack(arena, value));
            }
        }
    }
}
