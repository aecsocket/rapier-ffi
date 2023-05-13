package rapier.dynamics;

import rapier.DroppableNative;
import rapier.math.*;
import rapier.sys.RapierC;

import java.lang.foreign.MemorySegment;

import static rapier.sys.RapierC.*;

public final class RigidBodyBuilder extends DroppableNative {
    protected RigidBodyBuilder(MemorySegment memory) {
        super(memory);
    }

    public static RigidBodyBuilder at(MemorySegment memory) {
        return new RigidBodyBuilder(memory);
    }

    public static RigidBodyBuilder fixed() {
        return RigidBodyBuilder.at(RprRigidBodyBuilder_fixed());
    }

    public static RigidBodyBuilder kinematicVelocityBased() {
        return RigidBodyBuilder.at(RprRigidBodyBuilder_kinematic_velocity_based());
    }

    public static RigidBodyBuilder kinematicPositionBased() {
        return RigidBodyBuilder.at(RprRigidBodyBuilder_kinematic_position_based());
    }

    public static RigidBodyBuilder dynamic() {
        return RigidBodyBuilder.at(RprRigidBodyBuilder_dynamic());
    }

    @Override
    protected void dropInternal() {
        RprRigidBodyBuilder_drop(self);
    }

    public RigidBody build() {
        return RigidBody.at(RprRigidBodyBuilder_build(self));
    }

    public RigidBodyBuilder gravityScale({{ real }} scale) {
        {{ sys }}.RapierC.RprRigidBodyBuilder_gravity_scale(self, scale);
        return this;
    }

    public RigidBodyBuilder dominanceGroup(byte group) {
        RprRigidBodyBuilder_dominance_group(self, group);
        return this;
    }

    public RigidBodyBuilder translation(Vector translation) {
        {{ sys }}.RapierC.RprRigidBodyBuilder_translation(self, translation.memory());
        return this;
    }

    public RigidBodyBuilder rotation(AngVector rotation) {
        {{ sys }}.RapierC.RprRigidBodyBuilder_rotation(self, rotation.memory());
        return this;
    }

    public RigidBodyBuilder position(Isometry position) {
        {{ sys }}.RapierC.RprRigidBodyBuilder_position(self, position.memory());
        return this;
    }

    public RigidBodyBuilder additionalMass({{ real }} mass) {
        {{ sys }}.RapierC.RprRigidBodyBuilder_additional_mass(self, mass);
        return this;
    }

    public RigidBodyBuilder linearDamping({{ real }} factor) {
        {{ sys }}.RapierC.RprRigidBodyBuilder_linear_damping(self, factor);
        return this;
    }

    public RigidBodyBuilder angularDamping({{ real }} factor) {
        {{ sys }}.RapierC.RprRigidBodyBuilder_angular_damping(self, factor);
        return this;
    }

    public RigidBodyBuilder linvel(Vector linvel) {
        {{ sys }}.RapierC.RprRigidBodyBuilder_linvel(self, linvel.memory());
        return this;
    }

    public RigidBodyBuilder angvel(AngVector angvel) {
        {{ sys }}.RapierC.RprRigidBodyBuilder_angvel(self, angvel.memory());
        return this;
    }

    public RigidBodyBuilder canSleep(boolean canSleep) {
        RprRigidBodyBuilder_can_sleep(self, canSleep);
        return this;
    }

    public RigidBodyBuilder ccdEnabled(boolean ccdEnabled) {
        RprRigidBodyBuilder_ccd_enabled(self, ccdEnabled);
        return this;
    }

    public RigidBodyBuilder sleeping(boolean sleeping) {
        RprRigidBodyBuilder_sleeping(self, sleeping);
        return this;
    }

    public RigidBodyBuilder enabled(boolean enabled) {
        RprRigidBodyBuilder_enabled(self, enabled);
        return this;
    }
}
