// Generated by jextract

package rapier.sys_dim2_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$59 {

    static final FunctionDescriptor RprRigidBodyActivation_sleeping$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyActivation_sleeping$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyActivation_sleeping",
        constants$59.RprRigidBodyActivation_sleeping$FUNC
    );
    static final FunctionDescriptor RprRigidBodyActivation_time_since_can_sleep$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyActivation_time_since_can_sleep$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyActivation_time_since_can_sleep",
        constants$59.RprRigidBodyActivation_time_since_can_sleep$FUNC
    );
    static final FunctionDescriptor RprRigidBodyActivation_time_until_sleep$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyActivation_time_until_sleep$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyActivation_time_until_sleep",
        constants$59.RprRigidBodyActivation_time_until_sleep$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_additional_mass$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprRigidBodyBuilder_additional_mass$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_additional_mass",
        constants$59.RprRigidBodyBuilder_additional_mass$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_angular_damping$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprRigidBodyBuilder_angular_damping$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_angular_damping",
        constants$59.RprRigidBodyBuilder_angular_damping$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_angvel$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x")
        ).withName("RprAngVector")
    );
    static final MethodHandle RprRigidBodyBuilder_angvel$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_angvel",
        constants$59.RprRigidBodyBuilder_angvel$FUNC
    );
}


