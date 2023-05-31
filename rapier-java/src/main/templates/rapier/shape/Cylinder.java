package rapier.shape;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

{% if dim3 %}
public final class Cylinder extends Shape {
    private Cylinder(MemorySegment memory) {
        super(memory);
    }

    public static Cylinder at(MemorySegment memory) {
        return new Cylinder(memory);
    }

    public static Cylinder of(SegmentAllocator alloc, {{ real }} halfHeight, {{ real }} radius) {
        var memory = {{ sys }}.RprCylinder.allocate(alloc);
        {{ sys }}.RprCylinder.half_height$set(memory, halfHeight);
        {{ sys }}.RprCylinder.radius$set(memory, radius);
        return at(memory);
    }

    public {{ real }} getHalfHeight() {
        return {{ sys }}.RprCylinder.half_height$get(self);
    }

    public void setHalfHeight({{ real }} halfHeight) {
        {{ sys }}.RprCylinder.half_height$set(self, halfHeight);
    }

    public {{ real }} getRadius() {
        return {{ sys }}.RprCylinder.radius$get(self);
    }

    public void setRadius({{ real }} radius) {
        {{ sys }}.RprCylinder.radius$set(self, radius);
    }
}
{% else %}

/**
 * Does not exist in {@code dim2}
 */
public final class Cylinder {
    private Cylinder() {}
}
{% endif %}
