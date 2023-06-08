package rapier.pipeline;

import rapier.RefNative;
import rapier.data.ArenaKey;
import rapier.dynamics.RigidBodySet;
import rapier.geometry.ColliderSet;
import rapier.math.Isometry;
import rapier.math.Vector;
import rapier.sys.RapierC;

import javax.annotation.Nullable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.foreign.SegmentAllocator;

import static rapier.sys.RapierC.*;

public final class ContactManifold extends RefNative {
    private ContactManifold(MemoryAddress memory) {
        super(memory);
    }

    public static ContactManifold at(MemoryAddress memory) {
        return new ContactManifold(memory);
    }

    public ContactData[] getPoints() {
        try (var arena = MemorySession.openConfined()) {
            var nDataPtr = arena.allocate(C_POINTER);
            var nLen = arena.allocate(C_LONG);
            RprContactManifold_points(self, nDataPtr, nLen);

            var dataPtr = nDataPtr.get(C_POINTER, 0);
            // truncate long to int because our array is indexed by int
            var len = (int) nLen.get(C_LONG, 0);

            var res = new ContactData[len];
            for (int i = 0; i < len; i++) {
                res[i] = ContactData.at(dataPtr.getAtIndex(C_POINTER, i));
            }
            return res;
        }
    }

    public Vector getLocalN1(SegmentAllocator alloc) {
        return Vector.at({{sys}}.RapierC.RprContactManifold_local_n1(alloc, self));
    }

    public Vector getLocalN2(SegmentAllocator alloc) {
        return Vector.at({{ sys }}.RapierC.RprContactManifold_local_n2(alloc, self));
    }

    public int getSubshape1() {
        return RprContactManifold_subshape1(self);
    }

    public int getSubshape2() {
        return RprContactManifold_subshape2(self);
    }

    public @Nullable Isometry getSubshapePos1(SegmentAllocator alloc) {
        var res = Isometry.create(alloc);
        if (RprContactManifold_subshape_pos1(self, res.memory()))
            return res;
        return null;
    }

    public @Nullable Isometry getSubshapePos2(SegmentAllocator alloc) {
        var res = Isometry.create(alloc);
        if (RprContactManifold_subshape_pos2(self, res.memory()))
            return res;
        return null;
    }

    public @Nullable Long getRigidBody1() {
        try (var arena = MemorySession.openConfined()) {
            var res = arena.allocate(C_LONG, 0);
            if (RprContactManifold_rigid_body1(self, res))
                return ArenaKey.pack(res);
            return null;
        }
    }

    public @Nullable Long getRigidBody2() {
        try (var arena = MemorySession.openConfined()) {
            var res = arena.allocate(C_LONG, 0);
            if (RprContactManifold_rigid_body2(self, res))
                return ArenaKey.pack(res);
            return null;
        }
    }

    public int getSolverFlags() {
        return RprContactManifold_solver_flags(self);
    }

    public SolverContact[] getSolverContacts() {
        try (var arena = MemorySession.openConfined()) {
            var nDataPtr = arena.allocate(C_POINTER);
            var nLen = arena.allocate(C_LONG);
            RprContactManifold_solver_contacts(self, nDataPtr, nLen);

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

    public short getRelativeDominance() {
        return RprContactManifold_relative_dominance(self);
    }

    public int getUserData() {
        return RprContactManifold_user_data(self);
    }
}
