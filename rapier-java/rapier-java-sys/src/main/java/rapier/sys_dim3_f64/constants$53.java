// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$53 {

    static final FunctionDescriptor RprIslandManager_active_kinematic_bodies$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprIslandManager_active_kinematic_bodies$MH = RuntimeHelper.downcallHandle(
        "RprIslandManager_active_kinematic_bodies",
        constants$53.RprIslandManager_active_kinematic_bodies$FUNC
    );
    static final FunctionDescriptor RprIslandManager_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprIslandManager_drop$MH = RuntimeHelper.downcallHandle(
        "RprIslandManager_drop",
        constants$53.RprIslandManager_drop$FUNC
    );
    static final FunctionDescriptor RprIslandManager_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RprIslandManager_new$MH = RuntimeHelper.downcallHandle(
        "RprIslandManager_new",
        constants$53.RprIslandManager_new$FUNC
    );
    static final FunctionDescriptor RprJointLimits_default$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("min"),
        Constants$root.C_DOUBLE$LAYOUT.withName("max"),
        Constants$root.C_DOUBLE$LAYOUT.withName("impulse")
    ).withName("RprJointLimits"));
    static final MethodHandle RprJointLimits_default$MH = RuntimeHelper.downcallHandle(
        "RprJointLimits_default",
        constants$53.RprJointLimits_default$FUNC
    );
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
}


