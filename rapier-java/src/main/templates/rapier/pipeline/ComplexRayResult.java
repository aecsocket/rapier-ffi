package rapier.pipeline;

import rapier.ValNative;
import rapier.data.ArenaKey;
import rapier.math.Vector;
import rapier.sys.RprComplexRayResult;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public final class ComplexRayResult extends ValNative {
    private ComplexRayResult(MemorySegment memory) {
        super(memory);
    }

    public static ComplexRayResult at(MemorySegment memory) {
        return new ComplexRayResult(memory);
    }

    public static ComplexRayResult of(SegmentAllocator alloc) {
        return at({{ sys }}.RprComplexRayResult.allocate(alloc));
    }

    public long getCollider() {
        return ArenaKey.pack({{ sys }}.RprComplexRayResult.collider$slice(self));
    }

    public {{ real }} getToi() {
        return {{ sys }}.RprComplexRayResult.toi$get(self);
    }

    public Vector getNormal() {
        return Vector.at({{ sys }}.RprComplexRayResult.normal$slice(self));
    }

    public FeatureId getFeature() {
        return FeatureId.from({{ sys }}.RprComplexRayResult.feature$slice(self));
    }
}
