// Generated by jextract

package rapier.sys_dim3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3() {}
    static final FunctionDescriptor srandom$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle srandom$MH = RuntimeHelper.downcallHandle(
        "srandom",
        constants$3.srandom$FUNC
    );
    static final FunctionDescriptor initstate$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle initstate$MH = RuntimeHelper.downcallHandle(
        "initstate",
        constants$3.initstate$FUNC
    );
    static final FunctionDescriptor setstate$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle setstate$MH = RuntimeHelper.downcallHandle(
        "setstate",
        constants$3.setstate$FUNC
    );
    static final FunctionDescriptor random_r$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle random_r$MH = RuntimeHelper.downcallHandle(
        "random_r",
        constants$3.random_r$FUNC
    );
    static final FunctionDescriptor srandom_r$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle srandom_r$MH = RuntimeHelper.downcallHandle(
        "srandom_r",
        constants$3.srandom_r$FUNC
    );
    static final FunctionDescriptor initstate_r$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle initstate_r$MH = RuntimeHelper.downcallHandle(
        "initstate_r",
        constants$3.initstate_r$FUNC
    );
}


