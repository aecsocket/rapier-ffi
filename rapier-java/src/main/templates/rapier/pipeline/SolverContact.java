package rapier.pipeline;

import rapier.RefNative;
import rapier.__real;
import rapier.math.Vector;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.Arena;

public final class SolverContact extends RefNative {
    private SolverContact(MemorySegment memory) {
        super(memory);
    }

    public static SolverContact at(MemorySegment memory) {
        return new SolverContact(memory);
    }

    public Vector getPoint() {
        try (var arena = Arena.openConfined()) {
            return Vector.from(rapier.sys.RapierC.RprSolverContact_point(arena, self));
        }
    }

    public void setPoint(Vector value) {
        try (var arena = Arena.openConfined()) {
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
        try (var arena = Arena.openConfined()) {
            return Vector.from(rapier.sys.RapierC.RprSolverContact_tangent_velocity(arena, self));
        }
    }

    public void setTangentVelocity(Vector value) {
        try (var arena = Arena.openConfined()) {
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
