// Generated by jextract

package rapier.sys;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$83 {

    static final FunctionDescriptor RprSharedShape_capsule$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
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
    static final MethodHandle RprSharedShape_capsule$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_capsule",
        constants$83.RprSharedShape_capsule$FUNC
    );
    static final FunctionDescriptor RprSharedShape_compound$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle RprSharedShape_compound$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_compound",
        constants$83.RprSharedShape_compound$FUNC
    );
    static final FunctionDescriptor RprSharedShape_convex_decomposition$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle RprSharedShape_convex_decomposition$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_convex_decomposition",
        constants$83.RprSharedShape_convex_decomposition$FUNC
    );
    static final FunctionDescriptor RprSharedShape_convex_decomposition_with_params$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprSharedShape_convex_decomposition_with_params$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_convex_decomposition_with_params",
        constants$83.RprSharedShape_convex_decomposition_with_params$FUNC
    );
    static final FunctionDescriptor RprSharedShape_convex_hull$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle RprSharedShape_convex_hull$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_convex_hull",
        constants$83.RprSharedShape_convex_hull$FUNC
    );
    static final FunctionDescriptor RprSharedShape_cuboid$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprSharedShape_cuboid$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_cuboid",
        constants$83.RprSharedShape_cuboid$FUNC
    );
}


