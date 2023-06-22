package rapier.pipeline;

import rapier.ValNative;
import rapier.math.AngVector;
import rapier.math.Isometry;
import rapier.math.Vector;
import rapier.sys.RprNonlinearRigidMotion;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record NonlinearRigidMotion(
        Isometry start,
        Vector localCenter,
        Vector linVel,
        AngVector angVel
) {
    public static NonlinearRigidMotion from(MemorySegment memory) {
        return new NonlinearRigidMotion(
                Isometry.from({{ sys }}.RprNonlinearRigidMotion.start$slice(memory)),
                Vector.from({{ sys }}.RprNonlinearRigidMotion.local_center$slice(memory)),
                Vector.from({{ sys }}.RprNonlinearRigidMotion.linvel$slice(memory)),
                AngVector.from({{ sys }}.RprNonlinearRigidMotion.angvel$slice(memory))
        );
    }

    public void into(MemorySegment memory) {
        start.into({{ sys }}.RprNonlinearRigidMotion.start$slice(memory));
        localCenter.into({{ sys }}.RprNonlinearRigidMotion.local_center$slice(memory));
        linVel.into({{ sys }}.RprNonlinearRigidMotion.linvel$slice(memory));
        angVel.into({{ sys }}.RprNonlinearRigidMotion.angvel$slice(memory));
    }

    public MemorySegment allocate(SegmentAllocator alloc) {
        var memory = {{ sys }}.RprNonlinearRigidMotion.allocate(alloc);
        into(memory);
        return memory;
    }
}
