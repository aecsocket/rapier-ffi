package rapier.geometry;

import rapier.DropFlag;
import rapier.Droppable;
import rapier.RefNative;

import java.lang.foreign.MemoryAddress;

public final class NarrowPhase extends RefNative implements Droppable {
    private final DropFlag dropped = new DropFlag();

    @Override
    public void drop() {
        dropped.drop(() -> rapier.sys.RapierC.RprNarrowPhase_drop(self));
    }

    private NarrowPhase(MemoryAddress memory) {
        super(memory);
    }

    public static NarrowPhase at(MemoryAddress memory) {
        return new NarrowPhase(memory);
    }

    public static NarrowPhase create() {
        return at(rapier.sys.RapierC.RprNarrowPhase_new());
    }
}
