package rapier.geometry;

import rapier.ValNative;
import rapier.sys.FloodFill_Body;
import rapier.sys.RapierC;
import rapier.sys.RprFillMode;
import rapier.sys.RprVHACDParameters;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public final class VHACDParameters extends ValNative {
    private VHACDParameters(MemorySegment memory) {
        super(memory);
    }

    public static VHACDParameters at(MemorySegment memory) {
        return new VHACDParameters(memory);
    }

    public static VHACDParameters create(SegmentAllocator alloc) {
        return at({{ sys }}.RapierC.RprVHACDParameters_default(alloc));
    }

    public {{ real }} getConcavity() {
        return {{ sys }}.RprVHACDParameters.concavity$get(self);
    }

    public void setConcavity({{ real }} concavity) {
        {{ sys }}.RprVHACDParameters.concavity$set(self, concavity);
    }

    public {{ real }} getAlpha() {
        return {{ sys }}.RprVHACDParameters.alpha$get(self);
    }

    public void setAlpha({{ real }} alpha) {
        {{ sys }}.RprVHACDParameters.alpha$set(self, alpha);
    }

    public {{ real }} getBeta() {
        return {{ sys }}.RprVHACDParameters.beta$get(self);
    }

    public void setBeta({{ real }} beta) {
        {{ sys }}.RprVHACDParameters.beta$set(self, beta);
    }

    public int getResolution() {
        return {{ sys }}.RprVHACDParameters.resolution$get(self);
    }

    public void setResolution(int resolution) {
        {{ sys }}.RprVHACDParameters.resolution$set(self, resolution);
    }

    public int getPlaneDownsampling() {
        return {{ sys }}.RprVHACDParameters.plane_downsampling$get(self);
    }

    public void setPlaneDownsampling(int planeDownsampling) {
        {{ sys }}.RprVHACDParameters.plane_downsampling$set(self, planeDownsampling);
    }

    public int getConvexHullDownsampling() {
        return {{ sys }}.RprVHACDParameters.convex_hull_downsampling$get(self);
    }

    public void setConvexHullDownsampling(int convexHullDownsampling) {
        {{ sys }}.RprVHACDParameters.convex_hull_downsampling$set(self, convexHullDownsampling);
    }

    public FillMode getFillMode() {
        var memory = {{ sys }}.RprVHACDParameters.fill_mode$slice(self);
        var tag = {{ sys }}.RprFillMode.tag$get(memory);
        return switch (tag) {
            case 0 -> FillMode.SurfaceOnly.INSTANCE;
            case 1 -> {
                var body = {{ sys }}.RprFillMode.flood_fill$slice(memory);
                yield new FillMode.FloodFill(
{% if dim2 %}
                        {{ sys }}.FloodFill_Body.detect_cavities$get(body),
                        {{ sys }}.FloodFill_Body.detect_self_intersections$get(body)
{% else %}
                        {{ sys }}.FloodFill_Body.detect_cavities$get(body)
{% endif %}
                );
            }
            default -> throw new IllegalStateException("Unknown tagged enum type " + tag);
        };
    }

    public void setFillMode(FillMode fillMode) {
        var memory = {{ sys }}.RprVHACDParameters.fill_mode$slice(self);
        if (fillMode instanceof FillMode.SurfaceOnly) {
            {{ sys }}.RprFillMode.tag$set(memory, 0);
        } else if (fillMode instanceof FillMode.FloodFill floodFill) {
            var body = {{ sys }}.RprFillMode.flood_fill$slice(memory);
            {{ sys }}.FloodFill_Body.detect_cavities$set(body, floodFill.detectCavities());
{% if dim2 %}
            {{ sys }}.FloodFill_Body.detect_self_intersections$set(body, floodFill.detectSelfIntersections());
{% endif %}
        }
    }

    public boolean getConvexHullApproximation() {
        return {{ sys }}.RprVHACDParameters.convex_hull_approximation$get(self);
    }

    public void setConvexHullApproximation(boolean convexHullApproximation) {
        {{ sys }}.RprVHACDParameters.convex_hull_approximation$set(self, convexHullApproximation);
    }

    public int getMaxConvexHulls() {
        return {{ sys }}.RprVHACDParameters.max_convex_hulls$get(self);
    }

    public void setMaxConvexHulls(int maxConvexHulls) {
        {{ sys }}.RprVHACDParameters.max_convex_hulls$set(self, maxConvexHulls);
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
