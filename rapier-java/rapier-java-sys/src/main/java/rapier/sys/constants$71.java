// Generated by jextract

package rapier.sys;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$71 {

    static final FunctionDescriptor RprRigidBody_add_torque$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x")
        ).withName("RprAngVector"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_add_torque$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_add_torque",
        constants$71.RprRigidBody_add_torque$FUNC
    );
    static final FunctionDescriptor RprRigidBody_angular_damping$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_angular_damping$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_angular_damping",
        constants$71.RprRigidBody_angular_damping$FUNC
    );
    static final FunctionDescriptor RprRigidBody_angvel$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("x")
    ).withName("RprAngVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_angvel$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_angvel",
        constants$71.RprRigidBody_angvel$FUNC
    );
    static final FunctionDescriptor RprRigidBody_apply_impulse$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y")
        ).withName("RprVector"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_apply_impulse$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_apply_impulse",
        constants$71.RprRigidBody_apply_impulse$FUNC
    );
    static final FunctionDescriptor RprRigidBody_apply_impulse_at_point$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y")
        ).withName("RprVector"),
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y")
        ).withName("RprVector"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_apply_impulse_at_point$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_apply_impulse_at_point",
        constants$71.RprRigidBody_apply_impulse_at_point$FUNC
    );
    static final FunctionDescriptor RprRigidBody_apply_torque_impulse$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x")
        ).withName("RprAngVector"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_apply_torque_impulse$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_apply_torque_impulse",
        constants$71.RprRigidBody_apply_torque_impulse$FUNC
    );
}


