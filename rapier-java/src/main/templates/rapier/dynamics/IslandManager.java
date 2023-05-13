package rapier.dynamics;

import rapier.BaseNative;
import rapier.DropFlag;
import rapier.Droppable;

import java.lang.foreign.MemorySegment;

import static rapier.sys.RapierC.*;

public final class IslandManager extends BaseNative implements Droppable {
    private final DropFlag dropped = new DropFlag();

    @Override
    public void drop() {
        dropped.drop(() -> RprIslandManager_drop(self));
    }

    protected IslandManager(MemorySegment memory) {
        super(memory);
    }

    public static IslandManager at(MemorySegment memory) {
        return new IslandManager(memory);
    }

    public static IslandManager create() {
        return at(RprIslandManager_new());
    }
}
