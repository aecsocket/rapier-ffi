// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$29 {

    static final FunctionDescriptor RprCollider_set_translation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y"),
            Constants$root.C_FLOAT$LAYOUT.withName("z")
        ).withName("RprVector")
    );
    static final MethodHandle RprCollider_set_translation$MH = RuntimeHelper.downcallHandle(
        "RprCollider_set_translation",
        constants$29.RprCollider_set_translation$FUNC
    );
    static final FunctionDescriptor RprCollider_set_translation_wrt_parent$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y"),
            Constants$root.C_FLOAT$LAYOUT.withName("z")
        ).withName("RprVector")
    );
    static final MethodHandle RprCollider_set_translation_wrt_parent$MH = RuntimeHelper.downcallHandle(
        "RprCollider_set_translation_wrt_parent",
        constants$29.RprCollider_set_translation_wrt_parent$FUNC
    );
    static final FunctionDescriptor RprCollider_shape$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_shape$MH = RuntimeHelper.downcallHandle(
        "RprCollider_shape",
        constants$29.RprCollider_shape$FUNC
    );
    static final FunctionDescriptor RprCollider_translation$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("x"),
        Constants$root.C_FLOAT$LAYOUT.withName("y"),
        Constants$root.C_FLOAT$LAYOUT.withName("z")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_translation$MH = RuntimeHelper.downcallHandle(
        "RprCollider_translation",
        constants$29.RprCollider_translation$FUNC
    );
    static final FunctionDescriptor RprCollider_volume$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_volume$MH = RuntimeHelper.downcallHandle(
        "RprCollider_volume",
        constants$29.RprCollider_volume$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_contacts_enabled$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_contacts_enabled$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_contacts_enabled",
        constants$29.RprGenericJoint_contacts_enabled$FUNC
    );
}


