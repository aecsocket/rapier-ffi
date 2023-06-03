// Generated by jextract

package rapier.sys_dim2_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$28 {

    static final FunctionDescriptor RprCollider_material$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("friction"),
        Constants$root.C_DOUBLE$LAYOUT.withName("restitution"),
        Constants$root.C_INT$LAYOUT.withName("friction_combine_rule"),
        Constants$root.C_INT$LAYOUT.withName("restitution_combine_rule")
    ).withName("RprColliderMaterial"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_material$MH = RuntimeHelper.downcallHandle(
        "RprCollider_material",
        constants$28.RprCollider_material$FUNC
    );
    static final FunctionDescriptor RprCollider_parent$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("index"),
        Constants$root.C_INT$LAYOUT.withName("generation")
    ).withName("RprArenaKey"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_parent$MH = RuntimeHelper.downcallHandle(
        "RprCollider_parent",
        constants$28.RprCollider_parent$FUNC
    );
    static final FunctionDescriptor RprCollider_position$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("re"),
            Constants$root.C_DOUBLE$LAYOUT.withName("im")
        ).withName("rotation"),
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y")
        ).withName("translation")
    ).withName("RprIsometry"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_position$MH = RuntimeHelper.downcallHandle(
        "RprCollider_position",
        constants$28.RprCollider_position$FUNC
    );
    static final FunctionDescriptor RprCollider_position_wrt_parent$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("re"),
            Constants$root.C_DOUBLE$LAYOUT.withName("im")
        ).withName("rotation"),
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y")
        ).withName("translation")
    ).withName("RprIsometry"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_position_wrt_parent$MH = RuntimeHelper.downcallHandle(
        "RprCollider_position_wrt_parent",
        constants$28.RprCollider_position_wrt_parent$FUNC
    );
    static final FunctionDescriptor RprCollider_restitution$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_restitution$MH = RuntimeHelper.downcallHandle(
        "RprCollider_restitution",
        constants$28.RprCollider_restitution$FUNC
    );
    static final FunctionDescriptor RprCollider_restitution_combine_rule$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_restitution_combine_rule$MH = RuntimeHelper.downcallHandle(
        "RprCollider_restitution_combine_rule",
        constants$28.RprCollider_restitution_combine_rule$FUNC
    );
}


