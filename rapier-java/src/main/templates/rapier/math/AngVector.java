package rapier.math;

import rapier.__real;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record AngVector(
        __real x/*{% if dim3 %}*/,
        __real y,
        __real z
/*{% endif %}*/
) {
    public static long sizeof() {
        return rapier.sys.RprAngVector.sizeof();
    }

    public static MemorySegment alloc(SegmentAllocator alloc) {
        return rapier.sys.RprAngVector.allocate(alloc);
    }

    public static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return rapier.sys.RprAngVector.allocateArray(len, alloc);
    }

    public void into(MemorySegment memory) {
        rapier.sys_dim2.RprAngVector.x$set(memory, x);
/*{% if dim3 %}*/
        rapier.sys_dim3.RprAngVector.y$set(memory, y);
        rapier.sys_dim3.RprAngVector.z$set(memory, z);
/*{% endif %}*/
    }

    public MemorySegment allocInto(SegmentAllocator alloc) {
        var memory = alloc(alloc);
        into(memory);
        return memory;
    }

    public static MemorySegment allocIntoSlice(SegmentAllocator alloc, AngVector... objs) {
        var memory = allocSlice(alloc, objs.length);
        for (int i = 0; i < objs.length; i++) {
            objs[i].into(memory.asSlice(sizeof() * i));
        }
        return memory;
    }

    public static AngVector from(MemorySegment memory) {
        return new AngVector(
                rapier.sys_dim2.RprAngVector.x$get(memory)/*{% if dim3 %}*/,
                rapier.sys_dim3.RprAngVector.y$get(memory),
                rapier.sys_dim3.RprAngVector.z$get(memory)
/*{% endif %}*/
        );
    }

    @Override
    public String toString() {
/*{% if dim2 %}*/
        return "(%f)".formatted(x);
/*{% else %}*/
        return "(%f, %f, %f)".formatted(x, y, z);
/*{% endif %}*/
    }
}
