// Generated by jextract

package rapier.sys_dim3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$21 {

    static final FunctionDescriptor RprColliderBuilder_friction_combine_rule$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle RprColliderBuilder_friction_combine_rule$MH = RuntimeHelper.downcallHandle(
        "RprColliderBuilder_friction_combine_rule",
        constants$21.RprColliderBuilder_friction_combine_rule$FUNC
    );
    static final FunctionDescriptor RprColliderBuilder_mass$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprColliderBuilder_mass$MH = RuntimeHelper.downcallHandle(
        "RprColliderBuilder_mass",
        constants$21.RprColliderBuilder_mass$FUNC
    );
    static final FunctionDescriptor RprColliderBuilder_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprColliderBuilder_new$MH = RuntimeHelper.downcallHandle(
        "RprColliderBuilder_new",
        constants$21.RprColliderBuilder_new$FUNC
    );
    static final FunctionDescriptor RprColliderBuilder_position$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("x"),
                Constants$root.C_FLOAT$LAYOUT.withName("y"),
                Constants$root.C_FLOAT$LAYOUT.withName("z"),
                Constants$root.C_FLOAT$LAYOUT.withName("w")
            ).withName("rotation"),
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("x"),
                Constants$root.C_FLOAT$LAYOUT.withName("y"),
                Constants$root.C_FLOAT$LAYOUT.withName("z")
            ).withName("translation")
        ).withName("RprIsometry")
    );
    static final MethodHandle RprColliderBuilder_position$MH = RuntimeHelper.downcallHandle(
        "RprColliderBuilder_position",
        constants$21.RprColliderBuilder_position$FUNC
    );
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
}


