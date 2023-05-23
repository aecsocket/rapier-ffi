package rapier.shape;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public final class Capsule extends Shape {
    private Capsule(MemorySegment memory) {
        super(memory);
    }

    public static Capsule at(MemorySegment memory) {
        return new Capsule(memory);
    }

    public static Capsule of(SegmentAllocator alloc, Segment segment, {{ real }} radius) {
        var memory = {{ sys }}.RprCapsule.allocate(alloc);
        {{ sys }}.RprCapsule.segment$slice(memory).copyFrom(segment.memory());
        {{ sys }}.RprCapsule.radius$set(memory, radius);
        return at(memory);
    }

    public Segment getSegment() {
        return Segment.at({{ sys }}.RprCapsule.segment$slice(self));
    }

    public void setSegment(Segment segment) {
        {{ sys }}.RprCapsule.segment$slice(self).copyFrom(segment.memory());
    }

    public {{ real }} getRadius() {
        return {{ sys }}.RprCapsule.radius$get(self);
    }

    public void setRadius({{ real }} radius) {
        {{ sys }}.RprCapsule.radius$set(self, radius);
    }
}
