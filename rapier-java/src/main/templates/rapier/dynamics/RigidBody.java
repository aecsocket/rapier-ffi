package rapier.dynamics;

import rapier.DropFlag;
import rapier.Droppable;
import rapier.RefNative;
import rapier.data.ArenaKey;
import rapier.geometry.ColliderSet;
import rapier.math.*;
import rapier.sys.RapierC;

import java.lang.foreign.*;

import static rapier.sys.RapierC.*;

public sealed class RigidBody extends RefNative permits RigidBody.Mut {
    private RigidBody(MemoryAddress memory) {
        super(memory);
    }

    public static RigidBody at(MemoryAddress memory) {
        return new RigidBody(memory);
    }

    public static Mut atMut(MemoryAddress memory) {
        return new Mut(memory);
    }

    public RigidBodyActivation getActivation() {
        return RigidBodyActivation.at(RprRigidBody_activation(self));
    }

    public boolean isEnabled() {
        return RprRigidBody_is_enabled(self);
    }

    public {{ real }} getLinearDamping() {
        return {{ sys }}.RapierC.RprRigidBody_linear_damping(self);
    }

    public {{ real }} getAngularDamping() {
        return {{ sys }}.RapierC.RprRigidBody_angular_damping(self);
    }

    public RigidBodyType getBodyType() {
        return RigidBodyType.values()[RprRigidBody_body_type(self)];
    }

    public Vector getCenterOfMass() {
        try (var arena = MemorySession.openConfined()) {
            return Vector.from({{ sys }}.RapierC.RprRigidBody_center_of_mass(arena, self));
        }
    }

    public RigidBodyMassProps getMassProperties() {
        return RigidBodyMassProps.at({{ sys }}.RapierC.RprRigidBody_mass_properties(self));
    }

    public short getEffectiveDominanceGroup() {
        return RprRigidBody_effective_dominance_group(self);
    }

    public byte getLockedAxes() {
        return RprRigidBody_locked_axes(self);
    }

    public boolean isTranslationLocked() {
        return RprRigidBody_is_translation_locked(self);
    }

    public boolean[] isRotationLocked() {
        try (var arena = MemorySession.openConfined()) {
            var res = arena.allocateArray(ValueLayout.JAVA_BOOLEAN, {% if dim2 %} 1 {% elseif dim3 %} 3 {% endif %});
            RprRigidBody_is_rotation_locked(self, res);
{% if dim2 %}
            return new boolean[] { res.get(ValueLayout.JAVA_BOOLEAN, 0) };
{% elseif dim3 %}
            return new boolean[] {
                    res.get(ValueLayout.JAVA_BOOLEAN, 0),
                    res.get(ValueLayout.JAVA_BOOLEAN, 1),
                    res.get(ValueLayout.JAVA_BOOLEAN, 2)
            };
{% endif %}
        }
    }

    public boolean isCcdEnabled() {
        return RprRigidBody_is_ccd_enabled(self);
    }

    public boolean isCcdActive() {
        return RprRigidBody_is_ccd_active(self);
    }

    public ArenaKey[] getColliders() {
        try (var arena = MemorySession.openConfined()) {
            var data = arena.allocate(C_POINTER);
            var len = arena.allocate(C_LONG);
            RprRigidBody_colliders(self, data, len);
            return ArenaKey.fromSlice(data.get(C_POINTER, 0), (int) len.get(C_LONG, 0));
        }
    }

    public boolean isDynamic() {
        return RprRigidBody_is_dynamic(self);
    }

    public boolean isKinematic() {
        return RprRigidBody_is_kinematic(self);
    }

    public boolean isFixed() {
        return RprRigidBody_is_fixed(self);
    }

    public {{ real }} getMass() {
        return {{ sys }}.RapierC.RprRigidBody_mass(self);
    }

    public Isometry getNextPosition() {
        try (var arena = MemorySession.openConfined()) {
            return Isometry.from({{ sys }}.RapierC.RprRigidBody_next_position(arena, self));
        }
    }

    public {{ real }} getGravityScale() {
        return {{ sys }}.RapierC.RprRigidBody_gravity_scale(self);
    }

    public byte getDominanceGroup() {
        return RprRigidBody_dominance_group(self);
    }

    public boolean isSleeping() {
        return RprRigidBody_is_sleeping(self);
    }

    public Vector getLinearVelocity() {
        try (var arena = MemorySession.openConfined()) {
            return Vector.from({{ sys }}.RapierC.RprRigidBody_linvel(arena, self));
        }
    }

    public AngVector getAngularVelocity() {
        try (var arena = MemorySession.openConfined()) {
            return AngVector.from({{ sys }}.RapierC.RprRigidBody_angvel(arena, self));
        }
    }

    public Isometry getPosition() {
        try (var arena = MemorySession.openConfined()) {
            return Isometry.from({{ sys }}.RapierC.RprRigidBody_position(arena, self));
        }
    }

    public Vector getTranslation() {
        try (var arena = MemorySession.openConfined()) {
            return Vector.from({{ sys }}.RapierC.RprRigidBody_translation(arena, self));
        }
    }

    public Rotation getRotation() {
        try (var arena = MemorySession.openConfined()) {
            return Rotation.from({{ sys }}.RapierC.RprRigidBody_rotation(arena, self));
        }
    }

    public Isometry predictPositionUsingVelocityAndForces({{ real }} dt) {
        try (var arena = MemorySession.openConfined()) {
            return Isometry.from({{ sys }}.RapierC.RprRigidBody_predict_position_using_velocity_and_forces(arena, self, dt));
        }
    }

    public Vector getUserForce() {
        try (var arena = MemorySession.openConfined()) {
            return Vector.from({{ sys }}.RapierC.RprRigidBody_user_force(arena, self));
        }
    }

    public AngVector getUserTorque() {
        try (var arena = MemorySession.openConfined()) {
            return AngVector.from({{ sys }}.RapierC.RprRigidBody_user_torque(arena, self));
        }
    }

    public Vector velocityAtPoint(Vector point) {
        try (var arena = MemorySession.openConfined()) {
            return Vector.from({{ sys }}.RapierC.RprRigidBody_velocity_at_point(arena, self, point.allocInto(arena)));
        }
    }

    public {{ real }} getKineticEnergy() {
        return {{ sys }}.RapierC.RprRigidBody_kinetic_energy(self);
    }

    public {{ real }} getGravitationalPotentialEnergy({{ real }} dt, Vector gravity) {
        try (var arena = MemorySession.openConfined()) {
            return {{ sys }}.RapierC.RprRigidBody_gravitational_potential_energy(self, dt, gravity.allocInto(arena));
        }
    }

    public static final class Mut extends RigidBody implements Droppable {
        private final DropFlag dropped = new DropFlag();

        @Override
        public void drop() {
            dropped.drop(() -> RprRigidBody_drop(self));
        }

        private Mut(MemoryAddress memory) {
            super(memory);
        }

        @Override
        public RigidBodyActivation.Mut getActivation() {
            return RigidBodyActivation.atMut(RprRigidBody_activation_mut(self));
        }

        public void setEnabled(boolean enabled) {
            RprRigidBody_set_enabled(self, enabled);
        }

        public void setLinearDamping({{ real }} damping) {
            {{ sys }}.RapierC.RprRigidBody_set_linear_damping(self, damping);
        }

        public void setAngularDamping({{ real }} damping) {
            {{ sys }}.RapierC.RprRigidBody_set_angular_damping(self, damping);
        }

        public void setBodyType(RigidBodyType status, boolean wakeUp) {
            RprRigidBody_set_body_type(self, status.ordinal(), wakeUp);
        }

        public void setLockedAxes(byte lockedAxes, boolean wakeUp) {
            RprRigidBody_set_locked_axes(self, lockedAxes, wakeUp);
        }

        public void lockRotations(boolean locked, boolean wakeUp) {
            RprRigidBody_lock_rotations(self, locked, wakeUp);
        }

        public void setEnabledRotations(
                boolean allowRotationsX,
                boolean allowRotationsY,
                boolean allowRotationsZ,
                boolean wakeUp
        ) {
            RprRigidBody_set_enabled_rotations(self, allowRotationsX, allowRotationsY, allowRotationsZ, wakeUp);
        }

        public void lockTranslations(boolean locked, boolean wakeUp) {
            RprRigidBody_lock_translations(self, locked, wakeUp);
        }

        {% if dim2 %}
        public void setEnabledTranslations(
                boolean allowTranslationX,
                boolean allowTranslationY,
                boolean wakeUp
        ) {
            {{ sys }}.RapierC.RprRigidBody_set_enabled_translations(
                    self,
                    allowTranslationX,
                    allowTranslationY,
                    wakeUp
            );
        }
        {% elseif dim3 %}
        public void setEnabledTranslations(
                boolean allowTranslationX,
                boolean allowTranslationY,
                boolean allowTranslationZ,
                boolean wakeUp
        ) {
            {{ sys }}.RapierC.RprRigidBody_set_enabled_translations(
                    self,
                    allowTranslationX,
                    allowTranslationY,
                    allowTranslationZ,
                    wakeUp
            );
        }
        {% endif %}

        public void enableCcd(boolean enabled) {
            RprRigidBody_enable_ccd(self, enabled);
        }

        public void recomputeMassPropertiesFromColliders(ColliderSet colliders) {
            RprRigidBody_recompute_mass_properties_from_colliders(self, colliders.memory());
        }

        public void setAdditionalMass({{ real }} additionalMass, boolean wakeUp) {
            {{ sys }}.RapierC.RprRigidBody_set_additional_mass(self, additionalMass, wakeUp);
        }

        public void setGravityScale({{ real }} scale, boolean wakeUp) {
            {{ sys }}.RapierC.RprRigidBody_set_gravity_scale(self, scale, wakeUp);
        }

        public void setDominanceGroup(byte dominance) {
            RprRigidBody_set_dominance_group(self, dominance);
        }

        public void sleep() {
            RprRigidBody_sleep(self);
        }

        public void wakeUp(boolean strong) {
            RprRigidBody_wake_up(self, strong);
        }

        public void setLinearVelocity(Vector linvel, boolean wakeUp) {
            try (var arena = MemorySession.openConfined()) {
                {{ sys }}.RapierC.RprRigidBody_set_linvel(self, linvel.allocInto(arena), wakeUp);
            }
        }

        public void setAngularVelocity(AngVector angvel, boolean wakeUp) {
            try (var arena = MemorySession.openConfined()) {
                {{ sys }}.RapierC.RprRigidBody_set_angvel(self, angvel.allocate(arena), wakeUp);
            }
        }

        public void setTranslation(Vector translation, boolean wakeUp) {
            try (var arena = MemorySession.openConfined()) {
                {{ sys }}.RapierC.RprRigidBody_set_translation(self, translation.allocInto(arena), wakeUp);
            }
        }

        public void setRotation(Rotation rotation, boolean wakeUp) {
            try (var arena = MemorySession.openConfined()) {
                {{ sys }}.RapierC.RprRigidBody_set_rotation(self, rotation.allocate(arena), wakeUp);
            }
        }

        public void setPosition(Isometry pos, boolean wakeUp) {
            try (var arena = MemorySession.openConfined()) {
                {{ sys }}.RapierC.RprRigidBody_set_position(self, pos.allocate(arena), wakeUp);
            }
        }

        public void setNextKinematicRotation(Rotation rotation) {
            try (var arena = MemorySession.openConfined()) {
                {{ sys }}.RapierC.RprRigidBody_set_next_kinematic_rotation(self, rotation.allocate(arena));
            }
        }

        public void setNextKinematicTranslation(Vector translation) {
            try (var arena = MemorySession.openConfined()) {
                {{ sys }}.RapierC.RprRigidBody_set_next_kinematic_translation(self, translation.allocInto(arena));
            }
        }

        public void setNextKinematicPosition(Isometry pos) {
            try (var arena = MemorySession.openConfined()) {
                {{ sys }}.RapierC.RprRigidBody_set_next_kinematic_position(self, pos.allocate(arena));
            }
        }

        public void resetForces(boolean wakeUp) {
            RprRigidBody_reset_forces(self, wakeUp);
        }

        public void resetTorques(boolean wakeUp) {
            RprRigidBody_reset_torques(self, wakeUp);
        }

        public void addForce(Vector force, boolean wakeUp) {
            try (var arena = MemorySession.openConfined()) {
                {{ sys }}.RapierC.RprRigidBody_add_force(self, force.allocInto(arena), wakeUp);
            }
        }

        public void addTorque(AngVector torque, boolean wakeUp) {
            try (var arena = MemorySession.openConfined()) {
                {{ sys }}.RapierC.RprRigidBody_add_torque(self, torque.allocate(arena), wakeUp);
            }
        }

        public void addForceAtPoint(Vector force, Vector point, boolean wakeUp) {
            try (var arena = MemorySession.openConfined()) {
                {{ sys }}.RapierC.RprRigidBody_add_force_at_point(self, force.allocInto(arena), point.allocInto(arena), wakeUp);
            }
        }

        public void applyImpulse(Vector impulse, boolean wakeUp) {
            try (var arena = MemorySession.openConfined()) {
                {{ sys }}.RapierC.RprRigidBody_apply_impulse(self, impulse.allocInto(arena), wakeUp);
            }
        }

        public void applyTorqueImpulse(AngVector torqueImpulse, boolean wakeUp) {
            try (var arena = MemorySession.openConfined()) {
                {{ sys }}.RapierC.RprRigidBody_apply_torque_impulse(self, torqueImpulse.allocate(arena), wakeUp);
            }
        }

        public void applyImpulseAtPoint(Vector impulse, Vector point, boolean wakeUp) {
            try (var arena = MemorySession.openConfined()) {
                {{ sys }}.RapierC.RprRigidBody_apply_impulse_at_point(self, impulse.allocInto(arena), point.allocInto(arena), wakeUp);
            }
        }
    }
}
