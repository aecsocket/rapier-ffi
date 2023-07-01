package rapier.dynamics;

import rapier.RefNative;
import rapier.__real;

import java.lang.foreign.MemoryAddress;

public sealed class RigidBodyActivation extends RefNative permits RigidBodyActivation.Mut {
    private RigidBodyActivation(MemoryAddress memory) {
        super(memory);
    }

    public static RigidBodyActivation at(MemoryAddress memory) {
        return new RigidBodyActivation(memory);
    }

    public static Mut atMut(MemoryAddress memory) {
        return new Mut(memory);
    }

    public __real getLinearThreshold() {
        return rapier.sys.RapierC.RprRigidBodyActivation_linear_threshold(self);
    }

    public __real getAngularThreshold() {
        return rapier.sys.RapierC.RprRigidBodyActivation_angular_threshold(self);
    }

    public __real getTimeUntilSleep() {
        return rapier.sys.RapierC.RprRigidBodyActivation_time_until_sleep(self);
    }

    public __real getTimeSinceCanSleep() {
        return rapier.sys.RapierC.RprRigidBodyActivation_time_since_can_sleep(self);
    }

    public boolean isSleeping() {
        return rapier.sys.RapierC.RprRigidBodyActivation_sleeping(self);
    }

    public static final class Mut extends RigidBodyActivation {
        private Mut(MemoryAddress memory) {
            super(memory);
        }

        public void setLinearThreshold(__real value) {
            rapier.sys.RapierC.RprRigidBodyActivation_set_linear_threshold(self, value);
        }

        public void setAngularThreshold(__real value) {
            rapier.sys.RapierC.RprRigidBodyActivation_set_angular_threshold(self, value);
        }

        public void setTimeUntilSleep(__real value) {
            rapier.sys.RapierC.RprRigidBodyActivation_set_time_until_sleep(self, value);
        }

        public void setTimeSinceCanSleep(__real value) {
            rapier.sys.RapierC.RprRigidBodyActivation_set_time_since_can_sleep(self, value);
        }

        public void setSleeping(boolean value) {
            rapier.sys.RapierC.RprRigidBodyActivation_set_sleeping(self, value);
        }
    }
}
