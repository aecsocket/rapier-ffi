package rapier.math;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

public record AngVector(
{% if dim2 %}
        {{ real }} x
{% else %}
        {{ real }} x,
        {{ real }} y,
        {{ real }} z
{% endif %}
) {
    public static AngVector from(MemorySegment memory) {
        return new AngVector(
{% if dim2 %}
                {{ sys }}.RprAngVector.x$get(memory)
{% else %}
                {{ sys }}.RprAngVector.x$get(memory),
                {{ sys }}.RprAngVector.y$get(memory),
                {{ sys }}.RprAngVector.z$get(memory)
{% endif %}
        );
    }

    public void into(MemorySegment memory) {
{% if dim2 %}
        {{ sys }}.RprAngVector.x$set(memory, x);
{% else %}
        {{ sys }}.RprAngVector.x$set(memory, x);
        {{ sys }}.RprAngVector.y$set(memory, y);
        {{ sys }}.RprAngVector.z$set(memory, z);
{% endif %}
    }

    public MemorySegment allocate(SegmentAllocator alloc) {
        var memory = {{ sys }}.RprAngVector.allocate(alloc);
        into(memory);
        return memory;
    }

    public static MemorySegment allocateArray(SegmentAllocator alloc, AngVector... objs) {
        var memory = {{ sys }}.RprAngVector.allocateArray(objs.length, alloc);
        for (int i = 0; i < objs.length; i++) {
            objs[i].into(memory.asSlice({{ sys }}.RprAngVector.sizeof() * i));
        }
        return memory;
    }

    @Override
    public String toString() {
{% if dim2 %}
        return "(%f)".formatted(x);
{% else %}
        return "(%f, %f, %f)".formatted(x, y, z);
{% endif %}
    }
}
