// Generated by jextract

package rapier.sys_dim3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$48 {

    static final FunctionDescriptor RprGenericJoint_set_motor_velocity$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprGenericJoint_set_motor_velocity$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_motor_velocity",
        constants$48.RprGenericJoint_set_motor_velocity$FUNC
    );
    static final FunctionDescriptor RprImpulseJointSet_all$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprImpulseJointSet_all$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJointSet_all",
        constants$48.RprImpulseJointSet_all$FUNC
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
        constants$48.RprImpulseJointSet_contains$FUNC
    );
    static final FunctionDescriptor RprImpulseJointSet_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprImpulseJointSet_drop$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJointSet_drop",
        constants$48.RprImpulseJointSet_drop$FUNC
    );
    static final FunctionDescriptor RprImpulseJointSet_get$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey")
    );
    static final MethodHandle RprImpulseJointSet_get$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJointSet_get",
        constants$48.RprImpulseJointSet_get$FUNC
    );
    static final FunctionDescriptor RprImpulseJointSet_get_mut$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey")
    );
    static final MethodHandle RprImpulseJointSet_get_mut$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJointSet_get_mut",
        constants$48.RprImpulseJointSet_get_mut$FUNC
    );
}


