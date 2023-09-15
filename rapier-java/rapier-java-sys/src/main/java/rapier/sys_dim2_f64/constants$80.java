// Generated by jextract

package rapier.sys_dim2_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$80 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$80() {}
    static final FunctionDescriptor RprRigidBody_set_linvel$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y")
        ).withName("RprVector"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_linvel$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_linvel",
        constants$80.RprRigidBody_set_linvel$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_locked_axes$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_locked_axes$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_locked_axes",
        constants$80.RprRigidBody_set_locked_axes$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_next_kinematic_position$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_DOUBLE$LAYOUT.withName("re"),
                Constants$root.C_DOUBLE$LAYOUT.withName("im")
            ).withName("rotation"),
            MemoryLayout.structLayout(
                Constants$root.C_DOUBLE$LAYOUT.withName("x"),
                Constants$root.C_DOUBLE$LAYOUT.withName("y")
            ).withName("translation")
        ).withName("RprIsometry")
    );
    static final MethodHandle RprRigidBody_set_next_kinematic_position$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_next_kinematic_position",
        constants$80.RprRigidBody_set_next_kinematic_position$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_next_kinematic_rotation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("re"),
            Constants$root.C_DOUBLE$LAYOUT.withName("im")
        ).withName("RprRotation")
    );
    static final MethodHandle RprRigidBody_set_next_kinematic_rotation$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_next_kinematic_rotation",
        constants$80.RprRigidBody_set_next_kinematic_rotation$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_next_kinematic_translation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y")
        ).withName("RprVector")
    );
    static final MethodHandle RprRigidBody_set_next_kinematic_translation$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_next_kinematic_translation",
        constants$80.RprRigidBody_set_next_kinematic_translation$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_position$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_DOUBLE$LAYOUT.withName("re"),
                Constants$root.C_DOUBLE$LAYOUT.withName("im")
            ).withName("rotation"),
            MemoryLayout.structLayout(
                Constants$root.C_DOUBLE$LAYOUT.withName("x"),
                Constants$root.C_DOUBLE$LAYOUT.withName("y")
            ).withName("translation")
        ).withName("RprIsometry"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_position$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_position",
        constants$80.RprRigidBody_set_position$FUNC
    );
}


