// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$77 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$77() {}
    static final FunctionDescriptor RprRigidBody_is_enabled$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_is_enabled$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_is_enabled",
        constants$77.RprRigidBody_is_enabled$FUNC
    );
    static final FunctionDescriptor RprRigidBody_is_fixed$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_is_fixed$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_is_fixed",
        constants$77.RprRigidBody_is_fixed$FUNC
    );
    static final FunctionDescriptor RprRigidBody_is_kinematic$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_is_kinematic$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_is_kinematic",
        constants$77.RprRigidBody_is_kinematic$FUNC
    );
    static final FunctionDescriptor RprRigidBody_is_rotation_locked$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_is_rotation_locked$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_is_rotation_locked",
        constants$77.RprRigidBody_is_rotation_locked$FUNC
    );
    static final FunctionDescriptor RprRigidBody_is_sleeping$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_is_sleeping$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_is_sleeping",
        constants$77.RprRigidBody_is_sleeping$FUNC
    );
    static final FunctionDescriptor RprRigidBody_is_translation_locked$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_is_translation_locked$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_is_translation_locked",
        constants$77.RprRigidBody_is_translation_locked$FUNC
    );
}


