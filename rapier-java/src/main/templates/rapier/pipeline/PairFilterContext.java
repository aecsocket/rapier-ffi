package rapier.pipeline;

import rapier.RefNative;
import rapier.data.ArenaKey;
import rapier.dynamics.RigidBodySet;
import rapier.geometry.ColliderSet;

import javax.annotation.Nullable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;

import static rapier.sys.RapierC.*;

public final class PairFilterContext extends RefNative {
    private PairFilterContext(MemoryAddress memory) {
        super(memory);
    }

    public static PairFilterContext at(MemoryAddress memory) {
        return new PairFilterContext(memory);
    }

    public RigidBodySet getBodies() {
        return RigidBodySet.at(RprPairFilterContext_bodies(self));
    }

    public ColliderSet getColliders() {
        return ColliderSet.at(RprPairFilterContext_colliders(self));
    }

    public long getCollider1() {
        try (var arena = MemorySession.openConfined()) {
            return ArenaKey.pack(RprPairFilterContext_collider1(arena, self));
        }
    }

    public long getCollider2() {
        try (var arena = MemorySession.openConfined()) {
            return ArenaKey.pack(RprPairFilterContext_collider2(arena, self));
        }
    }

    public @Nullable Long getRigidBody1() {
        try (var arena = MemorySession.openConfined()) {
            var res = arena.allocate(C_LONG, 0);
            if (RprPairFilterContext_rigid_body1(self, res))
                return res.get(C_LONG, 0);
            return null;
        }
    }

    public @Nullable Long getRigidBody2() {
        try (var arena = MemorySession.openConfined()) {
            var res = arena.allocate(C_LONG, 0);
            if (RprPairFilterContext_rigid_body2(self, res))
                return res.get(C_LONG, 0);
            return null;
        }
    }
}
