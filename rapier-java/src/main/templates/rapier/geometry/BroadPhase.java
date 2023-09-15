
package rapier.geometry;

import rapier.*;

import java.lang.foreign.MemorySegment;

public final class BroadPhase extends RefNative implements Droppable {
    private final DropFlag dropped = new DropFlag();

    @Override
    public void drop() {
        dropped.drop(() -> rapier.sys.RapierC.RprBroadPhase_drop(self));
    }

    private BroadPhase(MemorySegment memory) {
        super(memory);
    }

    public static BroadPhase at(MemorySegment memory) {
        return new BroadPhase(memory);
    }

    public static BroadPhase create() {
        return at(rapier.sys.RapierC.RprBroadPhase_new());
    }
}
