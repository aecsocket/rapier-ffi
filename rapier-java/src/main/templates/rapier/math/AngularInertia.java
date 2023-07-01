package rapier.math;

import rapier.__real;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record AngularInertia(
/*{% if dim2 %}*/
        __real x
/*{% else %}*/
        __real m11,
        __real m12,
        __real m13,
        __real m22,
        __real m23,
        __real m33
/*{% endif %}*/
) {
    public static long sizeof() {
        return rapier.sys.RprAngularInertia.sizeof();
    }

    public static MemorySegment alloc(SegmentAllocator alloc) {
        return rapier.sys.RprAngularInertia.allocate(alloc);
    }

    public static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return rapier.sys.RprAngularInertia.allocateArray(len, alloc);
    }

    public void into(MemorySegment memory) {
/*{% if dim2 %}*/
        rapier.sys_dim2.RprAngularInertia.x$set(memory, x);
/*{% else %}*/
        rapier.sys_dim3.RprAngularInertia.m11$set(memory, m11);
        rapier.sys_dim3.RprAngularInertia.m12$set(memory, m12);
        rapier.sys_dim3.RprAngularInertia.m13$set(memory, m13);
        rapier.sys_dim3.RprAngularInertia.m22$set(memory, m22);
        rapier.sys_dim3.RprAngularInertia.m23$set(memory, m23);
        rapier.sys_dim3.RprAngularInertia.m33$set(memory, m33);
/*{% endif %}*/
    }

    public MemorySegment allocInto(SegmentAllocator alloc) {
        var memory = alloc(alloc);
        into(memory);
        return memory;
    }

    public static MemorySegment allocIntoSlice(SegmentAllocator alloc, AngularInertia... objs) {
        var memory = allocSlice(alloc, objs.length);
        for (int i = 0; i < objs.length; i++) {
            objs[i].into(memory.asSlice(sizeof() * i));
        }
        return memory;
    }

    public static AngularInertia from(MemorySegment memory) {
        return new AngularInertia(
/*{% if dim2 %}*/
                rapier.sys_dim2.RprAngularInertia.x$get(memory)
/*{% else %}*/
                rapier.sys_dim3.RprAngularInertia.m11$get(memory),
                rapier.sys_dim3.RprAngularInertia.m12$get(memory),
                rapier.sys_dim3.RprAngularInertia.m13$get(memory),
                rapier.sys_dim3.RprAngularInertia.m22$get(memory),
                rapier.sys_dim3.RprAngularInertia.m23$get(memory),
                rapier.sys_dim3.RprAngularInertia.m33$get(memory)
/*{% endif %}*/
        );
    }

    @Override
    public String toString() {
/*{% if dim2 %}*/
        return "(%f)".formatted(x);
/*{% else %}*/
        return "(%f, %f, %f, %f, %f, %f)".formatted(m11, m12, m13, m22, m23, m33);
/*{% endif %}*/
    }
}
