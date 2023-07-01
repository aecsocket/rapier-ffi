// Generated by jextract

package rapier.sys_dim2;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$54 {

    static final FunctionDescriptor RprKinematicCharacterController_set_up$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y")
        ).withName("RprVector")
    );
    static final MethodHandle RprKinematicCharacterController_set_up$MH = RuntimeHelper.downcallHandle(
        "RprKinematicCharacterController_set_up",
        constants$54.RprKinematicCharacterController_set_up$FUNC
    );
    static final FunctionDescriptor RprKinematicCharacterController_slide$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprKinematicCharacterController_slide$MH = RuntimeHelper.downcallHandle(
        "RprKinematicCharacterController_slide",
        constants$54.RprKinematicCharacterController_slide$FUNC
    );
    static final FunctionDescriptor RprKinematicCharacterController_snap_to_ground$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprKinematicCharacterController_snap_to_ground$MH = RuntimeHelper.downcallHandle(
        "RprKinematicCharacterController_snap_to_ground",
        constants$54.RprKinematicCharacterController_snap_to_ground$FUNC
    );
    static final FunctionDescriptor RprKinematicCharacterController_solve_character_collision_impulses$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
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
        ).withName("RprCharacterCollision"),
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
        ).withName("RprQueryFilter")
    );
    static final MethodHandle RprKinematicCharacterController_solve_character_collision_impulses$MH = RuntimeHelper.downcallHandle(
        "RprKinematicCharacterController_solve_character_collision_impulses",
        constants$54.RprKinematicCharacterController_solve_character_collision_impulses$FUNC
    );
    static final FunctionDescriptor RprKinematicCharacterController_up$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("x"),
        Constants$root.C_FLOAT$LAYOUT.withName("y")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprKinematicCharacterController_up$MH = RuntimeHelper.downcallHandle(
        "RprKinematicCharacterController_up",
        constants$54.RprKinematicCharacterController_up$FUNC
    );
    static final FunctionDescriptor RprMultibodyJointSet_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprMultibodyJointSet_drop$MH = RuntimeHelper.downcallHandle(
        "RprMultibodyJointSet_drop",
        constants$54.RprMultibodyJointSet_drop$FUNC
    );
}


