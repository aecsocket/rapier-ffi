// Generated by jextract

package rapier.sys_dim3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$80 {

    static final FunctionDescriptor RprRigidBody_set_angular_damping$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_angular_damping$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_angular_damping",
        constants$80.RprRigidBody_set_angular_damping$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_angvel$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y"),
            Constants$root.C_FLOAT$LAYOUT.withName("z")
        ).withName("RprVector"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_angvel$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_angvel",
        constants$80.RprRigidBody_set_angvel$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_body_type$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_body_type$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_body_type",
        constants$80.RprRigidBody_set_body_type$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_dominance_group$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_dominance_group$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_dominance_group",
        constants$80.RprRigidBody_set_dominance_group$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_enabled$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_enabled$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_enabled",
        constants$80.RprRigidBody_set_enabled$FUNC
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
        constants$80.RprRigidBody_set_enabled_rotations$FUNC
    );
}


