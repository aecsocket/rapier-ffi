// Generated by jextract

package rapier.sys_dim3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$93 {

    static final FunctionDescriptor RprWheel_max_suspension_travel$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprWheel_max_suspension_travel$MH = RuntimeHelper.downcallHandle(
        "RprWheel_max_suspension_travel",
        constants$93.RprWheel_max_suspension_travel$FUNC
    );
    static final FunctionDescriptor RprWheel_radius$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprWheel_radius$MH = RuntimeHelper.downcallHandle(
        "RprWheel_radius",
        constants$93.RprWheel_radius$FUNC
    );
    static final FunctionDescriptor RprWheel_rotation$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprWheel_rotation$MH = RuntimeHelper.downcallHandle(
        "RprWheel_rotation",
        constants$93.RprWheel_rotation$FUNC
    );
    static final FunctionDescriptor RprWheel_set_axle_cs$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y"),
            Constants$root.C_FLOAT$LAYOUT.withName("z")
        ).withName("RprVector")
    );
    static final MethodHandle RprWheel_set_axle_cs$MH = RuntimeHelper.downcallHandle(
        "RprWheel_set_axle_cs",
        constants$93.RprWheel_set_axle_cs$FUNC
    );
    static final FunctionDescriptor RprWheel_set_brake$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprWheel_set_brake$MH = RuntimeHelper.downcallHandle(
        "RprWheel_set_brake",
        constants$93.RprWheel_set_brake$FUNC
    );
    static final FunctionDescriptor RprWheel_set_chassis_connection_point_cs$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y"),
            Constants$root.C_FLOAT$LAYOUT.withName("z")
        ).withName("RprVector")
    );
    static final MethodHandle RprWheel_set_chassis_connection_point_cs$MH = RuntimeHelper.downcallHandle(
        "RprWheel_set_chassis_connection_point_cs",
        constants$93.RprWheel_set_chassis_connection_point_cs$FUNC
    );
}


