package rapier.math;

import rapier.__real;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record SpacialVector(
        __real x,
        __real y,
        __real z/*{% if dim3 %}*/,
        __real w,
        __real a,
        __real b/*{% endif %}*/
) {
    public static long sizeof() {
        return rapier.sys.RprSpacialVector.sizeof();
    }

    public static MemorySegment alloc(SegmentAllocator alloc) {
        return rapier.sys.RprSpacialVector.allocate(alloc);
    }

    public static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return rapier.sys.RprSpacialVector.allocateArray(len, alloc);
    }

    public void into(MemorySegment memory) {
        rapier.sys_dim2.RprSpacialVector.x$set(memory, x);
        rapier.sys_dim2.RprSpacialVector.y$set(memory, y);
        rapier.sys_dim2.RprSpacialVector.z$set(memory, z);
        /*{% if dim3 %}*/
        rapier.sys_dim3.RprSpacialVector.w$set(memory, w);
        rapier.sys_dim3.RprSpacialVector.a$set(memory, a);
        rapier.sys_dim3.RprSpacialVector.b$set(memory, b);
        /*{% endif %}*/
    }

    public MemorySegment allocInto(SegmentAllocator alloc) {
        var memory = alloc(alloc);
        into(memory);
        return memory;
    }

    public static MemorySegment allocIntoSlice(SegmentAllocator alloc, SpacialVector... objs) {
        var memory = allocSlice(alloc, objs.length);
        for (int i = 0; i < objs.length; i++) {
            objs[i].into(memory.asSlice(sizeof() * i));
        }
        return memory;
    }

    public static SpacialVector from(MemorySegment memory) {
        return new SpacialVector(
                rapier.sys_dim2.RprSpacialVector.x$get(memory),
                rapier.sys_dim2.RprSpacialVector.y$get(memory),
                rapier.sys_dim2.RprSpacialVector.z$get(memory)/*{% if dim3 %}*/,
                rapier.sys_dim3.RprSpacialVector.w$get(memory),
                rapier.sys_dim3.RprSpacialVector.a$get(memory),
                rapier.sys_dim3.RprSpacialVector.b$get(memory)
/*{% endif %}*/
        );
    }

    @Override
    public String toString() {
/*{% if dim2 %}*/
        return "(%f, %f, %f)".formatted(x, y, z);
/*{% else %}*/
        return "(%f, %f, %f, %f, %f, %f)".formatted(x, y, z, w, a, b);
/*{% endif %}*/
    }
}
