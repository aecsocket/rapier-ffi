// Generated by jextract

package rapier.sys_dim2_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$43 {

    static final FunctionDescriptor RprGenericJoint_set_contacts_enabled$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprGenericJoint_set_contacts_enabled$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_contacts_enabled",
        constants$43.RprGenericJoint_set_contacts_enabled$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_set_coupled_axes$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle RprGenericJoint_set_coupled_axes$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_coupled_axes",
        constants$43.RprGenericJoint_set_coupled_axes$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_set_enabled$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprGenericJoint_set_enabled$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_enabled",
        constants$43.RprGenericJoint_set_enabled$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_set_limit_axes$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle RprGenericJoint_set_limit_axes$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_limit_axes",
        constants$43.RprGenericJoint_set_limit_axes$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_set_limits$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprGenericJoint_set_limits$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_limits",
        constants$43.RprGenericJoint_set_limits$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_set_local_anchor1$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y")
        ).withName("RprVector")
    );
    static final MethodHandle RprGenericJoint_set_local_anchor1$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_local_anchor1",
        constants$43.RprGenericJoint_set_local_anchor1$FUNC
    );
}


