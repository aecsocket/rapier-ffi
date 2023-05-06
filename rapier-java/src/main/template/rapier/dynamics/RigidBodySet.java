package rapier.dynamics;

import rapier.DroppableNative;

import java.lang.foreign.MemorySegment;

import static rapier.sys.RapierC.*;

public final class RigidBodySet extends DroppableNative {
    protected RigidBodySet(MemorySegment memory) {
        super(memory);
    }

    public static RigidBodySet at(MemorySegment memory) {
        return new RigidBodySet(memory);
    }

    @Override
    protected void dropInternal() {
        RprRigidBodySet_drop(self);
    }

    public RigidBodyHandle insert(RigidBody rb) {
        return RigidBodyHandle.at(RprRigidBodySet_insert(self, rb.memory()));
    }

    public RigidBody index(RigidBodyHandle index) {
        return RigidBody.at(RprRigidBodySet_index(self, index.memory()));
    }
}
