package rapier.pipeline;

import rapier.Real;
import rapier.RefNative;
import rapier.__real;
import rapier.math.Vector;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.Arena;

public final class ContactData extends RefNative {
    private ContactData(MemorySegment memory) {
        super(memory);
    }

    public static ContactData at(MemorySegment memory) {
        return new ContactData(memory);
    }

    public Vector getLocalP1() {
        try (var arena = Arena.openConfined()) {
            return Vector.from(rapier.sys.RapierC.RprContactData_local_p1(arena, self));
        }
    }

    public void setLocalP1(Vector value) {
        try (var arena = Arena.openConfined()) {
            rapier.sys.RapierC.RprContactData_set_local_p1(self, value.allocInto(arena));
        }
    }

    public Vector getLocalP2() {
        try (var arena = Arena.openConfined()) {
            return Vector.from(rapier.sys.RapierC.RprContactData_local_p2(arena, self));
        }
    }

    public void setLocalP2(Vector value) {
        try (var arena = Arena.openConfined()) {
            rapier.sys.RapierC.RprContactData_set_local_p2(self, value.allocInto(arena));
        }
    }

    public __real getDist() {
        return rapier.sys.RapierC.RprContactData_dist(self);
    }

    public void setDist(__real value) {
        rapier.sys.RapierC.RprContactData_set_dist(self, value);
    }

    public __real getImpulse() {
        return rapier.sys.RapierC.RprContactData_impulse(self);
    }

    public void setImpulse(__real value) {
        rapier.sys.RapierC.RprContactData_set_impulse(self, value);
    }

    public record TangentImpulse(
            __real x/*{% if dim3 %}*/,
            __real y
/*{% endif %}*/
    ) {}

    public TangentImpulse getTangentImpulse() {
        try (var arena = Arena.openConfined()) {
/*{% if dim2 %}*/
            var nX = arena.allocate(Real.layout());
            rapier.sys.RapierC.RprContactData_tangent_impulse(self, nX);
            return new TangentImpulse(
                    nX.get(Real.layout(), 0)
            );
/*{% else %}*/
            var nX = arena.allocate(Real.layout(), 0);
            var nY = arena.allocate(Real.layout(), 0);
            rapier.sys.RapierC.RprContactData_tangent_impulse(self, nX, nY);
            return new TangentImpulse(
                    nX.get(Real.layout(), 0),
                    nY.get(Real.layout(), 0)
            );
/*{% endif %}*/
        }
    }

{% if dim2 %}
    public void setTangentImpulse(__real x) {
        rapier.sys.RapierC.RprContactData_set_tangent_impulse(self, x);
    }
{% else %}
    public void setTangentImpulse(__real x, __real y) {
        rapier.sys.RapierC.RprContactData_set_tangent_impulse(self, x, y);
    }
{% endif %}
}
