// Generated by jextract

package rapier.sys;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$63 {

    static final FunctionDescriptor RprRigidBodyActivation_set_linear_threshold$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprRigidBodyActivation_set_linear_threshold$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyActivation_set_linear_threshold",
        constants$63.RprRigidBodyActivation_set_linear_threshold$FUNC
    );
    static final FunctionDescriptor RprRigidBodyActivation_set_sleeping$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBodyActivation_set_sleeping$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyActivation_set_sleeping",
        constants$63.RprRigidBodyActivation_set_sleeping$FUNC
    );
    static final FunctionDescriptor RprRigidBodyActivation_set_time_since_can_sleep$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprRigidBodyActivation_set_time_since_can_sleep$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyActivation_set_time_since_can_sleep",
        constants$63.RprRigidBodyActivation_set_time_since_can_sleep$FUNC
    );
    static final FunctionDescriptor RprRigidBodyActivation_set_time_until_sleep$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprRigidBodyActivation_set_time_until_sleep$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyActivation_set_time_until_sleep",
        constants$63.RprRigidBodyActivation_set_time_until_sleep$FUNC
    );
    static final FunctionDescriptor RprRigidBodyActivation_sleeping$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyActivation_sleeping$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyActivation_sleeping",
        constants$63.RprRigidBodyActivation_sleeping$FUNC
    );
    static final FunctionDescriptor RprRigidBodyActivation_time_since_can_sleep$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyActivation_time_since_can_sleep$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyActivation_time_since_can_sleep",
        constants$63.RprRigidBodyActivation_time_since_can_sleep$FUNC
    );
}


