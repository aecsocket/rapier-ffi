package rapier.pipeline;

import rapier.RefNative;
import rapier.__real;
import rapier.math.Vector;

import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;

public final class SolverContact extends RefNative {
    private SolverContact(MemoryAddress memory) {
        super(memory);
    }

    public static SolverContact at(MemoryAddress memory) {
        return new SolverContact(memory);
    }

    public Vector getPoint() {
        try (var arena = MemorySession.openConfined()) {
            return Vector.from(rapier.sys.RapierC.RprSolverContact_point(arena, self));
        }
    }

    public void setPoint(Vector value) {
        try (var arena = MemorySession.openConfined()) {
            rapier.sys.RapierC.RprSolverContact_set_point(self, value.allocInto(arena));
        }
    }

    public __real getDist() {
        return rapier.sys.RapierC.RprSolverContact_dist(self);
    }

    public void setDist(__real value) {
        rapier.sys.RapierC.RprSolverContact_set_dist(self, value);
    }

    public __real getFriction() {
        return rapier.sys.RapierC.RprSolverContact_friction(self);
    }

    public void setFriction(__real value) {
        rapier.sys.RapierC.RprSolverContact_set_friction(self, value);
    }

    public __real getRestitution() {
        return rapier.sys.RapierC.RprSolverContact_restitution(self);
    }

    public void setRestitution(__real value) {
        rapier.sys.RapierC.RprSolverContact_set_restitution(self, value);
    }

    public Vector getTangentVelocity() {
        try (var arena = MemorySession.openConfined()) {
            return Vector.from(rapier.sys.RapierC.RprSolverContact_tangent_velocity(arena, self));
        }
    }

    public void setTangentVelocity(Vector value) {
        try (var arena = MemorySession.openConfined()) {
            rapier.sys.RapierC.RprSolverContact_set_tangent_velocity(self, value.allocInto(arena));
        }
    }

    public boolean isNew() {
        return rapier.sys.RapierC.RprSolverContact_is_new(self);
    }

    public boolean isBouncy() {
        return rapier.sys.RapierC.RprSolverContact_is_bouncy(self);
    }
}
