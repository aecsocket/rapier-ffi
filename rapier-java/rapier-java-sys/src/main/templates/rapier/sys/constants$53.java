// Generated by jextract

package rapier.sys;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$53 {

    static final FunctionDescriptor RprKinematicCharacterController_move_shape$events$FUNC = FunctionDescriptor.ofVoid(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_INT$LAYOUT.withName("index"),
                Constants$root.C_INT$LAYOUT.withName("generation")
            ).withName("handle"),
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_FLOAT$LAYOUT.withName("re"),
                    Constants$root.C_FLOAT$LAYOUT.withName("im")
                ).withName("rotation"),
                MemoryLayout.structLayout(
                    Constants$root.C_FLOAT$LAYOUT.withName("x"),
                    Constants$root.C_FLOAT$LAYOUT.withName("y")
                ).withName("translation")
            ).withName("character_pos"),
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("x"),
                Constants$root.C_FLOAT$LAYOUT.withName("y")
            ).withName("translation_applied"),
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("x"),
                Constants$root.C_FLOAT$LAYOUT.withName("y")
            ).withName("translation_remaining"),
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("toi"),
                MemoryLayout.structLayout(
                    Constants$root.C_FLOAT$LAYOUT.withName("x"),
                    Constants$root.C_FLOAT$LAYOUT.withName("y")
                ).withName("witness1"),
                MemoryLayout.structLayout(
                    Constants$root.C_FLOAT$LAYOUT.withName("x"),
                    Constants$root.C_FLOAT$LAYOUT.withName("y")
                ).withName("witness2"),
                MemoryLayout.structLayout(
                    Constants$root.C_FLOAT$LAYOUT.withName("x"),
                    Constants$root.C_FLOAT$LAYOUT.withName("y")
                ).withName("normal1"),
                MemoryLayout.structLayout(
                    Constants$root.C_FLOAT$LAYOUT.withName("x"),
                    Constants$root.C_FLOAT$LAYOUT.withName("y")
                ).withName("normal2"),
                Constants$root.C_INT$LAYOUT.withName("status")
            ).withName("toi")
        ).withName("RprCharacterCollision")
    );
    static final MethodHandle RprKinematicCharacterController_move_shape$events$MH = RuntimeHelper.downcallHandle(
        constants$53.RprKinematicCharacterController_move_shape$events$FUNC
    );
    static final FunctionDescriptor RprKinematicCharacterController_move_shape$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y")
        ).withName("translation"),
        Constants$root.C_BOOL$LAYOUT.withName("grounded"),
        MemoryLayout.paddingLayout(24)
    ).withName("RprEffectiveCharacterMovement"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("re"),
                Constants$root.C_FLOAT$LAYOUT.withName("im")
            ).withName("rotation"),
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("x"),
                Constants$root.C_FLOAT$LAYOUT.withName("y")
            ).withName("translation")
        ).withName("RprIsometry"),
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y")
        ).withName("RprVector"),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("flags"),
            Constants$root.C_BOOL$LAYOUT.withName("has_groups"),
            MemoryLayout.paddingLayout(24),
            MemoryLayout.structLayout(
                Constants$root.C_INT$LAYOUT.withName("memberships"),
                Constants$root.C_INT$LAYOUT.withName("filter")
            ).withName("groups"),
            Constants$root.C_BOOL$LAYOUT.withName("has_exclude_collider"),
            MemoryLayout.paddingLayout(24),
            MemoryLayout.structLayout(
                Constants$root.C_INT$LAYOUT.withName("index"),
                Constants$root.C_INT$LAYOUT.withName("generation")
            ).withName("exclude_collider"),
            Constants$root.C_BOOL$LAYOUT.withName("has_exclude_rigid_body"),
            MemoryLayout.paddingLayout(24),
            MemoryLayout.structLayout(
                Constants$root.C_INT$LAYOUT.withName("index"),
                Constants$root.C_INT$LAYOUT.withName("generation")
            ).withName("exclude_rigid_body"),
            Constants$root.C_POINTER$LAYOUT.withName("predicate")
        ).withName("RprQueryFilter"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprKinematicCharacterController_move_shape$MH = RuntimeHelper.downcallHandle(
        "RprKinematicCharacterController_move_shape",
        constants$53.RprKinematicCharacterController_move_shape$FUNC
    );
    static final FunctionDescriptor RprKinematicCharacterController_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y")
        ).withName("RprVector"),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("tag"),
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_FLOAT$LAYOUT.withName("relative")
                ).withName("$anon$0"),
                MemoryLayout.structLayout(
                    Constants$root.C_FLOAT$LAYOUT.withName("absolute")
                ).withName("$anon$1")
            ).withName("$anon$0")
        ).withName("RprCharacterLength"),
        Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprKinematicCharacterController_new$MH = RuntimeHelper.downcallHandle(
        "RprKinematicCharacterController_new",
        constants$53.RprKinematicCharacterController_new$FUNC
    );
    static final FunctionDescriptor RprKinematicCharacterController_offset$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("tag"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("relative")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("absolute")
            ).withName("$anon$1")
        ).withName("$anon$0")
    ).withName("RprCharacterLength"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprKinematicCharacterController_offset$MH = RuntimeHelper.downcallHandle(
        "RprKinematicCharacterController_offset",
        constants$53.RprKinematicCharacterController_offset$FUNC
    );
    static final FunctionDescriptor RprKinematicCharacterController_set_autostep$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_INT$LAYOUT.withName("tag"),
                MemoryLayout.unionLayout(
                    MemoryLayout.structLayout(
                        Constants$root.C_FLOAT$LAYOUT.withName("relative")
                    ).withName("$anon$0"),
                    MemoryLayout.structLayout(
                        Constants$root.C_FLOAT$LAYOUT.withName("absolute")
                    ).withName("$anon$1")
                ).withName("$anon$0")
            ).withName("max_height"),
            MemoryLayout.structLayout(
                Constants$root.C_INT$LAYOUT.withName("tag"),
                MemoryLayout.unionLayout(
                    MemoryLayout.structLayout(
                        Constants$root.C_FLOAT$LAYOUT.withName("relative")
                    ).withName("$anon$0"),
                    MemoryLayout.structLayout(
                        Constants$root.C_FLOAT$LAYOUT.withName("absolute")
                    ).withName("$anon$1")
                ).withName("$anon$0")
            ).withName("min_width"),
            Constants$root.C_BOOL$LAYOUT.withName("include_dynamic_bodies"),
            MemoryLayout.paddingLayout(24)
        ).withName("RprCharacterAutostep")
    );
    static final MethodHandle RprKinematicCharacterController_set_autostep$MH = RuntimeHelper.downcallHandle(
        "RprKinematicCharacterController_set_autostep",
        constants$53.RprKinematicCharacterController_set_autostep$FUNC
    );
    static final FunctionDescriptor RprKinematicCharacterController_set_max_slope_climb_angle$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprKinematicCharacterController_set_max_slope_climb_angle$MH = RuntimeHelper.downcallHandle(
        "RprKinematicCharacterController_set_max_slope_climb_angle",
        constants$53.RprKinematicCharacterController_set_max_slope_climb_angle$FUNC
    );
}


