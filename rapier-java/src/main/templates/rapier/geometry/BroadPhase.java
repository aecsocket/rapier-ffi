
package rapier.geometry;

import rapier.*;

import java.lang.foreign.MemoryAddress;

import static rapier.sys.RapierC.*;

public final class BroadPhase extends RefNative implements Droppable {
    private final DropFlag dropped = new DropFlag();

    @Override
    public void drop() {
        dropped.drop(() -> RprBroadPhase_drop(self));
    }

    private BroadPhase(MemoryAddress memory) {
        super(memory);
    }

    public static BroadPhase at(MemoryAddress memory) {
        return new BroadPhase(memory);
    }

    public static BroadPhase create() {
        return at(RprBroadPhase_new());
    }
}
