package rapier.pipeline;

import rapier.math.AngVector;
import rapier.math.Isometry;
import rapier.math.Vector;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record NonlinearRigidMotion(
        Isometry start,
        Vector localCenter,
        Vector linVel,
        AngVector angVel
) {
    public static long sizeof() {
        return rapier.sys.RprNonlinearRigidMotion.sizeof();
    }

    public static MemorySegment alloc(SegmentAllocator alloc) {
        return rapier.sys.RprNonlinearRigidMotion.allocate(alloc);
    }

    public static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return rapier.sys.RprNonlinearRigidMotion.allocateArray(len, alloc);
    }

    public void into(MemorySegment memory) {
        start.into(rapier.sys.RprNonlinearRigidMotion.start$slice(memory));
        localCenter.into(rapier.sys.RprNonlinearRigidMotion.local_center$slice(memory));
        linVel.into(rapier.sys.RprNonlinearRigidMotion.linvel$slice(memory));
        angVel.into(rapier.sys.RprNonlinearRigidMotion.angvel$slice(memory));
    }

    public MemorySegment allocInto(SegmentAllocator alloc) {
        var memory = alloc(alloc);
        into(memory);
        return memory;
    }

    public static NonlinearRigidMotion from(MemorySegment memory) {
        return new NonlinearRigidMotion(
                Isometry.from(rapier.sys.RprNonlinearRigidMotion.start$slice(memory)),
                Vector.from(rapier.sys.RprNonlinearRigidMotion.local_center$slice(memory)),
                Vector.from(rapier.sys.RprNonlinearRigidMotion.linvel$slice(memory)),
                AngVector.from(rapier.sys.RprNonlinearRigidMotion.angvel$slice(memory))
        );
    }
}
