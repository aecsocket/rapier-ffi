package rapier.dynamics;

import rapier.DroppableNative;
import rapier.geometry.ColliderSet;
import rapier.math.*;
import rapier.sys.RapierC;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

import static rapier.sys.RapierC.*;

public final class RigidBody extends DroppableNative {
    protected RigidBody(MemorySegment memory) {
        super(memory);
    }

    public static RigidBody at(MemorySegment memory) {
        return new RigidBody(memory);
    }

    @Override
    protected void dropInternal() {
        RprRigidBody_drop(self);
    }

    public boolean isEnabled() {
        return RprRigidBody_is_enabled(self);
    }

    public void setEnabled(boolean enabled) {
        RprRigidBody_set_enabled(self, enabled);
    }

    public {{ real }} getLinearDamping() {
        return {{ sys }}.RapierC.RprRigidBody_linear_damping(self);
    }

    public void setLinearDamping({{ real }} damping) {
        {{ sys }}.RapierC.RprRigidBody_set_linear_damping(self, damping);
    }

    public {{ real }} getAngularDamping() {
        return {{ sys }}.RapierC.RprRigidBody_angular_damping(self);
    }

    public void setAngularDamping({{ real }} damping) {
        {{ sys }}.RapierC.RprRigidBody_set_angular_damping(self, damping);
    }

    public RigidBodyType getBodyType() {
        return RigidBodyType.values()[RprRigidBody_body_type(self)];
    }

    public void setBodyType(RigidBodyType status, boolean wakeUp) {
        RprRigidBody_set_body_type(self, status.ordinal(), wakeUp);
    }

    public {{ realVec }} getCenterOfMass(SegmentAllocator alloc) {
        return {{ realVec }}.at(RprRigidBody_center_of_mass(alloc, self));
    }

    public short getEffectiveDominanceGroup() {
        return RprRigidBody_effective_dominance_group(self);
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

    public void enableCcd(boolean enabled) {
        RprRigidBody_enable_ccd(self, enabled);
    }

    public boolean isCcdEnabled() {
        return RprRigidBody_is_ccd_enabled(self);
    }

    public boolean isCcdActive() {
        return RprRigidBody_is_ccd_active(self);
    }

    public void recomputeMassPropertiesFromColliders(ColliderSet colliders) {
        RprRigidBody_recompute_mass_properties_from_colliders(self, colliders.memory());
    }

    public void setAdditionalMass({{ real }} additionalMass, boolean wakeUp) {
        {{ sys }}.RapierC.RprRigidBody_set_additional_mass(self, additionalMass, wakeUp);
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

    public Iso getNextPosition(SegmentAllocator alloc) {
        return Iso.at(RprRigidBody_next_position(alloc, self));
    }

    public {{ real }} getGravityScale() {
        return {{ sys }}.RapierC.RprRigidBody_gravity_scale(self);
    }

    public void getGravityScale({{ real }} scale, boolean wakeUp) {
        {{ sys }}.RapierC.RprRigidBody_set_gravity_scale(self, scale, wakeUp);
    }

    public byte getDominanceGroup() {
        return RprRigidBody_dominance_group(self);
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

    public boolean isSleeping() {
        return RprRigidBody_is_sleeping(self);
    }

    public {{ realVec }} getLinearVelocity(SegmentAllocator alloc) {
        return {{ realVec }}.at(RprRigidBody_linvel(alloc, self));
    }

    public {{ realAngVec }} getAngularVelocity(SegmentAllocator alloc) {
        return {{ realAngVec }}.at(RprRigidBody_angvel(alloc, self));
    }

    public void setLinearVelocity({{ realVec }} linvel, boolean wakeUp) {
        RprRigidBody_set_linvel(self, linvel.memory(), wakeUp);
    }

    public void setAngularVelocity({{ realAngVec }} angvel, boolean wakeUp) {
        RprRigidBody_set_angvel(self, angvel.memory(), wakeUp);
    }

    public Iso getPosition(SegmentAllocator alloc) {
        Iso.at(RprRigidBody_position(alloc, self));
    }

    public {{ realVec }} getTranslation(SegmentAllocator alloc) {
        return {{ realVec }}.at(RprRigidBody_translation(alloc, self));
    }

    public void setTranslation({{ realVec }} translation, boolean wakeUp) {
        RprRigidBody_set_translation(self, translation.memory(), wakeUp);
    }

    public {{ realRot }} getRotation(SegmentAllocator alloc) {
        return {{ realRot }}.at(RprRigidBody_rotation(alloc, self));
    }

    public void setRotation({{ realRot }} rotation, boolean wakeUp) {
        RprRigidBody_set_rotation(self, rotation.memory(), wakeUp);
    }

    public void setPosition(Iso pos, boolean wakeUp) {
        RprRigidBody_set_position(self, pos.memory(), wakeUp);
    }

    public void setNextKinematicRotation({{ realRot }} rotation) {
        RprRigidBody_set_next_kinematic_rotation(self, rotation.memory());
    }

    public void setNextKinematicTranslation({{ realVec }} translation) {
        RprRigidBody_set_next_kinematic_translation(self, translation.memory());
    }

    public void setNextKinematicPosition(Iso pos) {
        RprRigidBody_set_next_kinematic_position(self, pos.memory());
    }
}
