// Generated by jextract

package rapier.sys_dim2_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$58 {

    static final FunctionDescriptor RprQueryPipeline_update$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprQueryPipeline_update$MH = RuntimeHelper.downcallHandle(
        "RprQueryPipeline_update",
        constants$58.RprQueryPipeline_update$FUNC
    );
    static final FunctionDescriptor RprQueryPipeline_update_all$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprQueryPipeline_update_all$MH = RuntimeHelper.downcallHandle(
        "RprQueryPipeline_update_all",
        constants$58.RprQueryPipeline_update_all$FUNC
    );
    static final FunctionDescriptor RprRigidBodyActivation_angular_threshold$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyActivation_angular_threshold$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyActivation_angular_threshold",
        constants$58.RprRigidBodyActivation_angular_threshold$FUNC
    );
    static final FunctionDescriptor RprRigidBodyActivation_linear_threshold$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyActivation_linear_threshold$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyActivation_linear_threshold",
        constants$58.RprRigidBodyActivation_linear_threshold$FUNC
    );
    static final FunctionDescriptor RprRigidBodyActivation_set_angular_threshold$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle RprRigidBodyActivation_set_angular_threshold$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyActivation_set_angular_threshold",
        constants$58.RprRigidBodyActivation_set_angular_threshold$FUNC
    );
    static final FunctionDescriptor RprRigidBodyActivation_set_linear_threshold$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle RprRigidBodyActivation_set_linear_threshold$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyActivation_set_linear_threshold",
        constants$58.RprRigidBodyActivation_set_linear_threshold$FUNC
    );
}


