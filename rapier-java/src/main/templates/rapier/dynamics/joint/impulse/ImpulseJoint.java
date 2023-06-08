package rapier.dynamics.joint.impulse;

import rapier.RefNative;
import rapier.data.ArenaKey;
import rapier.dynamics.joint.GenericJoint;
import rapier.math.SpacialVector;

import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.foreign.SegmentAllocator;

import static rapier.sys.RapierC.*;

public sealed class ImpulseJoint extends RefNative permits ImpulseJoint.Mut {
    private ImpulseJoint(MemoryAddress memory) {
        super(memory);
    }

    public static ImpulseJoint at(MemoryAddress memory) {
        return new ImpulseJoint(memory);
    }

    public static Mut atMut(MemoryAddress memory) {
        return new Mut(memory);
    }

    public long getBody1() {
        try (var arena = MemorySession.openConfined()) {
            return ArenaKey.pack(RprImpulseJoint_body1(arena, self));
        }
    }

    public long getBody2() {
        try (var arena = MemorySession.openConfined()) {
            return ArenaKey.pack(RprImpulseJoint_body2(arena, self));
        }
    }

    public GenericJoint getData() {
        return GenericJoint.at(RprImpulseJoint_data(self));
    }

    public SpacialVector getImpulses(SegmentAllocator alloc) {
        return SpacialVector.at(RprImpulseJoint_impulses(alloc, self));
    }

    public static final class Mut extends ImpulseJoint {
        private Mut(MemoryAddress memory) {
            super(memory);
        }


        public void setBody1(long body1) {
            try (var arena = MemorySession.openConfined()) {
                RprImpulseJoint_set_body1(self, ArenaKey.unpack(arena, body1));
            }
        }

        public void setBody2(long body2) {
            try (var arena = MemorySession.openConfined()) {
                RprImpulseJoint_set_body2(self, ArenaKey.unpack(arena, body2));
            }
        }

        @Override
        public GenericJoint.Mut getData() {
            return GenericJoint.atMut(RprImpulseJoint_data(self));
        }

        public void setData(GenericJoint data) {
            RprImpulseJoint_set_data(self, data.memory());
        }

        public void setImpulses(SpacialVector impulses) {
            RprImpulseJoint_set_impulses(self, impulses.memory());
        }

        public GenericJoint.Mut retainData() {
            return GenericJoint.atMut(RprImpulseJoint_retain_data(self));
        }
    }
}
