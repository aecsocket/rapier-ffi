package rapier.geometry;

import rapier.DroppableNative;
import rapier.dynamics.RigidBodyHandle;
import rapier.dynamics.RigidBodySet;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

import static rapier.sys.RapierC.*;

public final class ColliderSet extends DroppableNative {
    protected ColliderSet(MemorySegment memory) {
        super(memory);
    }

    public static ColliderSet at(MemorySegment memory) {
        return new ColliderSet(memory);
    }

    public static ColliderSet create() {
        return at(RprColliderSet_new());
    }

    @Override
    protected void dropInternal() {
        RprColliderSet_drop(self);
    }

    public long insert(Collider coll) {
        try (var arena = Arena.openConfined()) {
            return ColliderHandle.pack(RprColliderSet_insert(arena, self, coll.memory()));
        }
    }

    public long insertWithParent(Collider coll, long parentHandle, RigidBodySet bodies) {
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

    public Collider get(long index) {
        try (var arena = Arena.openConfined()) {
            return Collider.at(RprColliderSet_index(self, ColliderHandle.unpack(arena, index)));
        }
    }
}
