// Generated by jextract

package rapier.sys_dim2_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$40 {

    static final FunctionDescriptor RprNarrowPhase_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprNarrowPhase_drop$MH = RuntimeHelper.downcallHandle(
        "RprNarrowPhase_drop",
        constants$40.RprNarrowPhase_drop$FUNC
    );
    static final FunctionDescriptor RprNarrowPhase_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RprNarrowPhase_new$MH = RuntimeHelper.downcallHandle(
        "RprNarrowPhase_new",
        constants$40.RprNarrowPhase_new$FUNC
    );
    static final FunctionDescriptor RprPhysicsPipeline_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprPhysicsPipeline_drop$MH = RuntimeHelper.downcallHandle(
        "RprPhysicsPipeline_drop",
        constants$40.RprPhysicsPipeline_drop$FUNC
    );
    static final FunctionDescriptor RprPhysicsPipeline_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RprPhysicsPipeline_new$MH = RuntimeHelper.downcallHandle(
        "RprPhysicsPipeline_new",
        constants$40.RprPhysicsPipeline_new$FUNC
    );
    static final FunctionDescriptor RprPhysicsPipeline_step$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y")
        ).withName("RprVector"),
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
        constants$40.RprPhysicsPipeline_step$FUNC
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
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprPhysicsPipeline_step_all$MH = RuntimeHelper.downcallHandle(
        "RprPhysicsPipeline_step_all",
        constants$40.RprPhysicsPipeline_step_all$FUNC
    );
}


