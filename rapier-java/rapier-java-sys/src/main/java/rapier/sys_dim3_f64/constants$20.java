// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$20 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$20() {}
    static final FunctionDescriptor RprColliderBuilder_density$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle RprColliderBuilder_density$MH = RuntimeHelper.downcallHandle(
        "RprColliderBuilder_density",
        constants$20.RprColliderBuilder_density$FUNC
    );
    static final FunctionDescriptor RprColliderBuilder_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprColliderBuilder_drop$MH = RuntimeHelper.downcallHandle(
        "RprColliderBuilder_drop",
        constants$20.RprColliderBuilder_drop$FUNC
    );
    static final FunctionDescriptor RprColliderBuilder_enabled$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprColliderBuilder_enabled$MH = RuntimeHelper.downcallHandle(
        "RprColliderBuilder_enabled",
        constants$20.RprColliderBuilder_enabled$FUNC
    );
    static final FunctionDescriptor RprColliderBuilder_friction$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle RprColliderBuilder_friction$MH = RuntimeHelper.downcallHandle(
        "RprColliderBuilder_friction",
        constants$20.RprColliderBuilder_friction$FUNC
    );
    static final FunctionDescriptor RprColliderBuilder_friction_combine_rule$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle RprColliderBuilder_friction_combine_rule$MH = RuntimeHelper.downcallHandle(
        "RprColliderBuilder_friction_combine_rule",
        constants$20.RprColliderBuilder_friction_combine_rule$FUNC
    );
    static final FunctionDescriptor RprColliderBuilder_mass$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle RprColliderBuilder_mass$MH = RuntimeHelper.downcallHandle(
        "RprColliderBuilder_mass",
        constants$20.RprColliderBuilder_mass$FUNC
    );
}


