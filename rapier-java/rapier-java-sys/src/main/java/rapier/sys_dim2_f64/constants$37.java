// Generated by jextract

package rapier.sys_dim2_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$37 {

    static final FunctionDescriptor RprImpulseJointSet_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RprImpulseJointSet_new$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJointSet_new",
        constants$37.RprImpulseJointSet_new$FUNC
    );
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
        constants$37.RprImpulseJointSet_remove$FUNC
    );
    static final FunctionDescriptor RprImpulseJointVec_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprImpulseJointVec_drop$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJointVec_drop",
        constants$37.RprImpulseJointVec_drop$FUNC
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
        constants$37.RprImpulseJointVec_handle$FUNC
    );
    static final FunctionDescriptor RprImpulseJointVec_len$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprImpulseJointVec_len$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJointVec_len",
        constants$37.RprImpulseJointVec_len$FUNC
    );
    static final FunctionDescriptor RprImpulseJointVec_value$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle RprImpulseJointVec_value$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJointVec_value",
        constants$37.RprImpulseJointVec_value$FUNC
    );
}


