// Generated by jextract

package rapier.sys;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$56 {

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
        constants$56.RprMultibodyJointSet_remove$FUNC
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
        constants$56.RprMultibodyJointSet_remove_joints_attached_to_rigid_body$FUNC
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
        constants$56.RprMultibodyJointSet_remove_multibody_articulations$FUNC
    );
    static final FunctionDescriptor RprNarrowPhase_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprNarrowPhase_drop$MH = RuntimeHelper.downcallHandle(
        "RprNarrowPhase_drop",
        constants$56.RprNarrowPhase_drop$FUNC
    );
    static final FunctionDescriptor RprNarrowPhase_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RprNarrowPhase_new$MH = RuntimeHelper.downcallHandle(
        "RprNarrowPhase_new",
        constants$56.RprNarrowPhase_new$FUNC
    );
    static final FunctionDescriptor RprPairFilterContext_bodies$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprPairFilterContext_bodies$MH = RuntimeHelper.downcallHandle(
        "RprPairFilterContext_bodies",
        constants$56.RprPairFilterContext_bodies$FUNC
    );
}


