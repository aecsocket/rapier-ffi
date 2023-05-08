package rapier.dynamics;

import rapier.DroppableNative;

import java.lang.foreign.MemorySegment;

import static rapier.sys.RapierC.*;

public final class CCDSolver extends DroppableNative {
    protected CCDSolver(MemorySegment memory) {
        super(memory);
    }

    public static CCDSolver at(MemorySegment memory) {
        return new CCDSolver(memory);
    }

    public static CCDSolver create() {
        return at(RprCCDSolver_new());
    }

    @Override
    protected void dropInternal() {
        RprCCDSolver_drop(self);
    }
}
