// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$55 {

    static final FunctionDescriptor RprRigidBody_set_rotation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y"),
            Constants$root.C_FLOAT$LAYOUT.withName("z"),
            Constants$root.C_FLOAT$LAYOUT.withName("w")
        ).withName("RprRotation"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_rotation$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_rotation",
        constants$55.RprRigidBody_set_rotation$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_translation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y"),
            Constants$root.C_FLOAT$LAYOUT.withName("z")
        ).withName("RprVector"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_translation$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_translation",
        constants$55.RprRigidBody_set_translation$FUNC
    );
    static final FunctionDescriptor RprRigidBody_sleep$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_sleep$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_sleep",
        constants$55.RprRigidBody_sleep$FUNC
    );
    static final FunctionDescriptor RprRigidBody_translation$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("x"),
        Constants$root.C_FLOAT$LAYOUT.withName("y"),
        Constants$root.C_FLOAT$LAYOUT.withName("z")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_translation$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_translation",
        constants$55.RprRigidBody_translation$FUNC
    );
    static final FunctionDescriptor RprRigidBody_user_force$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("x"),
        Constants$root.C_FLOAT$LAYOUT.withName("y"),
        Constants$root.C_FLOAT$LAYOUT.withName("z")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_user_force$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_user_force",
        constants$55.RprRigidBody_user_force$FUNC
    );
    static final FunctionDescriptor RprRigidBody_user_torque$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("x"),
        Constants$root.C_FLOAT$LAYOUT.withName("y"),
        Constants$root.C_FLOAT$LAYOUT.withName("z")
    ).withName("RprAngVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_user_torque$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_user_torque",
        constants$55.RprRigidBody_user_torque$FUNC
    );
}


