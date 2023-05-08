package rapier.dynamics;

import rapier.DroppableNative;

import java.lang.foreign.MemorySegment;

import static rapier.sys.RapierC.*;

public final class MultibodyJointSet extends DroppableNative {
    protected MultibodyJointSet(MemorySegment memory) {
        super(memory);
    }

    public static MultibodyJointSet at(MemorySegment memory) {
        return new MultibodyJointSet(memory);
    }

    public static MultibodyJointSet create() {
        return at(RprMultibodyJointSet_new());
    }

    @Override
    protected void dropInternal() {
        RprMultibodyJointSet_drop(self);
    }
}
