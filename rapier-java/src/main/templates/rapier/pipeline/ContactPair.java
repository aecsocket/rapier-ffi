package rapier.pipeline;

import rapier.Native;
import rapier.RefNative;
import rapier.data.ArenaKey;

import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.foreign.ValueLayout;

public final class ContactPair extends RefNative {
    private ContactPair(MemoryAddress memory) {
        super(memory);
    }

    public static ContactPair at(MemoryAddress memory) {
        return new ContactPair(memory);
    }

    public ArenaKey getCollider1() {
        try (var arena = MemorySession.openConfined()) {
            return ArenaKey.from(rapier.sys.RapierC.RprContactPair_collider1(arena, self));
        }
    }

    public ArenaKey getCollider2() {
        try (var arena = MemorySession.openConfined()) {
            return ArenaKey.from(rapier.sys.RapierC.RprContactPair_collider2(arena, self));
        }
    }

    public ContactManifold[] getManifolds() {
        try (var arena = MemorySession.openConfined()) {
            var data = arena.allocate(ValueLayout.ADDRESS);
            var len = arena.allocate(ValueLayout.JAVA_LONG);
            rapier.sys.RapierC.RprContactPair_manifolds(self, data, len);
            return Native.fromPtrSlice(
                    data.get(ValueLayout.ADDRESS, 0),
                    (int) len.get(ValueLayout.JAVA_LONG, 0),
                    ContactManifold[]::new,
                    ContactManifold::at
            );
        }
    }

    public boolean hasAnyActiveContact() {
        return rapier.sys.RapierC.RprContactPair_has_any_active_contact(self);
    }
}
