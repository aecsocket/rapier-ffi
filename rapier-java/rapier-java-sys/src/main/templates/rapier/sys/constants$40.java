// Generated by jextract

package rapier.sys;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$40 {

    static final FunctionDescriptor RprGenericJoint_contacts_enabled$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_contacts_enabled$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_contacts_enabled",
        constants$40.RprGenericJoint_contacts_enabled$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_coupled_axes$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_coupled_axes$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_coupled_axes",
        constants$40.RprGenericJoint_coupled_axes$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_drop$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_drop",
        constants$40.RprGenericJoint_drop$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_is_enabled$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_is_enabled$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_is_enabled",
        constants$40.RprGenericJoint_is_enabled$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_limit_axes$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_limit_axes$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_limit_axes",
        constants$40.RprGenericJoint_limit_axes$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_limits$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_limits$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_limits",
        constants$40.RprGenericJoint_limits$FUNC
    );
}

