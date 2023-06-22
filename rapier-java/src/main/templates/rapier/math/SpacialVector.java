package rapier.math;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

public record SpacialVector(
{% if dim2 %}
        {{ real }} x,
        {{ real }} y,
        {{ real }} z
{% else %}
        {{ real }} x,
        {{ real }} y,
        {{ real }} z,
        {{ real }} w,
        {{ real }} a,
        {{ real }} b
{% endif %}
) {
    public static SpacialVector from(MemorySegment memory) {
        return new SpacialVector(
{% if dim2 %}
                {{ sys }}.RprSpacialVector.x$get(memory),
                {{ sys }}.RprSpacialVector.y$get(memory),
                {{ sys }}.RprSpacialVector.z$get(memory)
{% else %}
                {{ sys }}.RprSpacialVector.x$get(memory),
                {{ sys }}.RprSpacialVector.y$get(memory),
                {{ sys }}.RprSpacialVector.z$get(memory),
                {{ sys }}.RprSpacialVector.w$get(memory),
                {{ sys }}.RprSpacialVector.a$get(memory),
                {{ sys }}.RprSpacialVector.b$get(memory)
{% endif %}
        );
    }

    public void into(MemorySegment memory) {
{% if dim2 %}
        {{ sys }}.RprSpacialVector.x$set(memory, x);
        {{ sys }}.RprSpacialVector.y$set(memory, y);
        {{ sys }}.RprSpacialVector.z$set(memory, z);
{% else %}
        {{ sys }}.RprSpacialVector.x$set(memory, x);
        {{ sys }}.RprSpacialVector.y$set(memory, y);
        {{ sys }}.RprSpacialVector.z$set(memory, z);
        {{ sys }}.RprSpacialVector.w$set(memory, w);
        {{ sys }}.RprSpacialVector.a$set(memory, a);
        {{ sys }}.RprSpacialVector.b$set(memory, b);
{% endif %}
    }

    public MemorySegment allocate(SegmentAllocator alloc) {
        var memory = {{ sys }}.RprSpacialVector.allocate(alloc);
        into(memory);
        return memory;
    }

    public static MemorySegment allocateArray(SegmentAllocator alloc, SpacialVector... objs) {
        var memory = {{ sys }}.RprSpacialVector.allocateArray(objs.length, alloc);
        for (int i = 0; i < objs.length; i++) {
            objs[i].into(memory.asSlice({{ sys }}.RprSpacialVector.sizeof() * i));
        }
        return memory;
    }

    @Override
    public String toString() {
{% if dim2 %}
        return "(%f, %f, %f)".formatted(x, y, z);
{% else %}
        return "(%f, %f, %f, %f, %f, %f)".formatted(x, y, z, w, a, b);
{% endif %}
    }
}
