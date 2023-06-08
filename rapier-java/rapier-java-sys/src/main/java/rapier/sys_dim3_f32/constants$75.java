// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$75 {

    static final FunctionDescriptor RprRigidBody_wake_up$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_wake_up$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_wake_up",
        constants$75.RprRigidBody_wake_up$FUNC
    );
    static final FunctionDescriptor RprSharedShape_acquire$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprSharedShape_acquire$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_acquire",
        constants$75.RprSharedShape_acquire$FUNC
    );
    static final FunctionDescriptor RprSharedShape_ball$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprSharedShape_ball$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_ball",
        constants$75.RprSharedShape_ball$FUNC
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
        constants$75.RprSharedShape_capsule$FUNC
    );
    static final FunctionDescriptor RprSharedShape_compound$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle RprSharedShape_compound$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_compound",
        constants$75.RprSharedShape_compound$FUNC
    );
    static final FunctionDescriptor RprSharedShape_cone$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprSharedShape_cone$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_cone",
        constants$75.RprSharedShape_cone$FUNC
    );
}


