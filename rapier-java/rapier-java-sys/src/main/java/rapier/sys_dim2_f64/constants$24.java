// Generated by jextract

package rapier.sys_dim2_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$24 {

    static final FunctionDescriptor RprColliderSet_set_parent$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey"),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprColliderSet_set_parent$MH = RuntimeHelper.downcallHandle(
        "RprColliderSet_set_parent",
        constants$24.RprColliderSet_set_parent$FUNC
    );
    static final FunctionDescriptor RprColliderVec_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprColliderVec_drop$MH = RuntimeHelper.downcallHandle(
        "RprColliderVec_drop",
        constants$24.RprColliderVec_drop$FUNC
    );
    static final FunctionDescriptor RprColliderVec_handle$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("index"),
        Constants$root.C_INT$LAYOUT.withName("generation")
    ).withName("RprArenaKey"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle RprColliderVec_handle$MH = RuntimeHelper.downcallHandle(
        "RprColliderVec_handle",
        constants$24.RprColliderVec_handle$FUNC
    );
    static final FunctionDescriptor RprColliderVec_len$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprColliderVec_len$MH = RuntimeHelper.downcallHandle(
        "RprColliderVec_len",
        constants$24.RprColliderVec_len$FUNC
    );
    static final FunctionDescriptor RprColliderVec_value$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle RprColliderVec_value$MH = RuntimeHelper.downcallHandle(
        "RprColliderVec_value",
        constants$24.RprColliderVec_value$FUNC
    );
    static final FunctionDescriptor RprCollider_compute_aabb$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y")
        ).withName("min"),
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y")
        ).withName("max")
    ).withName("RprAabb"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_compute_aabb$MH = RuntimeHelper.downcallHandle(
        "RprCollider_compute_aabb",
        constants$24.RprCollider_compute_aabb$FUNC
    );
}


