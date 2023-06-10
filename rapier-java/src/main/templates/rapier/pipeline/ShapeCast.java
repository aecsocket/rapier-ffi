package rapier.pipeline;

import rapier.ValNative;
import rapier.data.ArenaKey;
import rapier.sys.RprShapeCast;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public final class ShapeCast extends ValNative {
    private ShapeCast(MemorySegment memory) {
        super(memory);
    }

    public static ShapeCast at(MemorySegment memory) {
        return new ShapeCast(memory);
    }

    public static ShapeCast of(SegmentAllocator alloc) {
        return at({{ sys }}.RprShapeCast.allocate(alloc));
    }

    public long getCollider() {
        return ArenaKey.pack({{ sys }}.RprShapeCast.collider$slice(self));
    }

    public TOI getToi() {
        return TOI.at({{ sys }}.RprShapeCast.toi$slice(self));
    }
}
