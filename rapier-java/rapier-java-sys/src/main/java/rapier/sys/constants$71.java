// Generated by jextract

package rapier.sys;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$71 {

    static final FunctionDescriptor RprRigidBody_locked_axes$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_locked_axes$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_locked_axes",
        constants$71.RprRigidBody_locked_axes$FUNC
    );
    static final FunctionDescriptor RprRigidBody_mass$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_mass$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_mass",
        constants$71.RprRigidBody_mass$FUNC
    );
    static final FunctionDescriptor RprRigidBody_next_position$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("re"),
            Constants$root.C_FLOAT$LAYOUT.withName("im")
        ).withName("rotation"),
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y")
        ).withName("translation")
    ).withName("RprIsometry"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_next_position$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_next_position",
        constants$71.RprRigidBody_next_position$FUNC
    );
    static final FunctionDescriptor RprRigidBody_position$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("re"),
            Constants$root.C_FLOAT$LAYOUT.withName("im")
        ).withName("rotation"),
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y")
        ).withName("translation")
    ).withName("RprIsometry"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_position$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_position",
        constants$71.RprRigidBody_position$FUNC
    );
    static final FunctionDescriptor RprRigidBody_predict_position_using_velocity_and_forces$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("re"),
            Constants$root.C_FLOAT$LAYOUT.withName("im")
        ).withName("rotation"),
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y")
        ).withName("translation")
    ).withName("RprIsometry"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprRigidBody_predict_position_using_velocity_and_forces$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_predict_position_using_velocity_and_forces",
        constants$71.RprRigidBody_predict_position_using_velocity_and_forces$FUNC
    );
    static final FunctionDescriptor RprRigidBody_recompute_mass_properties_from_colliders$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_recompute_mass_properties_from_colliders$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_recompute_mass_properties_from_colliders",
        constants$71.RprRigidBody_recompute_mass_properties_from_colliders$FUNC
    );
}


