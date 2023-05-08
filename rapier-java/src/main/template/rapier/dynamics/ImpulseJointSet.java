package rapier.dynamics;

import rapier.DroppableNative;

import java.lang.foreign.MemorySegment;

import static rapier.sys.RapierC.*;

public final class ImpulseJointSet extends DroppableNative {
    protected ImpulseJointSet(MemorySegment memory) {
        super(memory);
    }

    public static ImpulseJointSet at(MemorySegment memory) {
        return new ImpulseJointSet(memory);
    }

    public static ImpulseJointSet create() {
        return at(RprImpulseJointSet_new());
    }

    @Override
    protected void dropInternal() {
        RprImpulseJointSet_drop(self);
    }
}
