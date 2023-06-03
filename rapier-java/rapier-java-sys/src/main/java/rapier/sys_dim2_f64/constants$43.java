// Generated by jextract

package rapier.sys_dim2_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$43 {

    static final FunctionDescriptor RprJointLimits_default$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("min"),
        Constants$root.C_DOUBLE$LAYOUT.withName("max"),
        Constants$root.C_DOUBLE$LAYOUT.withName("impulse")
    ).withName("RprJointLimits"));
    static final MethodHandle RprJointLimits_default$MH = RuntimeHelper.downcallHandle(
        "RprJointLimits_default",
        constants$43.RprJointLimits_default$FUNC
    );
    static final FunctionDescriptor RprJointMotor_default$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("target_vel"),
        Constants$root.C_DOUBLE$LAYOUT.withName("target_pos"),
        Constants$root.C_DOUBLE$LAYOUT.withName("stiffness"),
        Constants$root.C_DOUBLE$LAYOUT.withName("damping"),
        Constants$root.C_DOUBLE$LAYOUT.withName("max_force"),
        Constants$root.C_DOUBLE$LAYOUT.withName("impulse"),
        Constants$root.C_INT$LAYOUT.withName("model"),
        MemoryLayout.paddingLayout(32)
    ).withName("RprJointMotor"));
    static final MethodHandle RprJointMotor_default$MH = RuntimeHelper.downcallHandle(
        "RprJointMotor_default",
        constants$43.RprJointMotor_default$FUNC
    );
    static final FunctionDescriptor RprMultibodyJointSet_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprMultibodyJointSet_drop$MH = RuntimeHelper.downcallHandle(
        "RprMultibodyJointSet_drop",
        constants$43.RprMultibodyJointSet_drop$FUNC
    );
    static final FunctionDescriptor RprMultibodyJointSet_insert$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey"),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprMultibodyJointSet_insert$MH = RuntimeHelper.downcallHandle(
        "RprMultibodyJointSet_insert",
        constants$43.RprMultibodyJointSet_insert$FUNC
    );
    static final FunctionDescriptor RprMultibodyJointSet_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RprMultibodyJointSet_new$MH = RuntimeHelper.downcallHandle(
        "RprMultibodyJointSet_new",
        constants$43.RprMultibodyJointSet_new$FUNC
    );
    static final FunctionDescriptor RprMultibodyJointSet_remove$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprMultibodyJointSet_remove$MH = RuntimeHelper.downcallHandle(
        "RprMultibodyJointSet_remove",
        constants$43.RprMultibodyJointSet_remove$FUNC
    );
}


