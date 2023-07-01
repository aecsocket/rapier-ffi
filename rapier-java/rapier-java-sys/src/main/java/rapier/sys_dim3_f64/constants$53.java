// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$53 {

    static final FunctionDescriptor RprJointMotor_default$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("target_vel"),
        Constants$root.C_DOUBLE$LAYOUT.withName("target_pos"),
        Constants$root.C_DOUBLE$LAYOUT.withName("stiffness"),
        Constants$root.C_DOUBLE$LAYOUT.withName("damping"),
        Constants$root.C_DOUBLE$LAYOUT.withName("max_force"),
        Constants$root.C_DOUBLE$LAYOUT.withName("impulse"),
        Constants$root.C_INT$LAYOUT.withName("model"),
        MemoryLayout.paddingLayout(32)
    ).withName("RprJointMotor"));
    static final MethodHandle RprJointMotor_default$MH = RuntimeHelper.downcallHandle(
        "RprJointMotor_default",
        constants$53.RprJointMotor_default$FUNC
    );
    static final FunctionDescriptor RprKinematicCharacterController_autostep$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprKinematicCharacterController_autostep$MH = RuntimeHelper.downcallHandle(
        "RprKinematicCharacterController_autostep",
        constants$53.RprKinematicCharacterController_autostep$FUNC
    );
    static final FunctionDescriptor RprKinematicCharacterController_clear_autostep$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprKinematicCharacterController_clear_autostep$MH = RuntimeHelper.downcallHandle(
        "RprKinematicCharacterController_clear_autostep",
        constants$53.RprKinematicCharacterController_clear_autostep$FUNC
    );
    static final FunctionDescriptor RprKinematicCharacterController_clear_snap_to_ground$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprKinematicCharacterController_clear_snap_to_ground$MH = RuntimeHelper.downcallHandle(
        "RprKinematicCharacterController_clear_snap_to_ground",
        constants$53.RprKinematicCharacterController_clear_snap_to_ground$FUNC
    );
    static final FunctionDescriptor RprKinematicCharacterController_default$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RprKinematicCharacterController_default$MH = RuntimeHelper.downcallHandle(
        "RprKinematicCharacterController_default",
        constants$53.RprKinematicCharacterController_default$FUNC
    );
    static final FunctionDescriptor RprKinematicCharacterController_max_slope_climb_angle$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprKinematicCharacterController_max_slope_climb_angle$MH = RuntimeHelper.downcallHandle(
        "RprKinematicCharacterController_max_slope_climb_angle",
        constants$53.RprKinematicCharacterController_max_slope_climb_angle$FUNC
    );
}


