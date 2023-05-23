package rapier.dynamics;

import rapier.DropFlag;
import rapier.Droppable;
import rapier.RefNative;

import java.lang.foreign.MemoryAddress;

import static rapier.sys.RapierC.*;

public final class IslandManager extends RefNative implements Droppable {
    private final DropFlag dropped = new DropFlag();

    @Override
    public void drop() {
        dropped.drop(() -> RprIslandManager_drop(self));
    }

    private IslandManager(MemoryAddress memory) {
        super(memory);
    }

    public static IslandManager at(MemoryAddress memory) {
        return new IslandManager(memory);
    }

    public static IslandManager create() {
        return at(RprIslandManager_new());
    }
}
