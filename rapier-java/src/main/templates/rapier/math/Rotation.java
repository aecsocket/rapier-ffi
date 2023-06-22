package rapier.math;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

public record Rotation(
{% if dim2 %}
        {{ real }} re,
        {{ real }} im
{% else %}
        {{ real }} x,
        {{ real }} y,
        {{ real }} z,
        {{ real }} w
{% endif %}
) {
    public static Rotation identity() {
        return new Rotation(
{% if dim2 %}
                1.0f, 0.0f
{% else %}
                0.0f, 0.0f, 0.0f, 1.0f
{% endif %}
        );
    }

    public static Rotation from(MemorySegment memory) {
        return new Rotation(
{% if dim2 %}
                {{ sys }}.RprRotation.re$get(memory),
                {{ sys }}.RprRotation.im$get(memory)
{% else %}
                {{ sys }}.RprRotation.x$get(memory),
                {{ sys }}.RprRotation.y$get(memory),
                {{ sys }}.RprRotation.z$get(memory),
                {{ sys }}.RprRotation.w$get(memory)
{% endif %}
        );
    }

    public void into(MemorySegment memory) {
{% if dim2 %}
        {{ sys }}.RprRotation.re$set(memory, re);
        {{ sys }}.RprRotation.im$set(memory, im);
{% else %}
        {{ sys }}.RprRotation.x$set(memory, x);
        {{ sys }}.RprRotation.y$set(memory, y);
        {{ sys }}.RprRotation.z$set(memory, z);
        {{ sys }}.RprRotation.w$set(memory, w);
{% endif %}
    }

    public MemorySegment allocate(SegmentAllocator alloc) {
        var memory = {{ sys }}.RprRotation.allocate(alloc);
        into(memory);
        return memory;
    }

    public static MemorySegment allocateArray(SegmentAllocator alloc, Rotation... objs) {
        var memory = {{ sys }}.RprRotation.allocateArray(objs.length, alloc);
        for (int i = 0; i < objs.length; i++) {
            objs[i].into(memory.asSlice({{ sys }}.RprRotation.sizeof() * i));
        }
        return memory;
    }

    @Override
    public String toString() {
{% if dim2 %}
        return "(%f + %fi)".formatted(re, im);
{% else %}
        return "(%f + %fi + %fj + %fk)".formatted(w, x, y, z);
{% endif %}
    }
}
