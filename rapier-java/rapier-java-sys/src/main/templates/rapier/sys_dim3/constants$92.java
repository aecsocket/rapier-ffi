// Generated by jextract

package rapier.sys_dim3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$92 {

    static final FunctionDescriptor RprWheelTuning_default$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("suspension_stiffness"),
        Constants$root.C_FLOAT$LAYOUT.withName("suspension_compression"),
        Constants$root.C_FLOAT$LAYOUT.withName("suspension_damping"),
        Constants$root.C_FLOAT$LAYOUT.withName("max_suspension_travel"),
        Constants$root.C_FLOAT$LAYOUT.withName("friction_slip"),
        Constants$root.C_FLOAT$LAYOUT.withName("max_suspension_force")
    ).withName("RprWheelTuning"));
    static final MethodHandle RprWheelTuning_default$MH = RuntimeHelper.downcallHandle(
        "RprWheelTuning_default",
        constants$92.RprWheelTuning_default$FUNC
    );
    static final FunctionDescriptor RprWheel_axle$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("x"),
        Constants$root.C_FLOAT$LAYOUT.withName("y"),
        Constants$root.C_FLOAT$LAYOUT.withName("z")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprWheel_axle$MH = RuntimeHelper.downcallHandle(
        "RprWheel_axle",
        constants$92.RprWheel_axle$FUNC
    );
    static final FunctionDescriptor RprWheel_axle_cs$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("x"),
        Constants$root.C_FLOAT$LAYOUT.withName("y"),
        Constants$root.C_FLOAT$LAYOUT.withName("z")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprWheel_axle_cs$MH = RuntimeHelper.downcallHandle(
        "RprWheel_axle_cs",
        constants$92.RprWheel_axle_cs$FUNC
    );
    static final FunctionDescriptor RprWheel_brake$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprWheel_brake$MH = RuntimeHelper.downcallHandle(
        "RprWheel_brake",
        constants$92.RprWheel_brake$FUNC
    );
    static final FunctionDescriptor RprWheel_center$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("x"),
        Constants$root.C_FLOAT$LAYOUT.withName("y"),
        Constants$root.C_FLOAT$LAYOUT.withName("z")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprWheel_center$MH = RuntimeHelper.downcallHandle(
        "RprWheel_center",
        constants$92.RprWheel_center$FUNC
    );
    static final FunctionDescriptor RprWheel_chassis_connection_point_cs$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("x"),
        Constants$root.C_FLOAT$LAYOUT.withName("y"),
        Constants$root.C_FLOAT$LAYOUT.withName("z")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprWheel_chassis_connection_point_cs$MH = RuntimeHelper.downcallHandle(
        "RprWheel_chassis_connection_point_cs",
        constants$92.RprWheel_chassis_connection_point_cs$FUNC
    );
}


