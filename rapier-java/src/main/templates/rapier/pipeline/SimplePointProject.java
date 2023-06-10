package rapier.pipeline;

import rapier.ValNative;
import rapier.data.ArenaKey;
import rapier.math.Vector;
import rapier.sys_dim2_f32.RprSimplePointProject;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public final class SimplePointProject extends ValNative {
    private SimplePointProject(MemorySegment memory) {
        super(memory);
    }

    public static SimplePointProject at(MemorySegment memory) {
        return new SimplePointProject(memory);
    }

    public static SimplePointProject of(SegmentAllocator alloc) {
        return at({{ sys }}.RprSimplePointProject.allocate(alloc));
    }

    public long getCollider() {
        return ArenaKey.pack({{ sys }}.RprSimplePointProject.collider$slice(self));
    }

    public boolean isInside() {
        return {{ sys }}.RprSimplePointProject.is_inside$get(self);
    }

    public Vector getPoint() {
        return Vector.at({{ sys }}.RprSimplePointProject.point$slice(self));
    }
}
