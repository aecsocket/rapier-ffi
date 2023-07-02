package rapier.dynamics;

import rapier.DropFlag;
import rapier.Droppable;
import rapier.RefNative;
import rapier.data.ArenaKey;

import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemorySession;
import java.lang.foreign.ValueLayout;

public final class IslandManager extends RefNative implements Droppable {
    private final DropFlag dropped = new DropFlag();

    @Override
    public void drop() {
        dropped.drop(() -> rapier.sys.RapierC.RprIslandManager_drop(self));
    }

    private IslandManager(MemoryAddress memory) {
        super(memory);
    }

    public static IslandManager at(MemoryAddress memory) {
        return new IslandManager(memory);
    }

    public static IslandManager create() {
        return at(rapier.sys.RapierC.RprIslandManager_new());
    }

    public ArenaKey[] getActiveKinematicBodies() {
        try (var arena = MemorySession.openConfined()) {
            var data = arena.allocate(ValueLayout.ADDRESS);
            var len = arena.allocate(ValueLayout.JAVA_LONG);
            rapier.sys.RapierC.RprIslandManager_active_kinematic_bodies(self, data, len);

            var ptr = data.get(ValueLayout.ADDRESS, 0);
            int iLen = (int) len.get(ValueLayout.JAVA_LONG, 0);
            return ArenaKey.fromSlice(MemorySegment.ofAddress(ptr, ArenaKey.sizeof() * iLen, arena), iLen);
        }
    }

    public ArenaKey[] getActiveDynamicBodies() {
        try (var arena = MemorySession.openConfined()) {
            var data = arena.allocate(ValueLayout.ADDRESS);
            var len = arena.allocate(ValueLayout.JAVA_LONG);
            rapier.sys.RapierC.RprIslandManager_active_dynamic_bodies(self, data, len);

            var ptr = data.get(ValueLayout.ADDRESS, 0);
            int iLen = (int) len.get(ValueLayout.JAVA_LONG, 0);
            return ArenaKey.fromSlice(MemorySegment.ofAddress(ptr, ArenaKey.sizeof() * iLen, arena), iLen);
        }
    }
}
