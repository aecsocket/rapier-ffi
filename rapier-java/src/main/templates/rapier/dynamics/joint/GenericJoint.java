package rapier.dynamics.joint;

import rapier.DropFlag;
import rapier.Droppable;
import rapier.RefNative;
import rapier.math.Isometry;
import rapier.math.Vector;
import rapier.sys.RapierC;

import javax.annotation.Nullable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.foreign.SegmentAllocator;

import static rapier.sys.RapierC.*;

public sealed class GenericJoint extends RefNative permits GenericJoint.Mut {
    private GenericJoint(MemoryAddress memory) {
        super(memory);
    }

    public static GenericJoint at(MemoryAddress memory) {
        return new GenericJoint(memory);
    }

    public static Mut atMut(MemoryAddress memory) {
        return new Mut(memory);
    }

    public static Mut of(byte lockedAxes) {
        return atMut(RprGenericJoint_new(lockedAxes));
    }

    public byte getLockedAxes() {
        return RprGenericJoint_locked_axes(self);
    }

    public boolean isEnabled() {
        return RprGenericJoint_is_enabled(self);
    }

    public Isometry getLocalFrame1(SegmentAllocator alloc) {
        return Isometry.at({{ sys }}.RapierC.RprGenericJoint_local_frame1(alloc, self));
    }

    public Isometry getLocalFrame2(SegmentAllocator alloc) {
        return Isometry.at({{ sys }}.RapierC.RprGenericJoint_local_frame2(alloc, self));
    }

    public Vector getLocalAxis1(SegmentAllocator alloc) {
        return Vector.at({{ sys }}.RapierC.RprGenericJoint_local_axis1(alloc, self));
    }

    public Vector getLocalAxis2(SegmentAllocator alloc) {
        return Vector.at({{ sys }}.RapierC.RprGenericJoint_local_axis2(alloc, self));
    }

    public Vector getLocalAnchor1(SegmentAllocator alloc) {
        return Vector.at({{ sys }}.RapierC.RprGenericJoint_local_anchor1(alloc, self));
    }

    public Vector getLocalAnchor2(SegmentAllocator alloc) {
        return Vector.at({{ sys }}.RapierC.RprGenericJoint_local_anchor2(alloc, self));
    }

    public boolean getContactsEnabled() {
        return RprGenericJoint_contacts_enabled(self);
    }

    public @Nullable JointLimits getLimits(JointAxis axis) {
        try (var arena = MemorySession.openConfined()) {
            var res = JointLimits.create(arena);
            if ({{ sys }}.RapierC.RprGenericJoint_limits(self, axis.ordinal(), res.memory())) {
                return res;
            }
            return null;
        }
    }

    public @Nullable MotorModel getMotorModel(JointAxis axis) {
        try (var arena = MemorySession.openConfined()) {
            var out = arena.allocate(C_INT);
            if (RprGenericJoint_motor_model(self, axis.ordinal(), out)) {
                return MotorModel.values()[out.get(C_INT, 0)];
            }
            return null;
        }
    }

    public @Nullable JointMotor getMotor(JointAxis axis) {
        try (var arena = MemorySession.openConfined()) {
            var out = JointMotor.create(arena);
            if (RprGenericJoint_motor(self, axis.ordinal(), out.memory())) {
                return out;
            }
            return null;
        }
    }

    public static final class Mut extends GenericJoint implements Droppable {
        private final DropFlag dropped = new DropFlag();

        @Override
        public void drop() {
            dropped.drop(() -> RprGenericJoint_drop(self));
        }

        private Mut(MemoryAddress memory) {
            super(memory);
        }

        public void setEnabled(boolean enabled) {
            RprGenericJoint_set_enabled(self, enabled);
        }

        public void lockAxes(byte axes) {
            RprGenericJoint_lock_axes(self, axes);
        }

        public void setLocalFrame1(Isometry localFrame) {
            {{ sys }}.RapierC.RprGenericJoint_set_local_frame1(self, localFrame.memory());
        }

        public void setLocalFrame2(Isometry localFrame) {
            {{ sys }}.RapierC.RprGenericJoint_set_local_frame2(self, localFrame.memory());
        }

        public void setLocalAxis1(Vector localAxis) {
            {{ sys }}.RapierC.RprGenericJoint_set_local_axis1(self, localAxis.memory());
        }

        public void setLocalAxis2(Vector localAxis) {
            {{ sys }}.RapierC.RprGenericJoint_set_local_axis2(self, localAxis.memory());
        }

        public void setLocalAnchor1(Vector localAnchor) {
            {{ sys }}.RapierC.RprGenericJoint_set_local_anchor1(self, localAnchor.memory());
        }

        public void setLocalAnchor2(Vector localAnchor) {
            {{ sys }}.RapierC.RprGenericJoint_set_local_anchor2(self, localAnchor.memory());
        }

        public void setContactsEnabled(boolean enabled) {
            RprGenericJoint_set_contacts_enabled(self, enabled);
        }

        public void setLimits(JointAxis axis, {{ real }} min, {{ real }} max) {
            {{ sys }}.RapierC.RprGenericJoint_set_limits(self, axis.ordinal(), min, max);
        }

        public void setMotorModel(JointAxis axis, MotorModel model) {
            RprGenericJoint_set_motor_model(self, axis.ordinal(), model.ordinal());
        }

        public void setMotorVelocity(JointAxis axis, {{ real }} targetVel, {{ real }} factor) {
            {{ sys }}.RapierC.RprGenericJoint_set_motor_velocity(self, axis.ordinal(), targetVel, factor);
        }

        public void setMotorPosition(JointAxis axis, {{ real }} targetPos, {{ real }} stiffness, {{ real }} damping) {
            {{ sys }}.RapierC.RprGenericJoint_set_motor_position(self, axis.ordinal(), targetPos, stiffness, damping);
        }

        public void setMotorMaxForce(JointAxis axis, {{ real }} maxForce) {
            {{ sys }}.RapierC.RprGenericJoint_set_motor_max_force(self, axis.ordinal(), maxForce);
        }

        public void setMotor(JointAxis axis, {{ real }} targetPos, {{ real }} targetVel, {{ real }} stiffness, {{ real }} damping) {
            {{ sys }}.RapierC.RprGenericJoint_set_motor(self, axis.ordinal(), targetPos, targetVel, stiffness, damping);
        }
    }
}
