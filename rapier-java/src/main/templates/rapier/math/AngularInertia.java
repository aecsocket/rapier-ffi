package rapier.math;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

public record AngularInertia(
{% if dim2 %}
        {{ real }} x
{% else %}
        {{ real }} m11,
        {{ real }} m12,
        {{ real }} m13,
        {{ real }} m22,
        {{ real }} m23,
        {{ real }} m33
{% endif %}
) {
    public static long sizeof() {
        return {{ sys }}.RprAngularInertia.sizeof();
    }

    public static MemorySegment alloc(SegmentAllocator alloc) {
        return RprArenaKey.allocate(alloc);
    }

    public static AngularInertia from(MemorySegment memory) {
        return new AngularInertia(
{% if dim2 %}
                {{ sys }}.RprAngularInertia.x$get(memory)
{% else %}
                {{ sys }}.RprAngularInertia.m11$get(memory),
                {{ sys }}.RprAngularInertia.m12$get(memory),
                {{ sys }}.RprAngularInertia.m13$get(memory),
                {{ sys }}.RprAngularInertia.m22$get(memory),
                {{ sys }}.RprAngularInertia.m23$get(memory),
                {{ sys }}.RprAngularInertia.m33$get(memory)
{% endif %}
        );
    }

    public void into(MemorySegment memory) {
{% if dim2 %}
        {{ sys }}.RprAngularInertia.x$set(memory, x);
{% else %}
        {{ sys }}.RprAngularInertia.m11$set(memory, m11);
        {{ sys }}.RprAngularInertia.m12$set(memory, m12);
        {{ sys }}.RprAngularInertia.m13$set(memory, m13);
        {{ sys }}.RprAngularInertia.m22$set(memory, m22);
        {{ sys }}.RprAngularInertia.m23$set(memory, m23);
        {{ sys }}.RprAngularInertia.m33$set(memory, m33);
{% endif %}
    }

    public MemorySegment allocate(SegmentAllocator alloc) {
        var memory = {{ sys }}.RprAngularInertia.allocate(alloc);
        into(memory);
        return memory;
    }

    public static MemorySegment allocateArray(SegmentAllocator alloc, AngVector... objs) {
        var memory = {{ sys }}.RprAngularInertia.allocateArray(objs.length, alloc);
        for (int i = 0; i < objs.length; i++) {
            objs[i].into(memory.asSlice({{ sys }}.RprAngularInertia.sizeof() * i));
        }
        return memory;
    }

    @Override
    public String toString() {
{% if dim2 %}
        return "(%f)".formatted(x);
{% else %}
        return "(%f, %f, %f, %f, %f, %f)".formatted(m11, m12, m13, m22, m23, m33);
{% endif %}
    }
}
