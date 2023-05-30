package rapier.dynamics.joint;

import rapier.ValNative;
import rapier.sys.RprJointLimits;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public final class JointLimits extends ValNative {
    private JointLimits(MemorySegment memory) {
        super(memory);
    }

    public static JointLimits at(MemorySegment memory) {
        return new JointLimits(memory);
    }

    public static JointLimits create(SegmentAllocator alloc) {
        return at({{ sys }}.RapierC.RprJointLimits_default(alloc));
    }

    public {{ real }} getMin() {
        return {{ sys }}.RprJointLimits.min$get(self);
    }

    public void setMin({{ real }} min) {
        {{ sys }}.RprJointLimits.min$set(self, min);
    }

    public {{ real }} getMax() {
        return {{ sys }}.RprJointLimits.min$get(self);
    }

    public void setMax({{ real }} max) {
        {{ sys }}.RprJointLimits.max$set(self, max);
    }

    public {{ real }} getImpulse() {
        return {{ sys }}.RprJointLimits.impulse$get(self);
    }

    public void setImpulse({{ real }} impulse) {
        {{ sys }}.RprJointLimits.impulse$set(self, impulse);
    }
}
