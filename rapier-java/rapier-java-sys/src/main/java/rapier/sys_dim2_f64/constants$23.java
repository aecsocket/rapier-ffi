// Generated by jextract

package rapier.sys_dim2_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$23 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$23() {}
    static final FunctionDescriptor RprColliderSet_is_empty$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprColliderSet_is_empty$MH = RuntimeHelper.downcallHandle(
        "RprColliderSet_is_empty",
        constants$23.RprColliderSet_is_empty$FUNC
    );
    static final FunctionDescriptor RprColliderSet_len$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprColliderSet_len$MH = RuntimeHelper.downcallHandle(
        "RprColliderSet_len",
        constants$23.RprColliderSet_len$FUNC
    );
    static final FunctionDescriptor RprColliderSet_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RprColliderSet_new$MH = RuntimeHelper.downcallHandle(
        "RprColliderSet_new",
        constants$23.RprColliderSet_new$FUNC
    );
    static final FunctionDescriptor RprColliderSet_remove$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprColliderHandle"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprColliderSet_remove$MH = RuntimeHelper.downcallHandle(
        "RprColliderSet_remove",
        constants$23.RprColliderSet_remove$FUNC
    );
    static final FunctionDescriptor RprColliderSet_set_parent$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprColliderHandle"),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprRigidBodyHandle"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprColliderSet_set_parent$MH = RuntimeHelper.downcallHandle(
        "RprColliderSet_set_parent",
        constants$23.RprColliderSet_set_parent$FUNC
    );
    static final FunctionDescriptor RprCollider_compute_aabb$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(2, Constants$root.C_DOUBLE$LAYOUT).withName("_0")
        ).withName("min"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(2, Constants$root.C_DOUBLE$LAYOUT).withName("_0")
        ).withName("max")
    ).withName("RprAabb"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_compute_aabb$MH = RuntimeHelper.downcallHandle(
        "RprCollider_compute_aabb",
        constants$23.RprCollider_compute_aabb$FUNC
    );
}


