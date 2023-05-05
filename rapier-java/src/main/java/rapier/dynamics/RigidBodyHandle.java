package rapier.dynamics;

import rapier.DroppableNative;

import java.lang.foreign.MemorySegment;

import static rapier.headers.RapierC.*;

public final class RigidBodyHandle extends DroppableNative {
    protected RigidBodyHandle(MemorySegment memory) {
        super(memory);
    }

    public static RigidBodyHandle at(MemorySegment memory) {
        return new RigidBodyHandle(memory);
    }

    @Override
    protected void dropInternal() {
        RprRigidBodyHandle_drop(self);
    }
}
