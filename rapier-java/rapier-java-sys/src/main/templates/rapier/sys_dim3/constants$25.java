// Generated by jextract

package rapier.sys_dim3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$25 {

    static final FunctionDescriptor RprColliderVec_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprColliderVec_drop$MH = RuntimeHelper.downcallHandle(
        "RprColliderVec_drop",
        constants$25.RprColliderVec_drop$FUNC
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
        constants$25.RprColliderVec_handle$FUNC
    );
    static final FunctionDescriptor RprColliderVec_len$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprColliderVec_len$MH = RuntimeHelper.downcallHandle(
        "RprColliderVec_len",
        constants$25.RprColliderVec_len$FUNC
    );
    static final FunctionDescriptor RprColliderVec_value$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle RprColliderVec_value$MH = RuntimeHelper.downcallHandle(
        "RprColliderVec_value",
        constants$25.RprColliderVec_value$FUNC
    );
    static final FunctionDescriptor RprCollider_active_collision_types$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_active_collision_types$MH = RuntimeHelper.downcallHandle(
        "RprCollider_active_collision_types",
        constants$25.RprCollider_active_collision_types$FUNC
    );
    static final FunctionDescriptor RprCollider_active_events$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_active_events$MH = RuntimeHelper.downcallHandle(
        "RprCollider_active_events",
        constants$25.RprCollider_active_events$FUNC
    );
}


