// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$73 {

    static final FunctionDescriptor RprRigidBodyVec_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyVec_drop$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyVec_drop",
        constants$73.RprRigidBodyVec_drop$FUNC
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
        constants$73.RprRigidBodyVec_handle$FUNC
    );
    static final FunctionDescriptor RprRigidBodyVec_len$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyVec_len$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyVec_len",
        constants$73.RprRigidBodyVec_len$FUNC
    );
    static final FunctionDescriptor RprRigidBodyVec_value$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle RprRigidBodyVec_value$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyVec_value",
        constants$73.RprRigidBodyVec_value$FUNC
    );
    static final FunctionDescriptor RprRigidBody_activation$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_activation$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_activation",
        constants$73.RprRigidBody_activation$FUNC
    );
    static final FunctionDescriptor RprRigidBody_activation_mut$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_activation_mut$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_activation_mut",
        constants$73.RprRigidBody_activation_mut$FUNC
    );
}


