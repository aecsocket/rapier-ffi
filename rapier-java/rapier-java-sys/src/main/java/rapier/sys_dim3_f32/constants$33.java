// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$33 {

    static final FunctionDescriptor RprCollider_translation$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("x"),
        Constants$root.C_FLOAT$LAYOUT.withName("y"),
        Constants$root.C_FLOAT$LAYOUT.withName("z")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_translation$MH = RuntimeHelper.downcallHandle(
        "RprCollider_translation",
        constants$33.RprCollider_translation$FUNC
    );
    static final FunctionDescriptor RprCollider_volume$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_volume$MH = RuntimeHelper.downcallHandle(
        "RprCollider_volume",
        constants$33.RprCollider_volume$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_contacts_enabled$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_contacts_enabled$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_contacts_enabled",
        constants$33.RprGenericJoint_contacts_enabled$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_drop$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_drop",
        constants$33.RprGenericJoint_drop$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_is_enabled$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_is_enabled$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_is_enabled",
        constants$33.RprGenericJoint_is_enabled$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_limits$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_limits$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_limits",
        constants$33.RprGenericJoint_limits$FUNC
    );
}


