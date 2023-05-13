package rapier.geometry;

import rapier.BaseNative;
import rapier.DropFlag;
import rapier.Droppable;
import rapier.dynamics.IslandManager;
import rapier.dynamics.RigidBodyHandle;
import rapier.dynamics.RigidBodySet;

import javax.annotation.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

import static rapier.sys.RapierC.*;

public final class ColliderSet extends BaseNative implements Droppable {
    private final DropFlag dropped = new DropFlag();

    @Override
    public void drop() {
        dropped.drop(() -> RprColliderSet_drop(self));
    }

    protected ColliderSet(MemorySegment memory) {
        super(memory);
    }

    public static ColliderSet at(MemorySegment memory) {
        return new ColliderSet(memory);
    }

    public static ColliderSet create() {
        return at(RprColliderSet_new());
    }

    public long size() {
        return RprColliderSet_len(self);
    }

    public boolean isEmpty() {
        return RprColliderSet_is_empty(self);
    }

    public long insert(Collider.Mut coll) {
        try (var arena = Arena.openConfined()) {
            return ColliderHandle.pack(RprColliderSet_insert(arena, self, coll.memory()));
        }
    }

    public long insertWithParent(Collider.Mut coll, long parentHandle, RigidBodySet bodies) {
        try (var arena = Arena.openConfined()) {
            return ColliderHandle.pack(RprColliderSet_insert_with_parent(
                    arena,
                    self,
                    coll.memory(),
                    RigidBodyHandle.unpack(arena, parentHandle),
                    bodies.memory()
            ));
        }
    }

    public void setParent(long handle, @Nullable Long newParentHandle, RigidBodySet bodies) {
        try (var arena = Arena.openConfined()) {
            RprColliderSet_set_parent(
                    self,
                    ColliderHandle.unpack(arena, handle),
                    newParentHandle == null ? RprRigidBodyHandle_invalid(arena) : RigidBodyHandle.unpack(arena, newParentHandle),
                    bodies.memory()
            );
        }
    }

    public @Nullable Collider.Mut remove(
            long handle,
            IslandManager islands,
            RigidBodySet bodies,
            boolean wakeUp
    ) {
        try (var arena = Arena.openConfined()) {
            var res = RprColliderSet_remove(
                    self,
                    ColliderHandle.unpack(arena, handle),
                    islands.memory(),
                    bodies.memory(),
                    wakeUp
            );
            return res.address() == 0 ? null : Collider.atMut(res);
        }
    }

    public Collider index(long index) {
        try (var arena = Arena.openConfined()) {
            return Collider.at(RprColliderSet_index(self, ColliderHandle.unpack(arena, index)));
        }
    }

    public Collider.Mut indexMut(long index) {
        try (var arena = Arena.openConfined()) {
            return Collider.atMut(RprColliderSet_index_mut(self, ColliderHandle.unpack(arena, index)));
        }
    }
}
