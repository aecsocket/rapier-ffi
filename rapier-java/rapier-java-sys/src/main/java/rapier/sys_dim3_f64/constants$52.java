// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$52 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$52() {}
    static final FunctionDescriptor RprImpulseJoint_set_data$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprImpulseJoint_set_data$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJoint_set_data",
        constants$52.RprImpulseJoint_set_data$FUNC
    );
    static final FunctionDescriptor RprImpulseJoint_set_impulses$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y"),
            Constants$root.C_DOUBLE$LAYOUT.withName("z"),
            Constants$root.C_DOUBLE$LAYOUT.withName("w"),
            Constants$root.C_DOUBLE$LAYOUT.withName("a"),
            Constants$root.C_DOUBLE$LAYOUT.withName("b")
        ).withName("RprSpacialVector")
    );
    static final MethodHandle RprImpulseJoint_set_impulses$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJoint_set_impulses",
        constants$52.RprImpulseJoint_set_impulses$FUNC
    );
    static final FunctionDescriptor RprIntegrationParameters_default$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
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
}


