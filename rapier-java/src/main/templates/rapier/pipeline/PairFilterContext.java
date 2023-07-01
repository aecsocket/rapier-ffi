package rapier.pipeline;

import rapier.RefNative;
import rapier.data.ArenaKey;
import rapier.dynamics.RigidBodySet;
import rapier.geometry.ColliderSet;

import javax.annotation.Nullable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;

public final class PairFilterContext extends RefNative {
    private PairFilterContext(MemoryAddress memory) {
        super(memory);
    }

    public static PairFilterContext at(MemoryAddress memory) {
        return new PairFilterContext(memory);
    }

    public RigidBodySet getBodies() {
        return RigidBodySet.at(rapier.sys.RapierC.RprPairFilterContext_bodies(self));
    }

    public ColliderSet getColliders() {
        return ColliderSet.at(rapier.sys.RapierC.RprPairFilterContext_colliders(self));
    }

    public ArenaKey getCollider1() {
        try (var arena = MemorySession.openConfined()) {
            return ArenaKey.from(rapier.sys.RapierC.RprPairFilterContext_collider1(arena, self));
        }
    }

    public ArenaKey getCollider2() {
        try (var arena = MemorySession.openConfined()) {
            return ArenaKey.from(rapier.sys.RapierC.RprPairFilterContext_collider2(arena, self));
        }
    }

    public @Nullable ArenaKey getRigidBody1() {
        try (var arena = MemorySession.openConfined()) {
            var res = ArenaKey.alloc(arena);
            if (rapier.sys.RapierC.RprPairFilterContext_rigid_body1(self, res))
                return ArenaKey.from(res);
            return null;
        }
    }

    public @Nullable ArenaKey getRigidBody2() {
        try (var arena = MemorySession.openConfined()) {
            var res = ArenaKey.alloc(arena);
            if (rapier.sys.RapierC.RprPairFilterContext_rigid_body2(self, res))
                return ArenaKey.from(res);
            return null;
        }
    }
}
