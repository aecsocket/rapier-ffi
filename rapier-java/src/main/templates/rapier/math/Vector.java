package rapier.math;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

public record Vector(
{% if dim2 %}
        {{ real }} x,
        {{ real }} y
{% else %}
        {{ real }} x,
        {{ real }} y,
        {{ real }} z
{% endif %}
) {
    public static Vector zero() {
        return new Vector(
{% if dim2 %}
                0.0f, 0.0f
{% else %}
                0.0f, 0.0f, 0.0f
{% endif %}
        );
    }

public static Vector from(MemorySegment memory) {
        return new Vector(
{% if dim2 %}
                {{ sys }}.RprVector.x$get(memory),
                {{ sys }}.RprVector.y$get(memory)
{% else %}
                {{ sys }}.RprVector.x$get(memory),
                {{ sys }}.RprVector.y$get(memory),
                {{ sys }}.RprVector.z$get(memory)
{% endif %}
        );
    }

    public void into(MemorySegment memory) {
{% if dim2 %}
        {{ sys }}.RprVector.x$set(memory, x);
        {{ sys }}.RprVector.y$set(memory, y);
{% else %}
        {{ sys }}.RprVector.x$set(memory, x);
        {{ sys }}.RprVector.y$set(memory, y);
        {{ sys }}.RprVector.z$set(memory, z);
{% endif %}
    }

    public MemorySegment allocate(SegmentAllocator alloc) {
        var memory = {{ sys }}.RprVector.allocate(alloc);
        into(memory);
        return memory;
    }

    public static MemorySegment allocateArray(SegmentAllocator alloc, Vector... objs) {
        var memory = {{ sys }}.RprVector.allocateArray(objs.length, alloc);
        for (int i = 0; i < objs.length; i++) {
            objs[i].into(memory.asSlice({{ sys }}.RprVector.sizeof() * i));
        }
        return memory;
    }

    @Override
    public String toString() {
{% if dim2 %}
        return "(%f, %f)".formatted(x, y);
{% else %}
        return "(%f, %f, %f)".formatted(x, y, z);
{% endif %}
    }
}
