// Generated by jextract

package rapier.sys;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$56 {

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
        constants$56.RprRigidBody_gravitational_potential_energy$FUNC
    );
    static final FunctionDescriptor RprRigidBody_gravity_scale$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_gravity_scale$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_gravity_scale",
        constants$56.RprRigidBody_gravity_scale$FUNC
    );
    static final FunctionDescriptor RprRigidBody_is_ccd_active$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_is_ccd_active$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_is_ccd_active",
        constants$56.RprRigidBody_is_ccd_active$FUNC
    );
    static final FunctionDescriptor RprRigidBody_is_ccd_enabled$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_is_ccd_enabled$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_is_ccd_enabled",
        constants$56.RprRigidBody_is_ccd_enabled$FUNC
    );
    static final FunctionDescriptor RprRigidBody_is_dynamic$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_is_dynamic$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_is_dynamic",
        constants$56.RprRigidBody_is_dynamic$FUNC
    );
    static final FunctionDescriptor RprRigidBody_is_enabled$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_is_enabled$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_is_enabled",
        constants$56.RprRigidBody_is_enabled$FUNC
    );
}


