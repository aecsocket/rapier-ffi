package rapier.dynamics.joint.multibody;

import rapier.DropFlag;
import rapier.Droppable;
import rapier.RefNative;
import rapier.data.ArenaKey;
import rapier.dynamics.joint.GenericJoint;

import javax.annotation.Nullable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;

public final class MultibodyJointSet extends RefNative implements Droppable {
    private final DropFlag dropped = new DropFlag();

    @Override
    public void drop() {
        dropped.drop(() -> rapier.sys.RapierC.RprMultibodyJointSet_drop(self));
    }

    private MultibodyJointSet(MemoryAddress memory) {
        super(memory);
    }

    public static MultibodyJointSet at(MemoryAddress memory) {
        return new MultibodyJointSet(memory);
    }

    public static MultibodyJointSet create() {
        return at(rapier.sys.RapierC.RprMultibodyJointSet_new());
    }

    public @Nullable ArenaKey insert(ArenaKey body1, ArenaKey body2, GenericJoint.Mut data, boolean wakeUp) {
        try (var arena = MemorySession.openConfined()) {
            var res = ArenaKey.alloc(arena);
            if (rapier.sys.RapierC.RprMultibodyJointSet_insert(
                    self,
                    body1.allocInto(arena),
                    body2.allocInto(arena),
                    data.memory(),
                    wakeUp,
                    res
            )) return ArenaKey.from(res);
            return null;
        }
    }

    public void remove(ArenaKey handle, boolean wakeUp) {
        try (var arena = MemorySession.openConfined()) {
            rapier.sys.RapierC.RprMultibodyJointSet_remove(self, handle.allocInto(arena), wakeUp);
        }
    }

    public void removeMultibodyArticulations(ArenaKey handle, boolean wakeUp) {
        try (var arena = MemorySession.openConfined()) {
            rapier.sys.RapierC.RprMultibodyJointSet_remove_multibody_articulations(self, handle.allocInto(arena), wakeUp);
        }
    }

    public void removeJointsAttachedToRigidBody(ArenaKey rbToRemove) {
        try (var arena = MemorySession.openConfined()) {
            rapier.sys.RapierC.RprMultibodyJointSet_remove_joints_attached_to_rigid_body(self, rbToRemove.allocInto(arena));
        }
    }
}
