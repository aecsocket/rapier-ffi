// Generated by jextract

package rapier.sys_dim2_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$45 {

    static final FunctionDescriptor RprRigidBody_set_enabled_translations$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_enabled_translations$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_enabled_translations",
        constants$45.RprRigidBody_set_enabled_translations$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_gravity_scale$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_gravity_scale$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_gravity_scale",
        constants$45.RprRigidBody_set_gravity_scale$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_linear_damping$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_linear_damping$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_linear_damping",
        constants$45.RprRigidBody_set_linear_damping$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_linvel$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y")
        ).withName("RprVector"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_linvel$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_linvel",
        constants$45.RprRigidBody_set_linvel$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_next_kinematic_position$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_DOUBLE$LAYOUT.withName("re"),
                Constants$root.C_DOUBLE$LAYOUT.withName("im")
            ).withName("rotation"),
            MemoryLayout.structLayout(
                Constants$root.C_DOUBLE$LAYOUT.withName("x"),
                Constants$root.C_DOUBLE$LAYOUT.withName("y")
            ).withName("translation")
        ).withName("RprIsometry")
    );
    static final MethodHandle RprRigidBody_set_next_kinematic_position$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_next_kinematic_position",
        constants$45.RprRigidBody_set_next_kinematic_position$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_next_kinematic_rotation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("re"),
            Constants$root.C_DOUBLE$LAYOUT.withName("im")
        ).withName("RprRotation")
    );
    static final MethodHandle RprRigidBody_set_next_kinematic_rotation$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_next_kinematic_rotation",
        constants$45.RprRigidBody_set_next_kinematic_rotation$FUNC
    );
}


