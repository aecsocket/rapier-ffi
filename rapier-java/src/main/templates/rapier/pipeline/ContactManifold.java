package rapier.pipeline;

import rapier.Native;
import rapier.RefNative;
import rapier.data.ArenaKey;
import rapier.math.Isometry;
import rapier.math.Vector;

import javax.annotation.Nullable;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.Arena;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

public final class ContactManifold extends RefNative {
    private ContactManifold(MemorySegment memory) {
        super(memory);
    }

    public static ContactManifold at(MemorySegment memory) {
        return new ContactManifold(memory);
    }

    public ContactData[] getPoints() {
        try (var arena = Arena.openConfined()) {
            var data = arena.allocate(ValueLayout.ADDRESS);
            var len = arena.allocate(ValueLayout.JAVA_LONG);
            rapier.sys.RapierC.RprContactManifold_points(self, data, len);
            return Native.fromPtrSlice(
                    data.get(ValueLayout.ADDRESS, 0),
                    (int) len.get(ValueLayout.JAVA_LONG, 0),
                    ContactData[]::new,
                    ContactData::at
            );
        }
    }

    public Vector getLocalN1() {
        try (var arena = Arena.openConfined()) {
            return Vector.from(rapier.sys.RapierC.RprContactManifold_local_n1(arena, self));
        }
    }

    public Vector getLocalN2(SegmentAllocator alloc) {
        try (var arena = Arena.openConfined()) {
            return Vector.from(rapier.sys.RapierC.RprContactManifold_local_n2(arena, self));
        }
    }

    public int getSubshape1() {
        return rapier.sys.RapierC.RprContactManifold_subshape1(self);
    }

    public int getSubshape2() {
        return rapier.sys.RapierC.RprContactManifold_subshape2(self);
    }

    public @Nullable Isometry getSubshapePos1() {
        try (var arena = Arena.openConfined()) {
            var res = Isometry.alloc(arena);
            if (rapier.sys.RapierC.RprContactManifold_subshape_pos1(self, res))
                return Isometry.from(res);
            return null;
        }
    }

    public @Nullable Isometry getSubshapePos2() {
        try (var arena = Arena.openConfined()) {
            var res = Isometry.alloc(arena);
            if (rapier.sys.RapierC.RprContactManifold_subshape_pos2(self, res))
                return Isometry.from(res);
            return null;
        }
    }

    public @Nullable ArenaKey getRigidBody1() {
        try (var arena = Arena.openConfined()) {
            var res = ArenaKey.alloc(arena);
            if (rapier.sys.RapierC.RprContactManifold_rigid_body1(self, res))
                return ArenaKey.from(res);
            return null;
        }
    }

    public @Nullable ArenaKey getRigidBody2() {
        try (var arena = Arena.openConfined()) {
            var res = ArenaKey.alloc(arena);
            if (rapier.sys.RapierC.RprContactManifold_rigid_body2(self, res))
                return ArenaKey.from(res);
            return null;
        }
    }

    public int getSolverFlags() {
        return rapier.sys.RapierC.RprContactManifold_solver_flags(self);
    }

    public SolverContact[] getSolverContacts() {
        try (var arena = Arena.openConfined()) {
            var data = arena.allocate(ValueLayout.ADDRESS);
            var len = arena.allocate(ValueLayout.JAVA_LONG);
            rapier.sys.RapierC.RprContactManifold_solver_contacts(self, data, len);
            return Native.fromPtrSlice(
                    data.get(ValueLayout.ADDRESS, 0),
                    (int) len.get(ValueLayout.JAVA_LONG, 0),
                    SolverContact[]::new,
                    SolverContact::at
            );
        }
    }

    public short getRelativeDominance() {
        return rapier.sys.RapierC.RprContactManifold_relative_dominance(self);
    }

    public int getUserData() {
        return rapier.sys.RapierC.RprContactManifold_user_data(self);
    }
}
