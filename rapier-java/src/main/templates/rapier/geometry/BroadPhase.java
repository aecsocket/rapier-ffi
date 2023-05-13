
package rapier.geometry;

import rapier.BaseNative;
import rapier.DropFlag;
import rapier.Droppable;
import rapier.Native;

import java.lang.foreign.MemorySegment;

import static rapier.sys.RapierC.*;

public final class BroadPhase extends BaseNative implements Droppable {
    private final DropFlag dropped = new DropFlag();

    @Override
    public void drop() {
        dropped.drop(() -> RprBroadPhase_drop(self));
    }

    protected BroadPhase(MemorySegment memory) {
        super(memory);
    }

    public static BroadPhase at(MemorySegment memory) {
        return new BroadPhase(memory);
    }

    public static BroadPhase create() {
        return at(RprBroadPhase_new());
    }
}
