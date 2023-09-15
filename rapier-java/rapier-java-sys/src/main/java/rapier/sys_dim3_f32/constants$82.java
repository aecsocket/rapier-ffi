// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$82 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$82() {}
    static final FunctionDescriptor RprRigidBody_set_linear_damping$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_linear_damping$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_linear_damping",
        constants$82.RprRigidBody_set_linear_damping$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_linvel$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y"),
            Constants$root.C_FLOAT$LAYOUT.withName("z")
        ).withName("RprVector"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_linvel$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_linvel",
        constants$82.RprRigidBody_set_linvel$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_locked_axes$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_locked_axes$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_locked_axes",
        constants$82.RprRigidBody_set_locked_axes$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_next_kinematic_position$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("x"),
                Constants$root.C_FLOAT$LAYOUT.withName("y"),
                Constants$root.C_FLOAT$LAYOUT.withName("z"),
                Constants$root.C_FLOAT$LAYOUT.withName("w")
            ).withName("rotation"),
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("x"),
                Constants$root.C_FLOAT$LAYOUT.withName("y"),
                Constants$root.C_FLOAT$LAYOUT.withName("z")
            ).withName("translation")
        ).withName("RprIsometry")
    );
    static final MethodHandle RprRigidBody_set_next_kinematic_position$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_next_kinematic_position",
        constants$82.RprRigidBody_set_next_kinematic_position$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_next_kinematic_rotation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y"),
            Constants$root.C_FLOAT$LAYOUT.withName("z"),
            Constants$root.C_FLOAT$LAYOUT.withName("w")
        ).withName("RprRotation")
    );
    static final MethodHandle RprRigidBody_set_next_kinematic_rotation$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_next_kinematic_rotation",
        constants$82.RprRigidBody_set_next_kinematic_rotation$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_next_kinematic_translation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y"),
            Constants$root.C_FLOAT$LAYOUT.withName("z")
        ).withName("RprVector")
    );
    static final MethodHandle RprRigidBody_set_next_kinematic_translation$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_next_kinematic_translation",
        constants$82.RprRigidBody_set_next_kinematic_translation$FUNC
    );
}


