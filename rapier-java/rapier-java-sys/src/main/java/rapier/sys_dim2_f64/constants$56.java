// Generated by jextract

package rapier.sys_dim2_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$56 {

    static final FunctionDescriptor RprQueryPipeline_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RprQueryPipeline_new$MH = RuntimeHelper.downcallHandle(
        "RprQueryPipeline_new",
        constants$56.RprQueryPipeline_new$FUNC
    );
    static final FunctionDescriptor RprQueryPipeline_project_point$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y")
        ).withName("RprVector"),
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
            Constants$root.C_BOOL$LAYOUT.withName("has_predicate"),
            MemoryLayout.paddingLayout(56),
            Constants$root.C_POINTER$LAYOUT.withName("predicate")
        ).withName("RprQueryFilter"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprQueryPipeline_project_point$MH = RuntimeHelper.downcallHandle(
        "RprQueryPipeline_project_point",
        constants$56.RprQueryPipeline_project_point$FUNC
    );
    static final FunctionDescriptor RprQueryPipeline_project_point_and_get_feature$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y")
        ).withName("RprVector"),
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
            Constants$root.C_BOOL$LAYOUT.withName("has_predicate"),
            MemoryLayout.paddingLayout(56),
            Constants$root.C_POINTER$LAYOUT.withName("predicate")
        ).withName("RprQueryFilter"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprQueryPipeline_project_point_and_get_feature$MH = RuntimeHelper.downcallHandle(
        "RprQueryPipeline_project_point_and_get_feature",
        constants$56.RprQueryPipeline_project_point_and_get_feature$FUNC
    );
    static final FunctionDescriptor RprQuerypipeline_nonlinear_cast_shape$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_DOUBLE$LAYOUT.withName("re"),
                    Constants$root.C_DOUBLE$LAYOUT.withName("im")
                ).withName("rotation"),
                MemoryLayout.structLayout(
                    Constants$root.C_DOUBLE$LAYOUT.withName("x"),
                    Constants$root.C_DOUBLE$LAYOUT.withName("y")
                ).withName("translation")
            ).withName("start"),
            MemoryLayout.structLayout(
                Constants$root.C_DOUBLE$LAYOUT.withName("x"),
                Constants$root.C_DOUBLE$LAYOUT.withName("y")
            ).withName("local_center"),
            MemoryLayout.structLayout(
                Constants$root.C_DOUBLE$LAYOUT.withName("x"),
                Constants$root.C_DOUBLE$LAYOUT.withName("y")
            ).withName("linvel"),
            MemoryLayout.structLayout(
                Constants$root.C_DOUBLE$LAYOUT.withName("x")
            ).withName("angvel")
        ).withName("RprNonlinearRigidMotion"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
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
            Constants$root.C_BOOL$LAYOUT.withName("has_predicate"),
            MemoryLayout.paddingLayout(56),
            Constants$root.C_POINTER$LAYOUT.withName("predicate")
        ).withName("RprQueryFilter"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprQuerypipeline_nonlinear_cast_shape$MH = RuntimeHelper.downcallHandle(
        "RprQuerypipeline_nonlinear_cast_shape",
        constants$56.RprQuerypipeline_nonlinear_cast_shape$FUNC
    );
    static final FunctionDescriptor RprRigidBodyActivation_angular_threshold$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyActivation_angular_threshold$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyActivation_angular_threshold",
        constants$56.RprRigidBodyActivation_angular_threshold$FUNC
    );
    static final FunctionDescriptor RprRigidBodyActivation_linear_threshold$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyActivation_linear_threshold$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyActivation_linear_threshold",
        constants$56.RprRigidBodyActivation_linear_threshold$FUNC
    );
}


