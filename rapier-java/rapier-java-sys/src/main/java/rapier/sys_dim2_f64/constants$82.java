// Generated by jextract

package rapier.sys_dim2_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$82 {

    static final FunctionDescriptor RprSolverContact_friction$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprSolverContact_friction$MH = RuntimeHelper.downcallHandle(
        "RprSolverContact_friction",
        constants$82.RprSolverContact_friction$FUNC
    );
    static final FunctionDescriptor RprSolverContact_is_bouncy$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprSolverContact_is_bouncy$MH = RuntimeHelper.downcallHandle(
        "RprSolverContact_is_bouncy",
        constants$82.RprSolverContact_is_bouncy$FUNC
    );
    static final FunctionDescriptor RprSolverContact_is_new$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprSolverContact_is_new$MH = RuntimeHelper.downcallHandle(
        "RprSolverContact_is_new",
        constants$82.RprSolverContact_is_new$FUNC
    );
    static final FunctionDescriptor RprSolverContact_point$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("x"),
        Constants$root.C_DOUBLE$LAYOUT.withName("y")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprSolverContact_point$MH = RuntimeHelper.downcallHandle(
        "RprSolverContact_point",
        constants$82.RprSolverContact_point$FUNC
    );
    static final FunctionDescriptor RprSolverContact_restitution$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprSolverContact_restitution$MH = RuntimeHelper.downcallHandle(
        "RprSolverContact_restitution",
        constants$82.RprSolverContact_restitution$FUNC
    );
    static final FunctionDescriptor RprSolverContact_set_dist$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle RprSolverContact_set_dist$MH = RuntimeHelper.downcallHandle(
        "RprSolverContact_set_dist",
        constants$82.RprSolverContact_set_dist$FUNC
    );
}


