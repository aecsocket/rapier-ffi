// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$80 {

    static final FunctionDescriptor RprRigidBody_rotation$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("x"),
        Constants$root.C_DOUBLE$LAYOUT.withName("y"),
        Constants$root.C_DOUBLE$LAYOUT.withName("z"),
        Constants$root.C_DOUBLE$LAYOUT.withName("w")
    ).withName("RprRotation"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_rotation$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_rotation",
        constants$80.RprRigidBody_rotation$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_additional_mass$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_additional_mass$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_additional_mass",
        constants$80.RprRigidBody_set_additional_mass$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_angular_damping$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_angular_damping$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_angular_damping",
        constants$80.RprRigidBody_set_angular_damping$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_angvel$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y"),
            Constants$root.C_DOUBLE$LAYOUT.withName("z")
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
}


