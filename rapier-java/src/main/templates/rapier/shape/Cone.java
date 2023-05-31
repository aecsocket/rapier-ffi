package rapier.shape;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

{% if dim3 %}
public final class Cone extends Shape {
    private Cone(MemorySegment memory) {
        super(memory);
    }

    public static Cone at(MemorySegment memory) {
        return new Cone(memory);
    }

    public static Cone of(SegmentAllocator alloc, {{ real }} halfHeight, {{ real }} radius) {
        var memory = {{ sys }}.RprCone.allocate(alloc);
        {{ sys }}.RprCone.half_height$set(memory, halfHeight);
        {{ sys }}.RprCone.radius$set(memory, radius);
        return at(memory);
    }

    public {{ real }} getHalfHeight() {
        return {{ sys }}.RprCone.half_height$get(self);
    }

    public void setHalfHeight({{ real }} halfHeight) {
        {{ sys }}.RprCone.half_height$set(self, halfHeight);
    }

    public {{ real }} getRadius() {
        return {{ sys }}.RprCone.radius$get(self);
    }

    public void setRadius({{ real }} radius) {
        {{ sys }}.RprCone.radius$set(self, radius);
    }
}
{% else %}

/**
 * Does not exist in {@code dim2}
 */
public final class Cone {
    private Cone() {}
}
{% endif %}
