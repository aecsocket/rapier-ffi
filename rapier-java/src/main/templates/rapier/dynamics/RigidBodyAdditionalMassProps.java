package rapier.dynamics;

import rapier.data.ArenaKey;
import rapier.sys.RprRigidBodyAdditionalMassProps;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public sealed interface RigidBodyAdditionalMassProps {
    record MassProps(MassProperties props) implements RigidBodyAdditionalMassProps {}

    record Mass({{ real }} mass) implements RigidBodyAdditionalMassProps {}

    static long sizeof() {
        return {{ sys }}.RprRigidBodyAdditionalMassProps.sizeof();
    }

    static MemorySegment alloc(SegmentAllocator alloc) {
        return {{ sys }}.RprRigidBodyAdditionalMassProps.allocate(alloc);
    }

    static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return {{ sys }}.RprRigidBodyAdditionalMassProps.allocateArray(len, alloc);
    }

    static RigidBodyAdditionalMassProps from(MemorySegment memory) {
        var tag = RprRigidBodyAdditionalMassProps.tag$get(memory);
        return switch (tag) {
            case 0 -> {
                var body = RprRigidBodyAdditionalMassProps.mass_props$slice(memory);
                yield new MassProps(
                        MassProperties.from({{ sys }}.MassProps_Body.props$slice(body))
                );
            }
            case 1 -> {
                var body = RprRigidBodyAdditionalMassProps.mass$slice(memory);
                yield new Mass(
                        {{ sys }}.Mass_Body.mass$get(body)
                );
            }
            default -> throw new IllegalArgumentException("Invalid tag " + tag);
        };
    }
}
