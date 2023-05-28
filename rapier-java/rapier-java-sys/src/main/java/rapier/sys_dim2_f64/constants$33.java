// Generated by jextract

package rapier.sys_dim2_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$33 {

    static final FunctionDescriptor RprGenericJoint_set_local_frame2$FUNC = FunctionDescriptor.ofVoid(
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
    static final MethodHandle RprGenericJoint_set_local_frame2$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_local_frame2",
        constants$33.RprGenericJoint_set_local_frame2$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_set_motor$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle RprGenericJoint_set_motor$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_motor",
        constants$33.RprGenericJoint_set_motor$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_set_motor_max_force$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle RprGenericJoint_set_motor_max_force$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_motor_max_force",
        constants$33.RprGenericJoint_set_motor_max_force$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_set_motor_model$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle RprGenericJoint_set_motor_model$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_motor_model",
        constants$33.RprGenericJoint_set_motor_model$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_set_motor_position$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle RprGenericJoint_set_motor_position$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_motor_position",
        constants$33.RprGenericJoint_set_motor_position$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_set_motor_velocity$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle RprGenericJoint_set_motor_velocity$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_motor_velocity",
        constants$33.RprGenericJoint_set_motor_velocity$FUNC
    );
}


