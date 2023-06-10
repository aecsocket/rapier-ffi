// Generated by jextract

package rapier.sys_dim2_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$65 {

    static final FunctionDescriptor RprRigidBodyVec_handle$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("index"),
        Constants$root.C_INT$LAYOUT.withName("generation")
    ).withName("RprArenaKey"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle RprRigidBodyVec_handle$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyVec_handle",
        constants$65.RprRigidBodyVec_handle$FUNC
    );
    static final FunctionDescriptor RprRigidBodyVec_len$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyVec_len$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyVec_len",
        constants$65.RprRigidBodyVec_len$FUNC
    );
    static final FunctionDescriptor RprRigidBodyVec_value$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle RprRigidBodyVec_value$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyVec_value",
        constants$65.RprRigidBodyVec_value$FUNC
    );
    static final FunctionDescriptor RprRigidBody_activation$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_activation$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_activation",
        constants$65.RprRigidBody_activation$FUNC
    );
    static final FunctionDescriptor RprRigidBody_activation_mut$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_activation_mut$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_activation_mut",
        constants$65.RprRigidBody_activation_mut$FUNC
    );
    static final FunctionDescriptor RprRigidBody_add_force$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y")
        ).withName("RprVector"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_add_force$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_add_force",
        constants$65.RprRigidBody_add_force$FUNC
    );
}


