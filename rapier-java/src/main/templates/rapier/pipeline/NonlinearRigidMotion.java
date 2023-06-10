package rapier.pipeline;

import rapier.ValNative;
import rapier.math.AngVector;
import rapier.math.Isometry;
import rapier.math.Vector;
import rapier.sys.RprNonlinearRigidMotion;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public final class NonlinearRigidMotion extends ValNative {
    private NonlinearRigidMotion(MemorySegment memory) {
        super(memory);
    }

    public static NonlinearRigidMotion at(MemorySegment memory) {
        return new NonlinearRigidMotion(memory);
    }

    public static NonlinearRigidMotion of(SegmentAllocator alloc) {
        return at({{ sys }}.RprNonlinearRigidMotion.allocate(alloc));
    }

    public Isometry getStart() {
        return Isometry.at({{ sys }}.RprNonlinearRigidMotion.start$slice(self));
    }

    public void setStart(Isometry value) {
        {{ sys }}.RprNonlinearRigidMotion.start$slice(self).copyFrom(value.memory());
    }

    public Vector getLocalCenter() {
        return Vector.at({{ sys }}.RprNonlinearRigidMotion.local_center$slice(self));
    }

    public void setLocalCenter(Vector value) {
        {{ sys }}.RprNonlinearRigidMotion.local_center$slice(self).copyFrom(value.memory());
    }

    public Vector getLinVel() {
        return Vector.at({{ sys }}.RprNonlinearRigidMotion.linvel$slice(self));
    }

    public void setLinVel(Vector value) {
        {{ sys }}.RprNonlinearRigidMotion.linvel$slice(self).copyFrom(value.memory());
    }

    public AngVector getAngVel() {
        return AngVector.at({{ sys }}.RprNonlinearRigidMotion.angvel$slice(self));
    }

    public void setAngVel(AngVector value) {
        {{ sys }}.RprNonlinearRigidMotion.angvel$slice(self).copyFrom(value.memory());
    }
}
