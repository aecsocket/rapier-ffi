// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$26 {

    static final FunctionDescriptor RprCollider_restitution_combine_rule$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_restitution_combine_rule$MH = RuntimeHelper.downcallHandle(
        "RprCollider_restitution_combine_rule",
        constants$26.RprCollider_restitution_combine_rule$FUNC
    );
    static final FunctionDescriptor RprCollider_rotation$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("x"),
        Constants$root.C_FLOAT$LAYOUT.withName("y"),
        Constants$root.C_FLOAT$LAYOUT.withName("z"),
        Constants$root.C_FLOAT$LAYOUT.withName("w")
    ).withName("RprRotation"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_rotation$MH = RuntimeHelper.downcallHandle(
        "RprCollider_rotation",
        constants$26.RprCollider_rotation$FUNC
    );
    static final FunctionDescriptor RprCollider_set_contact_force_event_threshold$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprCollider_set_contact_force_event_threshold$MH = RuntimeHelper.downcallHandle(
        "RprCollider_set_contact_force_event_threshold",
        constants$26.RprCollider_set_contact_force_event_threshold$FUNC
    );
    static final FunctionDescriptor RprCollider_set_density$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprCollider_set_density$MH = RuntimeHelper.downcallHandle(
        "RprCollider_set_density",
        constants$26.RprCollider_set_density$FUNC
    );
    static final FunctionDescriptor RprCollider_set_enabled$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprCollider_set_enabled$MH = RuntimeHelper.downcallHandle(
        "RprCollider_set_enabled",
        constants$26.RprCollider_set_enabled$FUNC
    );
    static final FunctionDescriptor RprCollider_set_friction$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprCollider_set_friction$MH = RuntimeHelper.downcallHandle(
        "RprCollider_set_friction",
        constants$26.RprCollider_set_friction$FUNC
    );
}


