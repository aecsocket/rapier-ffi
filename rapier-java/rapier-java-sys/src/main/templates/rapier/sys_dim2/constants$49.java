// Generated by jextract

package rapier.sys_dim2;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$49 {

    static final FunctionDescriptor RprImpulseJointSet_insert$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("index"),
        Constants$root.C_INT$LAYOUT.withName("generation")
    ).withName("RprArenaKey"),
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey"),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprImpulseJointSet_insert$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJointSet_insert",
        constants$49.RprImpulseJointSet_insert$FUNC
    );
    static final FunctionDescriptor RprImpulseJointSet_is_empty$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprImpulseJointSet_is_empty$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJointSet_is_empty",
        constants$49.RprImpulseJointSet_is_empty$FUNC
    );
    static final FunctionDescriptor RprImpulseJointSet_len$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprImpulseJointSet_len$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJointSet_len",
        constants$49.RprImpulseJointSet_len$FUNC
    );
    static final FunctionDescriptor RprImpulseJointSet_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RprImpulseJointSet_new$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJointSet_new",
        constants$49.RprImpulseJointSet_new$FUNC
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
        constants$49.RprImpulseJointSet_remove$FUNC
    );
    static final FunctionDescriptor RprImpulseJointVec_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprImpulseJointVec_drop$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJointVec_drop",
        constants$49.RprImpulseJointVec_drop$FUNC
    );
}


