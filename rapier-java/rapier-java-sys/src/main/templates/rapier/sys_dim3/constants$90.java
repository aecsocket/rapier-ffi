// Generated by jextract

package rapier.sys_dim3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$90 {

    static final FunctionDescriptor RprSolverContact_is_new$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprSolverContact_is_new$MH = RuntimeHelper.downcallHandle(
        "RprSolverContact_is_new",
        constants$90.RprSolverContact_is_new$FUNC
    );
    static final FunctionDescriptor RprSolverContact_point$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("x"),
        Constants$root.C_FLOAT$LAYOUT.withName("y"),
        Constants$root.C_FLOAT$LAYOUT.withName("z")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprSolverContact_point$MH = RuntimeHelper.downcallHandle(
        "RprSolverContact_point",
        constants$90.RprSolverContact_point$FUNC
    );
    static final FunctionDescriptor RprSolverContact_restitution$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprSolverContact_restitution$MH = RuntimeHelper.downcallHandle(
        "RprSolverContact_restitution",
        constants$90.RprSolverContact_restitution$FUNC
    );
    static final FunctionDescriptor RprSolverContact_set_dist$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprSolverContact_set_dist$MH = RuntimeHelper.downcallHandle(
        "RprSolverContact_set_dist",
        constants$90.RprSolverContact_set_dist$FUNC
    );
    static final FunctionDescriptor RprSolverContact_set_friction$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprSolverContact_set_friction$MH = RuntimeHelper.downcallHandle(
        "RprSolverContact_set_friction",
        constants$90.RprSolverContact_set_friction$FUNC
    );
    static final FunctionDescriptor RprSolverContact_set_point$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y"),
            Constants$root.C_FLOAT$LAYOUT.withName("z")
        ).withName("RprVector")
    );
    static final MethodHandle RprSolverContact_set_point$MH = RuntimeHelper.downcallHandle(
        "RprSolverContact_set_point",
        constants$90.RprSolverContact_set_point$FUNC
    );
}


