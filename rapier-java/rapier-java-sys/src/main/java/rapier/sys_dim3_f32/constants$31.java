// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$31 {

    static final FunctionDescriptor RprGenericJoint_locked_axes$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_locked_axes$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_locked_axes",
        constants$31.RprGenericJoint_locked_axes$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_motor$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_motor$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_motor",
        constants$31.RprGenericJoint_motor$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_motor_model$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_motor_model$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_motor_model",
        constants$31.RprGenericJoint_motor_model$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle RprGenericJoint_new$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_new",
        constants$31.RprGenericJoint_new$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_set_contacts_enabled$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprGenericJoint_set_contacts_enabled$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_contacts_enabled",
        constants$31.RprGenericJoint_set_contacts_enabled$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_set_enabled$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprGenericJoint_set_enabled$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_enabled",
        constants$31.RprGenericJoint_set_enabled$FUNC
    );
}


