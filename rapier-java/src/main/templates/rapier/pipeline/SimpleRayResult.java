package rapier.pipeline;

import rapier.ValNative;
import rapier.data.ArenaKey;
import rapier.geometry.Collider;
import rapier.geometry.InteractionGroups;
import rapier.sys.RprQueryFilter;
import rapier.sys.RprSimpleRayResult;

import javax.annotation.Nullable;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemorySession;
import java.lang.foreign.SegmentAllocator;

import static rapier.sys.RapierC.RprQueryFilter_default;

public final class SimpleRayResult extends ValNative {
    private SimpleRayResult(MemorySegment memory) {
        super(memory);
    }

    public static SimpleRayResult at(MemorySegment memory) {
        return new SimpleRayResult(memory);
    }

    public static SimpleRayResult of(SegmentAllocator alloc) {
        return at({{ sys }}.RprSimpleRayResult.allocate(alloc));
    }

    public long getCollider() {
        return ArenaKey.pack({{ sys }}.RprSimpleRayResult.collider$slice(self));
    }

    public {{ real }} getToi() {
        return {{ sys }}.RprSimpleRayResult.toi$get(self);
    }
}
