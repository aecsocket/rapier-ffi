// Generated by jextract

package rapier.sys;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$79 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$79() {}
    static final FunctionDescriptor RprRigidBody_set_dominance_group$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_dominance_group$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_dominance_group",
        constants$79.RprRigidBody_set_dominance_group$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_enabled$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_enabled$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_enabled",
        constants$79.RprRigidBody_set_enabled$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_enabled_rotations$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_enabled_rotations$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_enabled_rotations",
        constants$79.RprRigidBody_set_enabled_rotations$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_enabled_translations$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_enabled_translations$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_enabled_translations",
        constants$79.RprRigidBody_set_enabled_translations$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_gravity_scale$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_gravity_scale$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_gravity_scale",
        constants$79.RprRigidBody_set_gravity_scale$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_linear_damping$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_linear_damping$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_linear_damping",
        constants$79.RprRigidBody_set_linear_damping$FUNC
    );
}


