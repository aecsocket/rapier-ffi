// Generated by jextract

package rapier.sys_dim2_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$22 {

    static final FunctionDescriptor RprColliderSet_get$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey")
    );
    static final MethodHandle RprColliderSet_get$MH = RuntimeHelper.downcallHandle(
        "RprColliderSet_get",
        constants$22.RprColliderSet_get$FUNC
    );
    static final FunctionDescriptor RprColliderSet_get_mut$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey")
    );
    static final MethodHandle RprColliderSet_get_mut$MH = RuntimeHelper.downcallHandle(
        "RprColliderSet_get_mut",
        constants$22.RprColliderSet_get_mut$FUNC
    );
    static final FunctionDescriptor RprColliderSet_index$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey")
    );
    static final MethodHandle RprColliderSet_index$MH = RuntimeHelper.downcallHandle(
        "RprColliderSet_index",
        constants$22.RprColliderSet_index$FUNC
    );
    static final FunctionDescriptor RprColliderSet_index_mut$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey")
    );
    static final MethodHandle RprColliderSet_index_mut$MH = RuntimeHelper.downcallHandle(
        "RprColliderSet_index_mut",
        constants$22.RprColliderSet_index_mut$FUNC
    );
    static final FunctionDescriptor RprColliderSet_insert$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("index"),
        Constants$root.C_INT$LAYOUT.withName("generation")
    ).withName("RprArenaKey"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprColliderSet_insert$MH = RuntimeHelper.downcallHandle(
        "RprColliderSet_insert",
        constants$22.RprColliderSet_insert$FUNC
    );
    static final FunctionDescriptor RprColliderSet_insert_with_parent$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("index"),
        Constants$root.C_INT$LAYOUT.withName("generation")
    ).withName("RprArenaKey"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprColliderSet_insert_with_parent$MH = RuntimeHelper.downcallHandle(
        "RprColliderSet_insert_with_parent",
        constants$22.RprColliderSet_insert_with_parent$FUNC
    );
}


