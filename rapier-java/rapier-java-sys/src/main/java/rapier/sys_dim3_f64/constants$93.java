// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$93 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$93() {}
    static final FunctionDescriptor RprWheel_direction_cs$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("x"),
        Constants$root.C_DOUBLE$LAYOUT.withName("y"),
        Constants$root.C_DOUBLE$LAYOUT.withName("z")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprWheel_direction_cs$MH = RuntimeHelper.downcallHandle(
        "RprWheel_direction_cs",
        constants$93.RprWheel_direction_cs$FUNC
    );
    static final FunctionDescriptor RprWheel_engine_force$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprWheel_engine_force$MH = RuntimeHelper.downcallHandle(
        "RprWheel_engine_force",
        constants$93.RprWheel_engine_force$FUNC
    );
    static final FunctionDescriptor RprWheel_forward_impulse$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprWheel_forward_impulse$MH = RuntimeHelper.downcallHandle(
        "RprWheel_forward_impulse",
        constants$93.RprWheel_forward_impulse$FUNC
    );
    static final FunctionDescriptor RprWheel_max_suspension_force$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprWheel_max_suspension_force$MH = RuntimeHelper.downcallHandle(
        "RprWheel_max_suspension_force",
        constants$93.RprWheel_max_suspension_force$FUNC
    );
    static final FunctionDescriptor RprWheel_max_suspension_travel$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprWheel_max_suspension_travel$MH = RuntimeHelper.downcallHandle(
        "RprWheel_max_suspension_travel",
        constants$93.RprWheel_max_suspension_travel$FUNC
    );
    static final FunctionDescriptor RprWheel_radius$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprWheel_radius$MH = RuntimeHelper.downcallHandle(
        "RprWheel_radius",
        constants$93.RprWheel_radius$FUNC
    );
}


