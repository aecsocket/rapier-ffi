// Generated by jextract

package rapier.sys_dim2_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$37 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$37() {}
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
            MemoryLayout.sequenceLayout(2, Constants$root.C_FLOAT$LAYOUT).withName("_0")
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
            MemoryLayout.sequenceLayout(2, Constants$root.C_FLOAT$LAYOUT).withName("_0")
        ).withName("RprVector"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(2, Constants$root.C_FLOAT$LAYOUT).withName("_0")
        ).withName("RprVector"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_add_force_at_point$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_add_force_at_point",
        constants$37.RprRigidBody_add_force_at_point$FUNC
    );
    static final FunctionDescriptor RprRigidBody_add_torque$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(1, Constants$root.C_FLOAT$LAYOUT).withName("_0")
        ).withName("RprAngVector"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_add_torque$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_add_torque",
        constants$37.RprRigidBody_add_torque$FUNC
    );
    static final FunctionDescriptor RprRigidBody_angular_damping$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_angular_damping$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_angular_damping",
        constants$37.RprRigidBody_angular_damping$FUNC
    );
}


