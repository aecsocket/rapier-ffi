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

import static rapier.sys.RapierC.*;

public final class RigidBodySet extends RefNative implements Droppable {
    private final DropFlag dropped = new DropFlag();

    @Override
    public void drop() {
        dropped.drop(() -> RprRigidBodySet_drop(self));
    }

    private RigidBodySet(MemoryAddress memory) {
        super(memory);
    }

    public static RigidBodySet at(MemoryAddress memory) {
        return new RigidBodySet(memory);
    }

    public static RigidBodySet create() {
        return at(RprRigidBodySet_new());
    }

    public long size() {
        return RprRigidBodySet_len(self);
    }

    public boolean isEmpty() {
        return RprRigidBodySet_is_empty(self);
    }

    public long insert(RigidBody.Mut rb) {
        try (var arena = MemorySession.openConfined()) {
            return ArenaKey.pack(RprRigidBodySet_insert(arena, self, rb.memory()));
        }
    }

    public @Nullable RigidBody.Mut remove(
            long handle,
            IslandManager islands,
            ColliderSet colliders,
            ImpulseJointSet impulseJoints,
            MultibodyJointSet multibodyJoints,
            boolean removeAttachedColliders
    ) {
        try (var arena = MemorySession.openConfined()) {
            var res = RprRigidBodySet_remove(
                    self,
                    ArenaKey.unpack(arena, handle),
                    islands.memory(),
                    colliders.memory(),
                    impulseJoints.memory(),
                    multibodyJoints.memory(),
                    removeAttachedColliders
            );
            return res.address().equals(MemoryAddress.NULL) ? null : RigidBody.atMut(res);
        }
    }

    public @Nullable RigidBody get(long index) {
        try (var arena = MemorySession.openConfined()) {
            var res = RprRigidBodySet_get(self, ArenaKey.unpack(arena, index));
            return res == null ? null : RigidBody.at(res);
        }
    }

    public @Nullable RigidBody.Mut getMut(long index) {
        try (var arena = MemorySession.openConfined()) {
            var res = RprRigidBodySet_get_mut(self, ArenaKey.unpack(arena, index));
            return res == null ? null : RigidBody.atMut(res);
        }
    }
}
