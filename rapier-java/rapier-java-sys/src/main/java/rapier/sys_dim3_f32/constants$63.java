// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$63 {

    static final FunctionDescriptor RprRigidBodyBuilder_rotation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y"),
            Constants$root.C_FLOAT$LAYOUT.withName("z")
        ).withName("RprAngVector")
    );
    static final MethodHandle RprRigidBodyBuilder_rotation$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_rotation",
        constants$63.RprRigidBodyBuilder_rotation$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_sleeping$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBodyBuilder_sleeping$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_sleeping",
        constants$63.RprRigidBodyBuilder_sleeping$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_translation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y"),
            Constants$root.C_FLOAT$LAYOUT.withName("z")
        ).withName("RprVector")
    );
    static final MethodHandle RprRigidBodyBuilder_translation$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_translation",
        constants$63.RprRigidBodyBuilder_translation$FUNC
    );
    static final FunctionDescriptor RprRigidBodyMassProps_additional_local_mprops$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyMassProps_additional_local_mprops$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyMassProps_additional_local_mprops",
        constants$63.RprRigidBodyMassProps_additional_local_mprops$FUNC
    );
    static final FunctionDescriptor RprRigidBodyMassProps_effective_angular_inertia$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("m11"),
        Constants$root.C_FLOAT$LAYOUT.withName("m12"),
        Constants$root.C_FLOAT$LAYOUT.withName("m13"),
        Constants$root.C_FLOAT$LAYOUT.withName("m22"),
        Constants$root.C_FLOAT$LAYOUT.withName("m23"),
        Constants$root.C_FLOAT$LAYOUT.withName("m33")
    ).withName("RprAngularInertia"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyMassProps_effective_angular_inertia$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyMassProps_effective_angular_inertia",
        constants$63.RprRigidBodyMassProps_effective_angular_inertia$FUNC
    );
    static final FunctionDescriptor RprRigidBodyMassProps_effective_inv_mass$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("x"),
        Constants$root.C_FLOAT$LAYOUT.withName("y"),
        Constants$root.C_FLOAT$LAYOUT.withName("z")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyMassProps_effective_inv_mass$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyMassProps_effective_inv_mass",
        constants$63.RprRigidBodyMassProps_effective_inv_mass$FUNC
    );
}


