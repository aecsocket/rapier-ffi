package rapier.dynamics.joint;

import rapier.__real;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record JointMotor(
        __real targetVel,
        __real targetPos,
        __real stiffness,
        __real damping,
        __real maxForce,
        __real impulse,
        MotorModel model
) {
    public static long sizeof() {
        return rapier.sys.RprJointMotor.sizeof();
    }

    public static MemorySegment alloc(SegmentAllocator alloc) {
        return rapier.sys.RprJointMotor.allocate(alloc);
    }

    public static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return rapier.sys.RprJointMotor.allocateArray(len, alloc);
    }

    public void into(MemorySegment memory) {
        rapier.sys.RprJointMotor.target_vel$set(memory, targetVel);
        rapier.sys.RprJointMotor.target_pos$set(memory, targetPos);
        rapier.sys.RprJointMotor.stiffness$set(memory, stiffness);
        rapier.sys.RprJointMotor.damping$set(memory, damping);
        rapier.sys.RprJointMotor.max_force$set(memory, maxForce);
        rapier.sys.RprJointMotor.impulse$set(memory, impulse);
        rapier.sys.RprJointMotor.model$set(memory, model.ordinal());
    }

    public MemorySegment allocInto(SegmentAllocator alloc) {
        var memory = alloc(alloc);
        into(memory);
        return memory;
    }

    public static MemorySegment allocIntoSlice(SegmentAllocator alloc, JointMotor... objs) {
        var memory = allocSlice(alloc, objs.length);
        for (int i = 0; i < objs.length; i++) {
            objs[i].into(memory.asSlice(sizeof() * i));
        }
        return memory;
    }

    public static JointMotor from(MemorySegment memory) {
        return new JointMotor(
                rapier.sys.RprJointMotor.target_vel$get(memory),
                rapier.sys.RprJointMotor.target_pos$get(memory),
                rapier.sys.RprJointMotor.stiffness$get(memory),
                rapier.sys.RprJointMotor.damping$get(memory),
                rapier.sys.RprJointMotor.max_force$get(memory),
                rapier.sys.RprJointMotor.impulse$get(memory),
                MotorModel.values()[rapier.sys.RprJointMotor.model$get(memory)]
        );
    }

    public static JointMotor[] fromSlice(MemorySegment data, int len) {
        var res = new JointMotor[len];
        for (int i = 0; i < len; i++) {
            res[i] = JointMotor.from(data.asSlice(sizeof() * i));
        }
        return res;
    }
}
