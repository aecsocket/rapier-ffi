// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$38 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$38() {}
    static final FunctionDescriptor RprRigidBody_angvel$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(3, Constants$root.C_FLOAT$LAYOUT).withName("_0")
    ).withName("RprAngVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_angvel$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_angvel",
        constants$38.RprRigidBody_angvel$FUNC
    );
    static final FunctionDescriptor RprRigidBody_apply_impulse$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y"),
            Constants$root.C_FLOAT$LAYOUT.withName("z")
        ).withName("RprVector"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_apply_impulse$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_apply_impulse",
        constants$38.RprRigidBody_apply_impulse$FUNC
    );
    static final FunctionDescriptor RprRigidBody_apply_impulse_at_point$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
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
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_apply_impulse_at_point$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_apply_impulse_at_point",
        constants$38.RprRigidBody_apply_impulse_at_point$FUNC
    );
    static final FunctionDescriptor RprRigidBody_apply_torque_impulse$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(3, Constants$root.C_FLOAT$LAYOUT).withName("_0")
        ).withName("RprAngVector"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_apply_torque_impulse$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_apply_torque_impulse",
        constants$38.RprRigidBody_apply_torque_impulse$FUNC
    );
    static final FunctionDescriptor RprRigidBody_body_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_body_type$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_body_type",
        constants$38.RprRigidBody_body_type$FUNC
    );
    static final FunctionDescriptor RprRigidBody_center_of_mass$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("x"),
        Constants$root.C_FLOAT$LAYOUT.withName("y"),
        Constants$root.C_FLOAT$LAYOUT.withName("z")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_center_of_mass$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_center_of_mass",
        constants$38.RprRigidBody_center_of_mass$FUNC
    );
}


