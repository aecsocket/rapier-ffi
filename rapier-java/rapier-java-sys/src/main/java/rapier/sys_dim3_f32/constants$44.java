// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$44 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$44() {}
    static final FunctionDescriptor RprGenericJoint_lock_axes$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle RprGenericJoint_lock_axes$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_lock_axes",
        constants$44.RprGenericJoint_lock_axes$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_locked_axes$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_locked_axes$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_locked_axes",
        constants$44.RprGenericJoint_locked_axes$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_motor$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_motor$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_motor",
        constants$44.RprGenericJoint_motor$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_motor_axes$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_motor_axes$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_motor_axes",
        constants$44.RprGenericJoint_motor_axes$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_motor_model$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_motor_model$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_motor_model",
        constants$44.RprGenericJoint_motor_model$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_motors$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_motors$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_motors",
        constants$44.RprGenericJoint_motors$FUNC
    );
}


