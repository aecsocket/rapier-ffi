// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$50 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$50() {}
    static final FunctionDescriptor RprImpulseJointSet_remove$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprImpulseJointSet_remove$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJointSet_remove",
        constants$50.RprImpulseJointSet_remove$FUNC
    );
    static final FunctionDescriptor RprImpulseJointVec_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprImpulseJointVec_drop$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJointVec_drop",
        constants$50.RprImpulseJointVec_drop$FUNC
    );
    static final FunctionDescriptor RprImpulseJointVec_handle$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("index"),
        Constants$root.C_INT$LAYOUT.withName("generation")
    ).withName("RprArenaKey"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle RprImpulseJointVec_handle$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJointVec_handle",
        constants$50.RprImpulseJointVec_handle$FUNC
    );
    static final FunctionDescriptor RprImpulseJointVec_len$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprImpulseJointVec_len$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJointVec_len",
        constants$50.RprImpulseJointVec_len$FUNC
    );
    static final FunctionDescriptor RprImpulseJointVec_value$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle RprImpulseJointVec_value$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJointVec_value",
        constants$50.RprImpulseJointVec_value$FUNC
    );
    static final FunctionDescriptor RprImpulseJoint_body1$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("index"),
        Constants$root.C_INT$LAYOUT.withName("generation")
    ).withName("RprArenaKey"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprImpulseJoint_body1$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJoint_body1",
        constants$50.RprImpulseJoint_body1$FUNC
    );
}


