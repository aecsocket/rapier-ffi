// Generated by jextract

package rapier.sys_dim2_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$66 {

    static final FunctionDescriptor RprRigidBodyBuilder_rotation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x")
        ).withName("RprAngVector")
    );
    static final MethodHandle RprRigidBodyBuilder_rotation$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_rotation",
        constants$66.RprRigidBodyBuilder_rotation$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_sleeping$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBodyBuilder_sleeping$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_sleeping",
        constants$66.RprRigidBodyBuilder_sleeping$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_translation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y")
        ).withName("RprVector")
    );
    static final MethodHandle RprRigidBodyBuilder_translation$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_translation",
        constants$66.RprRigidBodyBuilder_translation$FUNC
    );
    static final FunctionDescriptor RprRigidBodyMassProps_additional_local_mprops$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyMassProps_additional_local_mprops$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyMassProps_additional_local_mprops",
        constants$66.RprRigidBodyMassProps_additional_local_mprops$FUNC
    );
    static final FunctionDescriptor RprRigidBodyMassProps_effective_angular_inertia$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("x")
    ).withName("RprAngularInertia"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyMassProps_effective_angular_inertia$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyMassProps_effective_angular_inertia",
        constants$66.RprRigidBodyMassProps_effective_angular_inertia$FUNC
    );
    static final FunctionDescriptor RprRigidBodyMassProps_effective_inv_mass$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("x"),
        Constants$root.C_DOUBLE$LAYOUT.withName("y")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyMassProps_effective_inv_mass$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyMassProps_effective_inv_mass",
        constants$66.RprRigidBodyMassProps_effective_inv_mass$FUNC
    );
}


