// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$57 {

    static final FunctionDescriptor RprSharedShape_cuboid$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_DOUBLE$LAYOUT.withName("x"),
                Constants$root.C_DOUBLE$LAYOUT.withName("y"),
                Constants$root.C_DOUBLE$LAYOUT.withName("z")
            ).withName("half_extents")
        ).withName("RprCuboid")
    );
    static final MethodHandle RprSharedShape_cuboid$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_cuboid",
        constants$57.RprSharedShape_cuboid$FUNC
    );
    static final FunctionDescriptor RprSharedShape_cylinder$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("half_height"),
            Constants$root.C_DOUBLE$LAYOUT.withName("radius")
        ).withName("RprCylinder")
    );
    static final MethodHandle RprSharedShape_cylinder$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_cylinder",
        constants$57.RprSharedShape_cylinder$FUNC
    );
    static final FunctionDescriptor RprSharedShape_release$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprSharedShape_release$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_release",
        constants$57.RprSharedShape_release$FUNC
    );
    static final FunctionDescriptor RprSharedShape_segment$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_DOUBLE$LAYOUT.withName("x"),
                Constants$root.C_DOUBLE$LAYOUT.withName("y"),
                Constants$root.C_DOUBLE$LAYOUT.withName("z")
            ).withName("a"),
            MemoryLayout.structLayout(
                Constants$root.C_DOUBLE$LAYOUT.withName("x"),
                Constants$root.C_DOUBLE$LAYOUT.withName("y"),
                Constants$root.C_DOUBLE$LAYOUT.withName("z")
            ).withName("b")
        ).withName("RprSegment")
    );
    static final MethodHandle RprSharedShape_segment$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_segment",
        constants$57.RprSharedShape_segment$FUNC
    );
    static final FunctionDescriptor RprSharedShape_strong_count$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprSharedShape_strong_count$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_strong_count",
        constants$57.RprSharedShape_strong_count$FUNC
    );
    static final FunctionDescriptor RprSharedShape_triangle$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_DOUBLE$LAYOUT.withName("x"),
                Constants$root.C_DOUBLE$LAYOUT.withName("y"),
                Constants$root.C_DOUBLE$LAYOUT.withName("z")
            ).withName("a"),
            MemoryLayout.structLayout(
                Constants$root.C_DOUBLE$LAYOUT.withName("x"),
                Constants$root.C_DOUBLE$LAYOUT.withName("y"),
                Constants$root.C_DOUBLE$LAYOUT.withName("z")
            ).withName("b"),
            MemoryLayout.structLayout(
                Constants$root.C_DOUBLE$LAYOUT.withName("x"),
                Constants$root.C_DOUBLE$LAYOUT.withName("y"),
                Constants$root.C_DOUBLE$LAYOUT.withName("z")
            ).withName("c")
        ).withName("RprTriangle")
    );
    static final MethodHandle RprSharedShape_triangle$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_triangle",
        constants$57.RprSharedShape_triangle$FUNC
    );
}


