package rapier.dynamics.joint;

import rapier.ValNative;
import rapier.sys.RprJointLimits;
import rapier.sys.RprJointMotor;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public final class JointMotor extends ValNative {
    private JointMotor(MemorySegment memory) {
        super(memory);
    }

    public static JointMotor at(MemorySegment memory) {
        return new JointMotor(memory);
    }

    public static JointMotor create(SegmentAllocator alloc) {
        return at({{ sys }}.RapierC.RprJointMotor_default(alloc));
    }

    public {{ real }} getTargetVel() {
        return {{ sys }}.RprJointMotor.target_vel$get(self);
    }

    public void setTargetVel({{ real }} targetVel) {
        {{ sys }}.RprJointMotor.target_vel$set(self, targetVel);
    }

    public {{ real }} getTargetPos() {
        return {{ sys }}.RprJointMotor.target_pos$get(self);
    }

    public void setTargetPos({{ real }} targetPos) {
        {{ sys }}.RprJointMotor.target_pos$set(self, targetPos);
    }

    public {{ real }} getStiffness() {
        return {{ sys }}.RprJointMotor.stiffness$get(self);
    }

    public void setStiffness({{ real }} stiffness) {
        {{ sys }}.RprJointMotor.stiffness$set(self, stiffness);
    }

    public {{ real }} getDamping() {
        return {{ sys }}.RprJointMotor.damping$get(self);
    }

    public void setDamping({{ real }} damping) {
        {{ sys }}.RprJointMotor.damping$set(self, damping);
    }

    public {{ real }} getMaxForce() {
        return {{ sys }}.RprJointMotor.max_force$get(self);
    }

    public void setMaxForce({{ real }} maxForce) {
        {{ sys }}.RprJointMotor.max_force$set(self, maxForce);
    }

    public {{ real }} getImpulse() {
        return {{ sys }}.RprJointMotor.impulse$get(self);
    }

    public void setImpulse({{ real }} impulse) {
        {{ sys }}.RprJointMotor.impulse$set(self, impulse);
    }

    public MotorModel getModel() {
        return MotorModel.values()[{{ sys }}.RprJointMotor.model$get(self)];
    }

    public void setModel(MotorModel model) {
        {{ sys }}.RprJointMotor.model$set(self, model.ordinal());
    }
}
