// Generated by jextract

package rapier.sys_dim2;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$39 {

    static final FunctionDescriptor RprContactModificationContext_solver_contacts$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprContactModificationContext_solver_contacts$MH = RuntimeHelper.downcallHandle(
        "RprContactModificationContext_solver_contacts",
        constants$39.RprContactModificationContext_solver_contacts$FUNC
    );
    static final FunctionDescriptor RprContactModificationContext_user_data$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprContactModificationContext_user_data$MH = RuntimeHelper.downcallHandle(
        "RprContactModificationContext_user_data",
        constants$39.RprContactModificationContext_user_data$FUNC
    );
    static final FunctionDescriptor RprContactPair_collider1$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("index"),
        Constants$root.C_INT$LAYOUT.withName("generation")
    ).withName("RprArenaKey"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprContactPair_collider1$MH = RuntimeHelper.downcallHandle(
        "RprContactPair_collider1",
        constants$39.RprContactPair_collider1$FUNC
    );
    static final FunctionDescriptor RprContactPair_collider2$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("index"),
        Constants$root.C_INT$LAYOUT.withName("generation")
    ).withName("RprArenaKey"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprContactPair_collider2$MH = RuntimeHelper.downcallHandle(
        "RprContactPair_collider2",
        constants$39.RprContactPair_collider2$FUNC
    );
    static final FunctionDescriptor RprContactPair_has_any_active_contact$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprContactPair_has_any_active_contact$MH = RuntimeHelper.downcallHandle(
        "RprContactPair_has_any_active_contact",
        constants$39.RprContactPair_has_any_active_contact$FUNC
    );
    static final FunctionDescriptor RprContactPair_manifolds$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprContactPair_manifolds$MH = RuntimeHelper.downcallHandle(
        "RprContactPair_manifolds",
        constants$39.RprContactPair_manifolds$FUNC
    );
}

