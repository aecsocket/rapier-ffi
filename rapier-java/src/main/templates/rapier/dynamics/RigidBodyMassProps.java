package rapier.dynamics;

import rapier.RefNative;
import rapier.__real;
import rapier.math.AngularInertia;
import rapier.math.Vector;

import javax.annotation.Nullable;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.Arena;

public final class RigidBodyMassProps extends RefNative {
    private RigidBodyMassProps(MemorySegment memory) {
        super(memory);
    }

    public static RigidBodyMassProps at(MemorySegment memory) {
        return new RigidBodyMassProps(memory);
    }

    public byte getFlags() {
        return rapier.sys.RapierC.RprRigidBodyMassProps_flags(self);
    }

    public MassProperties getLocalMProps() {
        try (var arena = Arena.openConfined()) {
            return MassProperties.from(rapier.sys.RapierC.RprRigidBodyMassProps_local_mprops(arena, self));
        }
    }

    public @Nullable RigidBodyAdditionalMassProps getAdditionalLocalMProps() {
        try (var arena = Arena.openConfined()) {
            var res = RigidBodyAdditionalMassProps.alloc(arena);
            if (rapier.sys.RapierC.RprRigidBodyMassProps_additional_local_mprops(self, res)) {
                return RigidBodyAdditionalMassProps.from(res);
            }
            return null;
        }
    }

    public Vector getWorldCom() {
        try (var arena = Arena.openConfined()) {
            return Vector.from(rapier.sys.RapierC.RprRigidBodyMassProps_world_com(arena, self));
        }
    }

    public Vector getEffectiveInvMass() {
        try (var arena = Arena.openConfined()) {
            return Vector.from(rapier.sys.RapierC.RprRigidBodyMassProps_effective_inv_mass(arena, self));
        }
    }

    public AngularInertia getEffectiveWorldInvInertiaSqrt() {
        try (var arena = Arena.openConfined()) {
            return AngularInertia.from(rapier.sys.RapierC.RprRigidBodyMassProps_effective_world_inv_inertia_sqrt(arena, self));
        }
    }

    public __real getMass() {
        return rapier.sys.RapierC.RprRigidBodyMassProps_mass(self);
    }

    public Vector getEffectiveMass() {
        try (var arena = Arena.openConfined()) {
            return Vector.from(rapier.sys.RapierC.RprRigidBodyMassProps_effective_mass(arena, self));
        }
    }

    public AngularInertia getEffectiveAngularInertia() {
        try (var arena = Arena.openConfined()) {
            return AngularInertia.from(rapier.sys.RapierC.RprRigidBodyMassProps_effective_angular_inertia(arena, self));
        }
    }
}
