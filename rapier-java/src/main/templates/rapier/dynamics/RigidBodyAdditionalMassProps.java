package rapier.dynamics;

import rapier.__real;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public sealed interface RigidBodyAdditionalMassProps {
    record MassProps(MassProperties props) implements RigidBodyAdditionalMassProps {}

    record Mass(__real mass) implements RigidBodyAdditionalMassProps {}

    static long sizeof() {
        return rapier.sys.RprRigidBodyAdditionalMassProps.sizeof();
    }

    static MemorySegment alloc(SegmentAllocator alloc) {
        return rapier.sys.RprRigidBodyAdditionalMassProps.allocate(alloc);
    }

    static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return rapier.sys.RprRigidBodyAdditionalMassProps.allocateArray(len, alloc);
    }

    static RigidBodyAdditionalMassProps from(MemorySegment memory) {
        var tag = rapier.sys.RprRigidBodyAdditionalMassProps.tag$get(memory);
        return switch (tag) {
            case 0 -> {
                var body = rapier.sys.RprRigidBodyAdditionalMassProps.mass_props$slice(memory);
                yield new MassProps(
                        MassProperties.from(rapier.sys.MassProps_Body.props$slice(body))
                );
            }
            case 1 -> {
                var body = rapier.sys.RprRigidBodyAdditionalMassProps.mass$slice(memory);
                yield new Mass(
                        rapier.sys.Mass_Body.mass$get(body)
                );
            }
            default -> throw new IllegalArgumentException("Invalid tag " + tag);
        };
    }
}
