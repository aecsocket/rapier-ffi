package rapier.dynamics;

import rapier.DropFlag;
import rapier.Droppable;
import rapier.RefNative;
import rapier.__real;
import rapier.math.*;

import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;

public final class RigidBodyBuilder extends RefNative implements Droppable {
    private final DropFlag dropped = new DropFlag();

    @Override
    public void drop() {
        dropped.drop(() -> rapier.sys.RapierC.RprRigidBodyBuilder_drop(self));
    }

    private RigidBodyBuilder(MemoryAddress memory) {
        super(memory);
    }

    public static RigidBodyBuilder at(MemoryAddress memory) {
        return new RigidBodyBuilder(memory);
    }

    public static RigidBodyBuilder of(RigidBodyType bodyType) {
        return RigidBodyBuilder.at(rapier.sys.RapierC.RprRigidBodyBuilder_new(bodyType.ordinal()));
    }

    public static RigidBodyBuilder fixed() {
        return RigidBodyBuilder.at(rapier.sys.RapierC.RprRigidBodyBuilder_fixed());
    }

    public static RigidBodyBuilder kinematicVelocityBased() {
        return RigidBodyBuilder.at(rapier.sys.RapierC.RprRigidBodyBuilder_kinematic_velocity_based());
    }

    public static RigidBodyBuilder kinematicPositionBased() {
        return RigidBodyBuilder.at(rapier.sys.RapierC.RprRigidBodyBuilder_kinematic_position_based());
    }

    public static RigidBodyBuilder dynamic() {
        return RigidBodyBuilder.at(rapier.sys.RapierC.RprRigidBodyBuilder_dynamic());
    }

    public RigidBody.Mut build() {
        return RigidBody.atMut(rapier.sys.RapierC.RprRigidBodyBuilder_build(self));
    }

    public RigidBodyBuilder gravityScale(__real scale) {
        rapier.sys.RapierC.RprRigidBodyBuilder_gravity_scale(self, scale);
        return this;
    }

    public RigidBodyBuilder dominanceGroup(byte group) {
        rapier.sys.RapierC.RprRigidBodyBuilder_dominance_group(self, group);
        return this;
    }

    public RigidBodyBuilder translation(Vector translation) {
        try (var arena = MemorySession.openConfined()) {
            rapier.sys.RapierC.RprRigidBodyBuilder_translation(self, translation.allocInto(arena));
        }
        return this;
    }

    public RigidBodyBuilder rotation(AngVector rotation) {
        try (var arena = MemorySession.openConfined()) {
            rapier.sys.RapierC.RprRigidBodyBuilder_rotation(self, rotation.allocInto(arena));
        }
        return this;
    }

    public RigidBodyBuilder position(Isometry position) {
        try (var arena = MemorySession.openConfined()) {
            rapier.sys.RapierC.RprRigidBodyBuilder_position(self, position.allocInto(arena));
        }
        return this;
    }

    public RigidBodyBuilder additionalMass(__real mass) {
        rapier.sys.RapierC.RprRigidBodyBuilder_additional_mass(self, mass);
        return this;
    }

    public RigidBodyBuilder linearDamping(__real factor) {
        rapier.sys.RapierC.RprRigidBodyBuilder_linear_damping(self, factor);
        return this;
    }

    public RigidBodyBuilder angularDamping(__real factor) {
        rapier.sys.RapierC.RprRigidBodyBuilder_angular_damping(self, factor);
        return this;
    }

    public RigidBodyBuilder linvel(Vector linvel) {
        try (var arena = MemorySession.openConfined()) {
            rapier.sys.RapierC.RprRigidBodyBuilder_linvel(self, linvel.allocInto(arena));
        }
        return this;
    }

    public RigidBodyBuilder angvel(AngVector angvel) {
        try (var arena = MemorySession.openConfined()) {
            rapier.sys.RapierC.RprRigidBodyBuilder_angvel(self, angvel.allocInto(arena));
        }
        return this;
    }

    public RigidBodyBuilder canSleep(boolean canSleep) {
        rapier.sys.RapierC.RprRigidBodyBuilder_can_sleep(self, canSleep);
        return this;
    }

    public RigidBodyBuilder ccdEnabled(boolean ccdEnabled) {
        rapier.sys.RapierC.RprRigidBodyBuilder_ccd_enabled(self, ccdEnabled);
        return this;
    }

    public RigidBodyBuilder sleeping(boolean sleeping) {
        rapier.sys.RapierC.RprRigidBodyBuilder_sleeping(self, sleeping);
        return this;
    }

    public RigidBodyBuilder enabled(boolean enabled) {
        rapier.sys.RapierC.RprRigidBodyBuilder_enabled(self, enabled);
        return this;
    }
}
