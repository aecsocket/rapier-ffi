// Generated by jextract

package rapier.sys_dim3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$56 {

    static final FunctionDescriptor RprKinematicCharacterController_set_max_slope_climb_angle$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprKinematicCharacterController_set_max_slope_climb_angle$MH = RuntimeHelper.downcallHandle(
        "RprKinematicCharacterController_set_max_slope_climb_angle",
        constants$56.RprKinematicCharacterController_set_max_slope_climb_angle$FUNC
    );
    static final FunctionDescriptor RprKinematicCharacterController_set_min_slope_slide_angle$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprKinematicCharacterController_set_min_slope_slide_angle$MH = RuntimeHelper.downcallHandle(
        "RprKinematicCharacterController_set_min_slope_slide_angle",
        constants$56.RprKinematicCharacterController_set_min_slope_slide_angle$FUNC
    );
    static final FunctionDescriptor RprKinematicCharacterController_set_offset$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
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
        ).withName("RprCharacterLength")
    );
    static final MethodHandle RprKinematicCharacterController_set_offset$MH = RuntimeHelper.downcallHandle(
        "RprKinematicCharacterController_set_offset",
        constants$56.RprKinematicCharacterController_set_offset$FUNC
    );
    static final FunctionDescriptor RprKinematicCharacterController_set_slide$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprKinematicCharacterController_set_slide$MH = RuntimeHelper.downcallHandle(
        "RprKinematicCharacterController_set_slide",
        constants$56.RprKinematicCharacterController_set_slide$FUNC
    );
    static final FunctionDescriptor RprKinematicCharacterController_set_snap_to_ground$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
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
        ).withName("RprCharacterLength")
    );
    static final MethodHandle RprKinematicCharacterController_set_snap_to_ground$MH = RuntimeHelper.downcallHandle(
        "RprKinematicCharacterController_set_snap_to_ground",
        constants$56.RprKinematicCharacterController_set_snap_to_ground$FUNC
    );
    static final FunctionDescriptor RprKinematicCharacterController_set_up$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y"),
            Constants$root.C_FLOAT$LAYOUT.withName("z")
        ).withName("RprVector")
    );
    static final MethodHandle RprKinematicCharacterController_set_up$MH = RuntimeHelper.downcallHandle(
        "RprKinematicCharacterController_set_up",
        constants$56.RprKinematicCharacterController_set_up$FUNC
    );
}


