// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$48 {

    static final FunctionDescriptor RprRigidBodyBuilder_sleeping$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBodyBuilder_sleeping$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_sleeping",
        constants$48.RprRigidBodyBuilder_sleeping$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_translation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y"),
            Constants$root.C_FLOAT$LAYOUT.withName("z")
        ).withName("RprVector")
    );
    static final MethodHandle RprRigidBodyBuilder_translation$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_translation",
        constants$48.RprRigidBodyBuilder_translation$FUNC
    );
    static final FunctionDescriptor RprRigidBodySet_all$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodySet_all$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodySet_all",
        constants$48.RprRigidBodySet_all$FUNC
    );
    static final FunctionDescriptor RprRigidBodySet_contains$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey")
    );
    static final MethodHandle RprRigidBodySet_contains$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodySet_contains",
        constants$48.RprRigidBodySet_contains$FUNC
    );
    static final FunctionDescriptor RprRigidBodySet_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodySet_drop$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodySet_drop",
        constants$48.RprRigidBodySet_drop$FUNC
    );
    static final FunctionDescriptor RprRigidBodySet_get$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey")
    );
    static final MethodHandle RprRigidBodySet_get$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodySet_get",
        constants$48.RprRigidBodySet_get$FUNC
    );
}


