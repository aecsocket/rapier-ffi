// Generated by jextract

package rapier.sys_dim2_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$43 {

    static final FunctionDescriptor RprQueryPipeline_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RprQueryPipeline_new$MH = RuntimeHelper.downcallHandle(
        "RprQueryPipeline_new",
        constants$43.RprQueryPipeline_new$FUNC
    );
    static final FunctionDescriptor RprRigidBodyActivation_angular_threshold$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyActivation_angular_threshold$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyActivation_angular_threshold",
        constants$43.RprRigidBodyActivation_angular_threshold$FUNC
    );
    static final FunctionDescriptor RprRigidBodyActivation_linear_threshold$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyActivation_linear_threshold$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyActivation_linear_threshold",
        constants$43.RprRigidBodyActivation_linear_threshold$FUNC
    );
    static final FunctionDescriptor RprRigidBodyActivation_set_angular_threshold$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprRigidBodyActivation_set_angular_threshold$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyActivation_set_angular_threshold",
        constants$43.RprRigidBodyActivation_set_angular_threshold$FUNC
    );
    static final FunctionDescriptor RprRigidBodyActivation_set_linear_threshold$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprRigidBodyActivation_set_linear_threshold$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyActivation_set_linear_threshold",
        constants$43.RprRigidBodyActivation_set_linear_threshold$FUNC
    );
    static final FunctionDescriptor RprRigidBodyActivation_set_sleeping$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBodyActivation_set_sleeping$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyActivation_set_sleeping",
        constants$43.RprRigidBodyActivation_set_sleeping$FUNC
    );
}


