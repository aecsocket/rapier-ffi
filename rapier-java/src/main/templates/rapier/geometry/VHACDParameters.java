package rapier.geometry;

import rapier.sys.FloodFill_Body;
import rapier.sys.RapierC;
import rapier.sys.RprFillMode;
import rapier.sys.RprVHACDParameters;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record VHACDParameters(
        {{ real }} concavity,
        {{ real }} alpha,
        {{ real }} beta,
        int resolution,
        int planeDownsampling,
        int convexHullDownsampling,
        FillMode fillMode,
        boolean convexHullApproximation,
        int maxConvexHulls
) {
    public void into(MemorySegment memory) {
        {{ sys }}.RprVHACDParameters.concavity$set(memory, concavity);
        {{ sys }}.RprVHACDParameters.alpha$set(memory, alpha);
        {{ sys }}.RprVHACDParameters.beta$set(memory, beta);
        {{ sys }}.RprVHACDParameters.resolution$set(memory, resolution);
        {{ sys }}.RprVHACDParameters.plane_downsampling$set(memory, planeDownsampling);
        {{ sys }}.RprVHACDParameters.convex_hull_downsampling$set(memory, convexHullDownsampling);
        var mFillMode = {{ sys }}.RprVHACDParameters.fill_mode$slice(memory);
        if (fillMode instanceof FillMode.SurfaceOnly) {
            {{ sys }}.RprFillMode.tag$set(mFillMode, 0);
        } else if (fillMode instanceof FillMode.FloodFill floodFill) {
            var body = {{ sys }}.RprFillMode.flood_fill$slice(mFillMode);
            {{ sys }}.FloodFill_Body.detect_cavities$set(body, floodFill.detectCavities());
{% if dim2 %}
            {{ sys }}.FloodFill_Body.detect_self_intersections$set(body, floodFill.detectSelfIntersections());
{% endif %}
        }
        {{ sys }}.RprVHACDParameters.convex_hull_approximation$set(memory, convexHullApproximation);
        {{ sys }}.RprVHACDParameters.max_convex_hulls$set(memory, maxConvexHulls);
    }

    public MemorySegment allocate(SegmentAllocator alloc) {
        var memory = {{ sys }}.RprVHACDParameters.allocate(alloc);
        into(memory);
        return memory;
    }

    public sealed interface FillMode permits FillMode.SurfaceOnly, FillMode.FloodFill {
        final class SurfaceOnly implements FillMode {
            private SurfaceOnly() {}

            public static final SurfaceOnly INSTANCE = new SurfaceOnly();
        }

        record FloodFill(
{% if dim2 %}
                boolean detectCavities,
                boolean detectSelfIntersections
{% else %}
                boolean detectCavities
{% endif %}
        ) implements FillMode {}
    }
}
