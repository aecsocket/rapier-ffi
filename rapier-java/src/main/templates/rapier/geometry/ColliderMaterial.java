package rapier.geometry;

import rapier.ValNative;
import rapier.dynamics.joint.MotorModel;
import rapier.sys.RprColliderMaterial;
import rapier.sys.RprJointMotor;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public final class ColliderMaterial extends ValNative {
    private ColliderMaterial(MemorySegment memory) {
        super(memory);
    }

    public static ColliderMaterial at(MemorySegment memory) {
        return new ColliderMaterial(memory);
    }

    public static ColliderMaterial create(SegmentAllocator alloc) {
        return at({{ sys }}.RapierC.RprColliderMaterial_default(alloc));
    }

    public {{ real }} getFriction() {
        return {{ sys }}.RprColliderMaterial.friction$get(self);
    }

    public void setFriction({{ real }} friction) {
        {{ sys }}.RprColliderMaterial.friction$set(self, friction);
    }

    public {{ real }} getRestitution() {
        return {{ sys }}.RprColliderMaterial.restitution$get(self);
    }

    public void setRestitution({{ real }} restitution) {
        {{ sys }}.RprColliderMaterial.restitution$set(self, restitution);
    }

    public CoefficientCombineRule getFrictionCombineRule() {
        return CoefficientCombineRule.values()[{{ sys }}.RprColliderMaterial.friction_combine_rule$get(self)];
    }

    public void setFrictionCombineRule(CoefficientCombineRule frictionCombineRule) {
        {{ sys }}.RprColliderMaterial.friction_combine_rule$set(self, frictionCombineRule.ordinal());
    }

    public CoefficientCombineRule getRestitutionCombineRule() {
        return CoefficientCombineRule.values()[{{ sys }}.RprColliderMaterial.restitution_combine_rule$get(self)];
    }

    public void setRestitutionCombineRule(CoefficientCombineRule restitutionCombineRule) {
        {{ sys }}.RprColliderMaterial.restitution_combine_rule$set(self, restitutionCombineRule.ordinal());
    }
}
