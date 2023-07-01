package rapier.control;

import rapier.__real;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemorySession;
import java.lang.foreign.SegmentAllocator;

public record WheelTuning(
        __real suspensionStiffness,
        __real suspensionCompression,
        __real suspensionDamping,
        __real maxSuspensionTravel,
        __real frictionSlip,
        __real maxSuspensionForce
) {
/*{% if dim3 %}*/
    public static long sizeof() {
        return rapier.sys_dim3.RprWheelTuning.sizeof();
    }

    public static MemorySegment alloc(SegmentAllocator alloc) {
        return rapier.sys_dim3.RprWheelTuning.allocate(alloc);
    }

    public static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return rapier.sys_dim3.RprWheelTuning.allocateArray(len, alloc);
    }

    public void into(MemorySegment memory) {
        rapier.sys_dim3.RprWheelTuning.suspension_stiffness$set(memory, suspensionStiffness);
        rapier.sys_dim3.RprWheelTuning.suspension_compression$set(memory, suspensionCompression);
        rapier.sys_dim3.RprWheelTuning.suspension_damping$set(memory, suspensionDamping);
        rapier.sys_dim3.RprWheelTuning.max_suspension_travel$set(memory, maxSuspensionTravel);
        rapier.sys_dim3.RprWheelTuning.friction_slip$set(memory, frictionSlip);
        rapier.sys_dim3.RprWheelTuning.max_suspension_force$set(memory, maxSuspensionForce);
    }

    public MemorySegment allocInto(SegmentAllocator alloc) {
        var memory = alloc(alloc);
        into(memory);
        return memory;
    }

    public static WheelTuning from(MemorySegment memory) {
        return new WheelTuning(
                rapier.sys_dim3.RprWheelTuning.suspension_stiffness$get(memory),
                rapier.sys_dim3.RprWheelTuning.suspension_compression$get(memory),
                rapier.sys_dim3.RprWheelTuning.suspension_damping$get(memory),
                rapier.sys_dim3.RprWheelTuning.max_suspension_travel$get(memory),
                rapier.sys_dim3.RprWheelTuning.friction_slip$get(memory),
                rapier.sys_dim3.RprWheelTuning.max_suspension_force$get(memory)
        );
    }

    public static WheelTuning defaults() {
        try (var arena = MemorySession.openConfined()) {
            return from(rapier.sys_dim3.RapierC.RprWheelTuning_default(arena));
        }
    }
/*{% endif %}*/
}
