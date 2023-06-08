package rapier.dynamics.joint.multibody;

import rapier.DropFlag;
import rapier.Droppable;
import rapier.RefNative;
import rapier.data.ArenaKey;
import rapier.dynamics.joint.GenericJoint;

import javax.annotation.Nullable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;

import static rapier.sys.RapierC.*;

public final class MultibodyJointSet extends RefNative implements Droppable {
    private final DropFlag dropped = new DropFlag();

    @Override
    public void drop() {
        dropped.drop(() -> RprMultibodyJointSet_drop(self));
    }

    private MultibodyJointSet(MemoryAddress memory) {
        super(memory);
    }

    public static MultibodyJointSet at(MemoryAddress memory) {
        return new MultibodyJointSet(memory);
    }

    public static MultibodyJointSet create() {
        return at(RprMultibodyJointSet_new());
    }

    public @Nullable Long insert(long body1, long body2, GenericJoint.Mut data, boolean wakeUp) {
        try (var arena = MemorySession.openConfined()) {
            var res = arena.allocate(C_LONG, 0);
            if (RprMultibodyJointSet_insert(self, ArenaKey.unpack(arena, body1), ArenaKey.unpack(arena, body2), data.memory(), wakeUp, res))
                return res.get(C_LONG, 0);
            return null;
        }
    }

    public void remove(long handle, boolean wakeUp) {
        try (var arena = MemorySession.openConfined()) {
            RprMultibodyJointSet_remove(self, ArenaKey.unpack(arena, handle), wakeUp);
        }
    }

    public void removeMultibodyArticulations(long handle, boolean wakeUp) {
        try (var arena = MemorySession.openConfined()) {
            RprMultibodyJointSet_remove_multibody_articulations(self, ArenaKey.unpack(arena, handle), wakeUp);
        }
    }

    public void removeJointsAttachedToRigidBody(long rbToRemove) {
        try (var arena = MemorySession.openConfined()) {
            RprMultibodyJointSet_remove_joints_attached_to_rigid_body(self, ArenaKey.unpack(arena, rbToRemove));
        }
    }
}
