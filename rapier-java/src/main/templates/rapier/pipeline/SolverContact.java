package rapier.pipeline;

import rapier.RefNative;
import rapier.math.Vector;
import rapier.sys.RapierC;

import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.foreign.SegmentAllocator;

import static rapier.sys.RapierC.*;

public final class SolverContact extends RefNative {
    private SolverContact(MemoryAddress memory) {
        super(memory);
    }

    public static SolverContact at(MemoryAddress memory) {
        return new SolverContact(memory);
    }

    public Vector getPoint(SegmentAllocator alloc) {
        return Vector.at({{ sys }}.RapierC.RprSolverContact_point(alloc, self));
    }

    public void setPoint(Vector value) {
        {{ sys }}.RapierC.RprSolverContact_set_point(self, value.memory());
    }

    public {{ real }} getDist() {
        return {{ sys }}.RapierC.RprSolverContact_dist(self);
    }

    public void setDist({{ real }} value) {
        {{ sys }}.RapierC.RprSolverContact_set_dist(self, value);
    }

    public {{ real }} getFriction() {
        return {{ sys }}.RapierC.RprSolverContact_friction(self);
    }

    public void setFriction({{ real }} value) {
        {{ sys }}.RapierC.RprSolverContact_set_friction(self, value);
    }

    public {{ real }} getRestitution() {
        return {{ sys }}.RapierC.RprSolverContact_restitution(self);
    }

    public void setRestitution({{ real }} value) {
        {{ sys }}.RapierC.RprSolverContact_set_restitution(self, value);
    }

    public Vector getTangentVelocity(SegmentAllocator alloc) {
        return Vector.at({{ sys }}.RapierC.RprSolverContact_tangent_velocity(alloc, self));
    }

    public void setTangentVelocity(Vector value) {
        {{ sys }}.RapierC.RprSolverContact_set_tangent_velocity(self, value.memory());
    }

    public boolean isNew() {
        return RprSolverContact_is_new(self);
    }

    public boolean isBouncy() {
        return RprSolverContact_is_bouncy(self);
    }
}
