// Generated by jextract

package rapier.sys_dim2_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$37 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$37() {}
    static final FunctionDescriptor RprRigidBody_set_next_kinematic_position$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.sequenceLayout(2, Constants$root.C_FLOAT$LAYOUT).withName("_0")
            ).withName("rotation"),
            MemoryLayout.structLayout(
                MemoryLayout.sequenceLayout(2, Constants$root.C_FLOAT$LAYOUT).withName("_0")
            ).withName("translation")
        ).withName("RprIso")
    );
    static final MethodHandle RprRigidBody_set_next_kinematic_position$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_next_kinematic_position",
        constants$37.RprRigidBody_set_next_kinematic_position$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_next_kinematic_rotation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(2, Constants$root.C_FLOAT$LAYOUT).withName("_0")
        ).withName("RprRot")
    );
    static final MethodHandle RprRigidBody_set_next_kinematic_rotation$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_next_kinematic_rotation",
        constants$37.RprRigidBody_set_next_kinematic_rotation$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_next_kinematic_translation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(2, Constants$root.C_FLOAT$LAYOUT).withName("_0")
        ).withName("RprVec")
    );
    static final MethodHandle RprRigidBody_set_next_kinematic_translation$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_next_kinematic_translation",
        constants$37.RprRigidBody_set_next_kinematic_translation$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_position$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.sequenceLayout(2, Constants$root.C_FLOAT$LAYOUT).withName("_0")
            ).withName("rotation"),
            MemoryLayout.structLayout(
                MemoryLayout.sequenceLayout(2, Constants$root.C_FLOAT$LAYOUT).withName("_0")
            ).withName("translation")
        ).withName("RprIso"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_position$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_position",
        constants$37.RprRigidBody_set_position$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_rotation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(2, Constants$root.C_FLOAT$LAYOUT).withName("_0")
        ).withName("RprRot"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_rotation$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_rotation",
        constants$37.RprRigidBody_set_rotation$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_translation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(2, Constants$root.C_FLOAT$LAYOUT).withName("_0")
        ).withName("RprVec"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_translation$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_translation",
        constants$37.RprRigidBody_set_translation$FUNC
    );
}


