// Generated by jextract

package rapier.sys;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$24 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$24() {}
    static final FunctionDescriptor RprRigidBodySet_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodySet_drop$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodySet_drop",
        constants$24.RprRigidBodySet_drop$FUNC
    );
    static final FunctionDescriptor RprRigidBodySet_index$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprRigidBodyHandle")
    );
    static final MethodHandle RprRigidBodySet_index$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodySet_index",
        constants$24.RprRigidBodySet_index$FUNC
    );
    static final FunctionDescriptor RprRigidBodySet_index_mut$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprRigidBodyHandle")
    );
    static final MethodHandle RprRigidBodySet_index_mut$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodySet_index_mut",
        constants$24.RprRigidBodySet_index_mut$FUNC
    );
    static final FunctionDescriptor RprRigidBodySet_insert$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("index"),
        Constants$root.C_INT$LAYOUT.withName("generation")
    ).withName("RprRigidBodyHandle"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodySet_insert$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodySet_insert",
        constants$24.RprRigidBodySet_insert$FUNC
    );
    static final FunctionDescriptor RprRigidBodySet_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RprRigidBodySet_new$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodySet_new",
        constants$24.RprRigidBodySet_new$FUNC
    );
    static final FunctionDescriptor RprRigidBody_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_drop$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_drop",
        constants$24.RprRigidBody_drop$FUNC
    );
}


