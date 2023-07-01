package rapier.dynamics.joint.impulse;

import rapier.RefNative;
import rapier.data.ArenaKey;
import rapier.dynamics.joint.GenericJoint;
import rapier.math.SpacialVector;

import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;

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

    public ArenaKey getBody1() {
        try (var arena = MemorySession.openConfined()) {
            return ArenaKey.from(rapier.sys.RapierC.RprImpulseJoint_body1(arena, self));
        }
    }

    public ArenaKey getBody2() {
        try (var arena = MemorySession.openConfined()) {
            return ArenaKey.from(rapier.sys.RapierC.RprImpulseJoint_body2(arena, self));
        }
    }

    public GenericJoint getData() {
        return GenericJoint.at(rapier.sys.RapierC.RprImpulseJoint_data(self));
    }

    public SpacialVector getImpulses() {
        try (var arena = MemorySession.openConfined()) {
            return SpacialVector.from(rapier.sys.RapierC.RprImpulseJoint_impulses(arena, self));
        }
    }

    public static final class Mut extends ImpulseJoint {
        private Mut(MemoryAddress memory) {
            super(memory);
        }


        public void setBody1(ArenaKey body1) {
            try (var arena = MemorySession.openConfined()) {
                rapier.sys.RapierC.RprImpulseJoint_set_body1(self, body1.allocInto(arena));
            }
        }

        public void setBody2(ArenaKey body2) {
            try (var arena = MemorySession.openConfined()) {
                rapier.sys.RapierC.RprImpulseJoint_set_body2(self, body2.allocInto(arena));
            }
        }

        @Override
        public GenericJoint.Mut getData() {
            return GenericJoint.atMut(rapier.sys.RapierC.RprImpulseJoint_data(self));
        }

        public void setData(GenericJoint data) {
            rapier.sys.RapierC.RprImpulseJoint_set_data(self, data.memory());
        }

        public void setImpulses(SpacialVector impulses) {
            try (var arena = MemorySession.openConfined()) {
                rapier.sys.RapierC.RprImpulseJoint_set_impulses(self, impulses.allocInto(arena));
            }
        }

        public GenericJoint.Mut retainData() {
            return GenericJoint.atMut(rapier.sys.RapierC.RprImpulseJoint_retain_data(self));
        }
    }
}
