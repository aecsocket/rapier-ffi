// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$66 {

    static final FunctionDescriptor RprSharedShape_trimesh$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle RprSharedShape_trimesh$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_trimesh",
        constants$66.RprSharedShape_trimesh$FUNC
    );
    static final FunctionDescriptor RprVHACDParameters_default$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("concavity"),
        Constants$root.C_DOUBLE$LAYOUT.withName("alpha"),
        Constants$root.C_DOUBLE$LAYOUT.withName("beta"),
        Constants$root.C_INT$LAYOUT.withName("resolution"),
        Constants$root.C_INT$LAYOUT.withName("plane_downsampling"),
        Constants$root.C_INT$LAYOUT.withName("convex_hull_downsampling"),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("tag"),
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_BOOL$LAYOUT.withName("detect_cavities")
                ).withName("flood_fill")
            ).withName("$anon$0"),
            MemoryLayout.paddingLayout(24)
        ).withName("fill_mode"),
        Constants$root.C_BOOL$LAYOUT.withName("convex_hull_approximation"),
        MemoryLayout.paddingLayout(24),
        Constants$root.C_INT$LAYOUT.withName("max_convex_hulls"),
        MemoryLayout.paddingLayout(32)
    ).withName("RprVHACDParameters"));
    static final MethodHandle RprVHACDParameters_default$MH = RuntimeHelper.downcallHandle(
        "RprVHACDParameters_default",
        constants$66.RprVHACDParameters_default$FUNC
    );
    static final FunctionDescriptor RprVHACD_decompose$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprVHACD_decompose$MH = RuntimeHelper.downcallHandle(
        "RprVHACD_decompose",
        constants$66.RprVHACD_decompose$FUNC
    );
    static final FunctionDescriptor RprVHACD_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprVHACD_drop$MH = RuntimeHelper.downcallHandle(
        "RprVHACD_drop",
        constants$66.RprVHACD_drop$FUNC
    );
    static final MemoryAddress NULL$ADDR = MemoryAddress.ofLong(0L);
}


