// Generated by jextract

package rapier.headers_dim2_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$18 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$18() {}
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
    static final FunctionDescriptor RprCCDSolver_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RprCCDSolver_new$MH = RuntimeHelper.downcallHandle(
        "RprCCDSolver_new",
        constants$18.RprCCDSolver_new$FUNC
    );
    static final FunctionDescriptor RprColliderBuilder_ball$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle RprColliderBuilder_ball$MH = RuntimeHelper.downcallHandle(
        "RprColliderBuilder_ball",
        constants$18.RprColliderBuilder_ball$FUNC
    );
}


