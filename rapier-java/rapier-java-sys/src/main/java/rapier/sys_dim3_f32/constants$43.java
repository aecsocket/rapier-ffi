// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$43 {

    static final FunctionDescriptor RprQueryPipeline_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RprQueryPipeline_new$MH = RuntimeHelper.downcallHandle(
        "RprQueryPipeline_new",
        constants$43.RprQueryPipeline_new$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_additional_mass$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprRigidBodyBuilder_additional_mass$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_additional_mass",
        constants$43.RprRigidBodyBuilder_additional_mass$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_angular_damping$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprRigidBodyBuilder_angular_damping$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_angular_damping",
        constants$43.RprRigidBodyBuilder_angular_damping$FUNC
    );
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
        constants$43.RprRigidBodyBuilder_angvel$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_build$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyBuilder_build$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_build",
        constants$43.RprRigidBodyBuilder_build$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_can_sleep$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBodyBuilder_can_sleep$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_can_sleep",
        constants$43.RprRigidBodyBuilder_can_sleep$FUNC
    );
}


