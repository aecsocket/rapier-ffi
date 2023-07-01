// Generated by jextract

package rapier.sys_dim2;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$70 {

    static final FunctionDescriptor RprRigidBodyMassProps_mass$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyMassProps_mass$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyMassProps_mass",
        constants$70.RprRigidBodyMassProps_mass$FUNC
    );
    static final FunctionDescriptor RprRigidBodyMassProps_world_com$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("x"),
        Constants$root.C_FLOAT$LAYOUT.withName("y")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyMassProps_world_com$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyMassProps_world_com",
        constants$70.RprRigidBodyMassProps_world_com$FUNC
    );
    static final FunctionDescriptor RprRigidBodySet_all$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodySet_all$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodySet_all",
        constants$70.RprRigidBodySet_all$FUNC
    );
    static final FunctionDescriptor RprRigidBodySet_contains$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey")
    );
    static final MethodHandle RprRigidBodySet_contains$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodySet_contains",
        constants$70.RprRigidBodySet_contains$FUNC
    );
    static final FunctionDescriptor RprRigidBodySet_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodySet_drop$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodySet_drop",
        constants$70.RprRigidBodySet_drop$FUNC
    );
    static final FunctionDescriptor RprRigidBodySet_get$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey")
    );
    static final MethodHandle RprRigidBodySet_get$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodySet_get",
        constants$70.RprRigidBodySet_get$FUNC
    );
}


