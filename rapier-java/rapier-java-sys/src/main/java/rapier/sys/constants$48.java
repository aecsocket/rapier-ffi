// Generated by jextract

package rapier.sys;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$48 {

    static final FunctionDescriptor RprRigidBodySet_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RprRigidBodySet_new$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodySet_new",
        constants$48.RprRigidBodySet_new$FUNC
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
        constants$48.RprRigidBodySet_remove$FUNC
    );
    static final FunctionDescriptor RprRigidBodyVec_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyVec_drop$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyVec_drop",
        constants$48.RprRigidBodyVec_drop$FUNC
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
        constants$48.RprRigidBodyVec_handle$FUNC
    );
    static final FunctionDescriptor RprRigidBodyVec_len$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyVec_len$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyVec_len",
        constants$48.RprRigidBodyVec_len$FUNC
    );
    static final FunctionDescriptor RprRigidBodyVec_value$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle RprRigidBodyVec_value$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyVec_value",
        constants$48.RprRigidBodyVec_value$FUNC
    );
}


