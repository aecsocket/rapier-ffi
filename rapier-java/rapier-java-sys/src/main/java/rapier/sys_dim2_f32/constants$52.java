// Generated by jextract

package rapier.sys_dim2_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$52 {

    static final FunctionDescriptor RprPairFilterContext_colliders$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprPairFilterContext_colliders$MH = RuntimeHelper.downcallHandle(
        "RprPairFilterContext_colliders",
        constants$52.RprPairFilterContext_colliders$FUNC
    );
    static final FunctionDescriptor RprPairFilterContext_rigid_body1$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprPairFilterContext_rigid_body1$MH = RuntimeHelper.downcallHandle(
        "RprPairFilterContext_rigid_body1",
        constants$52.RprPairFilterContext_rigid_body1$FUNC
    );
    static final FunctionDescriptor RprPairFilterContext_rigid_body2$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprPairFilterContext_rigid_body2$MH = RuntimeHelper.downcallHandle(
        "RprPairFilterContext_rigid_body2",
        constants$52.RprPairFilterContext_rigid_body2$FUNC
    );
    static final FunctionDescriptor RprPhysicsPipeline_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprPhysicsPipeline_drop$MH = RuntimeHelper.downcallHandle(
        "RprPhysicsPipeline_drop",
        constants$52.RprPhysicsPipeline_drop$FUNC
    );
    static final FunctionDescriptor RprPhysicsPipeline_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RprPhysicsPipeline_new$MH = RuntimeHelper.downcallHandle(
        "RprPhysicsPipeline_new",
        constants$52.RprPhysicsPipeline_new$FUNC
    );
    static final FunctionDescriptor RprPhysicsPipeline_step$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y")
        ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprPhysicsPipeline_step$MH = RuntimeHelper.downcallHandle(
        "RprPhysicsPipeline_step",
        constants$52.RprPhysicsPipeline_step$FUNC
    );
}


