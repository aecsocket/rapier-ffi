// Generated by jextract

package rapier.sys;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$87 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$87() {}
    static final FunctionDescriptor RprSolverContact_set_dist$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprSolverContact_set_dist$MH = RuntimeHelper.downcallHandle(
        "RprSolverContact_set_dist",
        constants$87.RprSolverContact_set_dist$FUNC
    );
    static final FunctionDescriptor RprSolverContact_set_friction$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprSolverContact_set_friction$MH = RuntimeHelper.downcallHandle(
        "RprSolverContact_set_friction",
        constants$87.RprSolverContact_set_friction$FUNC
    );
    static final FunctionDescriptor RprSolverContact_set_point$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y")
        ).withName("RprVector")
    );
    static final MethodHandle RprSolverContact_set_point$MH = RuntimeHelper.downcallHandle(
        "RprSolverContact_set_point",
        constants$87.RprSolverContact_set_point$FUNC
    );
    static final FunctionDescriptor RprSolverContact_set_restitution$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprSolverContact_set_restitution$MH = RuntimeHelper.downcallHandle(
        "RprSolverContact_set_restitution",
        constants$87.RprSolverContact_set_restitution$FUNC
    );
    static final FunctionDescriptor RprSolverContact_set_tangent_velocity$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y")
        ).withName("RprVector")
    );
    static final MethodHandle RprSolverContact_set_tangent_velocity$MH = RuntimeHelper.downcallHandle(
        "RprSolverContact_set_tangent_velocity",
        constants$87.RprSolverContact_set_tangent_velocity$FUNC
    );
    static final FunctionDescriptor RprSolverContact_tangent_velocity$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("x"),
        Constants$root.C_FLOAT$LAYOUT.withName("y")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprSolverContact_tangent_velocity$MH = RuntimeHelper.downcallHandle(
        "RprSolverContact_tangent_velocity",
        constants$87.RprSolverContact_tangent_velocity$FUNC
    );
}


