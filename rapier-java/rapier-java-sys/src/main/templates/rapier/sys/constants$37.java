// Generated by jextract

package rapier.sys;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$37 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$37() {}
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
    static final FunctionDescriptor RprContactModificationContext_manifold$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprContactModificationContext_manifold$MH = RuntimeHelper.downcallHandle(
        "RprContactModificationContext_manifold",
        constants$37.RprContactModificationContext_manifold$FUNC
    );
    static final FunctionDescriptor RprContactModificationContext_normal$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("x"),
        Constants$root.C_FLOAT$LAYOUT.withName("y")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprContactModificationContext_normal$MH = RuntimeHelper.downcallHandle(
        "RprContactModificationContext_normal",
        constants$37.RprContactModificationContext_normal$FUNC
    );
}


