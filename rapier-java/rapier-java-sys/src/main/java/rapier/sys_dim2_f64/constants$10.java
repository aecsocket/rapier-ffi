// Generated by jextract

package rapier.sys_dim2_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$10 {

    static final FunctionDescriptor alloca$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle alloca$MH = RuntimeHelper.downcallHandle(
        "alloca",
        constants$10.alloca$FUNC
    );
    static final FunctionDescriptor valloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle valloc$MH = RuntimeHelper.downcallHandle(
        "valloc",
        constants$10.valloc$FUNC
    );
    static final FunctionDescriptor posix_memalign$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle posix_memalign$MH = RuntimeHelper.downcallHandle(
        "posix_memalign",
        constants$10.posix_memalign$FUNC
    );
    static final FunctionDescriptor aligned_alloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle aligned_alloc$MH = RuntimeHelper.downcallHandle(
        "aligned_alloc",
        constants$10.aligned_alloc$FUNC
    );
    static final FunctionDescriptor abort$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle abort$MH = RuntimeHelper.downcallHandle(
        "abort",
        constants$10.abort$FUNC
    );
    static final FunctionDescriptor atexit$__func$FUNC = FunctionDescriptor.ofVoid();
}


