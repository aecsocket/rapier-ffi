// Generated by jextract

package rapier.sys_dim2;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$46 {

    static final FunctionDescriptor RprGenericJoint_set_motor_model$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle RprGenericJoint_set_motor_model$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_motor_model",
        constants$46.RprGenericJoint_set_motor_model$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_set_motor_position$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprGenericJoint_set_motor_position$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_motor_position",
        constants$46.RprGenericJoint_set_motor_position$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_set_motor_velocity$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprGenericJoint_set_motor_velocity$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_motor_velocity",
        constants$46.RprGenericJoint_set_motor_velocity$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_set_motors$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_set_motors$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_motors",
        constants$46.RprGenericJoint_set_motors$FUNC
    );
    static final FunctionDescriptor RprImpulseJointSet_all$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprImpulseJointSet_all$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJointSet_all",
        constants$46.RprImpulseJointSet_all$FUNC
    );
    static final FunctionDescriptor RprImpulseJointSet_contains$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey")
    );
    static final MethodHandle RprImpulseJointSet_contains$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJointSet_contains",
        constants$46.RprImpulseJointSet_contains$FUNC
    );
}


