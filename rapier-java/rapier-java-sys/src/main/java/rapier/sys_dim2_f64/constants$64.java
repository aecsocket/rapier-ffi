// Generated by jextract

package rapier.sys_dim2_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$64 {

    static final FunctionDescriptor RprRigidBodyBuilder_build$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyBuilder_build$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_build",
        constants$64.RprRigidBodyBuilder_build$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_can_sleep$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBodyBuilder_can_sleep$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_can_sleep",
        constants$64.RprRigidBodyBuilder_can_sleep$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_ccd_enabled$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBodyBuilder_ccd_enabled$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_ccd_enabled",
        constants$64.RprRigidBodyBuilder_ccd_enabled$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_dominance_group$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle RprRigidBodyBuilder_dominance_group$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_dominance_group",
        constants$64.RprRigidBodyBuilder_dominance_group$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyBuilder_drop$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_drop",
        constants$64.RprRigidBodyBuilder_drop$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_dynamic$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RprRigidBodyBuilder_dynamic$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_dynamic",
        constants$64.RprRigidBodyBuilder_dynamic$FUNC
    );
}


