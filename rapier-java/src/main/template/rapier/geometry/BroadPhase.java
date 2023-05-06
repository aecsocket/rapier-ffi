
package rapier.geometry;

import rapier.DroppableNative;

import java.lang.foreign.MemorySegment;

import static rapier.sys.RapierC.*;

public final class BroadPhase extends DroppableNative {
    protected BroadPhase(MemorySegment memory) {
        super(memory);
    }

    public static BroadPhase at(MemorySegment memory) {
        return new BroadPhase(memory);
    }

    public static BroadPhase create() {
        return at(RprBroadPhase_new());
    }

    @Override
    protected void dropInternal() {
        RprBroadPhase_drop(self);
    }
}
