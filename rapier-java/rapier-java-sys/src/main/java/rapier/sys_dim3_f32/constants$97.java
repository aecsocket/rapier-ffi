// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$97 {

    static final FunctionDescriptor RprWheel_suspension$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("x"),
        Constants$root.C_FLOAT$LAYOUT.withName("y"),
        Constants$root.C_FLOAT$LAYOUT.withName("z")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprWheel_suspension$MH = RuntimeHelper.downcallHandle(
        "RprWheel_suspension",
        constants$97.RprWheel_suspension$FUNC
    );
    static final FunctionDescriptor RprWheel_suspension_rest_length$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprWheel_suspension_rest_length$MH = RuntimeHelper.downcallHandle(
        "RprWheel_suspension_rest_length",
        constants$97.RprWheel_suspension_rest_length$FUNC
    );
    static final FunctionDescriptor RprWheel_suspension_stiffness$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprWheel_suspension_stiffness$MH = RuntimeHelper.downcallHandle(
        "RprWheel_suspension_stiffness",
        constants$97.RprWheel_suspension_stiffness$FUNC
    );
    static final FunctionDescriptor RprWheel_wheel_suspension_force$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprWheel_wheel_suspension_force$MH = RuntimeHelper.downcallHandle(
        "RprWheel_wheel_suspension_force",
        constants$97.RprWheel_wheel_suspension_force$FUNC
    );
    static final MemoryAddress NULL$ADDR = MemoryAddress.ofLong(0L);
}


