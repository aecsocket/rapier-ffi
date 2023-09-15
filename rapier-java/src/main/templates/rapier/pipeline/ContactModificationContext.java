package rapier.pipeline;

import rapier.Native;
import rapier.RefNative;
import rapier.data.ArenaKey;
import rapier.dynamics.RigidBodySet;
import rapier.geometry.ColliderSet;
import rapier.math.Vector;

import javax.annotation.Nullable;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.Arena;
import java.lang.foreign.ValueLayout;

public final class ContactModificationContext extends RefNative {
    private ContactModificationContext(MemorySegment memory) {
        super(memory);
    }

    public static ContactModificationContext at(MemorySegment memory) {
        return new ContactModificationContext(memory);
    }

    public RigidBodySet getBodies() {
        return RigidBodySet.at(rapier.sys.RapierC.RprContactModificationContext_bodies(self));
    }

    public ColliderSet getColliders() {
        return ColliderSet.at(rapier.sys.RapierC.RprContactModificationContext_colliders(self));
    }

    public ArenaKey getCollider1() {
        try (var arena = Arena.openConfined()) {
            return ArenaKey.from(rapier.sys.RapierC.RprContactModificationContext_collider1(arena, self));
        }
    }

    public ArenaKey getCollider2() {
        try (var arena = Arena.openConfined()) {
            return ArenaKey.from(rapier.sys.RapierC.RprContactModificationContext_collider2(arena, self));
        }
    }

    public @Nullable ArenaKey getRigidBody1() {
        try (var arena = Arena.openConfined()) {
            var res = ArenaKey.alloc(arena);
            if (rapier.sys.RapierC.RprContactModificationContext_rigid_body1(self, res))
                return ArenaKey.from(res);
            return null;
        }
    }

    public @Nullable ArenaKey getRigidBody2() {
        try (var arena = Arena.openConfined()) {
            var res = ArenaKey.alloc(arena);
            if (rapier.sys.RapierC.RprContactModificationContext_rigid_body2(self, res))
                return ArenaKey.from(res);
            return null;
        }
    }

    public ContactManifold getManifold() {
        return ContactManifold.at(rapier.sys.RapierC.RprContactModificationContext_manifold(self));
    }

    public SolverContact[] getSolverContacts() {
        try (var arena = Arena.openConfined()) {
            var data = arena.allocate(ValueLayout.ADDRESS);
            var len = arena.allocate(ValueLayout.JAVA_LONG);
            rapier.sys.RapierC.RprContactModificationContext_solver_contacts(self, data, len);
            return Native.fromPtrSlice(
                    data.get(ValueLayout.ADDRESS, 0),
                    (int) len.get(ValueLayout.JAVA_LONG, 0),
                    SolverContact[]::new,
                    SolverContact::at
            );
        }
    }

    public Vector getNormal() {
        try (var arena = Arena.openConfined()) {
            return Vector.from(rapier.sys.RapierC.RprContactModificationContext_normal(arena, self));
        }
    }

    public void setNormal(Vector value) {
        try (var arena = Arena.openConfined()) {
            rapier.sys.RapierC.RprContactModificationContext_set_normal(self, value.allocInto(arena));
        }
    }

    public int getUserData() {
        return rapier.sys.RapierC.RprContactModificationContext_user_data(self);
    }

    public void setUserData(int value) {
        rapier.sys.RapierC.RprContactModificationContext_set_user_data(self, value);
    }
}
