// Generated by jextract

package rapier.sys_dim2_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$47 {

    static final FunctionDescriptor RprRigidBody_angvel$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("x")
    ).withName("RprAngVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_angvel$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_angvel",
        constants$47.RprRigidBody_angvel$FUNC
    );
    static final FunctionDescriptor RprRigidBody_apply_impulse$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y")
        ).withName("RprVector"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_apply_impulse$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_apply_impulse",
        constants$47.RprRigidBody_apply_impulse$FUNC
    );
    static final FunctionDescriptor RprRigidBody_apply_impulse_at_point$FUNC = FunctionDescriptor.ofVoid(
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
    static final MethodHandle RprRigidBody_apply_impulse_at_point$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_apply_impulse_at_point",
        constants$47.RprRigidBody_apply_impulse_at_point$FUNC
    );
    static final FunctionDescriptor RprRigidBody_apply_torque_impulse$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x")
        ).withName("RprAngVector"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_apply_torque_impulse$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_apply_torque_impulse",
        constants$47.RprRigidBody_apply_torque_impulse$FUNC
    );
    static final FunctionDescriptor RprRigidBody_body_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_body_type$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_body_type",
        constants$47.RprRigidBody_body_type$FUNC
    );
    static final FunctionDescriptor RprRigidBody_center_of_mass$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("x"),
        Constants$root.C_DOUBLE$LAYOUT.withName("y")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_center_of_mass$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_center_of_mass",
        constants$47.RprRigidBody_center_of_mass$FUNC
    );
}


