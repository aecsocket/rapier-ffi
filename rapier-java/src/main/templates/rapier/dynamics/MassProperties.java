package rapier.dynamics;

import rapier.math.*;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record MassProperties(
        Vector localCom,
        {{ real }} invMass,
        AngVector invPrincipalInertiaSqrt{% if dim3 %},
        Rotation principalInertiaLocalFrame
{% endif %}
) {
    public static long sizeof() {
        return {{ sys }}.RprMassProperties.sizeof();
    }

    public static MemorySegment alloc(SegmentAllocator alloc) {
        return {{ sys }}.RprMassProperties.allocate(alloc);
    }

    public static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return RprArenaKey.allocateArray(len, alloc);
    }

    public void into(MemorySegment memory) {
        localCom.into({{ sys }}.RprMassProperties.local_com$slice(memory));
        {{ sys }}.RprMassProperties.inv_mass$set(memory, invMass);
        invPrincipalInertiaSqrt.into({{ sys }}.RprMassProperties.inv_principal_inertia_sqrt$slice(memory));
{% if dim3 %}
        principalInertiaLocalFrame.into({{ sys }}.RprMassProperties.principal_inertia_local_frame$slice(memory));
{% endif %}
    }

    public MemorySegment allocInto(SegmentAllocator alloc) {
        var memory = alloc(alloc);
        into(memory);
        return memory;
    }

    public static MemorySegment allocIntoSlice(SegmentAllocator alloc, MassProperties... objs) {
        var memory = allocSlice(alloc, objs.length);
        for (int i = 0; i < objs.length; i++) {
            objs[i].into(memory.asSlice(sizeof() * i));
        }
        return memory;
    }

    public static MassProperties from(MemorySegment memory) {
        return new MassProperties(
                Vector.from({{ sys }}.RprMassProperties.local_com$slice(memory)),
                {{ sys }}.RprMassProperties.inv_mass$get(memory),
                AngVector.from({{ sys }}.RprMassProperties.inv_principal_inertia_sqrt$slice(memory)){% if dim3 %},
                Rotation.from({{ sys }}.RprMassProperties.principal_inertia_local_frame$slice(memory))
{% endif %}
        );
    }
}
