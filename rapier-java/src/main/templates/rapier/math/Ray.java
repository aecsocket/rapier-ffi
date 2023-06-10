package rapier.math;

import rapier.ValNative;
import rapier.sys.RprRay;
import rapier.sys.RprVector;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public final class Ray extends ValNative {
    private Ray(MemorySegment memory) {
        super(memory);
    }

    public static Ray at(MemorySegment memory) {
        return new Ray(memory);
    }

    public static Ray of(SegmentAllocator alloc, Vector origin, Vector dir) {
        var memory = {{ sys }}.RprRay.allocate(alloc);
        {{ sys }}.RprRay.origin$slice(memory).copyFrom(origin.memory());
        {{ sys }}.RprRay.dir$slice(memory).copyFrom(dir.memory());
        return at(memory);
    }

    public Vector getOrigin() {
        return Vector.at({{ sys }}.RprRay.origin$slice(self));
    }

    public void setOrigin(Vector value) {
        {{ sys }}.RprRay.origin$slice(self).copyFrom(value.memory());
    }

    public Vector getDir() {
        return Vector.at({{ sys }}.RprRay.dir$slice(self));
    }

    public void setDir(Vector value) {
        {{ sys }}.RprRay.dir$slice(self).copyFrom(value.memory());
    }
}
