package rapier.dynamics;

import rapier.BaseNative;
import rapier.DropFlag;
import rapier.Droppable;
import rapier.data.ArenaKey;
import rapier.geometry.ColliderSet;

import javax.annotation.Nullable;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.Arena;

import static rapier.sys.RapierC.*;

public final class RigidBodySet extends BaseNative implements Droppable {
    private final DropFlag dropped = new DropFlag();

    @Override
    public void drop() {
        dropped.drop(() -> RprRigidBodySet_drop(self));
    }

    protected RigidBodySet(MemorySegment memory) {
        super(memory);
    }

    public static RigidBodySet at(MemorySegment memory) {
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
        try (var arena = Arena.openConfined()) {
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
        try (var arena = Arena.openConfined()) {
            var res = RprRigidBodySet_remove(
                    self,
                    ArenaKey.unpack(arena, handle),
                    islands.memory(),
                    colliders.memory(),
                    impulseJoints.memory(),
                    multibodyJoints.memory(),
                    removeAttachedColliders
            );
            return res.address() == 0 ? null : RigidBody.atMut(res);
        }
    }

    public RigidBody index(long index) {
        try (var arena = Arena.openConfined()) {
            return RigidBody.at(RprRigidBodySet_index(self, ArenaKey.unpack(arena, index)));
        }
    }

    public RigidBody.Mut indexMut(long index) {
        try (var arena = Arena.openConfined()) {
            return RigidBody.atMut(RprRigidBodySet_index_mut(self, ArenaKey.unpack(arena, index)));
        }
    }
}
