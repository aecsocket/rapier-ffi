// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$60 {

    static final FunctionDescriptor RprRigidBodyBuilder_angvel$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y"),
            Constants$root.C_FLOAT$LAYOUT.withName("z")
        ).withName("RprAngVector")
    );
    static final MethodHandle RprRigidBodyBuilder_angvel$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_angvel",
        constants$60.RprRigidBodyBuilder_angvel$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_build$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyBuilder_build$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_build",
        constants$60.RprRigidBodyBuilder_build$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_can_sleep$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBodyBuilder_can_sleep$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_can_sleep",
        constants$60.RprRigidBodyBuilder_can_sleep$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_ccd_enabled$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBodyBuilder_ccd_enabled$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_ccd_enabled",
        constants$60.RprRigidBodyBuilder_ccd_enabled$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_dominance_group$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle RprRigidBodyBuilder_dominance_group$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_dominance_group",
        constants$60.RprRigidBodyBuilder_dominance_group$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyBuilder_drop$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_drop",
        constants$60.RprRigidBodyBuilder_drop$FUNC
    );
}


