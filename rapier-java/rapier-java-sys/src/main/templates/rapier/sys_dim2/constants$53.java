// Generated by jextract

package rapier.sys_dim2;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$53 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$53() {}
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
                ).withName("struct (anonymous at /home/socket/Projects/rapier-ffi/rapier-java/rapier-java-sys/build/librapier.h:955:5)"),
                MemoryLayout.structLayout(
                    Constants$root.C_FLOAT$LAYOUT.withName("absolute")
                ).withName("struct (anonymous at /home/socket/Projects/rapier-ffi/rapier-java/rapier-java-sys/build/librapier.h:958:5)")
            ).withName("union (anonymous at /home/socket/Projects/rapier-ffi/rapier-java/rapier-java-sys/build/librapier.h:954:3)")
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
            ).withName("struct (anonymous at /home/socket/Projects/rapier-ffi/rapier-java/rapier-java-sys/build/librapier.h:955:5)"),
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("absolute")
            ).withName("struct (anonymous at /home/socket/Projects/rapier-ffi/rapier-java/rapier-java-sys/build/librapier.h:958:5)")
        ).withName("union (anonymous at /home/socket/Projects/rapier-ffi/rapier-java/rapier-java-sys/build/librapier.h:954:3)")
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
                    ).withName("struct (anonymous at /home/socket/Projects/rapier-ffi/rapier-java/rapier-java-sys/build/librapier.h:955:5)"),
                    MemoryLayout.structLayout(
                        Constants$root.C_FLOAT$LAYOUT.withName("absolute")
                    ).withName("struct (anonymous at /home/socket/Projects/rapier-ffi/rapier-java/rapier-java-sys/build/librapier.h:958:5)")
                ).withName("union (anonymous at /home/socket/Projects/rapier-ffi/rapier-java/rapier-java-sys/build/librapier.h:954:3)")
            ).withName("max_height"),
            MemoryLayout.structLayout(
                Constants$root.C_INT$LAYOUT.withName("tag"),
                MemoryLayout.unionLayout(
                    MemoryLayout.structLayout(
                        Constants$root.C_FLOAT$LAYOUT.withName("relative")
                    ).withName("struct (anonymous at /home/socket/Projects/rapier-ffi/rapier-java/rapier-java-sys/build/librapier.h:955:5)"),
                    MemoryLayout.structLayout(
                        Constants$root.C_FLOAT$LAYOUT.withName("absolute")
                    ).withName("struct (anonymous at /home/socket/Projects/rapier-ffi/rapier-java/rapier-java-sys/build/librapier.h:958:5)")
                ).withName("union (anonymous at /home/socket/Projects/rapier-ffi/rapier-java/rapier-java-sys/build/librapier.h:954:3)")
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
    static final FunctionDescriptor RprKinematicCharacterController_set_min_slope_slide_angle$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprKinematicCharacterController_set_min_slope_slide_angle$MH = RuntimeHelper.downcallHandle(
        "RprKinematicCharacterController_set_min_slope_slide_angle",
        constants$53.RprKinematicCharacterController_set_min_slope_slide_angle$FUNC
    );
    static final FunctionDescriptor RprKinematicCharacterController_set_offset$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("tag"),
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_FLOAT$LAYOUT.withName("relative")
                ).withName("struct (anonymous at /home/socket/Projects/rapier-ffi/rapier-java/rapier-java-sys/build/librapier.h:955:5)"),
                MemoryLayout.structLayout(
                    Constants$root.C_FLOAT$LAYOUT.withName("absolute")
                ).withName("struct (anonymous at /home/socket/Projects/rapier-ffi/rapier-java/rapier-java-sys/build/librapier.h:958:5)")
            ).withName("union (anonymous at /home/socket/Projects/rapier-ffi/rapier-java/rapier-java-sys/build/librapier.h:954:3)")
        ).withName("RprCharacterLength")
    );
    static final MethodHandle RprKinematicCharacterController_set_offset$MH = RuntimeHelper.downcallHandle(
        "RprKinematicCharacterController_set_offset",
        constants$53.RprKinematicCharacterController_set_offset$FUNC
    );
}


