// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$13 {

    static final FunctionDescriptor putenv$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle putenv$MH = RuntimeHelper.downcallHandle(
        "putenv",
        constants$13.putenv$FUNC
    );
    static final FunctionDescriptor setenv$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle setenv$MH = RuntimeHelper.downcallHandle(
        "setenv",
        constants$13.setenv$FUNC
    );
    static final FunctionDescriptor unsetenv$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle unsetenv$MH = RuntimeHelper.downcallHandle(
        "unsetenv",
        constants$13.unsetenv$FUNC
    );
    static final FunctionDescriptor clearenv$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle clearenv$MH = RuntimeHelper.downcallHandle(
        "clearenv",
        constants$13.clearenv$FUNC
    );
    static final FunctionDescriptor mktemp$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mktemp$MH = RuntimeHelper.downcallHandle(
        "mktemp",
        constants$13.mktemp$FUNC
    );
    static final FunctionDescriptor mkstemp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mkstemp$MH = RuntimeHelper.downcallHandle(
        "mkstemp",
        constants$13.mkstemp$FUNC
    );
}


