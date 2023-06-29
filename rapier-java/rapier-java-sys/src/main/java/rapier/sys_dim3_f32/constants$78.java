// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$78 {

    static final FunctionDescriptor RprRigidBody_user_torque$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("x"),
        Constants$root.C_FLOAT$LAYOUT.withName("y"),
        Constants$root.C_FLOAT$LAYOUT.withName("z")
    ).withName("RprAngVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_user_torque$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_user_torque",
        constants$78.RprRigidBody_user_torque$FUNC
    );
    static final FunctionDescriptor RprRigidBody_velocity_at_point$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("x"),
        Constants$root.C_FLOAT$LAYOUT.withName("y"),
        Constants$root.C_FLOAT$LAYOUT.withName("z")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y"),
            Constants$root.C_FLOAT$LAYOUT.withName("z")
        ).withName("RprVector")
    );
    static final MethodHandle RprRigidBody_velocity_at_point$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_velocity_at_point",
        constants$78.RprRigidBody_velocity_at_point$FUNC
    );
    static final FunctionDescriptor RprRigidBody_wake_up$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_wake_up$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_wake_up",
        constants$78.RprRigidBody_wake_up$FUNC
    );
    static final FunctionDescriptor RprSharedShape_acquire$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprSharedShape_acquire$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_acquire",
        constants$78.RprSharedShape_acquire$FUNC
    );
    static final FunctionDescriptor RprSharedShape_ball$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprSharedShape_ball$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_ball",
        constants$78.RprSharedShape_ball$FUNC
    );
    static final FunctionDescriptor RprSharedShape_capsule$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y"),
            Constants$root.C_FLOAT$LAYOUT.withName("z")
        ).withName("RprVector"),
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y"),
            Constants$root.C_FLOAT$LAYOUT.withName("z")
        ).withName("RprVector"),
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprSharedShape_capsule$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_capsule",
        constants$78.RprSharedShape_capsule$FUNC
    );
}


