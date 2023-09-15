package rapier.dynamics;

import rapier.*;
import rapier.data.ArenaKey;
import rapier.geometry.ColliderSet;
import rapier.math.*;

import java.lang.foreign.*;

public sealed class RigidBody extends RefNative permits RigidBody.Mut {
    private RigidBody(MemorySegment memory) {
        super(memory);
    }

    public static RigidBody at(MemorySegment memory) {
        return new RigidBody(memory);
    }

    public static Mut atMut(MemorySegment memory) {
        return new Mut(memory);
    }

    public RigidBodyActivation getActivation() {
        return RigidBodyActivation.at(rapier.sys.RapierC.RprRigidBody_activation(self));
    }

    public boolean isEnabled() {
        return rapier.sys.RapierC.RprRigidBody_is_enabled(self);
    }

    public __real getLinearDamping() {
        return rapier.sys.RapierC.RprRigidBody_linear_damping(self);
    }

    public __real getAngularDamping() {
        return rapier.sys.RapierC.RprRigidBody_angular_damping(self);
    }

    public RigidBodyType getBodyType() {
        return RigidBodyType.values()[rapier.sys.RapierC.RprRigidBody_body_type(self)];
    }

    public Vector getCenterOfMass() {
        try (var arena = Arena.openConfined()) {
            return Vector.from(rapier.sys.RapierC.RprRigidBody_center_of_mass(arena, self));
        }
    }

    public RigidBodyMassProps getMassProperties() {
        return RigidBodyMassProps.at(rapier.sys.RapierC.RprRigidBody_mass_properties(self));
    }

    public short getEffectiveDominanceGroup() {
        return rapier.sys.RapierC.RprRigidBody_effective_dominance_group(self);
    }

    public byte getLockedAxes() {
        return rapier.sys.RapierC.RprRigidBody_locked_axes(self);
    }

    public boolean isTranslationLocked() {
        return rapier.sys.RapierC.RprRigidBody_is_translation_locked(self);
    }

    public record RotationLock(
            boolean x/*{% if dim3 %}*/,
            boolean y,
            boolean z
/*{% endif %}*/
    ) {}

    public RotationLock isRotationLocked() {
        try (var arena = Arena.openConfined()) {
            var res = arena.allocateArray(ValueLayout.JAVA_BOOLEAN, Real.angDim());
            rapier.sys.RapierC.RprRigidBody_is_rotation_locked(self, res);
/*{% if dim2 %}*/
            return new RotationLock(
                    res.get(ValueLayout.JAVA_BOOLEAN, 0)
            );
/*{% else %}*/
            return new RotationLock(
                    res.get(ValueLayout.JAVA_BOOLEAN, 0),
                    res.get(ValueLayout.JAVA_BOOLEAN, 1),
                    res.get(ValueLayout.JAVA_BOOLEAN, 2)
            );
/*{% endif %}*/
        }
    }

    public boolean isCcdEnabled() {
        return rapier.sys.RapierC.RprRigidBody_is_ccd_enabled(self);
    }

    public boolean isCcdActive() {
        return rapier.sys.RapierC.RprRigidBody_is_ccd_active(self);
    }

    public ArenaKey[] getColliders() {
        try (var arena = Arena.openConfined()) {
            var data = arena.allocate(ValueLayout.ADDRESS);
            var len = arena.allocate(ValueLayout.JAVA_LONG);
            rapier.sys.RapierC.RprRigidBody_colliders(self, data, len);

            var ptr = data.get(ValueLayout.ADDRESS, 0);
            int iLen = (int) len.get(ValueLayout.JAVA_LONG, 0);
            return ArenaKey.fromSlice(MemorySegment.ofAddress(ptr.address(), ArenaKey.sizeof() * iLen, arena.scope()), iLen);
        }
    }

    public boolean isDynamic() {
        return rapier.sys.RapierC.RprRigidBody_is_dynamic(self);
    }

    public boolean isKinematic() {
        return rapier.sys.RapierC.RprRigidBody_is_kinematic(self);
    }

    public boolean isFixed() {
        return rapier.sys.RapierC.RprRigidBody_is_fixed(self);
    }

    public __real getMass() {
        return rapier.sys.RapierC.RprRigidBody_mass(self);
    }

    public Isometry getNextPosition() {
        try (var arena = Arena.openConfined()) {
            return Isometry.from(rapier.sys.RapierC.RprRigidBody_next_position(arena, self));
        }
    }

    public __real getGravityScale() {
        return rapier.sys.RapierC.RprRigidBody_gravity_scale(self);
    }

    public byte getDominanceGroup() {
        return rapier.sys.RapierC.RprRigidBody_dominance_group(self);
    }

    public boolean isSleeping() {
        return rapier.sys.RapierC.RprRigidBody_is_sleeping(self);
    }

    public Vector getLinearVelocity() {
        try (var arena = Arena.openConfined()) {
            return Vector.from(rapier.sys.RapierC.RprRigidBody_linvel(arena, self));
        }
    }

    public AngVector getAngularVelocity() {
        try (var arena = Arena.openConfined()) {
            return AngVector.from(rapier.sys.RapierC.RprRigidBody_angvel(arena, self));
        }
    }

    public Isometry getPosition() {
        try (var arena = Arena.openConfined()) {
            return Isometry.from(rapier.sys.RapierC.RprRigidBody_position(arena, self));
        }
    }

    public Vector getTranslation() {
        try (var arena = Arena.openConfined()) {
            return Vector.from(rapier.sys.RapierC.RprRigidBody_translation(arena, self));
        }
    }

    public Rotation getRotation() {
        try (var arena = Arena.openConfined()) {
            return Rotation.from(rapier.sys.RapierC.RprRigidBody_rotation(arena, self));
        }
    }

    public Isometry predictPositionUsingVelocityAndForces(__real dt) {
        try (var arena = Arena.openConfined()) {
            return Isometry.from(rapier.sys.RapierC.RprRigidBody_predict_position_using_velocity_and_forces(arena, self, dt));
        }
    }

    public Vector getUserForce() {
        try (var arena = Arena.openConfined()) {
            return Vector.from(rapier.sys.RapierC.RprRigidBody_user_force(arena, self));
        }
    }

    public AngVector getUserTorque() {
        try (var arena = Arena.openConfined()) {
            return AngVector.from(rapier.sys.RapierC.RprRigidBody_user_torque(arena, self));
        }
    }

    public Vector velocityAtPoint(Vector point) {
        try (var arena = Arena.openConfined()) {
            return Vector.from(rapier.sys.RapierC.RprRigidBody_velocity_at_point(arena, self, point.allocInto(arena)));
        }
    }

    public __real getKineticEnergy() {
        return rapier.sys.RapierC.RprRigidBody_kinetic_energy(self);
    }

    public __real getGravitationalPotentialEnergy(__real dt, Vector gravity) {
        try (var arena = Arena.openConfined()) {
            return rapier.sys.RapierC.RprRigidBody_gravitational_potential_energy(self, dt, gravity.allocInto(arena));
        }
    }

    public static final class Mut extends RigidBody implements Droppable {
        private final DropFlag dropped = new DropFlag();

        @Override
        public void drop() {
            dropped.drop(() -> rapier.sys.RapierC.RprRigidBody_drop(self));
        }

        private Mut(MemorySegment memory) {
            super(memory);
        }

        @Override
        public RigidBodyActivation.Mut getActivation() {
            return RigidBodyActivation.atMut(rapier.sys.RapierC.RprRigidBody_activation_mut(self));
        }

        public void setEnabled(boolean enabled) {
            rapier.sys.RapierC.RprRigidBody_set_enabled(self, enabled);
        }

        public void setLinearDamping(__real damping) {
            rapier.sys.RapierC.RprRigidBody_set_linear_damping(self, damping);
        }

        public void setAngularDamping(__real damping) {
            rapier.sys.RapierC.RprRigidBody_set_angular_damping(self, damping);
        }

        public void setBodyType(RigidBodyType status, boolean wakeUp) {
            rapier.sys.RapierC.RprRigidBody_set_body_type(self, status.ordinal(), wakeUp);
        }

        public void setLockedAxes(byte lockedAxes, boolean wakeUp) {
            rapier.sys.RapierC.RprRigidBody_set_locked_axes(self, lockedAxes, wakeUp);
        }

        public void lockRotations(boolean locked, boolean wakeUp) {
            rapier.sys.RapierC.RprRigidBody_lock_rotations(self, locked, wakeUp);
        }

        public void setEnabledRotations(
                boolean allowRotationsX,
                boolean allowRotationsY,
                boolean allowRotationsZ,
                boolean wakeUp
        ) {
            rapier.sys.RapierC.RprRigidBody_set_enabled_rotations(self, allowRotationsX, allowRotationsY, allowRotationsZ, wakeUp);
        }

        public void lockTranslations(boolean locked, boolean wakeUp) {
            rapier.sys.RapierC.RprRigidBody_lock_translations(self, locked, wakeUp);
        }

/*{% if dim2 %}*/
        public void setEnabledTranslations(
                boolean allowTranslationX,
                boolean allowTranslationY,
                boolean wakeUp
        ) {
            rapier.sys_dim2.RapierC.RprRigidBody_set_enabled_translations(
                    self,
                    allowTranslationX,
                    allowTranslationY,
                    wakeUp
            );
        }
/*{% else %}*/
        public void setEnabledTranslations(
                boolean allowTranslationX,
                boolean allowTranslationY,
                boolean allowTranslationZ,
                boolean wakeUp
        ) {
            rapier.sys_dim3.RapierC.RprRigidBody_set_enabled_translations(
                    self,
                    allowTranslationX,
                    allowTranslationY,
                    allowTranslationZ,
                    wakeUp
            );
        }
/*{% endif %}*/

        public void enableCcd(boolean enabled) {
            rapier.sys.RapierC.RprRigidBody_enable_ccd(self, enabled);
        }

        public void recomputeMassPropertiesFromColliders(ColliderSet colliders) {
            rapier.sys.RapierC.RprRigidBody_recompute_mass_properties_from_colliders(self, colliders.memory());
        }

        public void setAdditionalMass(__real additionalMass, boolean wakeUp) {
            rapier.sys.RapierC.RprRigidBody_set_additional_mass(self, additionalMass, wakeUp);
        }

        public void setGravityScale(__real scale, boolean wakeUp) {
            rapier.sys.RapierC.RprRigidBody_set_gravity_scale(self, scale, wakeUp);
        }

        public void setDominanceGroup(byte dominance) {
            rapier.sys.RapierC.RprRigidBody_set_dominance_group(self, dominance);
        }

        public void sleep() {
            rapier.sys.RapierC.RprRigidBody_sleep(self);
        }

        public void wakeUp(boolean strong) {
            rapier.sys.RapierC.RprRigidBody_wake_up(self, strong);
        }

        public void setLinearVelocity(Vector linvel, boolean wakeUp) {
            try (var arena = Arena.openConfined()) {
                rapier.sys.RapierC.RprRigidBody_set_linvel(self, linvel.allocInto(arena), wakeUp);
            }
        }

        public void setAngularVelocity(AngVector angvel, boolean wakeUp) {
            try (var arena = Arena.openConfined()) {
                rapier.sys.RapierC.RprRigidBody_set_angvel(self, angvel.allocInto(arena), wakeUp);
            }
        }

        public void setTranslation(Vector translation, boolean wakeUp) {
            try (var arena = Arena.openConfined()) {
                rapier.sys.RapierC.RprRigidBody_set_translation(self, translation.allocInto(arena), wakeUp);
            }
        }

        public void setRotation(Rotation rotation, boolean wakeUp) {
            try (var arena = Arena.openConfined()) {
                rapier.sys.RapierC.RprRigidBody_set_rotation(self, rotation.allocInto(arena), wakeUp);
            }
        }

        public void setPosition(Isometry pos, boolean wakeUp) {
            try (var arena = Arena.openConfined()) {
                rapier.sys.RapierC.RprRigidBody_set_position(self, pos.allocInto(arena), wakeUp);
            }
        }

        public void setNextKinematicRotation(Rotation rotation) {
            try (var arena = Arena.openConfined()) {
                rapier.sys.RapierC.RprRigidBody_set_next_kinematic_rotation(self, rotation.allocInto(arena));
            }
        }

        public void setNextKinematicTranslation(Vector translation) {
            try (var arena = Arena.openConfined()) {
                rapier.sys.RapierC.RprRigidBody_set_next_kinematic_translation(self, translation.allocInto(arena));
            }
        }

        public void setNextKinematicPosition(Isometry pos) {
            try (var arena = Arena.openConfined()) {
                rapier.sys.RapierC.RprRigidBody_set_next_kinematic_position(self, pos.allocInto(arena));
            }
        }

        public void resetForces(boolean wakeUp) {
            rapier.sys.RapierC.RprRigidBody_reset_forces(self, wakeUp);
        }

        public void resetTorques(boolean wakeUp) {
            rapier.sys.RapierC.RprRigidBody_reset_torques(self, wakeUp);
        }

        public void addForce(Vector force, boolean wakeUp) {
            try (var arena = Arena.openConfined()) {
                rapier.sys.RapierC.RprRigidBody_add_force(self, force.allocInto(arena), wakeUp);
            }
        }

        public void addTorque(AngVector torque, boolean wakeUp) {
            try (var arena = Arena.openConfined()) {
                rapier.sys.RapierC.RprRigidBody_add_torque(self, torque.allocInto(arena), wakeUp);
            }
        }

        public void addForceAtPoint(Vector force, Vector point, boolean wakeUp) {
            try (var arena = Arena.openConfined()) {
                rapier.sys.RapierC.RprRigidBody_add_force_at_point(self, force.allocInto(arena), point.allocInto(arena), wakeUp);
            }
        }

        public void applyImpulse(Vector impulse, boolean wakeUp) {
            try (var arena = Arena.openConfined()) {
                rapier.sys.RapierC.RprRigidBody_apply_impulse(self, impulse.allocInto(arena), wakeUp);
            }
        }

        public void applyTorqueImpulse(AngVector torqueImpulse, boolean wakeUp) {
            try (var arena = Arena.openConfined()) {
                rapier.sys.RapierC.RprRigidBody_apply_torque_impulse(self, torqueImpulse.allocInto(arena), wakeUp);
            }
        }

        public void applyImpulseAtPoint(Vector impulse, Vector point, boolean wakeUp) {
            try (var arena = Arena.openConfined()) {
                rapier.sys.RapierC.RprRigidBody_apply_impulse_at_point(self, impulse.allocInto(arena), point.allocInto(arena), wakeUp);
            }
        }
    }
}
