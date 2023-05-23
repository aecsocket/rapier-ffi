package rapier.shape;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public final class Ball extends Shape {
    private Ball(MemorySegment memory) {
        super(memory);
    }

    public static Ball at(MemorySegment memory) {
        return new Ball(memory);
    }

    public static Ball of(SegmentAllocator alloc, {{ real }} radius) {
        var memory = {{ sys }}.RprBall.allocate(alloc);
        {{ sys }}.RprBall.radius$set(memory, radius);
        return at(memory);
    }

    public {{ real }} getRadius() {
        return {{ sys }}.RprBall.radius$get(self);
    }

    public void setRadius({{ real }} radius) {
        {{ sys }}.RprBall.radius$set(self, radius);
    }
}
