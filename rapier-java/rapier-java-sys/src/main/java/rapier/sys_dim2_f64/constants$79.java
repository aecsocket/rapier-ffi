// Generated by jextract

package rapier.sys_dim2_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$79 {

    static final FunctionDescriptor RprSharedShape_round_triangle$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y")
        ).withName("RprVector"),
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y")
        ).withName("RprVector"),
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y")
        ).withName("RprVector"),
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle RprSharedShape_round_triangle$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_round_triangle",
        constants$79.RprSharedShape_round_triangle$FUNC
    );
    static final FunctionDescriptor RprSharedShape_segment$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y")
        ).withName("RprVector"),
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y")
        ).withName("RprVector")
    );
    static final MethodHandle RprSharedShape_segment$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_segment",
        constants$79.RprSharedShape_segment$FUNC
    );
    static final FunctionDescriptor RprSharedShape_strong_count$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprSharedShape_strong_count$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_strong_count",
        constants$79.RprSharedShape_strong_count$FUNC
    );
    static final FunctionDescriptor RprSharedShape_triangle$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y")
        ).withName("RprVector"),
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y")
        ).withName("RprVector"),
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y")
        ).withName("RprVector")
    );
    static final MethodHandle RprSharedShape_triangle$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_triangle",
        constants$79.RprSharedShape_triangle$FUNC
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
        constants$79.RprSharedShape_trimesh$FUNC
    );
    static final FunctionDescriptor RprSolverContact_dist$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprSolverContact_dist$MH = RuntimeHelper.downcallHandle(
        "RprSolverContact_dist",
        constants$79.RprSolverContact_dist$FUNC
    );
}


