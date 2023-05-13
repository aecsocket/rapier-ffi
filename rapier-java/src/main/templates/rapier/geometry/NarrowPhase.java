package rapier.geometry;

import rapier.BaseNative;
import rapier.DropFlag;
import rapier.Droppable;

import java.lang.foreign.MemorySegment;

import static rapier.sys.RapierC.*;

public final class NarrowPhase extends BaseNative implements Droppable {
    private final DropFlag dropped = new DropFlag();

    @Override
    public void drop() {
        dropped.drop(() -> RprNarrowPhase_drop(self));
    }

    protected NarrowPhase(MemorySegment memory) {
        super(memory);
    }

    public static NarrowPhase at(MemorySegment memory) {
        return new NarrowPhase(memory);
    }

    public static NarrowPhase create() {
        return at(RprNarrowPhase_new());
    }
}
