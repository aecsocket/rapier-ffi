// Generated by jextract

package rapier.sys_dim2_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$21 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$21() {}
    static final FunctionDescriptor RprColliderBuilder_sensor$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprColliderBuilder_sensor$MH = RuntimeHelper.downcallHandle(
        "RprColliderBuilder_sensor",
        constants$21.RprColliderBuilder_sensor$FUNC
    );
    static final FunctionDescriptor RprColliderBuilder_translation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(2, Constants$root.C_FLOAT$LAYOUT).withName("_0")
        ).withName("RprVector")
    );
    static final MethodHandle RprColliderBuilder_translation$MH = RuntimeHelper.downcallHandle(
        "RprColliderBuilder_translation",
        constants$21.RprColliderBuilder_translation$FUNC
    );
    static final FunctionDescriptor RprColliderHandle_invalid$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("index"),
        Constants$root.C_INT$LAYOUT.withName("generation")
    ).withName("RprColliderHandle"));
    static final MethodHandle RprColliderHandle_invalid$MH = RuntimeHelper.downcallHandle(
        "RprColliderHandle_invalid",
        constants$21.RprColliderHandle_invalid$FUNC
    );
    static final FunctionDescriptor RprColliderHandle_is_valid$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprColliderHandle")
    );
    static final MethodHandle RprColliderHandle_is_valid$MH = RuntimeHelper.downcallHandle(
        "RprColliderHandle_is_valid",
        constants$21.RprColliderHandle_is_valid$FUNC
    );
    static final FunctionDescriptor RprColliderSet_contains$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprColliderHandle")
    );
    static final MethodHandle RprColliderSet_contains$MH = RuntimeHelper.downcallHandle(
        "RprColliderSet_contains",
        constants$21.RprColliderSet_contains$FUNC
    );
    static final FunctionDescriptor RprColliderSet_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprColliderSet_drop$MH = RuntimeHelper.downcallHandle(
        "RprColliderSet_drop",
        constants$21.RprColliderSet_drop$FUNC
    );
}


