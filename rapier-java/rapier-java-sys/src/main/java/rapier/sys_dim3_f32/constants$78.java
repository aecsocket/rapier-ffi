// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$78 {

    static final FunctionDescriptor RprSharedShape_cuboid$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprSharedShape_cuboid$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_cuboid",
        constants$78.RprSharedShape_cuboid$FUNC
    );
    static final FunctionDescriptor RprSharedShape_cylinder$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprSharedShape_cylinder$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_cylinder",
        constants$78.RprSharedShape_cylinder$FUNC
    );
    static final FunctionDescriptor RprSharedShape_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprSharedShape_data$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_data",
        constants$78.RprSharedShape_data$FUNC
    );
    static final FunctionDescriptor RprSharedShape_halfspace$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y"),
            Constants$root.C_FLOAT$LAYOUT.withName("z")
        ).withName("RprVector")
    );
    static final MethodHandle RprSharedShape_halfspace$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_halfspace",
        constants$78.RprSharedShape_halfspace$FUNC
    );
    static final FunctionDescriptor RprSharedShape_polyline$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle RprSharedShape_polyline$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_polyline",
        constants$78.RprSharedShape_polyline$FUNC
    );
    static final FunctionDescriptor RprSharedShape_release$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprSharedShape_release$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_release",
        constants$78.RprSharedShape_release$FUNC
    );
}


