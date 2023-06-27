// Generated by jextract

package rapier.sys_dim2_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$66 {

    static final FunctionDescriptor RprRigidBody_activation_mut$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_activation_mut$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_activation_mut",
        constants$66.RprRigidBody_activation_mut$FUNC
    );
    static final FunctionDescriptor RprRigidBody_add_force$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y")
        ).withName("RprVector"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_add_force$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_add_force",
        constants$66.RprRigidBody_add_force$FUNC
    );
    static final FunctionDescriptor RprRigidBody_add_force_at_point$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y")
        ).withName("RprVector"),
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y")
        ).withName("RprVector"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_add_force_at_point$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_add_force_at_point",
        constants$66.RprRigidBody_add_force_at_point$FUNC
    );
    static final FunctionDescriptor RprRigidBody_add_torque$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x")
        ).withName("RprAngVector"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_add_torque$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_add_torque",
        constants$66.RprRigidBody_add_torque$FUNC
    );
    static final FunctionDescriptor RprRigidBody_angular_damping$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_angular_damping$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_angular_damping",
        constants$66.RprRigidBody_angular_damping$FUNC
    );
    static final FunctionDescriptor RprRigidBody_angvel$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("x")
    ).withName("RprAngVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_angvel$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_angvel",
        constants$66.RprRigidBody_angvel$FUNC
    );
}


