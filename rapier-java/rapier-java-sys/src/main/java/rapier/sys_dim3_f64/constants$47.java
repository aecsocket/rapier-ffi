// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$47 {

    static final FunctionDescriptor RprRigidBodyActivation_time_since_can_sleep$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyActivation_time_since_can_sleep$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyActivation_time_since_can_sleep",
        constants$47.RprRigidBodyActivation_time_since_can_sleep$FUNC
    );
    static final FunctionDescriptor RprRigidBodyActivation_time_until_sleep$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyActivation_time_until_sleep$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyActivation_time_until_sleep",
        constants$47.RprRigidBodyActivation_time_until_sleep$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_additional_mass$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle RprRigidBodyBuilder_additional_mass$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_additional_mass",
        constants$47.RprRigidBodyBuilder_additional_mass$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_angular_damping$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle RprRigidBodyBuilder_angular_damping$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_angular_damping",
        constants$47.RprRigidBodyBuilder_angular_damping$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_angvel$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y"),
            Constants$root.C_DOUBLE$LAYOUT.withName("z")
        ).withName("RprAngVector")
    );
    static final MethodHandle RprRigidBodyBuilder_angvel$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_angvel",
        constants$47.RprRigidBodyBuilder_angvel$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_build$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyBuilder_build$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_build",
        constants$47.RprRigidBodyBuilder_build$FUNC
    );
}


