// Generated by jextract

package rapier.sys_dim3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$45 {

    static final FunctionDescriptor RprGenericJoint_motor_model$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_motor_model$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_motor_model",
        constants$45.RprGenericJoint_motor_model$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_motors$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_motors$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_motors",
        constants$45.RprGenericJoint_motors$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle RprGenericJoint_new$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_new",
        constants$45.RprGenericJoint_new$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_set_contacts_enabled$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprGenericJoint_set_contacts_enabled$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_contacts_enabled",
        constants$45.RprGenericJoint_set_contacts_enabled$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_set_coupled_axes$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle RprGenericJoint_set_coupled_axes$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_coupled_axes",
        constants$45.RprGenericJoint_set_coupled_axes$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_set_enabled$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprGenericJoint_set_enabled$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_enabled",
        constants$45.RprGenericJoint_set_enabled$FUNC
    );
}

