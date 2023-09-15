package rapier.dynamics;

import rapier.DropFlag;
import rapier.Droppable;
import rapier.RefNative;
import rapier.data.ArenaKey;
import rapier.dynamics.joint.impulse.ImpulseJointSet;
import rapier.dynamics.joint.multibody.MultibodyJointSet;
import rapier.geometry.ColliderSet;

import javax.annotation.Nullable;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.Arena;
import java.lang.foreign.SegmentAllocator;
import java.util.ArrayList;
import java.util.List;

public final class RigidBodySet extends RefNative implements Droppable {
    public record Entry(ArenaKey handle, RigidBody value) {}

    private final DropFlag dropped = new DropFlag();

    @Override
    public void drop() {
        dropped.drop(() -> rapier.sys.RapierC.RprRigidBodySet_drop(self));
    }

    private RigidBodySet(MemorySegment memory) {
        super(memory);
    }

    public static RigidBodySet at(MemorySegment memory) {
        return new RigidBodySet(memory);
    }

    public static RigidBodySet create() {
        return at(rapier.sys.RapierC.RprRigidBodySet_new());
    }

    public long size() {
        return rapier.sys.RapierC.RprRigidBodySet_len(self);
    }

    public boolean isEmpty() {
        return rapier.sys.RapierC.RprRigidBodySet_is_empty(self);
    }

    private List<Entry> vecToList(SegmentAllocator alloc, MemorySegment vec) {
        var len = (int) rapier.sys.RapierC.RprRigidBodyVec_len(vec);
        var res = new ArrayList<Entry>(len);
        for (int i = 0; i < len; i++) {
            var handle = ArenaKey.from(rapier.sys.RapierC.RprRigidBodyVec_handle(alloc, vec, i));
            var value = RigidBody.at(rapier.sys.RapierC.RprRigidBodyVec_value(vec, i));
            res.add(new Entry(handle, value));
        }
        rapier.sys.RapierC.RprRigidBodyVec_drop(vec);
        return res;
    }

    public List<Entry> all() {
        try (var arena = Arena.openConfined()) {
            return vecToList(arena, rapier.sys.RapierC.RprRigidBodySet_all(self));
        }
    }

    public ArenaKey insert(RigidBody.Mut rb) {
        try (var arena = Arena.openConfined()) {
            return ArenaKey.from(rapier.sys.RapierC.RprRigidBodySet_insert(arena, self, rb.memory()));
        }
    }

    public @Nullable RigidBody.Mut remove(
            ArenaKey handle,
            IslandManager islands,
            ColliderSet colliders,
            ImpulseJointSet impulseJoints,
            MultibodyJointSet multibodyJoints,
            boolean removeAttachedColliders
    ) {
        try (var arena = Arena.openConfined()) {
            var res = rapier.sys.RapierC.RprRigidBodySet_remove(
                    self,
                    handle.allocInto(arena),
                    islands.memory(),
                    colliders.memory(),
                    impulseJoints.memory(),
                    multibodyJoints.memory(),
                    removeAttachedColliders
            );
            return res.equals(MemorySegment.NULL) ? null : RigidBody.atMut(res);
        }
    }

    public @Nullable RigidBody get(ArenaKey index) {
        try (var arena = Arena.openConfined()) {
            var res = rapier.sys.RapierC.RprRigidBodySet_get(self, index.allocInto(arena));
            return res.equals(MemorySegment.NULL) ? null : RigidBody.at(res);
        }
    }

    public @Nullable RigidBody.Mut getMut(ArenaKey index) {
        try (var arena = Arena.openConfined()) {
            var res = rapier.sys.RapierC.RprRigidBodySet_get_mut(self, index.allocInto(arena));
            return res.equals(MemorySegment.NULL) ? null : RigidBody.atMut(res);
        }
    }
}
