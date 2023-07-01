package rapier.geometry;

import rapier.__real;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record VHACDParameters(
        __real concavity,
        __real alpha,
        __real beta,
        int resolution,
        int planeDownsampling,
        int convexHullDownsampling,
        FillMode fillMode,
        boolean convexHullApproximation,
        int maxConvexHulls
) {
    public sealed interface FillMode permits FillMode.SurfaceOnly, FillMode.FloodFill {
        final class SurfaceOnly implements FillMode {
            private SurfaceOnly() {}

            public static final SurfaceOnly INSTANCE = new SurfaceOnly();
        }

        record FloodFill(
                boolean detectCavities/*{% if dim2 %}*/,
                boolean detectSelfIntersections
/*{% endif %}*/
        ) implements FillMode {}
    }

    public static long sizeof() {
        return rapier.sys.RprVHACDParameters.sizeof();
    }

    public static MemorySegment alloc(SegmentAllocator alloc) {
        return rapier.sys.RprVHACDParameters.allocate(alloc);
    }

    public static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return rapier.sys.RprVHACDParameters.allocateArray(len, alloc);
    }

    public void into(MemorySegment memory) {
        rapier.sys.RprVHACDParameters.concavity$set(memory, concavity);
        rapier.sys.RprVHACDParameters.alpha$set(memory, alpha);
        rapier.sys.RprVHACDParameters.beta$set(memory, beta);
        rapier.sys.RprVHACDParameters.resolution$set(memory, resolution);
        rapier.sys.RprVHACDParameters.plane_downsampling$set(memory, planeDownsampling);
        rapier.sys.RprVHACDParameters.convex_hull_downsampling$set(memory, convexHullDownsampling);
        var mFillMode = rapier.sys.RprVHACDParameters.fill_mode$slice(memory);
        if (fillMode instanceof FillMode.SurfaceOnly) {
            rapier.sys.RprFillMode.tag$set(mFillMode, 0);
        } else if (fillMode instanceof FillMode.FloodFill floodFill) {
            var body = rapier.sys.RprFillMode.flood_fill$slice(mFillMode);
            rapier.sys.FloodFill_Body.detect_cavities$set(body, floodFill.detectCavities());
/*{% if dim2 %}*/
            rapier.sys.FloodFill_Body.detect_self_intersections$set(body, floodFill.detectSelfIntersections());
/*{% endif %}*/
        }
        rapier.sys.RprVHACDParameters.convex_hull_approximation$set(memory, convexHullApproximation);
        rapier.sys.RprVHACDParameters.max_convex_hulls$set(memory, maxConvexHulls);
    }

    public MemorySegment allocInto(SegmentAllocator alloc) {
        var memory = alloc(alloc);
        into(memory);
        return memory;
    }

    public static MemorySegment allocIntoSlice(SegmentAllocator alloc, VHACDParameters... objs) {
        var memory = allocSlice(alloc, objs.length);
        for (int i = 0; i < objs.length; i++) {
            objs[i].into(memory.asSlice(sizeof() * i));
        }
        return memory;
    }
}
