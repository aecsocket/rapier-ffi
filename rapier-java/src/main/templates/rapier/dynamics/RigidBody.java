package rapier.dynamics;

import rapier.BaseNative;
import rapier.DropFlag;
import rapier.Droppable;
import rapier.geometry.ColliderSet;
import rapier.math.*;
import rapier.sys.RapierC;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

import static rapier.sys.RapierC.*;

public sealed class RigidBody extends BaseNative permits RigidBody.Mut {
    protected RigidBody(MemorySegment memory) {
        super(memory);
    }

    public static RigidBody at(MemorySegment memory) {
        return new RigidBody(memory);
    }

    public static Mut atMut(MemorySegment memory) {
        return new Mut(memory);
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

    public Vector getCenterOfMass(SegmentAllocator alloc) {
        return Vector.at({{ sys }}.RapierC.RprRigidBody_center_of_mass(alloc, self));
    }

    public short getEffectiveDominanceGroup() {
        return RprRigidBody_effective_dominance_group(self);
    }

    public boolean isTranslationLocked() {
        return RprRigidBody_is_translation_locked(self);
    }

    public boolean[] isRotationLocked() {
        try (var arena = Arena.openConfined()) {
            var out = arena.allocateArray(ValueLayout.JAVA_BOOLEAN, {% if dim2 %} 1 {% elseif dim3 %} 3 {% endif %});
            RprRigidBody_is_rotation_locked(self, out);
{% if dim2 %}
            return new boolean[] { out.get(ValueLayout.JAVA_BOOLEAN, 0) };
{% elseif dim3 %}
            return new boolean[] {
                    out.get(ValueLayout.JAVA_BOOLEAN, 0),
                    out.get(ValueLayout.JAVA_BOOLEAN, 1),
                    out.get(ValueLayout.JAVA_BOOLEAN, 2)
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

    public Isometry getNextPosition(SegmentAllocator alloc) {
        return Isometry.at({{ sys }}.RapierC.RprRigidBody_next_position(alloc, self));
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

    public Vector getLinearVelocity(SegmentAllocator alloc) {
        return Vector.at({{ sys }}.RapierC.RprRigidBody_linvel(alloc, self));
    }

    public AngVector getAngularVelocity(SegmentAllocator alloc) {
        return AngVector.at({{ sys }}.RapierC.RprRigidBody_angvel(alloc, self));
    }

    public Isometry getPosition(SegmentAllocator alloc) {
        return Isometry.at({{ sys }}.RapierC.RprRigidBody_position(alloc, self));
    }

    public Vector getTranslation(SegmentAllocator alloc) {
        return Vector.at({{ sys }}.RapierC.RprRigidBody_translation(alloc, self));
    }

    public Isometry predictPositionUsingVelocityAndForces(SegmentAllocator alloc, {{ real }} dt) {
        return Isometry.at({{ sys }}.RapierC.RprRigidBody_predict_position_using_velocity_and_forces(alloc, self, dt));
    }

    public Vector getUserForce(SegmentAllocator alloc) {
        return Vector.at({{ sys }}.RapierC.RprRigidBody_user_force(alloc, self));
    }

    public AngVector getUserTorque(SegmentAllocator alloc) {
        return AngVector.at({{ sys }}.RapierC.RprRigidBody_user_torque(alloc, self));
    }

    public Vector velocityAtPoint(SegmentAllocator alloc, Vector point) {
        return Vector.at({{ sys }}.RapierC.RprRigidBody_velocity_at_point(alloc, self, point.memory()));
    }

    public {{ real }} getKineticEnergy() {
        return {{ sys }}.RapierC.RprRigidBody_kinetic_energy(self);
    }

    public {{ real }} getGravitationalPotentialEnergy({{ real }} dt, Vector gravity) {
        return {{ sys }}.RapierC.RprRigidBody_gravitational_potential_energy(self, dt, gravity.memory());
    }

    public static final class Mut extends RigidBody implements Droppable {
        private final DropFlag dropped = new DropFlag();

        @Override
        public void drop() {
            dropped.drop(() -> RprRigidBody_drop(self));
        }

        protected Mut(MemorySegment memory) {
            super(memory);
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

        public void setLinearVelocity(AngVector linvel, boolean wakeUp) {
            {{ sys }}.RapierC.RprRigidBody_set_linvel(self, linvel.memory(), wakeUp);
        }

        public void setAngularVelocity(AngVector angvel, boolean wakeUp) {
            {{ sys }}.RapierC.RprRigidBody_set_angvel(self, angvel.memory(), wakeUp);
        }

        public void setTranslation(Vector translation, boolean wakeUp) {
            {{ sys }}.RapierC.RprRigidBody_set_translation(self, translation.memory(), wakeUp);
        }

        public Rotation getRotation(SegmentAllocator alloc) {
            return Rotation.at({{ sys }}.RapierC.RprRigidBody_rotation(alloc, self));
        }

        public void setRotation(Rotation rotation, boolean wakeUp) {
            {{ sys }}.RapierC.RprRigidBody_set_rotation(self, rotation.memory(), wakeUp);
        }

        public void setPosition(Isometry pos, boolean wakeUp) {
            {{ sys }}.RapierC.RprRigidBody_set_position(self, pos.memory(), wakeUp);
        }

        public void setNextKinematicRotation(Rotation rotation) {
            {{ sys }}.RapierC.RprRigidBody_set_next_kinematic_rotation(self, rotation.memory());
        }

        public void setNextKinematicTranslation(Vector translation) {
            {{ sys }}.RapierC.RprRigidBody_set_next_kinematic_translation(self, translation.memory());
        }

        public void setNextKinematicPosition(Isometry pos) {
            {{ sys }}.RapierC.RprRigidBody_set_next_kinematic_position(self, pos.memory());
        }

        public void resetForces(boolean wakeUp) {
            RprRigidBody_reset_forces(self, wakeUp);
        }

        public void resetTorques(boolean wakeUp) {
            RprRigidBody_reset_torques(self, wakeUp);
        }

        public void addForce(Vector force, boolean wakeUp) {
            {{ sys }}.RapierC.RprRigidBody_add_force(self, force.memory(), wakeUp);
        }

        public void addTorque(AngVector torque, boolean wakeUp) {
            {{ sys }}.RapierC.RprRigidBody_add_torque(self, torque.memory(), wakeUp);
        }

        public void addForceAtPoint(Vector force, Vector point, boolean wakeUp) {
            {{ sys }}.RapierC.RprRigidBody_add_force_at_point(self, force.memory(), point.memory(), wakeUp);
        }

        public void applyImpulse(Vector impulse, boolean wakeUp) {
            {{ sys }}.RapierC.RprRigidBody_apply_impulse(self, impulse.memory(), wakeUp);
        }

        public void applyTorqueImpulse(AngVector torqueImpulse, boolean wakeUp) {
            {{ sys }}.RapierC.RprRigidBody_apply_torque_impulse(self, torqueImpulse.memory(), wakeUp);
        }

        public void applyImpulseAtPoint(Vector impulse, Vector point, boolean wakeUp) {
            {{ sys }}.RapierC.RprRigidBody_apply_impulse_at_point(self, impulse.memory(), point.memory(), wakeUp);
        }
    }
}
