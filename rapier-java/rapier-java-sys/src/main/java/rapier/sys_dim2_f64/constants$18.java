// Generated by jextract

package rapier.sys_dim2_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$18 {

    static final FunctionDescriptor rpmatch$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle rpmatch$MH = RuntimeHelper.downcallHandle(
        "rpmatch",
        constants$18.rpmatch$FUNC
    );
    static final FunctionDescriptor getsubopt$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getsubopt$MH = RuntimeHelper.downcallHandle(
        "getsubopt",
        constants$18.getsubopt$FUNC
    );
    static final FunctionDescriptor getloadavg$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle getloadavg$MH = RuntimeHelper.downcallHandle(
        "getloadavg",
        constants$18.getloadavg$FUNC
    );
    static final FunctionDescriptor RprBroadPhase_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprBroadPhase_drop$MH = RuntimeHelper.downcallHandle(
        "RprBroadPhase_drop",
        constants$18.RprBroadPhase_drop$FUNC
    );
    static final FunctionDescriptor RprBroadPhase_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RprBroadPhase_new$MH = RuntimeHelper.downcallHandle(
        "RprBroadPhase_new",
        constants$18.RprBroadPhase_new$FUNC
    );
    static final FunctionDescriptor RprCCDSolver_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCCDSolver_drop$MH = RuntimeHelper.downcallHandle(
        "RprCCDSolver_drop",
        constants$18.RprCCDSolver_drop$FUNC
    );
}


