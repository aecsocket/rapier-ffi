package rapier.geometry;

import rapier.BaseNative;
import rapier.DropFlag;
import rapier.Droppable;
import rapier.data.ArenaKey;
import rapier.dynamics.IslandManager;
import rapier.dynamics.RigidBodySet;

import javax.annotation.Nullable;
import java.lang.foreign.MemorySession;
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
        try (var arena = MemorySession.openConfined()) {
            return ArenaKey.pack(RprColliderSet_insert(arena, self, coll.memory()));
        }
    }

    public long insertWithParent(Collider.Mut coll, long parentHandle, RigidBodySet bodies) {
        try (var arena = MemorySession.openConfined()) {
            return ArenaKey.pack(RprColliderSet_insert_with_parent(
                    arena,
                    self,
                    coll.memory(),
                    ArenaKey.unpack(arena, parentHandle),
                    bodies.memory()
            ));
        }
    }

    public void setParent(long handle, @Nullable Long newParentHandle, RigidBodySet bodies) {
        try (var arena = MemorySession.openConfined()) {
            RprColliderSet_set_parent(
                    self,
                    ArenaKey.unpack(arena, handle),
                    ArenaKey.unpack(arena, newParentHandle == null ? ArenaKey.INVALID_KEY : newParentHandle),
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
        try (var arena = MemorySession.openConfined()) {
            var res = RprColliderSet_remove(
                    self,
                    ArenaKey.unpack(arena, handle),
                    islands.memory(),
                    bodies.memory(),
                    wakeUp
            );
            return res.address() == 0 ? null : Collider.atMut(res);
        }
    }

    public Collider index(long index) {
        try (var arena = MemorySession.openConfined()) {
            return Collider.at(RprColliderSet_index(self, ArenaKey.unpack(arena, index)));
        }
    }

    public Collider.Mut indexMut(long index) {
        try (var arena = MemorySession.openConfined()) {
            return Collider.atMut(RprColliderSet_index_mut(self, ArenaKey.unpack(arena, index)));
        }
    }
}
