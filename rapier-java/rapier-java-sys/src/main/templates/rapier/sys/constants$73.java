// Generated by jextract

package rapier.sys;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$73 {

    static final FunctionDescriptor RprRigidBody_dominance_group$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_dominance_group$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_dominance_group",
        constants$73.RprRigidBody_dominance_group$FUNC
    );
    static final FunctionDescriptor RprRigidBody_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_drop$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_drop",
        constants$73.RprRigidBody_drop$FUNC
    );
    static final FunctionDescriptor RprRigidBody_effective_dominance_group$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_effective_dominance_group$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_effective_dominance_group",
        constants$73.RprRigidBody_effective_dominance_group$FUNC
    );
    static final FunctionDescriptor RprRigidBody_enable_ccd$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_enable_ccd$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_enable_ccd",
        constants$73.RprRigidBody_enable_ccd$FUNC
    );
    static final FunctionDescriptor RprRigidBody_gravitational_potential_energy$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y")
        ).withName("RprVector")
    );
    static final MethodHandle RprRigidBody_gravitational_potential_energy$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_gravitational_potential_energy",
        constants$73.RprRigidBody_gravitational_potential_energy$FUNC
    );
    static final FunctionDescriptor RprRigidBody_gravity_scale$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_gravity_scale$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_gravity_scale",
        constants$73.RprRigidBody_gravity_scale$FUNC
    );
}


