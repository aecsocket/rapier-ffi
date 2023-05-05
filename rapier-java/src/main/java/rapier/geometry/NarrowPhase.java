package rapier.geometry;

import rapier.DroppableNative;

import java.lang.foreign.MemorySegment;

import static rapier.headers.RapierC.*;

public final class NarrowPhase extends DroppableNative {
    protected NarrowPhase(MemorySegment memory) {
        super(memory);
    }

    public static NarrowPhase at(MemorySegment memory) {
        return new NarrowPhase(memory);
    }

    public static NarrowPhase create() {
        return at(RprNarrowPhase_new());
    }

    @Override
    protected void dropInternal() {
        RprNarrowPhase_drop(self);
    }
}
