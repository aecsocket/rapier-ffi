// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$26 {

    static final FunctionDescriptor RprCollider_active_hooks$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_active_hooks$MH = RuntimeHelper.downcallHandle(
        "RprCollider_active_hooks",
        constants$26.RprCollider_active_hooks$FUNC
    );
    static final FunctionDescriptor RprCollider_collision_groups$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("memberships"),
        Constants$root.C_INT$LAYOUT.withName("filter")
    ).withName("RprInteractionGroups"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_collision_groups$MH = RuntimeHelper.downcallHandle(
        "RprCollider_collision_groups",
        constants$26.RprCollider_collision_groups$FUNC
    );
    static final FunctionDescriptor RprCollider_compute_aabb$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y"),
            Constants$root.C_DOUBLE$LAYOUT.withName("z")
        ).withName("min"),
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y"),
            Constants$root.C_DOUBLE$LAYOUT.withName("z")
        ).withName("max")
    ).withName("RprAabb"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_compute_aabb$MH = RuntimeHelper.downcallHandle(
        "RprCollider_compute_aabb",
        constants$26.RprCollider_compute_aabb$FUNC
    );
    static final FunctionDescriptor RprCollider_compute_swept_aabb$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y"),
            Constants$root.C_DOUBLE$LAYOUT.withName("z")
        ).withName("min"),
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y"),
            Constants$root.C_DOUBLE$LAYOUT.withName("z")
        ).withName("max")
    ).withName("RprAabb"),
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_DOUBLE$LAYOUT.withName("x"),
                Constants$root.C_DOUBLE$LAYOUT.withName("y"),
                Constants$root.C_DOUBLE$LAYOUT.withName("z"),
                Constants$root.C_DOUBLE$LAYOUT.withName("w")
            ).withName("rotation"),
            MemoryLayout.structLayout(
                Constants$root.C_DOUBLE$LAYOUT.withName("x"),
                Constants$root.C_DOUBLE$LAYOUT.withName("y"),
                Constants$root.C_DOUBLE$LAYOUT.withName("z")
            ).withName("translation")
        ).withName("RprIsometry")
    );
    static final MethodHandle RprCollider_compute_swept_aabb$MH = RuntimeHelper.downcallHandle(
        "RprCollider_compute_swept_aabb",
        constants$26.RprCollider_compute_swept_aabb$FUNC
    );
    static final FunctionDescriptor RprCollider_contact_force_event_threshold$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_contact_force_event_threshold$MH = RuntimeHelper.downcallHandle(
        "RprCollider_contact_force_event_threshold",
        constants$26.RprCollider_contact_force_event_threshold$FUNC
    );
    static final FunctionDescriptor RprCollider_density$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_density$MH = RuntimeHelper.downcallHandle(
        "RprCollider_density",
        constants$26.RprCollider_density$FUNC
    );
}


