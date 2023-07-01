package rapier.math;

import rapier.__real;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record Rotation(
/*{% if dim2 %}*/
        __real re,
        __real im
/*{% else %}*/
        __real x,
        __real y,
        __real z,
        __real w
/*{% endif %}*/
) {
    public static Rotation identity() {
        return new Rotation(
/*{% if dim2 %}*/
                1.0f, 0.0f
/*{% else %}*/
                0.0f, 0.0f, 0.0f, 1.0f
/*{% endif %}*/
        );
    }

    public static long sizeof() {
        return rapier.sys.RprRotation.sizeof();
    }

    public static MemorySegment alloc(SegmentAllocator alloc) {
        return rapier.sys.RprRotation.allocate(alloc);
    }

    public static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return rapier.sys.RprRotation.allocateArray(len, alloc);
    }

    public void into(MemorySegment memory) {
/*{% if dim2 %}*/
        rapier.sys_dim2.RprRotation.re$set(memory, re);
        rapier.sys_dim2.RprRotation.im$set(memory, im);
/*{% else %}*/
        rapier.sys_dim3.RprRotation.x$set(memory, x);
        rapier.sys_dim3.RprRotation.y$set(memory, y);
        rapier.sys_dim3.RprRotation.z$set(memory, z);
        rapier.sys_dim3.RprRotation.w$set(memory, w);
/*{% endif %}*/
    }

    public MemorySegment allocInto(SegmentAllocator alloc) {
        var memory = alloc(alloc);
        into(memory);
        return memory;
    }

    public static MemorySegment allocIntoSlice(SegmentAllocator alloc, Rotation... objs) {
        var memory = allocSlice(alloc, objs.length);
        for (int i = 0; i < objs.length; i++) {
            objs[i].into(memory.asSlice(sizeof() * i));
        }
        return memory;
    }

    public static Rotation from(MemorySegment memory) {
        return new Rotation(
/*{% if dim2 %}*/
                rapier.sys_dim2.RprRotation.re$get(memory),
                rapier.sys_dim2.RprRotation.im$get(memory)
/*{% else %}*/
                rapier.sys_dim3.RprRotation.x$get(memory),
                rapier.sys_dim3.RprRotation.y$get(memory),
                rapier.sys_dim3.RprRotation.z$get(memory),
                rapier.sys_dim3.RprRotation.w$get(memory)
/*{% endif %}*/
        );
    }

    @Override
    public String toString() {
/*{% if dim2 %}*/
        return "(%f + %fi)".formatted(re, im);
/*{% else %}*/
        return "(%f + %fi + %fj + %fk)".formatted(w, x, y, z);
/*{% endif %}*/
    }
}
