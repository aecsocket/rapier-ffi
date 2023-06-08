package rapier.pipeline;

import rapier.RefNative;
import rapier.math.Vector;
import rapier.sys.RapierC;

import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

import static rapier.sys.RapierC.*;

public final class ContactData extends RefNative {
    private ContactData(MemoryAddress memory) {
        super(memory);
    }

    public static ContactData at(MemoryAddress memory) {
        return new ContactData(memory);
    }

    public Vector getLocalP1(SegmentAllocator alloc) {
        return Vector.at({{ sys }}.RapierC.RprContactData_local_p1(alloc, self));
    }

    public void setLocalP1(Vector value) {
        {{ sys }}.RapierC.RprContactData_set_local_p1(self, value.memory());
    }

    public Vector getLocalP2(SegmentAllocator alloc) {
        return Vector.at({{ sys }}.RapierC.RprContactData_local_p2(alloc, self));
    }

    public void setLocalP2(Vector value) {
        {{ sys }}.RapierC.RprContactData_set_local_p2(self, value.memory());
    }

    public {{ real }} getDist() {
        return {{ sys }}.RapierC.RprContactData_dist(self);
    }

    public void setDist({{ real }} value) {
        {{ sys }}.RapierC.RprContactData_set_dist(self, value);
    }

    public {{ real }} getImpulse() {
        return {{ sys }}.RapierC.RprContactData_impulse(self);
    }

    public void setImpulse({{ real }} value) {
        {{ sys }}.RapierC.RprContactData_set_impulse(self, value);
    }

    public {{ real }}[] getTangentImpulse() {
        try (var arena = MemorySession.openConfined()) {
{% if dim2 %}
            var nX = arena.allocate(C_LONG, 0);
            {{ sys }}.RapierC.RprContactData_tangent_impulse(self, nX);
            return new {{ real }}[] { nX.get({{ realLayout }}, 0) };
{% else %}
            var nX = arena.allocate(C_LONG, 0);
            var nY = arena.allocate(C_LONG, 0);
            {{ sys }}.RapierC.RprContactData_tangent_impulse(self, nX, nY);
            return new {{ real }}[] { nX.get({{ realLayout }}, 0), nY.get({{ realLayout }}, 0) };
{% endif %}
        }
    }

{% if dim2 %}
    public void setTangentImpulse({{ real }} x) {
        {{ sys }}.RapierC.RprContactData_set_tangent_impulse(self, x);
    }
{% else %}
    public void setTangentImpulse({{ real }} x, {{ real }} y) {
        {{ sys }}.RapierC.RprContactData_set_tangent_impulse(self, x, y);
    }
{% endif %}
}
