// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$57 {

    static final FunctionDescriptor RprMultibodyJointSet_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RprMultibodyJointSet_new$MH = RuntimeHelper.downcallHandle(
        "RprMultibodyJointSet_new",
        constants$57.RprMultibodyJointSet_new$FUNC
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
        constants$57.RprMultibodyJointSet_remove$FUNC
    );
    static final FunctionDescriptor RprMultibodyJointSet_remove_joints_attached_to_rigid_body$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey")
    );
    static final MethodHandle RprMultibodyJointSet_remove_joints_attached_to_rigid_body$MH = RuntimeHelper.downcallHandle(
        "RprMultibodyJointSet_remove_joints_attached_to_rigid_body",
        constants$57.RprMultibodyJointSet_remove_joints_attached_to_rigid_body$FUNC
    );
    static final FunctionDescriptor RprMultibodyJointSet_remove_multibody_articulations$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprMultibodyJointSet_remove_multibody_articulations$MH = RuntimeHelper.downcallHandle(
        "RprMultibodyJointSet_remove_multibody_articulations",
        constants$57.RprMultibodyJointSet_remove_multibody_articulations$FUNC
    );
    static final FunctionDescriptor RprNarrowPhase_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprNarrowPhase_drop$MH = RuntimeHelper.downcallHandle(
        "RprNarrowPhase_drop",
        constants$57.RprNarrowPhase_drop$FUNC
    );
    static final FunctionDescriptor RprNarrowPhase_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RprNarrowPhase_new$MH = RuntimeHelper.downcallHandle(
        "RprNarrowPhase_new",
        constants$57.RprNarrowPhase_new$FUNC
    );
}


