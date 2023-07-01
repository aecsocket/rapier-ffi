// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$79 {

    static final FunctionDescriptor RprRigidBody_next_position$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y"),
            Constants$root.C_DOUBLE$LAYOUT.withName("z"),
            Constants$root.C_DOUBLE$LAYOUT.withName("w")
        ).withName("rotation"),
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y"),
            Constants$root.C_DOUBLE$LAYOUT.withName("z")
        ).withName("translation")
    ).withName("RprIsometry"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_next_position$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_next_position",
        constants$79.RprRigidBody_next_position$FUNC
    );
    static final FunctionDescriptor RprRigidBody_position$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y"),
            Constants$root.C_DOUBLE$LAYOUT.withName("z"),
            Constants$root.C_DOUBLE$LAYOUT.withName("w")
        ).withName("rotation"),
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y"),
            Constants$root.C_DOUBLE$LAYOUT.withName("z")
        ).withName("translation")
    ).withName("RprIsometry"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_position$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_position",
        constants$79.RprRigidBody_position$FUNC
    );
    static final FunctionDescriptor RprRigidBody_predict_position_using_velocity_and_forces$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y"),
            Constants$root.C_DOUBLE$LAYOUT.withName("z"),
            Constants$root.C_DOUBLE$LAYOUT.withName("w")
        ).withName("rotation"),
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y"),
            Constants$root.C_DOUBLE$LAYOUT.withName("z")
        ).withName("translation")
    ).withName("RprIsometry"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle RprRigidBody_predict_position_using_velocity_and_forces$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_predict_position_using_velocity_and_forces",
        constants$79.RprRigidBody_predict_position_using_velocity_and_forces$FUNC
    );
    static final FunctionDescriptor RprRigidBody_recompute_mass_properties_from_colliders$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_recompute_mass_properties_from_colliders$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_recompute_mass_properties_from_colliders",
        constants$79.RprRigidBody_recompute_mass_properties_from_colliders$FUNC
    );
    static final FunctionDescriptor RprRigidBody_reset_forces$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_reset_forces$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_reset_forces",
        constants$79.RprRigidBody_reset_forces$FUNC
    );
    static final FunctionDescriptor RprRigidBody_reset_torques$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_reset_torques$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_reset_torques",
        constants$79.RprRigidBody_reset_torques$FUNC
    );
}


