// Generated by jextract

package rapier.sys;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$37 {

    static final FunctionDescriptor RprImpulseJoint_set_body2$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey")
    );
    static final MethodHandle RprImpulseJoint_set_body2$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJoint_set_body2",
        constants$37.RprImpulseJoint_set_body2$FUNC
    );
    static final FunctionDescriptor RprImpulseJoint_set_data$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprImpulseJoint_set_data$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJoint_set_data",
        constants$37.RprImpulseJoint_set_data$FUNC
    );
    static final FunctionDescriptor RprImpulseJoint_set_impulses$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y"),
            Constants$root.C_FLOAT$LAYOUT.withName("z")
        ).withName("RprSpacialVector")
    );
    static final MethodHandle RprImpulseJoint_set_impulses$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJoint_set_impulses",
        constants$37.RprImpulseJoint_set_impulses$FUNC
    );
    static final FunctionDescriptor RprIntegrationParametersDesc_default$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
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
    ).withName("RprIntegrationParametersDesc"));
    static final MethodHandle RprIntegrationParametersDesc_default$MH = RuntimeHelper.downcallHandle(
        "RprIntegrationParametersDesc_default",
        constants$37.RprIntegrationParametersDesc_default$FUNC
    );
    static final FunctionDescriptor RprIntegrationParameters_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprIntegrationParameters_drop$MH = RuntimeHelper.downcallHandle(
        "RprIntegrationParameters_drop",
        constants$37.RprIntegrationParameters_drop$FUNC
    );
    static final FunctionDescriptor RprIntegrationParameters_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
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
        ).withName("RprIntegrationParametersDesc")
    );
    static final MethodHandle RprIntegrationParameters_new$MH = RuntimeHelper.downcallHandle(
        "RprIntegrationParameters_new",
        constants$37.RprIntegrationParameters_new$FUNC
    );
}


