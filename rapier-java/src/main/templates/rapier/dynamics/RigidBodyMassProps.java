package rapier.dynamics;

import rapier.RefNative;
import rapier.math.AngularInertia;
import rapier.math.Vector;

import javax.annotation.Nullable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;

import static rapier.sys.RapierC.*;

public final class RigidBodyMassProps extends RefNative {
    private RigidBodyMassProps(MemoryAddress memory) {
        super(memory);
    }

    public static RigidBodyMassProps at(MemoryAddress memory) {
        return new RigidBodyMassProps(memory);
    }

    public byte getFlags() {
        return RprRigidBodyMassProps_flags(self);
    }

    public MassProperties getLocalMProps() {
        try (var arena = MemorySession.openConfined()) {
            return MassProperties.from({{ sys }}.RapierC.RprRigidBodyMassProps_local_mprops(arena, self));
        }
    }

    public @Nullable RigidBodyAdditionalMassProps getAdditionalLocalMProps() {
        try (var arena = MemorySession.openConfined()) {
            var res = RigidBodyAdditionalMassProps.allocate(arena);
            if ({{ sys }}.RapierC.RprRigidBodyMassProps_additional_local_mprops(self, res)) {
                return RigidBodyAdditionalMassProps.from(res);
            }
            return null;
        }
    }

    public Vector getWorldCom() {
        try (var arena = MemorySession.openConfined()) {
            return Vector.from({{ sys }}.RapierC.RprRigidBodyMassProps_world_com(arena, self));
        }
    }

    public Vector getEffectiveInvMass() {
        try (var arena = MemorySession.openConfined()) {
            return Vector.from({{ sys }}.RapierC.RprRigidBodyMassProps_effective_inv_mass(arena, self));
        }
    }

    public AngularInertia getEffectiveWorldInvInertiaSqrt() {
        try (var arena = MemorySession.openConfined()) {
            return AngularInertia.from({{ sys }}.RapierC.RprRigidBodyMassProps_effective_world_inv_inertia_sqrt(arena, self));
        }
    }

    public {{ real }} getMass() {
        return {{ sys }}.RapierC.RprRigidBodyMassProps_mass(self);
    }

    public Vector getEffectiveMass() {
        try (var arena = MemorySession.openConfined()) {
            return Vector.from({{ sys }}.RapierC.RprRigidBodyMassProps_effective_mass(arena, self));
        }
    }

    public AngularInertia getEffectiveAngularInertia() {
        try (var arena = MemorySession.openConfined()) {
            return AngularInertia.from({{ sys }}.RapierC.RprRigidBodyMassProps_effective_angular_inertia(arena, self));
        }
    }
}
