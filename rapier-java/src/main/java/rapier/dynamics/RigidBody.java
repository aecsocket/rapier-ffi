package rapier.dynamics;

import rapier.DroppableNative;

import java.lang.foreign.MemorySegment;

import static rapier.headers.RapierC.*;

public final class RigidBody extends DroppableNative {
    protected RigidBody(MemorySegment memory) {
        super(memory);
    }

    public static RigidBody at(MemorySegment memory) {
        return new RigidBody(memory);
    }

    @Override
    protected void dropInternal() {
        RprRigidBody_drop(self);
    }
}
