package rapier.dynamics;

import rapier.data.ArenaKey;
import rapier.math.*;
import rapier.pipeline.TOI;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record MassProperties(
{% if dim2 %}
        Vector localCom,
        {{ real }} invMass,
        AngVector invPrincipalInertiaSqrt
{% else %}
        Vector localCom,
        {{ real }} invMass,
        AngVector invPrincipalInertiaSqrt,
        Rotation principalInertiaLocalFrame
{% endif %}
) {
    public static MassProperties from(MemorySegment memory) {
        return new MassProperties(
{% if dim2 %}
                Vector.from({{ sys }}.RprMassProperties.local_com$slice(memory)),
                {{ sys }}.RprMassProperties.inv_mass$get(memory),
                AngVector.from({{ sys }}.RprMassProperties.inv_principal_inertia_sqrt$slice(memory))
{% else %}
                Vector.from({{ sys }}.RprMassProperties.local_com$slice(memory)),
                {{ sys }}.RprMassProperties.inv_mass$get(memory),
                AngVector.from({{ sys }}.RprMassProperties.inv_principal_inertia_sqrt$slice(memory)),
                Rotation.from({{ sys }}.RprMassProperties.principal_inertia_local_frame$slice(memory))
{% endif %}
        );
    }

    public static MemorySegment allocate(SegmentAllocator alloc) {
        var memory = {{ sys }}.RprMassProperties.allocate(alloc);
        return memory;
    }
}
