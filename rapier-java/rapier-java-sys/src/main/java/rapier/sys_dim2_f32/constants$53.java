// Generated by jextract

package rapier.sys_dim2_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$53 {

    static final FunctionDescriptor RprRigidBody_is_sleeping$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_is_sleeping$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_is_sleeping",
        constants$53.RprRigidBody_is_sleeping$FUNC
    );
    static final FunctionDescriptor RprRigidBody_is_translation_locked$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_is_translation_locked$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_is_translation_locked",
        constants$53.RprRigidBody_is_translation_locked$FUNC
    );
    static final FunctionDescriptor RprRigidBody_kinetic_energy$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_kinetic_energy$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_kinetic_energy",
        constants$53.RprRigidBody_kinetic_energy$FUNC
    );
    static final FunctionDescriptor RprRigidBody_linear_damping$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_linear_damping$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_linear_damping",
        constants$53.RprRigidBody_linear_damping$FUNC
    );
    static final FunctionDescriptor RprRigidBody_linvel$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("x"),
        Constants$root.C_FLOAT$LAYOUT.withName("y")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_linvel$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_linvel",
        constants$53.RprRigidBody_linvel$FUNC
    );
    static final FunctionDescriptor RprRigidBody_lock_translations$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_lock_translations$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_lock_translations",
        constants$53.RprRigidBody_lock_translations$FUNC
    );
}


