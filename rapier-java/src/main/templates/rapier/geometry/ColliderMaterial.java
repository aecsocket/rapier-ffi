package rapier.geometry;

import rapier.__real;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record ColliderMaterial(
        __real friction,
        __real restitution,
        CoefficientCombineRule frictionCombineRule,
        CoefficientCombineRule restitutionCombineRule
) {
    public static long sizeof() {
        return rapier.sys.RprColliderMaterial.sizeof();
    }

    public static MemorySegment alloc(SegmentAllocator alloc) {
        return rapier.sys.RprColliderMaterial.allocate(alloc);
    }

    public static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return rapier.sys.RprColliderMaterial.allocateArray(len, alloc);
    }

    public void into(MemorySegment memory) {
        rapier.sys.RprColliderMaterial.friction$set(memory, friction);
        rapier.sys.RprColliderMaterial.restitution$set(memory, restitution);
        rapier.sys.RprColliderMaterial.friction_combine_rule$set(memory, frictionCombineRule.ordinal());
        rapier.sys.RprColliderMaterial.restitution_combine_rule$set(memory, restitutionCombineRule.ordinal());
    }

    public MemorySegment allocInto(SegmentAllocator alloc) {
        var memory = alloc(alloc);
        into(memory);
        return memory;
    }

    public static MemorySegment allocIntoSlice(SegmentAllocator alloc, ColliderMaterial... objs) {
        var memory = allocSlice(alloc, objs.length);
        for (int i = 0; i < objs.length; i++) {
            objs[i].into(memory.asSlice(sizeof() * i));
        }
        return memory;
    }

    public static ColliderMaterial from(MemorySegment memory) {
        return new ColliderMaterial(
                rapier.sys.RprColliderMaterial.friction$get(memory),
                rapier.sys.RprColliderMaterial.restitution$get(memory),
                CoefficientCombineRule.values()[rapier.sys.RprColliderMaterial.friction_combine_rule$get(memory)],
                CoefficientCombineRule.values()[rapier.sys.RprColliderMaterial.restitution_combine_rule$get(memory)]
        );
    }
}
