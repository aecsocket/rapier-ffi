// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$3 {

    static final FunctionDescriptor __uint16_identity$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle __uint16_identity$MH = RuntimeHelper.downcallHandle(
        "__uint16_identity",
        constants$3.__uint16_identity$FUNC
    );
    static final FunctionDescriptor __uint32_identity$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle __uint32_identity$MH = RuntimeHelper.downcallHandle(
        "__uint32_identity",
        constants$3.__uint32_identity$FUNC
    );
    static final FunctionDescriptor __uint64_identity$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle __uint64_identity$MH = RuntimeHelper.downcallHandle(
        "__uint64_identity",
        constants$3.__uint64_identity$FUNC
    );
    static final FunctionDescriptor select$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle select$MH = RuntimeHelper.downcallHandle(
        "select",
        constants$3.select$FUNC
    );
    static final FunctionDescriptor pselect$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pselect$MH = RuntimeHelper.downcallHandle(
        "pselect",
        constants$3.pselect$FUNC
    );
    static final FunctionDescriptor random$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle random$MH = RuntimeHelper.downcallHandle(
        "random",
        constants$3.random$FUNC
    );
}


