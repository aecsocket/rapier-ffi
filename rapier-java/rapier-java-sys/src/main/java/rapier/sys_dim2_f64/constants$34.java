// Generated by jextract

package rapier.sys_dim2_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$34 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$34() {}
    static final FunctionDescriptor RprContactData_set_local_p1$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y")
        ).withName("RprVector")
    );
    static final MethodHandle RprContactData_set_local_p1$MH = RuntimeHelper.downcallHandle(
        "RprContactData_set_local_p1",
        constants$34.RprContactData_set_local_p1$FUNC
    );
    static final FunctionDescriptor RprContactData_set_local_p2$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y")
        ).withName("RprVector")
    );
    static final MethodHandle RprContactData_set_local_p2$MH = RuntimeHelper.downcallHandle(
        "RprContactData_set_local_p2",
        constants$34.RprContactData_set_local_p2$FUNC
    );
    static final FunctionDescriptor RprContactData_set_tangent_impulse$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle RprContactData_set_tangent_impulse$MH = RuntimeHelper.downcallHandle(
        "RprContactData_set_tangent_impulse",
        constants$34.RprContactData_set_tangent_impulse$FUNC
    );
    static final FunctionDescriptor RprContactData_tangent_impulse$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprContactData_tangent_impulse$MH = RuntimeHelper.downcallHandle(
        "RprContactData_tangent_impulse",
        constants$34.RprContactData_tangent_impulse$FUNC
    );
    static final FunctionDescriptor RprContactManifold_local_n1$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("x"),
        Constants$root.C_DOUBLE$LAYOUT.withName("y")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprContactManifold_local_n1$MH = RuntimeHelper.downcallHandle(
        "RprContactManifold_local_n1",
        constants$34.RprContactManifold_local_n1$FUNC
    );
    static final FunctionDescriptor RprContactManifold_local_n2$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("x"),
        Constants$root.C_DOUBLE$LAYOUT.withName("y")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprContactManifold_local_n2$MH = RuntimeHelper.downcallHandle(
        "RprContactManifold_local_n2",
        constants$34.RprContactManifold_local_n2$FUNC
    );
}


