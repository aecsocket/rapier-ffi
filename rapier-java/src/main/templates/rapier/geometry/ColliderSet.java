package rapier.geometry;

import rapier.DropFlag;
import rapier.Droppable;
import rapier.RefNative;
import rapier.data.ArenaKey;
import rapier.dynamics.IslandManager;
import rapier.dynamics.RigidBodySet;

import javax.annotation.Nullable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;

import static rapier.sys.RapierC.*;

public final class ColliderSet extends RefNative implements Droppable {
    private final DropFlag dropped = new DropFlag();

    @Override
    public void drop() {
        dropped.drop(() -> RprColliderSet_drop(self));
    }

    private ColliderSet(MemoryAddress memory) {
        super(memory);
    }

    public static ColliderSet at(MemoryAddress memory) {
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
            return res.address().equals(MemoryAddress.NULL) ? null : Collider.atMut(res);
        }
    }

    public @Nullable Collider get(long index) {
        try (var arena = MemorySession.openConfined()) {
            var res = RprColliderSet_get(self, ArenaKey.unpack(arena, index));
            return res == null ? null : Collider.at(res);
        }
    }

    public @Nullable Collider.Mut getMut(long index) {
        try (var arena = MemorySession.openConfined()) {
            var res = RprColliderSet_get_mut(self, ArenaKey.unpack(arena, index));
            return res == null ? null : Collider.atMut(res);
        }
    }
}
