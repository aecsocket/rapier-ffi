// Generated by jextract

package rapier.sys;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$54 {

    static final FunctionDescriptor RprKinematicCharacterController_snap_to_ground$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprKinematicCharacterController_snap_to_ground$MH = RuntimeHelper.downcallHandle(
        "RprKinematicCharacterController_snap_to_ground",
        constants$54.RprKinematicCharacterController_snap_to_ground$FUNC
    );
    static final FunctionDescriptor RprKinematicCharacterController_up$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("x"),
        Constants$root.C_FLOAT$LAYOUT.withName("y")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprKinematicCharacterController_up$MH = RuntimeHelper.downcallHandle(
        "RprKinematicCharacterController_up",
        constants$54.RprKinematicCharacterController_up$FUNC
    );
    static final FunctionDescriptor RprMultibodyJointSet_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprMultibodyJointSet_drop$MH = RuntimeHelper.downcallHandle(
        "RprMultibodyJointSet_drop",
        constants$54.RprMultibodyJointSet_drop$FUNC
    );
    static final FunctionDescriptor RprMultibodyJointSet_insert$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey"),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprMultibodyJointSet_insert$MH = RuntimeHelper.downcallHandle(
        "RprMultibodyJointSet_insert",
        constants$54.RprMultibodyJointSet_insert$FUNC
    );
    static final FunctionDescriptor RprMultibodyJointSet_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RprMultibodyJointSet_new$MH = RuntimeHelper.downcallHandle(
        "RprMultibodyJointSet_new",
        constants$54.RprMultibodyJointSet_new$FUNC
    );
    static final FunctionDescriptor RprMultibodyJointSet_remove$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprMultibodyJointSet_remove$MH = RuntimeHelper.downcallHandle(
        "RprMultibodyJointSet_remove",
        constants$54.RprMultibodyJointSet_remove$FUNC
    );
}


