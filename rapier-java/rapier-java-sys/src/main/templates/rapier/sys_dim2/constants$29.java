// Generated by jextract

package rapier.sys_dim2;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$29 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$29() {}
    static final FunctionDescriptor RprCollider_set_active_events$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle RprCollider_set_active_events$MH = RuntimeHelper.downcallHandle(
        "RprCollider_set_active_events",
        constants$29.RprCollider_set_active_events$FUNC
    );
    static final FunctionDescriptor RprCollider_set_active_hooks$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle RprCollider_set_active_hooks$MH = RuntimeHelper.downcallHandle(
        "RprCollider_set_active_hooks",
        constants$29.RprCollider_set_active_hooks$FUNC
    );
    static final FunctionDescriptor RprCollider_set_collision_groups$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("memberships"),
            Constants$root.C_INT$LAYOUT.withName("filter")
        ).withName("RprInteractionGroups")
    );
    static final MethodHandle RprCollider_set_collision_groups$MH = RuntimeHelper.downcallHandle(
        "RprCollider_set_collision_groups",
        constants$29.RprCollider_set_collision_groups$FUNC
    );
    static final FunctionDescriptor RprCollider_set_contact_force_event_threshold$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprCollider_set_contact_force_event_threshold$MH = RuntimeHelper.downcallHandle(
        "RprCollider_set_contact_force_event_threshold",
        constants$29.RprCollider_set_contact_force_event_threshold$FUNC
    );
    static final FunctionDescriptor RprCollider_set_density$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprCollider_set_density$MH = RuntimeHelper.downcallHandle(
        "RprCollider_set_density",
        constants$29.RprCollider_set_density$FUNC
    );
    static final FunctionDescriptor RprCollider_set_enabled$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprCollider_set_enabled$MH = RuntimeHelper.downcallHandle(
        "RprCollider_set_enabled",
        constants$29.RprCollider_set_enabled$FUNC
    );
}


