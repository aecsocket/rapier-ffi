// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$70 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$70() {}
    static final FunctionDescriptor RprRigidBodyMassProps_effective_mass$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("x"),
        Constants$root.C_DOUBLE$LAYOUT.withName("y"),
        Constants$root.C_DOUBLE$LAYOUT.withName("z")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyMassProps_effective_mass$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyMassProps_effective_mass",
        constants$70.RprRigidBodyMassProps_effective_mass$FUNC
    );
    static final FunctionDescriptor RprRigidBodyMassProps_effective_world_inv_inertia_sqrt$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("m11"),
        Constants$root.C_DOUBLE$LAYOUT.withName("m12"),
        Constants$root.C_DOUBLE$LAYOUT.withName("m13"),
        Constants$root.C_DOUBLE$LAYOUT.withName("m22"),
        Constants$root.C_DOUBLE$LAYOUT.withName("m23"),
        Constants$root.C_DOUBLE$LAYOUT.withName("m33")
    ).withName("RprAngularInertia"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyMassProps_effective_world_inv_inertia_sqrt$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyMassProps_effective_world_inv_inertia_sqrt",
        constants$70.RprRigidBodyMassProps_effective_world_inv_inertia_sqrt$FUNC
    );
    static final FunctionDescriptor RprRigidBodyMassProps_flags$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyMassProps_flags$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyMassProps_flags",
        constants$70.RprRigidBodyMassProps_flags$FUNC
    );
    static final FunctionDescriptor RprRigidBodyMassProps_local_mprops$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y"),
            Constants$root.C_DOUBLE$LAYOUT.withName("z")
        ).withName("local_com"),
        Constants$root.C_DOUBLE$LAYOUT.withName("inv_mass"),
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y"),
            Constants$root.C_DOUBLE$LAYOUT.withName("z")
        ).withName("inv_principal_inertia_sqrt"),
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y"),
            Constants$root.C_DOUBLE$LAYOUT.withName("z"),
            Constants$root.C_DOUBLE$LAYOUT.withName("w")
        ).withName("principal_inertia_local_frame")
    ).withName("RprMassProperties"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyMassProps_local_mprops$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyMassProps_local_mprops",
        constants$70.RprRigidBodyMassProps_local_mprops$FUNC
    );
    static final FunctionDescriptor RprRigidBodyMassProps_mass$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyMassProps_mass$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyMassProps_mass",
        constants$70.RprRigidBodyMassProps_mass$FUNC
    );
    static final FunctionDescriptor RprRigidBodyMassProps_world_com$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("x"),
        Constants$root.C_DOUBLE$LAYOUT.withName("y"),
        Constants$root.C_DOUBLE$LAYOUT.withName("z")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyMassProps_world_com$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyMassProps_world_com",
        constants$70.RprRigidBodyMassProps_world_com$FUNC
    );
}


