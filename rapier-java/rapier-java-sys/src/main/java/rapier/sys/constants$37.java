// Generated by jextract

package rapier.sys;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$37 {

    static final FunctionDescriptor RprRigidBodySet_is_empty$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodySet_is_empty$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodySet_is_empty",
        constants$37.RprRigidBodySet_is_empty$FUNC
    );
    static final FunctionDescriptor RprRigidBodySet_len$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodySet_len$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodySet_len",
        constants$37.RprRigidBodySet_len$FUNC
    );
    static final FunctionDescriptor RprRigidBodySet_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RprRigidBodySet_new$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodySet_new",
        constants$37.RprRigidBodySet_new$FUNC
    );
    static final FunctionDescriptor RprRigidBodySet_remove$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBodySet_remove$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodySet_remove",
        constants$37.RprRigidBodySet_remove$FUNC
    );
    static final FunctionDescriptor RprRigidBody_add_force$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y")
        ).withName("RprVector"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_add_force$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_add_force",
        constants$37.RprRigidBody_add_force$FUNC
    );
    static final FunctionDescriptor RprRigidBody_add_force_at_point$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y")
        ).withName("RprVector"),
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y")
        ).withName("RprVector"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_add_force_at_point$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_add_force_at_point",
        constants$37.RprRigidBody_add_force_at_point$FUNC
    );
}


