package rapier.math;

import rapier.__real;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record Vector(
        __real x,
        __real y/*{% if dim3 %}*/,
        __real z/*{% endif %}*/
) {
    public static Vector zero() {
        return new Vector(
/*{% if dim2 %}*/
                0.0f, 0.0f
/*{% else %}*/
                0.0f, 0.0f, 0.0f
/*{% endif %}*/
        );
    }

    public static long sizeof() {
        return rapier.sys.RprVector.sizeof();
    }

    public static MemorySegment alloc(SegmentAllocator alloc) {
        return rapier.sys.RprVector.allocate(alloc);
    }

    public static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return rapier.sys.RprVector.allocateArray(len, alloc);
    }

    public void into(MemorySegment memory) {
        rapier.sys_dim2.RprVector.x$set(memory, x);
        rapier.sys_dim2.RprVector.y$set(memory, y);
/*{% if dim3 %}*/
        rapier.sys_dim3.RprVector.z$set(memory, z);
/*{% endif %}*/
    }

    public MemorySegment allocInto(SegmentAllocator alloc) {
        var memory = alloc(alloc);
        into(memory);
        return memory;
    }

    public static MemorySegment allocIntoSlice(SegmentAllocator alloc, Vector... objs) {
        var memory = allocSlice(alloc, objs.length);
        for (int i = 0; i < objs.length; i++) {
            objs[i].into(memory.asSlice(sizeof() * i));
        }
        return memory;
    }

    public static Vector from(MemorySegment memory) {
        return new Vector(
                rapier.sys_dim2.RprVector.x$get(memory),
                rapier.sys_dim2.RprVector.y$get(memory)/*{% if dim3 %}*/,
                rapier.sys_dim3.RprVector.z$get(memory)
/*{% endif %}*/
        );
    }

    @Override
    public String toString() {
/*{% if dim2 %}*/
        return "(%f, %f)".formatted(x, y);
/*{% else %}*/
        return "(%f, %f, %f)".formatted(x, y, z);
/*{% endif %}*/
    }
}
