// Generated by jextract

package rapier.sys;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$75 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$75() {}
    static final FunctionDescriptor RprRigidBody_is_fixed$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_is_fixed$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_is_fixed",
        constants$75.RprRigidBody_is_fixed$FUNC
    );
    static final FunctionDescriptor RprRigidBody_is_kinematic$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_is_kinematic$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_is_kinematic",
        constants$75.RprRigidBody_is_kinematic$FUNC
    );
    static final FunctionDescriptor RprRigidBody_is_rotation_locked$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_is_rotation_locked$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_is_rotation_locked",
        constants$75.RprRigidBody_is_rotation_locked$FUNC
    );
    static final FunctionDescriptor RprRigidBody_is_sleeping$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_is_sleeping$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_is_sleeping",
        constants$75.RprRigidBody_is_sleeping$FUNC
    );
    static final FunctionDescriptor RprRigidBody_is_translation_locked$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_is_translation_locked$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_is_translation_locked",
        constants$75.RprRigidBody_is_translation_locked$FUNC
    );
    static final FunctionDescriptor RprRigidBody_kinetic_energy$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_kinetic_energy$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_kinetic_energy",
        constants$75.RprRigidBody_kinetic_energy$FUNC
    );
}


