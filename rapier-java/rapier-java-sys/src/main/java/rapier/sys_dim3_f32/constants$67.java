// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$67 {

    static final FunctionDescriptor RprSharedShape_round_convex_decomposition_with_params$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprSharedShape_round_convex_decomposition_with_params$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_round_convex_decomposition_with_params",
        constants$67.RprSharedShape_round_convex_decomposition_with_params$FUNC
    );
    static final FunctionDescriptor RprSharedShape_round_convex_hull$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprSharedShape_round_convex_hull$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_round_convex_hull",
        constants$67.RprSharedShape_round_convex_hull$FUNC
    );
    static final FunctionDescriptor RprSharedShape_round_convex_mesh$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprSharedShape_round_convex_mesh$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_round_convex_mesh",
        constants$67.RprSharedShape_round_convex_mesh$FUNC
    );
    static final FunctionDescriptor RprSharedShape_round_cuboid$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprSharedShape_round_cuboid$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_round_cuboid",
        constants$67.RprSharedShape_round_cuboid$FUNC
    );
    static final FunctionDescriptor RprSharedShape_round_cylinder$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprSharedShape_round_cylinder$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_round_cylinder",
        constants$67.RprSharedShape_round_cylinder$FUNC
    );
    static final FunctionDescriptor RprSharedShape_round_triangle$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y"),
            Constants$root.C_FLOAT$LAYOUT.withName("z")
        ).withName("RprVector"),
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y"),
            Constants$root.C_FLOAT$LAYOUT.withName("z")
        ).withName("RprVector"),
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y"),
            Constants$root.C_FLOAT$LAYOUT.withName("z")
        ).withName("RprVector"),
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprSharedShape_round_triangle$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_round_triangle",
        constants$67.RprSharedShape_round_triangle$FUNC
    );
}


