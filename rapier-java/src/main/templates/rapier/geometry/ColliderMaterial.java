package rapier.geometry;

import rapier.ValNative;
import rapier.dynamics.joint.MotorModel;
import rapier.sys.RprColliderMaterial;
import rapier.sys.RprJointMotor;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record ColliderMaterial(
        {{ real }} friction,
        {{ real }} restitution,
        CoefficientCombineRule frictionCombineRule,
        CoefficientCombineRule restitutionCombineRule
) {
    public static ColliderMaterial from(MemorySegment memory) {
        return new ColliderMaterial(
                {{ sys }}.RprColliderMaterial.friction$get(memory),
                {{ sys }}.RprColliderMaterial.restitution$get(memory),
                CoefficientCombineRule.values()[{{ sys }}.RprColliderMaterial.friction_combine_rule$get(memory)],
                CoefficientCombineRule.values()[{{ sys }}.RprColliderMaterial.restitution_combine_rule$get(memory)]
        );
    }

    public void into(MemorySegment memory) {
        {{ sys }}.RprColliderMaterial.friction$set(memory, friction);
        {{ sys }}.RprColliderMaterial.restitution$set(memory, restitution);
        {{ sys }}.RprColliderMaterial.friction_combine_rule$set(memory, frictionCombineRule.ordinal());
        {{ sys }}.RprColliderMaterial.restitution_combine_rule$set(memory, restitutionCombineRule.ordinal());
    }

    public MemorySegment allocate(SegmentAllocator alloc) {
        var memory = {{ sys }}.RprColliderMaterial.allocate(alloc);
        into(memory);
        return memory;
    }
}
