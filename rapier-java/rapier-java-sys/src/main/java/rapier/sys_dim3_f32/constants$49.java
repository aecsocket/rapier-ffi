// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$49 {

    static final FunctionDescriptor RprImpulseJointSet_contains$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey")
    );
    static final MethodHandle RprImpulseJointSet_contains$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJointSet_contains",
        constants$49.RprImpulseJointSet_contains$FUNC
    );
    static final FunctionDescriptor RprImpulseJointSet_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprImpulseJointSet_drop$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJointSet_drop",
        constants$49.RprImpulseJointSet_drop$FUNC
    );
    static final FunctionDescriptor RprImpulseJointSet_get$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey")
    );
    static final MethodHandle RprImpulseJointSet_get$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJointSet_get",
        constants$49.RprImpulseJointSet_get$FUNC
    );
    static final FunctionDescriptor RprImpulseJointSet_get_mut$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey")
    );
    static final MethodHandle RprImpulseJointSet_get_mut$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJointSet_get_mut",
        constants$49.RprImpulseJointSet_get_mut$FUNC
    );
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
}


