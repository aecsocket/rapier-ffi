// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$96 {

    static final FunctionDescriptor RprWheel_set_steering$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle RprWheel_set_steering$MH = RuntimeHelper.downcallHandle(
        "RprWheel_set_steering",
        constants$96.RprWheel_set_steering$FUNC
    );
    static final FunctionDescriptor RprWheel_set_suspension_rest_length$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle RprWheel_set_suspension_rest_length$MH = RuntimeHelper.downcallHandle(
        "RprWheel_set_suspension_rest_length",
        constants$96.RprWheel_set_suspension_rest_length$FUNC
    );
    static final FunctionDescriptor RprWheel_set_suspension_stiffness$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle RprWheel_set_suspension_stiffness$MH = RuntimeHelper.downcallHandle(
        "RprWheel_set_suspension_stiffness",
        constants$96.RprWheel_set_suspension_stiffness$FUNC
    );
    static final FunctionDescriptor RprWheel_set_wheel_suspension_force$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle RprWheel_set_wheel_suspension_force$MH = RuntimeHelper.downcallHandle(
        "RprWheel_set_wheel_suspension_force",
        constants$96.RprWheel_set_wheel_suspension_force$FUNC
    );
    static final FunctionDescriptor RprWheel_side_impulse$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprWheel_side_impulse$MH = RuntimeHelper.downcallHandle(
        "RprWheel_side_impulse",
        constants$96.RprWheel_side_impulse$FUNC
    );
    static final FunctionDescriptor RprWheel_steering$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprWheel_steering$MH = RuntimeHelper.downcallHandle(
        "RprWheel_steering",
        constants$96.RprWheel_steering$FUNC
    );
}


