// Generated by jextract

package rapier.sys_dim2;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$37 {

    static final FunctionDescriptor RprContactManifold_subshape_pos2$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprContactManifold_subshape_pos2$MH = RuntimeHelper.downcallHandle(
        "RprContactManifold_subshape_pos2",
        constants$37.RprContactManifold_subshape_pos2$FUNC
    );
    static final FunctionDescriptor RprContactManifold_user_data$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprContactManifold_user_data$MH = RuntimeHelper.downcallHandle(
        "RprContactManifold_user_data",
        constants$37.RprContactManifold_user_data$FUNC
    );
    static final FunctionDescriptor RprContactModificationContext_bodies$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprContactModificationContext_bodies$MH = RuntimeHelper.downcallHandle(
        "RprContactModificationContext_bodies",
        constants$37.RprContactModificationContext_bodies$FUNC
    );
    static final FunctionDescriptor RprContactModificationContext_collider1$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("index"),
        Constants$root.C_INT$LAYOUT.withName("generation")
    ).withName("RprArenaKey"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprContactModificationContext_collider1$MH = RuntimeHelper.downcallHandle(
        "RprContactModificationContext_collider1",
        constants$37.RprContactModificationContext_collider1$FUNC
    );
    static final FunctionDescriptor RprContactModificationContext_collider2$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("index"),
        Constants$root.C_INT$LAYOUT.withName("generation")
    ).withName("RprArenaKey"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprContactModificationContext_collider2$MH = RuntimeHelper.downcallHandle(
        "RprContactModificationContext_collider2",
        constants$37.RprContactModificationContext_collider2$FUNC
    );
    static final FunctionDescriptor RprContactModificationContext_colliders$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprContactModificationContext_colliders$MH = RuntimeHelper.downcallHandle(
        "RprContactModificationContext_colliders",
        constants$37.RprContactModificationContext_colliders$FUNC
    );
}


