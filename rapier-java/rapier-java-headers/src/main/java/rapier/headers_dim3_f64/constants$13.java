// Generated by jextract

package rapier.headers_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$13 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$13() {}
    static final FunctionDescriptor mkstemps$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle mkstemps$MH = RuntimeHelper.downcallHandle(
        "mkstemps",
        constants$13.mkstemps$FUNC
    );
    static final FunctionDescriptor mkdtemp$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mkdtemp$MH = RuntimeHelper.downcallHandle(
        "mkdtemp",
        constants$13.mkdtemp$FUNC
    );
    static final FunctionDescriptor system$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle system$MH = RuntimeHelper.downcallHandle(
        "system",
        constants$13.system$FUNC
    );
    static final FunctionDescriptor realpath$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle realpath$MH = RuntimeHelper.downcallHandle(
        "realpath",
        constants$13.realpath$FUNC
    );
    static final FunctionDescriptor __compar_fn_t$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __compar_fn_t$MH = RuntimeHelper.downcallHandle(
        constants$13.__compar_fn_t$FUNC
    );
}


