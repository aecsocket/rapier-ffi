// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$42 {

    static final FunctionDescriptor RprRigidBodyBuilder_fixed$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RprRigidBodyBuilder_fixed$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_fixed",
        constants$42.RprRigidBodyBuilder_fixed$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_gravity_scale$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle RprRigidBodyBuilder_gravity_scale$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_gravity_scale",
        constants$42.RprRigidBodyBuilder_gravity_scale$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_kinematic_position_based$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RprRigidBodyBuilder_kinematic_position_based$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_kinematic_position_based",
        constants$42.RprRigidBodyBuilder_kinematic_position_based$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_kinematic_velocity_based$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RprRigidBodyBuilder_kinematic_velocity_based$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_kinematic_velocity_based",
        constants$42.RprRigidBodyBuilder_kinematic_velocity_based$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_linear_damping$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle RprRigidBodyBuilder_linear_damping$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_linear_damping",
        constants$42.RprRigidBodyBuilder_linear_damping$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_linvel$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y"),
            Constants$root.C_DOUBLE$LAYOUT.withName("z")
        ).withName("RprVector")
    );
    static final MethodHandle RprRigidBodyBuilder_linvel$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_linvel",
        constants$42.RprRigidBodyBuilder_linvel$FUNC
    );
}


