// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$82 {

    static final FunctionDescriptor RprSolverContact_point$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("x"),
        Constants$root.C_DOUBLE$LAYOUT.withName("y"),
        Constants$root.C_DOUBLE$LAYOUT.withName("z")
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
    static final FunctionDescriptor RprSolverContact_set_friction$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle RprSolverContact_set_friction$MH = RuntimeHelper.downcallHandle(
        "RprSolverContact_set_friction",
        constants$82.RprSolverContact_set_friction$FUNC
    );
    static final FunctionDescriptor RprSolverContact_set_point$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y"),
            Constants$root.C_DOUBLE$LAYOUT.withName("z")
        ).withName("RprVector")
    );
    static final MethodHandle RprSolverContact_set_point$MH = RuntimeHelper.downcallHandle(
        "RprSolverContact_set_point",
        constants$82.RprSolverContact_set_point$FUNC
    );
    static final FunctionDescriptor RprSolverContact_set_restitution$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle RprSolverContact_set_restitution$MH = RuntimeHelper.downcallHandle(
        "RprSolverContact_set_restitution",
        constants$82.RprSolverContact_set_restitution$FUNC
    );
}


