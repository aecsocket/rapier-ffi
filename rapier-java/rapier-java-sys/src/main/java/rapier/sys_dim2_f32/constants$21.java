// Generated by jextract

package rapier.sys_dim2_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$21 {

    static final FunctionDescriptor RprColliderBuilder_restitution$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprColliderBuilder_restitution$MH = RuntimeHelper.downcallHandle(
        "RprColliderBuilder_restitution",
        constants$21.RprColliderBuilder_restitution$FUNC
    );
    static final FunctionDescriptor RprColliderBuilder_restitution_combine_rule$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle RprColliderBuilder_restitution_combine_rule$MH = RuntimeHelper.downcallHandle(
        "RprColliderBuilder_restitution_combine_rule",
        constants$21.RprColliderBuilder_restitution_combine_rule$FUNC
    );
    static final FunctionDescriptor RprColliderBuilder_rotation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x")
        ).withName("RprAngVector")
    );
    static final MethodHandle RprColliderBuilder_rotation$MH = RuntimeHelper.downcallHandle(
        "RprColliderBuilder_rotation",
        constants$21.RprColliderBuilder_rotation$FUNC
    );
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
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y")
        ).withName("RprVector")
    );
    static final MethodHandle RprColliderBuilder_translation$MH = RuntimeHelper.downcallHandle(
        "RprColliderBuilder_translation",
        constants$21.RprColliderBuilder_translation$FUNC
    );
    static final FunctionDescriptor RprColliderSet_contains$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey")
    );
    static final MethodHandle RprColliderSet_contains$MH = RuntimeHelper.downcallHandle(
        "RprColliderSet_contains",
        constants$21.RprColliderSet_contains$FUNC
    );
}


