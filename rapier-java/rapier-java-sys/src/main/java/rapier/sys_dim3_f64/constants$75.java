// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$75 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$75() {}
    static final FunctionDescriptor RprRigidBody_body_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_body_type$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_body_type",
        constants$75.RprRigidBody_body_type$FUNC
    );
    static final FunctionDescriptor RprRigidBody_center_of_mass$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("x"),
        Constants$root.C_DOUBLE$LAYOUT.withName("y"),
        Constants$root.C_DOUBLE$LAYOUT.withName("z")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_center_of_mass$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_center_of_mass",
        constants$75.RprRigidBody_center_of_mass$FUNC
    );
    static final FunctionDescriptor RprRigidBody_colliders$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_colliders$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_colliders",
        constants$75.RprRigidBody_colliders$FUNC
    );
    static final FunctionDescriptor RprRigidBody_dominance_group$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_dominance_group$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_dominance_group",
        constants$75.RprRigidBody_dominance_group$FUNC
    );
    static final FunctionDescriptor RprRigidBody_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_drop$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_drop",
        constants$75.RprRigidBody_drop$FUNC
    );
    static final FunctionDescriptor RprRigidBody_effective_dominance_group$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_effective_dominance_group$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_effective_dominance_group",
        constants$75.RprRigidBody_effective_dominance_group$FUNC
    );
}


