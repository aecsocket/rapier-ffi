// Generated by jextract

package rapier.sys_dim2_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$28 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$28() {}
    static final FunctionDescriptor RprCollider_set_rotation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(2, Constants$root.C_FLOAT$LAYOUT).withName("_0")
        ).withName("RprRotation")
    );
    static final MethodHandle RprCollider_set_rotation$MH = RuntimeHelper.downcallHandle(
        "RprCollider_set_rotation",
        constants$28.RprCollider_set_rotation$FUNC
    );
    static final FunctionDescriptor RprCollider_set_rotation_wrt_parent$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(1, Constants$root.C_FLOAT$LAYOUT).withName("_0")
        ).withName("RprAngVector")
    );
    static final MethodHandle RprCollider_set_rotation_wrt_parent$MH = RuntimeHelper.downcallHandle(
        "RprCollider_set_rotation_wrt_parent",
        constants$28.RprCollider_set_rotation_wrt_parent$FUNC
    );
    static final FunctionDescriptor RprCollider_set_sensor$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprCollider_set_sensor$MH = RuntimeHelper.downcallHandle(
        "RprCollider_set_sensor",
        constants$28.RprCollider_set_sensor$FUNC
    );
    static final FunctionDescriptor RprCollider_set_shape$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_set_shape$MH = RuntimeHelper.downcallHandle(
        "RprCollider_set_shape",
        constants$28.RprCollider_set_shape$FUNC
    );
    static final FunctionDescriptor RprCollider_set_translation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(2, Constants$root.C_FLOAT$LAYOUT).withName("_0")
        ).withName("RprVector")
    );
    static final MethodHandle RprCollider_set_translation$MH = RuntimeHelper.downcallHandle(
        "RprCollider_set_translation",
        constants$28.RprCollider_set_translation$FUNC
    );
    static final FunctionDescriptor RprCollider_set_translation_wrt_parent$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(2, Constants$root.C_FLOAT$LAYOUT).withName("_0")
        ).withName("RprVector")
    );
    static final MethodHandle RprCollider_set_translation_wrt_parent$MH = RuntimeHelper.downcallHandle(
        "RprCollider_set_translation_wrt_parent",
        constants$28.RprCollider_set_translation_wrt_parent$FUNC
    );
}


