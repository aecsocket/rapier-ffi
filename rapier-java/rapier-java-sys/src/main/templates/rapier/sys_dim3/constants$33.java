// Generated by jextract

package rapier.sys_dim3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$33 {

    static final FunctionDescriptor RprCollider_translation$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("x"),
        Constants$root.C_FLOAT$LAYOUT.withName("y"),
        Constants$root.C_FLOAT$LAYOUT.withName("z")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_translation$MH = RuntimeHelper.downcallHandle(
        "RprCollider_translation",
        constants$33.RprCollider_translation$FUNC
    );
    static final FunctionDescriptor RprCollider_volume$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_volume$MH = RuntimeHelper.downcallHandle(
        "RprCollider_volume",
        constants$33.RprCollider_volume$FUNC
    );
    static final FunctionDescriptor RprContactData_dist$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprContactData_dist$MH = RuntimeHelper.downcallHandle(
        "RprContactData_dist",
        constants$33.RprContactData_dist$FUNC
    );
    static final FunctionDescriptor RprContactData_impulse$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprContactData_impulse$MH = RuntimeHelper.downcallHandle(
        "RprContactData_impulse",
        constants$33.RprContactData_impulse$FUNC
    );
    static final FunctionDescriptor RprContactData_local_p1$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("x"),
        Constants$root.C_FLOAT$LAYOUT.withName("y"),
        Constants$root.C_FLOAT$LAYOUT.withName("z")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprContactData_local_p1$MH = RuntimeHelper.downcallHandle(
        "RprContactData_local_p1",
        constants$33.RprContactData_local_p1$FUNC
    );
    static final FunctionDescriptor RprContactData_local_p2$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("x"),
        Constants$root.C_FLOAT$LAYOUT.withName("y"),
        Constants$root.C_FLOAT$LAYOUT.withName("z")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprContactData_local_p2$MH = RuntimeHelper.downcallHandle(
        "RprContactData_local_p2",
        constants$33.RprContactData_local_p2$FUNC
    );
}


