// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$78 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$78() {}
    static final FunctionDescriptor RprRigidBody_kinetic_energy$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_kinetic_energy$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_kinetic_energy",
        constants$78.RprRigidBody_kinetic_energy$FUNC
    );
    static final FunctionDescriptor RprRigidBody_linear_damping$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_linear_damping$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_linear_damping",
        constants$78.RprRigidBody_linear_damping$FUNC
    );
    static final FunctionDescriptor RprRigidBody_linvel$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("x"),
        Constants$root.C_FLOAT$LAYOUT.withName("y"),
        Constants$root.C_FLOAT$LAYOUT.withName("z")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_linvel$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_linvel",
        constants$78.RprRigidBody_linvel$FUNC
    );
    static final FunctionDescriptor RprRigidBody_lock_rotations$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_lock_rotations$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_lock_rotations",
        constants$78.RprRigidBody_lock_rotations$FUNC
    );
    static final FunctionDescriptor RprRigidBody_lock_translations$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_lock_translations$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_lock_translations",
        constants$78.RprRigidBody_lock_translations$FUNC
    );
    static final FunctionDescriptor RprRigidBody_locked_axes$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_locked_axes$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_locked_axes",
        constants$78.RprRigidBody_locked_axes$FUNC
    );
}


