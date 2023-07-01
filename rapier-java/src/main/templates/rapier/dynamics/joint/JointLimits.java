package rapier.dynamics.joint;

import rapier.__real;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record JointLimits(
        __real min,
        __real max,
        __real impulse
) {
    public static long sizeof() {
        return rapier.sys.RprJointLimits.sizeof();
    }

    public static MemorySegment alloc(SegmentAllocator alloc) {
        return rapier.sys.RprJointLimits.allocate(alloc);
    }

    public static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return rapier.sys.RprJointLimits.allocateArray(len, alloc);
    }

    public void into(MemorySegment memory) {
        rapier.sys.RprJointLimits.min$set(memory, min);
        rapier.sys.RprJointLimits.max$set(memory, max);
        rapier.sys.RprJointLimits.impulse$set(memory, impulse);
    }

    public MemorySegment allocInto(SegmentAllocator alloc) {
        var memory = alloc(alloc);
        into(memory);
        return memory;
    }

    public static JointLimits from(MemorySegment memory) {
        return new JointLimits(
                rapier.sys.RprJointLimits.min$get(memory),
                rapier.sys.RprJointLimits.max$get(memory),
                rapier.sys.RprJointLimits.impulse$get(memory)
        );
    }
}
