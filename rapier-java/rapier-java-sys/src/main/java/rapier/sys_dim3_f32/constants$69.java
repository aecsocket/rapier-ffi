// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$69 {

    static final FunctionDescriptor RprRigidBodySet_is_empty$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodySet_is_empty$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodySet_is_empty",
        constants$69.RprRigidBodySet_is_empty$FUNC
    );
    static final FunctionDescriptor RprRigidBodySet_len$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodySet_len$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodySet_len",
        constants$69.RprRigidBodySet_len$FUNC
    );
    static final FunctionDescriptor RprRigidBodySet_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RprRigidBodySet_new$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodySet_new",
        constants$69.RprRigidBodySet_new$FUNC
    );
    static final FunctionDescriptor RprRigidBodySet_remove$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBodySet_remove$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodySet_remove",
        constants$69.RprRigidBodySet_remove$FUNC
    );
    static final FunctionDescriptor RprRigidBodyVec_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyVec_drop$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyVec_drop",
        constants$69.RprRigidBodyVec_drop$FUNC
    );
    static final FunctionDescriptor RprRigidBodyVec_handle$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("index"),
        Constants$root.C_INT$LAYOUT.withName("generation")
    ).withName("RprArenaKey"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle RprRigidBodyVec_handle$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyVec_handle",
        constants$69.RprRigidBodyVec_handle$FUNC
    );
}


