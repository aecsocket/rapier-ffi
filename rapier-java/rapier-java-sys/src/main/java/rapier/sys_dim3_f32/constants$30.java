// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$30 {

    static final FunctionDescriptor RprGenericJoint_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_drop$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_drop",
        constants$30.RprGenericJoint_drop$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_is_enabled$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_is_enabled$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_is_enabled",
        constants$30.RprGenericJoint_is_enabled$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_limits$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_limits$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_limits",
        constants$30.RprGenericJoint_limits$FUNC
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
        constants$30.RprGenericJoint_local_anchor1$FUNC
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
        constants$30.RprGenericJoint_local_anchor2$FUNC
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
        constants$30.RprGenericJoint_local_axis1$FUNC
    );
}


