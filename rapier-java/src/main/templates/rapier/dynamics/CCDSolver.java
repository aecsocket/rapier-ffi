package rapier.dynamics;

import rapier.DropFlag;
import rapier.Droppable;
import rapier.RefNative;

import java.lang.foreign.MemoryAddress;

public final class CCDSolver extends RefNative implements Droppable {
    private final DropFlag dropped = new DropFlag();

    @Override
    public void drop() {
        dropped.drop(() -> rapier.sys.RapierC.RprCCDSolver_drop(self));
    }

    private CCDSolver(MemoryAddress memory) {
        super(memory);
    }

    public static CCDSolver at(MemoryAddress memory) {
        return new CCDSolver(memory);
    }

    public static CCDSolver create() {
        return at(rapier.sys.RapierC.RprCCDSolver_new());
    }
}
