// Generated by jextract

package rapier.sys_dim2_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$59 {

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
    static final FunctionDescriptor RprPhysicsPipeline_step$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y")
        ).withName("RprVector"),
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("dt"),
            Constants$root.C_DOUBLE$LAYOUT.withName("min_ccd_dt"),
            Constants$root.C_DOUBLE$LAYOUT.withName("erp"),
            Constants$root.C_DOUBLE$LAYOUT.withName("damping_ratio"),
            Constants$root.C_DOUBLE$LAYOUT.withName("joint_erp"),
            Constants$root.C_DOUBLE$LAYOUT.withName("joint_damping_ratio"),
            Constants$root.C_DOUBLE$LAYOUT.withName("allowed_linear_error"),
            Constants$root.C_DOUBLE$LAYOUT.withName("max_penetration_correction"),
            Constants$root.C_DOUBLE$LAYOUT.withName("prediction_distance"),
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
        constants$59.RprPhysicsPipeline_step$FUNC
    );
    static final FunctionDescriptor RprPhysicsPipeline_step_all$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT,
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
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprPhysicsPipeline_step_all$MH = RuntimeHelper.downcallHandle(
        "RprPhysicsPipeline_step_all",
        constants$59.RprPhysicsPipeline_step_all$FUNC
    );
    static final FunctionDescriptor RprQueryFilter_default$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("flags"),
        Constants$root.C_BOOL$LAYOUT.withName("has_groups"),
        MemoryLayout.paddingLayout(24),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("memberships"),
            Constants$root.C_INT$LAYOUT.withName("filter")
        ).withName("groups"),
        Constants$root.C_BOOL$LAYOUT.withName("has_exclude_collider"),
        MemoryLayout.paddingLayout(24),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("exclude_collider"),
        Constants$root.C_BOOL$LAYOUT.withName("has_exclude_rigid_body"),
        MemoryLayout.paddingLayout(24),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("exclude_rigid_body"),
        Constants$root.C_POINTER$LAYOUT.withName("predicate")
    ).withName("RprQueryFilter"));
    static final MethodHandle RprQueryFilter_default$MH = RuntimeHelper.downcallHandle(
        "RprQueryFilter_default",
        constants$59.RprQueryFilter_default$FUNC
    );
    static final FunctionDescriptor RprQueryPipeline_cast_ray$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_DOUBLE$LAYOUT.withName("x"),
                Constants$root.C_DOUBLE$LAYOUT.withName("y")
            ).withName("origin"),
            MemoryLayout.structLayout(
                Constants$root.C_DOUBLE$LAYOUT.withName("x"),
                Constants$root.C_DOUBLE$LAYOUT.withName("y")
            ).withName("dir")
        ).withName("RprRay"),
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("flags"),
            Constants$root.C_BOOL$LAYOUT.withName("has_groups"),
            MemoryLayout.paddingLayout(24),
            MemoryLayout.structLayout(
                Constants$root.C_INT$LAYOUT.withName("memberships"),
                Constants$root.C_INT$LAYOUT.withName("filter")
            ).withName("groups"),
            Constants$root.C_BOOL$LAYOUT.withName("has_exclude_collider"),
            MemoryLayout.paddingLayout(24),
            MemoryLayout.structLayout(
                Constants$root.C_INT$LAYOUT.withName("index"),
                Constants$root.C_INT$LAYOUT.withName("generation")
            ).withName("exclude_collider"),
            Constants$root.C_BOOL$LAYOUT.withName("has_exclude_rigid_body"),
            MemoryLayout.paddingLayout(24),
            MemoryLayout.structLayout(
                Constants$root.C_INT$LAYOUT.withName("index"),
                Constants$root.C_INT$LAYOUT.withName("generation")
            ).withName("exclude_rigid_body"),
            Constants$root.C_POINTER$LAYOUT.withName("predicate")
        ).withName("RprQueryFilter"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprQueryPipeline_cast_ray$MH = RuntimeHelper.downcallHandle(
        "RprQueryPipeline_cast_ray",
        constants$59.RprQueryPipeline_cast_ray$FUNC
    );
}


