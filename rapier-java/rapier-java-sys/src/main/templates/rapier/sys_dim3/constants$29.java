// Generated by jextract

package rapier.sys_dim3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$29 {

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
        constants$29.RprCollider_rotation$FUNC
    );
    static final FunctionDescriptor RprCollider_set_active_collision_types$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle RprCollider_set_active_collision_types$MH = RuntimeHelper.downcallHandle(
        "RprCollider_set_active_collision_types",
        constants$29.RprCollider_set_active_collision_types$FUNC
    );
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
}


