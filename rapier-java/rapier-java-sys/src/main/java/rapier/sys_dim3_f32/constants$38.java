// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$38 {

    static final FunctionDescriptor RprContactModificationContext_manifold$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprContactModificationContext_manifold$MH = RuntimeHelper.downcallHandle(
        "RprContactModificationContext_manifold",
        constants$38.RprContactModificationContext_manifold$FUNC
    );
    static final FunctionDescriptor RprContactModificationContext_normal$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("x"),
        Constants$root.C_FLOAT$LAYOUT.withName("y"),
        Constants$root.C_FLOAT$LAYOUT.withName("z")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprContactModificationContext_normal$MH = RuntimeHelper.downcallHandle(
        "RprContactModificationContext_normal",
        constants$38.RprContactModificationContext_normal$FUNC
    );
    static final FunctionDescriptor RprContactModificationContext_rigid_body1$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprContactModificationContext_rigid_body1$MH = RuntimeHelper.downcallHandle(
        "RprContactModificationContext_rigid_body1",
        constants$38.RprContactModificationContext_rigid_body1$FUNC
    );
    static final FunctionDescriptor RprContactModificationContext_rigid_body2$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprContactModificationContext_rigid_body2$MH = RuntimeHelper.downcallHandle(
        "RprContactModificationContext_rigid_body2",
        constants$38.RprContactModificationContext_rigid_body2$FUNC
    );
    static final FunctionDescriptor RprContactModificationContext_set_normal$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y"),
            Constants$root.C_FLOAT$LAYOUT.withName("z")
        ).withName("RprVector")
    );
    static final MethodHandle RprContactModificationContext_set_normal$MH = RuntimeHelper.downcallHandle(
        "RprContactModificationContext_set_normal",
        constants$38.RprContactModificationContext_set_normal$FUNC
    );
    static final FunctionDescriptor RprContactModificationContext_set_user_data$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle RprContactModificationContext_set_user_data$MH = RuntimeHelper.downcallHandle(
        "RprContactModificationContext_set_user_data",
        constants$38.RprContactModificationContext_set_user_data$FUNC
    );
}


