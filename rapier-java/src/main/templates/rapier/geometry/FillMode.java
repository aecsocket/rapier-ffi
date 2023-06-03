package rapier.geometry;

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
