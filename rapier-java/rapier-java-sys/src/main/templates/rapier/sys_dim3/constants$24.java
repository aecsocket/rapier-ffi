// Generated by jextract

package rapier.sys_dim3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$24 {

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
        constants$24.RprColliderSet_insert_with_parent$FUNC
    );
    static final FunctionDescriptor RprColliderSet_is_empty$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprColliderSet_is_empty$MH = RuntimeHelper.downcallHandle(
        "RprColliderSet_is_empty",
        constants$24.RprColliderSet_is_empty$FUNC
    );
    static final FunctionDescriptor RprColliderSet_len$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprColliderSet_len$MH = RuntimeHelper.downcallHandle(
        "RprColliderSet_len",
        constants$24.RprColliderSet_len$FUNC
    );
    static final FunctionDescriptor RprColliderSet_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RprColliderSet_new$MH = RuntimeHelper.downcallHandle(
        "RprColliderSet_new",
        constants$24.RprColliderSet_new$FUNC
    );
    static final FunctionDescriptor RprColliderSet_remove$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprColliderSet_remove$MH = RuntimeHelper.downcallHandle(
        "RprColliderSet_remove",
        constants$24.RprColliderSet_remove$FUNC
    );
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
}


