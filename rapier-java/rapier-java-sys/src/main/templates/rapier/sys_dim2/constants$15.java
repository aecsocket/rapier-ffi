// Generated by jextract

package rapier.sys_dim2;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$15 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$15() {}
    static final FunctionDescriptor abs$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle abs$MH = RuntimeHelper.downcallHandle(
        "abs",
        constants$15.abs$FUNC
    );
    static final FunctionDescriptor labs$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle labs$MH = RuntimeHelper.downcallHandle(
        "labs",
        constants$15.labs$FUNC
    );
    static final FunctionDescriptor llabs$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle llabs$MH = RuntimeHelper.downcallHandle(
        "llabs",
        constants$15.llabs$FUNC
    );
    static final FunctionDescriptor div$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("quot"),
        Constants$root.C_INT$LAYOUT.withName("rem")
    ).withName("div_t"),
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle div$MH = RuntimeHelper.downcallHandle(
        "div",
        constants$15.div$FUNC
    );
    static final FunctionDescriptor ldiv$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("quot"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("rem")
    ).withName("ldiv_t"),
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle ldiv$MH = RuntimeHelper.downcallHandle(
        "ldiv",
        constants$15.ldiv$FUNC
    );
    static final FunctionDescriptor lldiv$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("quot"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("rem")
    ).withName("lldiv_t"),
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle lldiv$MH = RuntimeHelper.downcallHandle(
        "lldiv",
        constants$15.lldiv$FUNC
    );
}


