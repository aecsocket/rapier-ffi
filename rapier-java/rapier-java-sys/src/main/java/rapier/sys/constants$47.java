// Generated by jextract

package rapier.sys;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$47 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$47() {}
    static final FunctionDescriptor RprRigidBody_translation$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(2, Constants$root.C_FLOAT$LAYOUT).withName("_0")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_translation$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_translation",
        constants$47.RprRigidBody_translation$FUNC
    );
    static final FunctionDescriptor RprRigidBody_user_force$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(2, Constants$root.C_FLOAT$LAYOUT).withName("_0")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_user_force$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_user_force",
        constants$47.RprRigidBody_user_force$FUNC
    );
    static final FunctionDescriptor RprRigidBody_user_torque$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(1, Constants$root.C_FLOAT$LAYOUT).withName("_0")
    ).withName("RprAngVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_user_torque$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_user_torque",
        constants$47.RprRigidBody_user_torque$FUNC
    );
    static final FunctionDescriptor RprRigidBody_velocity_at_point$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(2, Constants$root.C_FLOAT$LAYOUT).withName("_0")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(2, Constants$root.C_FLOAT$LAYOUT).withName("_0")
        ).withName("RprVector")
    );
    static final MethodHandle RprRigidBody_velocity_at_point$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_velocity_at_point",
        constants$47.RprRigidBody_velocity_at_point$FUNC
    );
    static final FunctionDescriptor RprRigidBody_wake_up$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_wake_up$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_wake_up",
        constants$47.RprRigidBody_wake_up$FUNC
    );
    static final FunctionDescriptor RprSharedShape_acquire$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprSharedShape_acquire$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_acquire",
        constants$47.RprSharedShape_acquire$FUNC
    );
}


