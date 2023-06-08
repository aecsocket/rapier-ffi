package rapier.pipeline;

import rapier.RefNative;
import rapier.data.ArenaKey;
import rapier.math.Vector;
import rapier.sys.RapierC;

import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.foreign.SegmentAllocator;

import static rapier.sys.RapierC.*;

public final class ContactPair extends RefNative {
    private ContactPair(MemoryAddress memory) {
        super(memory);
    }

    public static ContactPair at(MemoryAddress memory) {
        return new ContactPair(memory);
    }

    public long getCollider1() {
        try (var arena = MemorySession.openConfined()) {
            return ArenaKey.pack(RprContactPair_collider1(arena, self));
        }
    }

    public long getCollider2() {
        try (var arena = MemorySession.openConfined()) {
            return ArenaKey.pack(RprContactPair_collider2(arena, self));
        }
    }

    public ContactManifold[] getManifolds() {
        try (var arena = MemorySession.openConfined()) {
            var nDataPtr = arena.allocate(C_POINTER);
            var nLen = arena.allocate(C_LONG);
            RprContactPair_manifolds(self, nDataPtr, nLen);

            var dataPtr = nDataPtr.get(C_POINTER, 0);
            // truncate long to int because our array is indexed by int
            var len = (int) nLen.get(C_LONG, 0);

            var res = new ContactManifold[len];
            for (int i = 0; i < len; i++) {
                res[i] = ContactManifold.at(dataPtr.getAtIndex(C_POINTER, i));
            }
            return res;
        }
    }

    public boolean hasAnyActiveContact() {
        return RprContactPair_has_any_active_contact(self);
    }
}
