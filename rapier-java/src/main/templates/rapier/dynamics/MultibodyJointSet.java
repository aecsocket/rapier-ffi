package rapier.dynamics;

import rapier.BaseNative;
import rapier.DropFlag;
import rapier.Droppable;

import java.lang.foreign.MemorySegment;

import static rapier.sys.RapierC.*;

public final class MultibodyJointSet extends BaseNative implements Droppable {
    private final DropFlag dropped = new DropFlag();

    @Override
    public void drop() {
        dropped.drop(() -> RprMultibodyJointSet_drop(self));
    }

    protected MultibodyJointSet(MemorySegment memory) {
        super(memory);
    }

    public static MultibodyJointSet at(MemorySegment memory) {
        return new MultibodyJointSet(memory);
    }

    public static MultibodyJointSet create() {
        return at(RprMultibodyJointSet_new());
    }
}
