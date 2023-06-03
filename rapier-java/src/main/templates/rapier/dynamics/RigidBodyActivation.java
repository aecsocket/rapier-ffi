package rapier.dynamics;

import rapier.RefNative;

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

    public {{ real }} getLinearThreshold() {
        return {{ sys }}.RapierC.RprRigidBodyActivation_linear_threshold(self);
    }

    public {{ real }} getAngularThreshold() {
        return {{ sys }}.RapierC.RprRigidBodyActivation_angular_threshold(self);
    }

    public {{ real }} getTimeUntilSleep() {
        return {{ sys }}.RapierC.RprRigidBodyActivation_time_until_sleep(self);
    }

    public {{ real }} getTimeSinceCanSleep() {
        return {{ sys }}.RapierC.RprRigidBodyActivation_time_since_can_sleep(self);
    }

    public boolean isSleeping() {
        return {{ sys }}.RapierC.RprRigidBodyActivation_sleeping(self);
    }

    public static final class Mut extends RigidBodyActivation {
        private Mut(MemoryAddress memory) {
            super(memory);
        }

        public void setLinearThreshold({{ real }} value) {
            {{ sys }}.RapierC.RprRigidBodyActivation_set_linear_threshold(self, value);
        }

        public void setAngularThreshold({{ real }} value) {
            {{ sys }}.RapierC.RprRigidBodyActivation_set_angular_threshold(self, value);
        }

        public void setTimeUntilSleep({{ real }} value) {
            {{ sys }}.RapierC.RprRigidBodyActivation_set_time_until_sleep(self, value);
        }

        public void setTimeSinceCanSleep({{ real }} value) {
            {{ sys }}.RapierC.RprRigidBodyActivation_set_time_since_can_sleep(self, value);
        }

        public void setSleeping(boolean value) {
            {{ sys }}.RapierC.RprRigidBodyActivation_set_sleeping(self, value);
        }
    }
}
