// Generated by jextract

package rapier.sys_dim2;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$48 {

    static final FunctionDescriptor RprImpulseJointVec_len$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprImpulseJointVec_len$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJointVec_len",
        constants$48.RprImpulseJointVec_len$FUNC
    );
    static final FunctionDescriptor RprImpulseJointVec_value$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle RprImpulseJointVec_value$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJointVec_value",
        constants$48.RprImpulseJointVec_value$FUNC
    );
    static final FunctionDescriptor RprImpulseJoint_body1$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("index"),
        Constants$root.C_INT$LAYOUT.withName("generation")
    ).withName("RprArenaKey"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprImpulseJoint_body1$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJoint_body1",
        constants$48.RprImpulseJoint_body1$FUNC
    );
    static final FunctionDescriptor RprImpulseJoint_body2$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("index"),
        Constants$root.C_INT$LAYOUT.withName("generation")
    ).withName("RprArenaKey"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprImpulseJoint_body2$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJoint_body2",
        constants$48.RprImpulseJoint_body2$FUNC
    );
    static final FunctionDescriptor RprImpulseJoint_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprImpulseJoint_data$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJoint_data",
        constants$48.RprImpulseJoint_data$FUNC
    );
    static final FunctionDescriptor RprImpulseJoint_impulses$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("x"),
        Constants$root.C_FLOAT$LAYOUT.withName("y"),
        Constants$root.C_FLOAT$LAYOUT.withName("z")
    ).withName("RprSpacialVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprImpulseJoint_impulses$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJoint_impulses",
        constants$48.RprImpulseJoint_impulses$FUNC
    );
}


