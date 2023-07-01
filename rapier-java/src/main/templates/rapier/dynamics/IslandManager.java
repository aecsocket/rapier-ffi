package rapier.dynamics;

import rapier.DropFlag;
import rapier.Droppable;
import rapier.RefNative;
import rapier.data.ArenaKey;

import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;

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

    public ArenaKey[] getActiveKinematicBodies() {
        try (var arena = MemorySession.openConfined()) {
            var data = arena.allocate(C_POINTER);
            var len = arena.allocate(C_LONG);
            RprIslandManager_active_kinematic_bodies(self, data, len);
            return ArenaKey.fromSlice(data.get(C_POINTER, 0), (int) len.get(C_LONG, 0));
        }
    }

    public ArenaKey[] getActiveDynamicBodies() {
        try (var arena = MemorySession.openConfined()) {
            var data = arena.allocate(C_POINTER);
            var len = arena.allocate(C_LONG);
            RprIslandManager_active_dynamic_bodies(self, data, len);
            return ArenaKey.fromSlice(data.get(C_POINTER, 0), (int) len.get(C_LONG, 0));
        }
    }
}
