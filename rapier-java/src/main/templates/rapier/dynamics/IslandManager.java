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

    public long[] getActiveKinematicBodies() {
        try (var arena = MemorySession.openConfined()) {
            var nDataPtr = arena.allocate(C_POINTER);
            var nLen = arena.allocate(C_LONG);
            RprIslandManager_active_kinematic_bodies(self, nDataPtr, nLen);

            var dataPtr = nDataPtr.get(C_POINTER, 0);
            // truncate long to int because our array is indexed by int
            var len = (int) nLen.get(C_LONG, 0);

            var res = new long[len];
            for (int i = 0; i < len; i++) {
                res[i] = ArenaKey.pack(dataPtr, i);
            }
            return res;
        }
    }

    public long[] getActiveDynamicBodies() {
        try (var arena = MemorySession.openConfined()) {
            var nDataPtr = arena.allocate(C_POINTER);
            var nLen = arena.allocate(C_LONG);
            RprIslandManager_active_dynamic_bodies(self, nDataPtr, nLen);

            var dataPtr = nDataPtr.get(C_POINTER, 0);
            // truncate long to int because our array is indexed by int
            var len = (int) nLen.get(C_LONG, 0);

            var res = new long[len];
            for (int i = 0; i < len; i++) {
                res[i] = ArenaKey.pack(dataPtr, i);
            }
            return res;
        }
    }
}
