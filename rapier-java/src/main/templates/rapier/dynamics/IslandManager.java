package rapier.dynamics;

import rapier.DroppableNative;

import java.lang.foreign.MemorySegment;

import static rapier.sys.RapierC.*;

public final class IslandManager extends DroppableNative {
    protected IslandManager(MemorySegment memory) {
        super(memory);
    }

    public static IslandManager at(MemorySegment memory) {
        return new IslandManager(memory);
    }

    public static IslandManager create() {
        return at(RprIslandManager_new());
    }

    @Override
    protected void dropInternal() {
        RprIslandManager_drop(self);
    }
}
