// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$65 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$65() {}
    static final FunctionDescriptor RprRigidBodyActivation_set_sleeping$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBodyActivation_set_sleeping$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyActivation_set_sleeping",
        constants$65.RprRigidBodyActivation_set_sleeping$FUNC
    );
    static final FunctionDescriptor RprRigidBodyActivation_set_time_since_can_sleep$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle RprRigidBodyActivation_set_time_since_can_sleep$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyActivation_set_time_since_can_sleep",
        constants$65.RprRigidBodyActivation_set_time_since_can_sleep$FUNC
    );
    static final FunctionDescriptor RprRigidBodyActivation_set_time_until_sleep$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle RprRigidBodyActivation_set_time_until_sleep$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyActivation_set_time_until_sleep",
        constants$65.RprRigidBodyActivation_set_time_until_sleep$FUNC
    );
    static final FunctionDescriptor RprRigidBodyActivation_sleeping$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyActivation_sleeping$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyActivation_sleeping",
        constants$65.RprRigidBodyActivation_sleeping$FUNC
    );
    static final FunctionDescriptor RprRigidBodyActivation_time_since_can_sleep$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyActivation_time_since_can_sleep$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyActivation_time_since_can_sleep",
        constants$65.RprRigidBodyActivation_time_since_can_sleep$FUNC
    );
    static final FunctionDescriptor RprRigidBodyActivation_time_until_sleep$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyActivation_time_until_sleep$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyActivation_time_until_sleep",
        constants$65.RprRigidBodyActivation_time_until_sleep$FUNC
    );
}


