package rapier.dynamics.joint;

import rapier.*;
import rapier.math.Isometry;
import rapier.math.Vector;

import javax.annotation.Nullable;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.Arena;
import java.lang.foreign.ValueLayout;

public sealed class GenericJoint extends RefNative permits GenericJoint.Mut {
    private GenericJoint(MemorySegment memory) {
        super(memory);
    }

    public static GenericJoint at(MemorySegment memory) {
        return new GenericJoint(memory);
    }

    public static Mut atMut(MemorySegment memory) {
        return new Mut(memory);
    }

    public static Mut of(byte lockedAxes) {
        return atMut(rapier.sys.RapierC.RprGenericJoint_new(lockedAxes));
    }

    public byte getLockedAxes() {
        return rapier.sys.RapierC.RprGenericJoint_locked_axes(self);
    }

    public byte getLimitAxes() {
        return rapier.sys.RapierC.RprGenericJoint_limit_axes(self);
    }

    public byte getMotorAxes() {
        return rapier.sys.RapierC.RprGenericJoint_motor_axes(self);
    }

    public byte getCoupledAxes() {
        return rapier.sys.RapierC.RprGenericJoint_coupled_axes(self);
    }

    public JointLimits[] getLimits() {
        try (var arena = Arena.openConfined()) {
            var res = JointLimits.allocSlice(arena, Real.spatialDim());
            rapier.sys.RapierC.RprGenericJoint_limits(self, res);
            return JointLimits.fromSlice(res, Real.spatialDim());
        }
    }

    public JointMotor[] getMotors() {
        try (var arena = Arena.openConfined()) {
            var res = JointMotor.allocSlice(arena, Real.spatialDim());
            rapier.sys.RapierC.RprGenericJoint_motors(self, res);
            return JointMotor.fromSlice(res, Real.spatialDim());
        }
    }

    public boolean isEnabled() {
        return rapier.sys.RapierC.RprGenericJoint_is_enabled(self);
    }

    public Isometry getLocalFrame1() {
        try (var arena = Arena.openConfined()) {
            return Isometry.from(rapier.sys.RapierC.RprGenericJoint_local_frame1(arena, self));
        }
    }

    public Isometry getLocalFrame2() {
        try (var arena = Arena.openConfined()) {
            return Isometry.from(rapier.sys.RapierC.RprGenericJoint_local_frame2(arena, self));
        }
    }

    public Vector getLocalAxis1() {
        try (var arena = Arena.openConfined()) {
            return Vector.from(rapier.sys.RapierC.RprGenericJoint_local_axis1(arena, self));
        }
    }

    public Vector getLocalAxis2() {
        try (var arena = Arena.openConfined()) {
            return Vector.from(rapier.sys.RapierC.RprGenericJoint_local_axis2(arena, self));
        }
    }

    public Vector getLocalAnchor1() {
        try (var arena = Arena.openConfined()) {
            return Vector.from(rapier.sys.RapierC.RprGenericJoint_local_anchor1(arena, self));
        }
    }

    public Vector getLocalAnchor2() {
        try (var arena = Arena.openConfined()) {
            return Vector.from(rapier.sys.RapierC.RprGenericJoint_local_anchor2(arena, self));
        }
    }

    public boolean getContactsEnabled() {
        return rapier.sys.RapierC.RprGenericJoint_contacts_enabled(self);
    }

    public @Nullable JointLimits getLimits(JointAxis axis) {
        try (var arena = Arena.openConfined()) {
            var res = JointLimits.alloc(arena);
            if (rapier.sys.RapierC.RprGenericJoint_limits_for(self, axis.ordinal(), res))
                return JointLimits.from(res);
            return null;
        }
    }

    public @Nullable MotorModel getMotorModel(JointAxis axis) {
        try (var arena = Arena.openConfined()) {
            var res = arena.allocate(ValueLayout.JAVA_INT);
            if (rapier.sys.RapierC.RprGenericJoint_motor_model(self, axis.ordinal(), res))
                return MotorModel.values()[res.get(ValueLayout.JAVA_INT, 0)];
            return null;
        }
    }

    public @Nullable JointMotor getMotor(JointAxis axis) {
        try (var arena = Arena.openConfined()) {
            var res = JointMotor.alloc(arena);
            if (rapier.sys.RapierC.RprGenericJoint_motor(self, axis.ordinal(), res))
                return JointMotor.from(res);
            return null;
        }
    }

    public static final class Mut extends GenericJoint implements Droppable {
        private final DropFlag dropped = new DropFlag();

        @Override
        public void drop() {
            dropped.drop(() -> rapier.sys.RapierC.RprGenericJoint_drop(self));
        }

        private Mut(MemorySegment memory) {
            super(memory);
        }

        public void setLockedAxes(byte value) {
            rapier.sys.RapierC.RprGenericJoint_set_locked_axes(self, value);
        }

        public void setLimitAxes(byte value) {
            rapier.sys.RapierC.RprGenericJoint_set_limit_axes(self, value);
        }

        public void setMotorAxes(byte value) {
            rapier.sys.RapierC.RprGenericJoint_set_motor_axes(self, value);
        }

        public void setCoupledAxes(byte value) {
            rapier.sys.RapierC.RprGenericJoint_set_coupled_axes(self, value);
        }

        public void setLimits(JointLimits... value) {
            if (value.length != Real.spatialDim())
                throw new IllegalArgumentException("Array must contain " + Real.spatialDim() + " values");
            try (var arena = Arena.openConfined()) {
                var data = JointLimits.allocIntoSlice(arena, value);
                rapier.sys.RapierC.RprGenericJoint_set_limits(self, data);
            }
        }

        public void setMotors(JointMotor... value) {
            if (value.length != Real.spatialDim())
                throw new IllegalArgumentException("Array must contain " + Real.spatialDim() + " values");
            try (var arena = Arena.openConfined()) {
                var data = JointMotor.allocIntoSlice(arena, value);
                rapier.sys.RapierC.RprGenericJoint_set_motors(self, data);
            }
        }

        public void setEnabled(boolean enabled) {
            rapier.sys.RapierC.RprGenericJoint_set_enabled(self, enabled);
        }

        public void lockAxes(byte axes) {
            rapier.sys.RapierC.RprGenericJoint_lock_axes(self, axes);
        }

        public void setLocalFrame1(Isometry localFrame) {
            try (var arena = Arena.openConfined()) {
                rapier.sys.RapierC.RprGenericJoint_set_local_frame1(self, localFrame.allocInto(arena));
            }
        }

        public void setLocalFrame2(Isometry localFrame) {
            try (var arena = Arena.openConfined()) {
                rapier.sys.RapierC.RprGenericJoint_set_local_frame2(self, localFrame.allocInto(arena));
            }
        }

        public void setLocalAxis1(Vector localAxis) {
            try (var arena = Arena.openConfined()) {
                rapier.sys.RapierC.RprGenericJoint_set_local_axis1(self, localAxis.allocInto(arena));
            }
        }

        public void setLocalAxis2(Vector localAxis) {
            try (var arena = Arena.openConfined()) {
                rapier.sys.RapierC.RprGenericJoint_set_local_axis2(self, localAxis.allocInto(arena));
            }
        }

        public void setLocalAnchor1(Vector localAnchor) {
            try (var arena = Arena.openConfined()) {
                rapier.sys.RapierC.RprGenericJoint_set_local_anchor1(self, localAnchor.allocInto(arena));
            }
        }

        public void setLocalAnchor2(Vector localAnchor) {
            try (var arena = Arena.openConfined()) {
                rapier.sys.RapierC.RprGenericJoint_set_local_anchor2(self, localAnchor.allocInto(arena));
            }
        }

        public void setContactsEnabled(boolean enabled) {
            rapier.sys.RapierC.RprGenericJoint_set_contacts_enabled(self, enabled);
        }

        public void setLimits(JointAxis axis, __real min, __real max) {
            rapier.sys.RapierC.RprGenericJoint_set_limits_for(self, axis.ordinal(), min, max);
        }

        public void setMotorModel(JointAxis axis, MotorModel model) {
            rapier.sys.RapierC.RprGenericJoint_set_motor_model(self, axis.ordinal(), model.ordinal());
        }

        public void setMotorVelocity(JointAxis axis, __real targetVel, __real factor) {
            rapier.sys.RapierC.RprGenericJoint_set_motor_velocity(self, axis.ordinal(), targetVel, factor);
        }

        public void setMotorPosition(JointAxis axis, __real targetPos, __real stiffness, __real damping) {
            rapier.sys.RapierC.RprGenericJoint_set_motor_position(self, axis.ordinal(), targetPos, stiffness, damping);
        }

        public void setMotorMaxForce(JointAxis axis, __real maxForce) {
            rapier.sys.RapierC.RprGenericJoint_set_motor_max_force(self, axis.ordinal(), maxForce);
        }

        public void setMotor(JointAxis axis, __real targetPos, __real targetVel, __real stiffness, __real damping) {
            rapier.sys.RapierC.RprGenericJoint_set_motor(self, axis.ordinal(), targetPos, targetVel, stiffness, damping);
        }
    }
}
