package rapier.dynamics;

import rapier.DroppableNative;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.Arena;

import static rapier.sys.RapierC.*;

public final class RigidBodySet extends DroppableNative {
    protected RigidBodySet(MemorySegment memory) {
        super(memory);
    }

    public static RigidBodySet at(MemorySegment memory) {
        return new RigidBodySet(memory);
    }

    public static RigidBodySet create() {
        return at(RprRigidBodySet_new());
    }

    @Override
    protected void dropInternal() {
        RprRigidBodySet_drop(self);
    }

    public long insert(RigidBody rb) {
        try (var arena = Arena.openConfined()) {
            return RigidBodyHandle.pack(RprRigidBodySet_insert(arena, self, rb.memory()));
        }
    }

    public RigidBody get(long index) {
        try (var arena = Arena.openConfined()) {
            return RigidBody.at(RprRigidBodySet_index(self, RigidBodyHandle.unpack(arena, index)));
        }
    }
}
