package rapier.dynamics;

import rapier.DropFlag;
import rapier.Droppable;
import rapier.RefNative;
import rapier.data.ArenaKey;
import rapier.dynamics.joint.impulse.ImpulseJointSet;
import rapier.dynamics.joint.multibody.MultibodyJointSet;
import rapier.geometry.ColliderSet;

import javax.annotation.Nullable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.foreign.SegmentAllocator;
import java.util.ArrayList;
import java.util.List;

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

    // TODO
}
