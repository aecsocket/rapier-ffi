// Generated by jextract

package rapier.sys_dim2_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$57 {

    static final FunctionDescriptor RprPairFilterContext_collider1$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("index"),
        Constants$root.C_INT$LAYOUT.withName("generation")
    ).withName("RprArenaKey"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprPairFilterContext_collider1$MH = RuntimeHelper.downcallHandle(
        "RprPairFilterContext_collider1",
        constants$57.RprPairFilterContext_collider1$FUNC
    );
    static final FunctionDescriptor RprPairFilterContext_collider2$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("index"),
        Constants$root.C_INT$LAYOUT.withName("generation")
    ).withName("RprArenaKey"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprPairFilterContext_collider2$MH = RuntimeHelper.downcallHandle(
        "RprPairFilterContext_collider2",
        constants$57.RprPairFilterContext_collider2$FUNC
    );
    static final FunctionDescriptor RprPairFilterContext_colliders$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprPairFilterContext_colliders$MH = RuntimeHelper.downcallHandle(
        "RprPairFilterContext_colliders",
        constants$57.RprPairFilterContext_colliders$FUNC
    );
    static final FunctionDescriptor RprPairFilterContext_rigid_body1$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprPairFilterContext_rigid_body1$MH = RuntimeHelper.downcallHandle(
        "RprPairFilterContext_rigid_body1",
        constants$57.RprPairFilterContext_rigid_body1$FUNC
    );
    static final FunctionDescriptor RprPairFilterContext_rigid_body2$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprPairFilterContext_rigid_body2$MH = RuntimeHelper.downcallHandle(
        "RprPairFilterContext_rigid_body2",
        constants$57.RprPairFilterContext_rigid_body2$FUNC
    );
    static final FunctionDescriptor RprPhysicsPipeline_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprPhysicsPipeline_drop$MH = RuntimeHelper.downcallHandle(
        "RprPhysicsPipeline_drop",
        constants$57.RprPhysicsPipeline_drop$FUNC
    );
}


