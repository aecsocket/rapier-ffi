// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$89 {

    static final FunctionDescriptor RprSharedShape_strong_count$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprSharedShape_strong_count$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_strong_count",
        constants$89.RprSharedShape_strong_count$FUNC
    );
    static final FunctionDescriptor RprSharedShape_triangle$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y"),
            Constants$root.C_DOUBLE$LAYOUT.withName("z")
        ).withName("RprVector"),
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y"),
            Constants$root.C_DOUBLE$LAYOUT.withName("z")
        ).withName("RprVector"),
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y"),
            Constants$root.C_DOUBLE$LAYOUT.withName("z")
        ).withName("RprVector")
    );
    static final MethodHandle RprSharedShape_triangle$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_triangle",
        constants$89.RprSharedShape_triangle$FUNC
    );
    static final FunctionDescriptor RprSharedShape_trimesh$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle RprSharedShape_trimesh$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_trimesh",
        constants$89.RprSharedShape_trimesh$FUNC
    );
    static final FunctionDescriptor RprSolverContact_dist$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprSolverContact_dist$MH = RuntimeHelper.downcallHandle(
        "RprSolverContact_dist",
        constants$89.RprSolverContact_dist$FUNC
    );
    static final FunctionDescriptor RprSolverContact_friction$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprSolverContact_friction$MH = RuntimeHelper.downcallHandle(
        "RprSolverContact_friction",
        constants$89.RprSolverContact_friction$FUNC
    );
    static final FunctionDescriptor RprSolverContact_is_bouncy$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprSolverContact_is_bouncy$MH = RuntimeHelper.downcallHandle(
        "RprSolverContact_is_bouncy",
        constants$89.RprSolverContact_is_bouncy$FUNC
    );
}


