// Generated by jextract

package rapier.sys_dim2_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$65 {

    static final FunctionDescriptor RprSharedShape_convex_decomposition_with_params$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprSharedShape_convex_decomposition_with_params$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_convex_decomposition_with_params",
        constants$65.RprSharedShape_convex_decomposition_with_params$FUNC
    );
    static final FunctionDescriptor RprSharedShape_convex_hull$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle RprSharedShape_convex_hull$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_convex_hull",
        constants$65.RprSharedShape_convex_hull$FUNC
    );
    static final FunctionDescriptor RprSharedShape_cuboid$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprSharedShape_cuboid$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_cuboid",
        constants$65.RprSharedShape_cuboid$FUNC
    );
    static final FunctionDescriptor RprSharedShape_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprSharedShape_data$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_data",
        constants$65.RprSharedShape_data$FUNC
    );
    static final FunctionDescriptor RprSharedShape_halfspace$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y")
        ).withName("RprVector")
    );
    static final MethodHandle RprSharedShape_halfspace$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_halfspace",
        constants$65.RprSharedShape_halfspace$FUNC
    );
    static final FunctionDescriptor RprSharedShape_polyline$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle RprSharedShape_polyline$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_polyline",
        constants$65.RprSharedShape_polyline$FUNC
    );
}


