package rapier.geometry;

import rapier.DropFlag;
import rapier.Droppable;
import rapier.RefNative;
import rapier.data.ArenaKey;
import rapier.dynamics.IslandManager;
import rapier.dynamics.RigidBodySet;

import javax.annotation.Nullable;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.Arena;
import java.lang.foreign.SegmentAllocator;
import java.util.ArrayList;
import java.util.List;

public final class ColliderSet extends RefNative implements Droppable {
    public record Entry(ArenaKey handle, Collider value) {}

    private final DropFlag dropped = new DropFlag();

    @Override
    public void drop() {
        dropped.drop(() -> rapier.sys.RapierC.RprColliderSet_drop(self));
    }

    private ColliderSet(MemorySegment memory) {
        super(memory);
    }

    public static ColliderSet at(MemorySegment memory) {
        return new ColliderSet(memory);
    }

    public static ColliderSet create() {
        return at(rapier.sys.RapierC.RprColliderSet_new());
    }

    public long size() {
        return rapier.sys.RapierC.RprColliderSet_len(self);
    }

    public boolean isEmpty() {
        return rapier.sys.RapierC.RprColliderSet_is_empty(self);
    }

    private List<Entry> vecToList(SegmentAllocator alloc, MemorySegment vec) {
        var len = (int) rapier.sys.RapierC.RprColliderVec_len(vec);
        var res = new ArrayList<Entry>(len);
        for (int i = 0; i < len; i++) {
            var handle = ArenaKey.from(rapier.sys.RapierC.RprColliderVec_handle(alloc, vec, i));
            var value = Collider.at(rapier.sys.RapierC.RprColliderVec_value(vec, i));
            res.add(new Entry(handle, value));
        }
        rapier.sys.RapierC.RprColliderVec_drop(vec);
        return res;
    }

    public List<Entry> all() {
        try (var arena = Arena.openConfined()) {
            return vecToList(arena, rapier.sys.RapierC.RprColliderSet_all(self));
        }
    }

    public List<Entry> allEnabled() {
        try (var arena = Arena.openConfined()) {
            return vecToList(arena, rapier.sys.RapierC.RprColliderSet_all_enabled(self));
        }
    }

    public ArenaKey insert(Collider.Mut coll) {
        try (var arena = Arena.openConfined()) {
            return ArenaKey.from(rapier.sys.RapierC.RprColliderSet_insert(arena, self, coll.memory()));
        }
    }

    public ArenaKey insertWithParent(Collider.Mut coll, ArenaKey parentHandle, RigidBodySet bodies) {
        try (var arena = Arena.openConfined()) {
            return ArenaKey.from(rapier.sys.RapierC.RprColliderSet_insert_with_parent(
                    arena,
                    self,
                    coll.memory(),
                    parentHandle.allocInto(arena),
                    bodies.memory()
            ));
        }
    }

    public void setParent(ArenaKey handle, @Nullable ArenaKey newParentHandle, RigidBodySet bodies) {
        try (var arena = Arena.openConfined()) {
            rapier.sys.RapierC.RprColliderSet_set_parent(
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
        try (var arena = Arena.openConfined()) {
            var res = rapier.sys.RapierC.RprColliderSet_remove(
                    self,
                    handle.allocInto(arena),
                    islands.memory(),
                    bodies.memory(),
                    wakeUp
            );
            return res.equals(MemorySegment.NULL) ? null : Collider.atMut(res);
        }
    }

    public @Nullable Collider get(ArenaKey index) {
        try (var arena = Arena.openConfined()) {
            var res = rapier.sys.RapierC.RprColliderSet_get(self, index.allocInto(arena));
            return res.equals(MemorySegment.NULL) ? null : Collider.at(res);
        }
    }

    public @Nullable Collider.Mut getMut(ArenaKey index) {
        try (var arena = Arena.openConfined()) {
            var res = rapier.sys.RapierC.RprColliderSet_get_mut(self, index.allocInto(arena));
            return res.equals(MemorySegment.NULL) ? null : Collider.atMut(res);
        }
    }
}
