package rapier.dynamics;

import rapier.BaseNative;
import rapier.DropFlag;
import rapier.Droppable;

import java.lang.foreign.MemorySegment;

import static rapier.sys.RapierC.*;

public final class CCDSolver extends BaseNative implements Droppable {
    private final DropFlag dropped = new DropFlag();

    @Override
    public void drop() {
        dropped.drop(() -> RprCCDSolver_drop(self));
    }

    protected CCDSolver(MemorySegment memory) {
        super(memory);
    }

    public static CCDSolver at(MemorySegment memory) {
        return new CCDSolver(memory);
    }

    public static CCDSolver create() {
        return at(RprCCDSolver_new());
    }
}
