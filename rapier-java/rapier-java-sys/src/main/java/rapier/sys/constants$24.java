// Generated by jextract

package rapier.sys;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$24 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$24() {}
    static final FunctionDescriptor RprCollider_density$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_density$MH = RuntimeHelper.downcallHandle(
        "RprCollider_density",
        constants$24.RprCollider_density$FUNC
    );
    static final FunctionDescriptor RprCollider_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_drop$MH = RuntimeHelper.downcallHandle(
        "RprCollider_drop",
        constants$24.RprCollider_drop$FUNC
    );
    static final FunctionDescriptor RprCollider_friction$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_friction$MH = RuntimeHelper.downcallHandle(
        "RprCollider_friction",
        constants$24.RprCollider_friction$FUNC
    );
    static final FunctionDescriptor RprCollider_friction_combine_rule$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_friction_combine_rule$MH = RuntimeHelper.downcallHandle(
        "RprCollider_friction_combine_rule",
        constants$24.RprCollider_friction_combine_rule$FUNC
    );
    static final FunctionDescriptor RprCollider_is_enabled$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_is_enabled$MH = RuntimeHelper.downcallHandle(
        "RprCollider_is_enabled",
        constants$24.RprCollider_is_enabled$FUNC
    );
    static final FunctionDescriptor RprCollider_is_sensor$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_is_sensor$MH = RuntimeHelper.downcallHandle(
        "RprCollider_is_sensor",
        constants$24.RprCollider_is_sensor$FUNC
    );
}


