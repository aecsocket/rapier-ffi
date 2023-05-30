package rapier.dynamics.joint.multibody;

import rapier.DropFlag;
import rapier.Droppable;
import rapier.RefNative;

import java.lang.foreign.MemoryAddress;

import static rapier.sys.RapierC.*;

public final class MultibodyJointSet extends RefNative implements Droppable {
    private final DropFlag dropped = new DropFlag();

    @Override
    public void drop() {
        dropped.drop(() -> RprMultibodyJointSet_drop(self));
    }

    private MultibodyJointSet(MemoryAddress memory) {
        super(memory);
    }

    public static MultibodyJointSet at(MemoryAddress memory) {
        return new MultibodyJointSet(memory);
    }

    public static MultibodyJointSet create() {
        return at(RprMultibodyJointSet_new());
    }
}
