// Generated by jextract

package rapier.sys_dim2;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$20 {

    static final FunctionDescriptor RprColliderBuilder_collision_groups$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("memberships"),
            Constants$root.C_INT$LAYOUT.withName("filter")
        ).withName("RprInteractionGroups")
    );
    static final MethodHandle RprColliderBuilder_collision_groups$MH = RuntimeHelper.downcallHandle(
        "RprColliderBuilder_collision_groups",
        constants$20.RprColliderBuilder_collision_groups$FUNC
    );
    static final FunctionDescriptor RprColliderBuilder_contact_force_event_threshold$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprColliderBuilder_contact_force_event_threshold$MH = RuntimeHelper.downcallHandle(
        "RprColliderBuilder_contact_force_event_threshold",
        constants$20.RprColliderBuilder_contact_force_event_threshold$FUNC
    );
    static final FunctionDescriptor RprColliderBuilder_density$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
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
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprColliderBuilder_friction$MH = RuntimeHelper.downcallHandle(
        "RprColliderBuilder_friction",
        constants$20.RprColliderBuilder_friction$FUNC
    );
}


