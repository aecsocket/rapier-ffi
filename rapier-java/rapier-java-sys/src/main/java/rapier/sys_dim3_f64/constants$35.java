// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$35 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$35() {}
    static final FunctionDescriptor RprRigidBody_reset_forces$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_reset_forces$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_reset_forces",
        constants$35.RprRigidBody_reset_forces$FUNC
    );
    static final FunctionDescriptor RprRigidBody_reset_torques$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_reset_torques$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_reset_torques",
        constants$35.RprRigidBody_reset_torques$FUNC
    );
    static final FunctionDescriptor RprRigidBody_rotation$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(4, Constants$root.C_DOUBLE$LAYOUT).withName("_0")
    ).withName("RprRot"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_rotation$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_rotation",
        constants$35.RprRigidBody_rotation$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_additional_mass$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_additional_mass$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_additional_mass",
        constants$35.RprRigidBody_set_additional_mass$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_angular_damping$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_angular_damping$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_angular_damping",
        constants$35.RprRigidBody_set_angular_damping$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_angvel$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(3, Constants$root.C_DOUBLE$LAYOUT).withName("_0")
        ).withName("RprVec"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_angvel$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_angvel",
        constants$35.RprRigidBody_set_angvel$FUNC
    );
}


