// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$59 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$59() {}
    static final FunctionDescriptor RprPairFilterContext_collider2$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("index"),
        Constants$root.C_INT$LAYOUT.withName("generation")
    ).withName("RprArenaKey"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprPairFilterContext_collider2$MH = RuntimeHelper.downcallHandle(
        "RprPairFilterContext_collider2",
        constants$59.RprPairFilterContext_collider2$FUNC
    );
    static final FunctionDescriptor RprPairFilterContext_colliders$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprPairFilterContext_colliders$MH = RuntimeHelper.downcallHandle(
        "RprPairFilterContext_colliders",
        constants$59.RprPairFilterContext_colliders$FUNC
    );
    static final FunctionDescriptor RprPairFilterContext_rigid_body1$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprPairFilterContext_rigid_body1$MH = RuntimeHelper.downcallHandle(
        "RprPairFilterContext_rigid_body1",
        constants$59.RprPairFilterContext_rigid_body1$FUNC
    );
    static final FunctionDescriptor RprPairFilterContext_rigid_body2$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprPairFilterContext_rigid_body2$MH = RuntimeHelper.downcallHandle(
        "RprPairFilterContext_rigid_body2",
        constants$59.RprPairFilterContext_rigid_body2$FUNC
    );
    static final FunctionDescriptor RprPhysicsPipeline_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprPhysicsPipeline_drop$MH = RuntimeHelper.downcallHandle(
        "RprPhysicsPipeline_drop",
        constants$59.RprPhysicsPipeline_drop$FUNC
    );
    static final FunctionDescriptor RprPhysicsPipeline_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RprPhysicsPipeline_new$MH = RuntimeHelper.downcallHandle(
        "RprPhysicsPipeline_new",
        constants$59.RprPhysicsPipeline_new$FUNC
    );
}


