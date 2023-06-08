package rapier.pipeline;

import rapier.RefNative;
import rapier.data.ArenaKey;
import rapier.dynamics.RigidBodySet;
import rapier.geometry.ColliderSet;
import rapier.math.Vector;
import rapier.sys.RapierC;

import javax.annotation.Nullable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.foreign.SegmentAllocator;

import static rapier.sys.RapierC.*;

public final class ContactModificationContext extends RefNative {
    private ContactModificationContext(MemoryAddress memory) {
        super(memory);
    }

    public static ContactModificationContext at(MemoryAddress memory) {
        return new ContactModificationContext(memory);
    }

    public RigidBodySet getBodies() {
        return RigidBodySet.at(RprContactModificationContext_bodies(self));
    }

    public ColliderSet getColliders() {
        return ColliderSet.at(RprContactModificationContext_colliders(self));
    }

    public long getCollider1() {
        try (var arena = MemorySession.openConfined()) {
            return ArenaKey.pack(RprContactModificationContext_collider1(arena, self));
        }
    }

    public long getCollider2() {
        try (var arena = MemorySession.openConfined()) {
            return ArenaKey.pack(RprContactModificationContext_collider2(arena, self));
        }
    }

    public @Nullable Long getRigidBody1() {
        try (var arena = MemorySession.openConfined()) {
            var res = arena.allocate(C_LONG, 0);
            if (RprContactModificationContext_rigid_body1(self, res))
                return res.get(C_LONG, 0);
            return null;
        }
    }

    public @Nullable Long getRigidBody2() {
        try (var arena = MemorySession.openConfined()) {
            var res = arena.allocate(C_LONG, 0);
            if (RprContactModificationContext_rigid_body2(self, res))
                return res.get(C_LONG, 0);
            return null;
        }
    }

    public ContactManifold getManifold() {
        return ContactManifold.at(RprContactModificationContext_manifold(self));
    }

    public SolverContact[] getSolverContacts() {
        try (var arena = MemorySession.openConfined()) {
            var nDataPtr = arena.allocate(C_POINTER);
            var nLen = arena.allocate(C_LONG);
            RprContactModificationContext_solver_contacts(self, nDataPtr, nLen);

            var dataPtr = nDataPtr.get(C_POINTER, 0);
            // truncate long to int because our array is indexed by int
            var len = (int) nLen.get(C_LONG, 0);

            var res = new SolverContact[len];
            for (int i = 0; i < len; i++) {
                res[i] = SolverContact.at(dataPtr.getAtIndex(C_POINTER, i));
            }
            return res;
        }
    }

    public Vector getNormal(SegmentAllocator alloc) {
        return Vector.at({{ sys }}.RapierC.RprContactModificationContext_normal(alloc, self));
    }

    public void setNormal(Vector value) {
        {{ sys }}.RapierC.RprContactModificationContext_set_normal(self, value.memory());
    }

    public int getUserData() {
        return RprContactModificationContext_user_data(self);
    }

    public void setUserData(int value) {
        RprContactModificationContext_set_user_data(self, value);
    }
}
