// Generated by jextract

package rapier.sys_dim2;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$77 {

    static final FunctionDescriptor RprRigidBody_locked_axes$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_locked_axes$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_locked_axes",
        constants$77.RprRigidBody_locked_axes$FUNC
    );
    static final FunctionDescriptor RprRigidBody_mass$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_mass$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_mass",
        constants$77.RprRigidBody_mass$FUNC
    );
    static final FunctionDescriptor RprRigidBody_mass_properties$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_mass_properties$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_mass_properties",
        constants$77.RprRigidBody_mass_properties$FUNC
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
        constants$77.RprRigidBody_next_position$FUNC
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
        constants$77.RprRigidBody_position$FUNC
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
        constants$77.RprRigidBody_predict_position_using_velocity_and_forces$FUNC
    );
}

