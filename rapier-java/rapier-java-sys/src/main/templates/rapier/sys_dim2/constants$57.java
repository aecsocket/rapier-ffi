// Generated by jextract

package rapier.sys_dim2;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$57 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$57() {}
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
    static final FunctionDescriptor RprPhysicsPipeline_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RprPhysicsPipeline_new$MH = RuntimeHelper.downcallHandle(
        "RprPhysicsPipeline_new",
        constants$57.RprPhysicsPipeline_new$FUNC
    );
    static final FunctionDescriptor RprPhysicsPipeline_step$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y")
        ).withName("RprVector"),
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("dt"),
            Constants$root.C_FLOAT$LAYOUT.withName("min_ccd_dt"),
            Constants$root.C_FLOAT$LAYOUT.withName("erp"),
            Constants$root.C_FLOAT$LAYOUT.withName("damping_ratio"),
            Constants$root.C_FLOAT$LAYOUT.withName("joint_erp"),
            Constants$root.C_FLOAT$LAYOUT.withName("joint_damping_ratio"),
            Constants$root.C_FLOAT$LAYOUT.withName("allowed_linear_error"),
            Constants$root.C_FLOAT$LAYOUT.withName("max_penetration_correction"),
            Constants$root.C_FLOAT$LAYOUT.withName("prediction_distance"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_LONG_LONG$LAYOUT.withName("max_velocity_iterations"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("max_velocity_friction_iterations"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("max_stabilization_iterations"),
            Constants$root.C_BOOL$LAYOUT.withName("interleave_restitution_and_friction_resolution"),
            MemoryLayout.paddingLayout(56),
            Constants$root.C_LONG_LONG$LAYOUT.withName("min_island_size"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("max_ccd_substeps")
        ).withName("RprIntegrationParameters"),
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
        constants$57.RprPhysicsPipeline_step$FUNC
    );
}


