// Generated by jextract

package rapier.sys_dim2_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$42 {

    static final FunctionDescriptor RprIntegrationParameters_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprIntegrationParameters_drop$MH = RuntimeHelper.downcallHandle(
        "RprIntegrationParameters_drop",
        constants$42.RprIntegrationParameters_drop$FUNC
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
        constants$42.RprIntegrationParameters_new$FUNC
    );
    static final FunctionDescriptor RprIslandManager_active_dynamic_bodies$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprIslandManager_active_dynamic_bodies$MH = RuntimeHelper.downcallHandle(
        "RprIslandManager_active_dynamic_bodies",
        constants$42.RprIslandManager_active_dynamic_bodies$FUNC
    );
    static final FunctionDescriptor RprIslandManager_active_kinematic_bodies$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprIslandManager_active_kinematic_bodies$MH = RuntimeHelper.downcallHandle(
        "RprIslandManager_active_kinematic_bodies",
        constants$42.RprIslandManager_active_kinematic_bodies$FUNC
    );
    static final FunctionDescriptor RprIslandManager_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprIslandManager_drop$MH = RuntimeHelper.downcallHandle(
        "RprIslandManager_drop",
        constants$42.RprIslandManager_drop$FUNC
    );
    static final FunctionDescriptor RprIslandManager_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RprIslandManager_new$MH = RuntimeHelper.downcallHandle(
        "RprIslandManager_new",
        constants$42.RprIslandManager_new$FUNC
    );
}


