// Generated by jextract

package rapier.sys_dim2_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$68 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$68() {}
    static final FunctionDescriptor RprRigidBodyMassProps_effective_world_inv_inertia_sqrt$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("x")
    ).withName("RprAngularInertia"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyMassProps_effective_world_inv_inertia_sqrt$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyMassProps_effective_world_inv_inertia_sqrt",
        constants$68.RprRigidBodyMassProps_effective_world_inv_inertia_sqrt$FUNC
    );
    static final FunctionDescriptor RprRigidBodyMassProps_flags$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyMassProps_flags$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyMassProps_flags",
        constants$68.RprRigidBodyMassProps_flags$FUNC
    );
    static final FunctionDescriptor RprRigidBodyMassProps_local_mprops$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y")
        ).withName("local_com"),
        Constants$root.C_DOUBLE$LAYOUT.withName("inv_mass"),
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x")
        ).withName("inv_principal_inertia_sqrt")
    ).withName("RprMassProperties"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyMassProps_local_mprops$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyMassProps_local_mprops",
        constants$68.RprRigidBodyMassProps_local_mprops$FUNC
    );
    static final FunctionDescriptor RprRigidBodyMassProps_mass$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyMassProps_mass$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyMassProps_mass",
        constants$68.RprRigidBodyMassProps_mass$FUNC
    );
    static final FunctionDescriptor RprRigidBodyMassProps_world_com$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("x"),
        Constants$root.C_DOUBLE$LAYOUT.withName("y")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyMassProps_world_com$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyMassProps_world_com",
        constants$68.RprRigidBodyMassProps_world_com$FUNC
    );
    static final FunctionDescriptor RprRigidBodySet_all$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodySet_all$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodySet_all",
        constants$68.RprRigidBodySet_all$FUNC
    );
}


