// Generated by jextract

package rapier.sys_dim2_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$77 {

    static final FunctionDescriptor RprSharedShape_release$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprSharedShape_release$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_release",
        constants$77.RprSharedShape_release$FUNC
    );
    static final FunctionDescriptor RprSharedShape_round_convex_decomposition$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprSharedShape_round_convex_decomposition$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_round_convex_decomposition",
        constants$77.RprSharedShape_round_convex_decomposition$FUNC
    );
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
        constants$77.RprSharedShape_round_convex_decomposition_with_params$FUNC
    );
    static final FunctionDescriptor RprSharedShape_round_convex_hull$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprSharedShape_round_convex_hull$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_round_convex_hull",
        constants$77.RprSharedShape_round_convex_hull$FUNC
    );
    static final FunctionDescriptor RprSharedShape_round_cuboid$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprSharedShape_round_cuboid$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_round_cuboid",
        constants$77.RprSharedShape_round_cuboid$FUNC
    );
    static final FunctionDescriptor RprSharedShape_round_triangle$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y")
        ).withName("RprVector"),
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y")
        ).withName("RprVector"),
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y")
        ).withName("RprVector"),
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprSharedShape_round_triangle$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_round_triangle",
        constants$77.RprSharedShape_round_triangle$FUNC
    );
}


