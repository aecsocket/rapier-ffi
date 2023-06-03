// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$47 {

    static final FunctionDescriptor RprRigidBodyBuilder_kinematic_velocity_based$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RprRigidBodyBuilder_kinematic_velocity_based$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_kinematic_velocity_based",
        constants$47.RprRigidBodyBuilder_kinematic_velocity_based$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_linear_damping$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle RprRigidBodyBuilder_linear_damping$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_linear_damping",
        constants$47.RprRigidBodyBuilder_linear_damping$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_linvel$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y"),
            Constants$root.C_DOUBLE$LAYOUT.withName("z")
        ).withName("RprVector")
    );
    static final MethodHandle RprRigidBodyBuilder_linvel$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_linvel",
        constants$47.RprRigidBodyBuilder_linvel$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle RprRigidBodyBuilder_new$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_new",
        constants$47.RprRigidBodyBuilder_new$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_position$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_DOUBLE$LAYOUT.withName("x"),
                Constants$root.C_DOUBLE$LAYOUT.withName("y"),
                Constants$root.C_DOUBLE$LAYOUT.withName("z"),
                Constants$root.C_DOUBLE$LAYOUT.withName("w")
            ).withName("rotation"),
            MemoryLayout.structLayout(
                Constants$root.C_DOUBLE$LAYOUT.withName("x"),
                Constants$root.C_DOUBLE$LAYOUT.withName("y"),
                Constants$root.C_DOUBLE$LAYOUT.withName("z")
            ).withName("translation")
        ).withName("RprIsometry")
    );
    static final MethodHandle RprRigidBodyBuilder_position$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_position",
        constants$47.RprRigidBodyBuilder_position$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_rotation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y"),
            Constants$root.C_DOUBLE$LAYOUT.withName("z")
        ).withName("RprAngVector")
    );
    static final MethodHandle RprRigidBodyBuilder_rotation$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_rotation",
        constants$47.RprRigidBodyBuilder_rotation$FUNC
    );
}


