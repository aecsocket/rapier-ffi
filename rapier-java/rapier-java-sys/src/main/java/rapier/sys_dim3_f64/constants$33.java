// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$33 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$33() {}
    static final FunctionDescriptor RprContactData_dist$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprContactData_dist$MH = RuntimeHelper.downcallHandle(
        "RprContactData_dist",
        constants$33.RprContactData_dist$FUNC
    );
    static final FunctionDescriptor RprContactData_impulse$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprContactData_impulse$MH = RuntimeHelper.downcallHandle(
        "RprContactData_impulse",
        constants$33.RprContactData_impulse$FUNC
    );
    static final FunctionDescriptor RprContactData_local_p1$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("x"),
        Constants$root.C_DOUBLE$LAYOUT.withName("y"),
        Constants$root.C_DOUBLE$LAYOUT.withName("z")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprContactData_local_p1$MH = RuntimeHelper.downcallHandle(
        "RprContactData_local_p1",
        constants$33.RprContactData_local_p1$FUNC
    );
    static final FunctionDescriptor RprContactData_local_p2$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("x"),
        Constants$root.C_DOUBLE$LAYOUT.withName("y"),
        Constants$root.C_DOUBLE$LAYOUT.withName("z")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprContactData_local_p2$MH = RuntimeHelper.downcallHandle(
        "RprContactData_local_p2",
        constants$33.RprContactData_local_p2$FUNC
    );
    static final FunctionDescriptor RprContactData_set_dist$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle RprContactData_set_dist$MH = RuntimeHelper.downcallHandle(
        "RprContactData_set_dist",
        constants$33.RprContactData_set_dist$FUNC
    );
    static final FunctionDescriptor RprContactData_set_impulse$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle RprContactData_set_impulse$MH = RuntimeHelper.downcallHandle(
        "RprContactData_set_impulse",
        constants$33.RprContactData_set_impulse$FUNC
    );
}


