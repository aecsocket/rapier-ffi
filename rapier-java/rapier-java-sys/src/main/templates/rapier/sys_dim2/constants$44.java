// Generated by jextract

package rapier.sys_dim2;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$44 {

    static final FunctionDescriptor RprGenericJoint_set_limits$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_set_limits$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_limits",
        constants$44.RprGenericJoint_set_limits$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_set_limits_for$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprGenericJoint_set_limits_for$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_limits_for",
        constants$44.RprGenericJoint_set_limits_for$FUNC
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
        constants$44.RprGenericJoint_set_local_anchor1$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_set_local_anchor2$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y")
        ).withName("RprVector")
    );
    static final MethodHandle RprGenericJoint_set_local_anchor2$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_local_anchor2",
        constants$44.RprGenericJoint_set_local_anchor2$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_set_local_axis1$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y")
        ).withName("RprVector")
    );
    static final MethodHandle RprGenericJoint_set_local_axis1$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_local_axis1",
        constants$44.RprGenericJoint_set_local_axis1$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_set_local_axis2$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y")
        ).withName("RprVector")
    );
    static final MethodHandle RprGenericJoint_set_local_axis2$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_local_axis2",
        constants$44.RprGenericJoint_set_local_axis2$FUNC
    );
}


