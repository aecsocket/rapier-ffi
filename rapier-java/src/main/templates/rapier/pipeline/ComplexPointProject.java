package rapier.pipeline;

import rapier.ValNative;
import rapier.data.ArenaKey;
import rapier.math.Vector;
import rapier.sys.RprComplexPointProject;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public final class ComplexPointProject extends ValNative {
    private ComplexPointProject(MemorySegment memory) {
        super(memory);
    }

    public static ComplexPointProject at(MemorySegment memory) {
        return new ComplexPointProject(memory);
    }

    public static ComplexPointProject of(SegmentAllocator alloc) {
        return at({{ sys }}.RprComplexPointProject.allocate(alloc));
    }

    public long getCollider() {
        return ArenaKey.pack({{ sys }}.RprComplexPointProject.collider$slice(self));
    }

    public boolean isInside() {
        return {{ sys }}.RprComplexPointProject.is_inside$get(self);
    }

    public Vector getPoint() {
        return Vector.at({{ sys }}.RprComplexPointProject.point$slice(self));
    }

    public FeatureId getFeature() {
        return FeatureId.from({{ sys }}.RprComplexPointProject.feature$slice(self));
    }
}
