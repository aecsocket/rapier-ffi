// Generated by jextract

package rapier.headers_dim2_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$11 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$11() {}
    static final FunctionDescriptor on_exit$__func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle on_exit$__func$MH = RuntimeHelper.downcallHandle(
        constants$11.on_exit$__func$FUNC
    );
    static final FunctionDescriptor on_exit$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle on_exit$MH = RuntimeHelper.downcallHandle(
        "on_exit",
        constants$11.on_exit$FUNC
    );
    static final FunctionDescriptor exit$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle exit$MH = RuntimeHelper.downcallHandle(
        "exit",
        constants$11.exit$FUNC
    );
    static final FunctionDescriptor quick_exit$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle quick_exit$MH = RuntimeHelper.downcallHandle(
        "quick_exit",
        constants$11.quick_exit$FUNC
    );
    static final FunctionDescriptor _Exit$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle _Exit$MH = RuntimeHelper.downcallHandle(
        "_Exit",
        constants$11._Exit$FUNC
    );
    static final FunctionDescriptor getenv$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getenv$MH = RuntimeHelper.downcallHandle(
        "getenv",
        constants$11.getenv$FUNC
    );
}


