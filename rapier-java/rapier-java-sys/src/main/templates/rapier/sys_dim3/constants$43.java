// Generated by jextract

package rapier.sys_dim3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$43 {

    static final FunctionDescriptor RprGenericJoint_limits$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_limits$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_limits",
        constants$43.RprGenericJoint_limits$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_limits_for$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_limits_for$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_limits_for",
        constants$43.RprGenericJoint_limits_for$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_local_anchor1$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("x"),
        Constants$root.C_FLOAT$LAYOUT.withName("y"),
        Constants$root.C_FLOAT$LAYOUT.withName("z")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_local_anchor1$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_local_anchor1",
        constants$43.RprGenericJoint_local_anchor1$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_local_anchor2$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("x"),
        Constants$root.C_FLOAT$LAYOUT.withName("y"),
        Constants$root.C_FLOAT$LAYOUT.withName("z")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_local_anchor2$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_local_anchor2",
        constants$43.RprGenericJoint_local_anchor2$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_local_axis1$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("x"),
        Constants$root.C_FLOAT$LAYOUT.withName("y"),
        Constants$root.C_FLOAT$LAYOUT.withName("z")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_local_axis1$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_local_axis1",
        constants$43.RprGenericJoint_local_axis1$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_local_axis2$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("x"),
        Constants$root.C_FLOAT$LAYOUT.withName("y"),
        Constants$root.C_FLOAT$LAYOUT.withName("z")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_local_axis2$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_local_axis2",
        constants$43.RprGenericJoint_local_axis2$FUNC
    );
}

