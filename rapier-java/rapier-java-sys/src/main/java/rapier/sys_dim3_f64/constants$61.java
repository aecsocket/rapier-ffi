// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$61 {

    static final FunctionDescriptor RprRigidBody_set_enabled$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_enabled$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_enabled",
        constants$61.RprRigidBody_set_enabled$FUNC
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
        constants$61.RprRigidBody_set_enabled_rotations$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_enabled_translations$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_enabled_translations$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_enabled_translations",
        constants$61.RprRigidBody_set_enabled_translations$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_gravity_scale$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_gravity_scale$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_gravity_scale",
        constants$61.RprRigidBody_set_gravity_scale$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_linear_damping$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_linear_damping$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_linear_damping",
        constants$61.RprRigidBody_set_linear_damping$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_linvel$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y"),
            Constants$root.C_DOUBLE$LAYOUT.withName("z")
        ).withName("RprVector"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_linvel$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_linvel",
        constants$61.RprRigidBody_set_linvel$FUNC
    );
}


