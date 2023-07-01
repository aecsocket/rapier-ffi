// Generated by jextract

package rapier.sys_dim3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$52 {

    static final FunctionDescriptor RprIntegrationParameters_default$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
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
    ).withName("RprIntegrationParameters"));
    static final MethodHandle RprIntegrationParameters_default$MH = RuntimeHelper.downcallHandle(
        "RprIntegrationParameters_default",
        constants$52.RprIntegrationParameters_default$FUNC
    );
    static final FunctionDescriptor RprIslandManager_active_dynamic_bodies$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprIslandManager_active_dynamic_bodies$MH = RuntimeHelper.downcallHandle(
        "RprIslandManager_active_dynamic_bodies",
        constants$52.RprIslandManager_active_dynamic_bodies$FUNC
    );
    static final FunctionDescriptor RprIslandManager_active_kinematic_bodies$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprIslandManager_active_kinematic_bodies$MH = RuntimeHelper.downcallHandle(
        "RprIslandManager_active_kinematic_bodies",
        constants$52.RprIslandManager_active_kinematic_bodies$FUNC
    );
    static final FunctionDescriptor RprIslandManager_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprIslandManager_drop$MH = RuntimeHelper.downcallHandle(
        "RprIslandManager_drop",
        constants$52.RprIslandManager_drop$FUNC
    );
    static final FunctionDescriptor RprIslandManager_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RprIslandManager_new$MH = RuntimeHelper.downcallHandle(
        "RprIslandManager_new",
        constants$52.RprIslandManager_new$FUNC
    );
    static final FunctionDescriptor RprJointLimits_default$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("min"),
        Constants$root.C_FLOAT$LAYOUT.withName("max"),
        Constants$root.C_FLOAT$LAYOUT.withName("impulse")
    ).withName("RprJointLimits"));
    static final MethodHandle RprJointLimits_default$MH = RuntimeHelper.downcallHandle(
        "RprJointLimits_default",
        constants$52.RprJointLimits_default$FUNC
    );
}


