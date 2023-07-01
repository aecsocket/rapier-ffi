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
import java.lang.foreign.SegmentAllocator;
import java.util.ArrayList;
import java.util.List;

import static rapier.sys.RapierC.*;

public final class ColliderSet extends RefNative implements Droppable {
    public record Entry(ArenaKey handle, Collider value) {}

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

    private List<Entry> vecToList(SegmentAllocator alloc, MemoryAddress vec) {
        var len = (int) RprColliderVec_len(vec);
        var res = new ArrayList<Entry>(len);
        for (int i = 0; i < len; i++) {
            var handle = ArenaKey.from(RprColliderVec_handle(alloc, vec, i));
            var value = Collider.at(RprColliderVec_value(vec, i));
            res.add(new Entry(handle, value));
        }
        RprColliderVec_drop(vec);
        return res;
    }

    public List<Entry> all() {
        try (var arena = MemorySession.openConfined()) {
            return vecToList(arena, RprColliderSet_all(self));
        }
    }

    public List<Entry> allEnabled() {
        try (var arena = MemorySession.openConfined()) {
            return vecToList(arena, RprColliderSet_all_enabled(self));
        }
    }

    public ArenaKey insert(Collider.Mut coll) {
        try (var arena = MemorySession.openConfined()) {
            return ArenaKey.from(RprColliderSet_insert(arena, self, coll.memory()));
        }
    }

    public ArenaKey insertWithParent(Collider.Mut coll, ArenaKey parentHandle, RigidBodySet bodies) {
        try (var arena = MemorySession.openConfined()) {
            return ArenaKey.from(RprColliderSet_insert_with_parent(
                    arena,
                    self,
                    coll.memory(),
                    parentHandle.allocInto(arena),
                    bodies.memory()
            ));
        }
    }

    public void setParent(ArenaKey handle, @Nullable ArenaKey newParentHandle, RigidBodySet bodies) {
        try (var arena = MemorySession.openConfined()) {
            RprColliderSet_set_parent(
                    self,
                    handle.allocInto(arena),
                    (newParentHandle == null ? ArenaKey.INVALID : newParentHandle).allocInto(arena),
                    bodies.memory()
            );
        }
    }

    public @Nullable Collider.Mut remove(
            ArenaKey handle,
            IslandManager islands,
            RigidBodySet bodies,
            boolean wakeUp
    ) {
        try (var arena = MemorySession.openConfined()) {
            var res = RprColliderSet_remove(
                    self,
                    handle.allocInto(arena),
                    islands.memory(),
                    bodies.memory(),
                    wakeUp
            );
            return res.address().equals(MemoryAddress.NULL) ? null : Collider.atMut(res);
        }
    }

    public @Nullable Collider get(ArenaKey index) {
        try (var arena = MemorySession.openConfined()) {
            var res = RprColliderSet_get(self, index.allocInto(arena));
            return res.equals(MemoryAddress.NULL) ? null : Collider.at(res);
        }
    }

    public @Nullable Collider.Mut getMut(ArenaKey index) {
        try (var arena = MemorySession.openConfined()) {
            var res = RprColliderSet_get_mut(self, index.allocInto(arena));
            return res.equals(MemoryAddress.NULL) ? null : Collider.atMut(res);
        }
    }
}
