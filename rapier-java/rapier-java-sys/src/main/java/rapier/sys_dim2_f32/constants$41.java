// Generated by jextract

package rapier.sys_dim2_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$41 {

    static final FunctionDescriptor RprGenericJoint_local_axis1$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("x"),
        Constants$root.C_FLOAT$LAYOUT.withName("y")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_local_axis1$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_local_axis1",
        constants$41.RprGenericJoint_local_axis1$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_local_axis2$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("x"),
        Constants$root.C_FLOAT$LAYOUT.withName("y")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_local_axis2$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_local_axis2",
        constants$41.RprGenericJoint_local_axis2$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_local_frame1$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("re"),
            Constants$root.C_FLOAT$LAYOUT.withName("im")
        ).withName("rotation"),
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y")
        ).withName("translation")
    ).withName("RprIsometry"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_local_frame1$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_local_frame1",
        constants$41.RprGenericJoint_local_frame1$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_local_frame2$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("re"),
            Constants$root.C_FLOAT$LAYOUT.withName("im")
        ).withName("rotation"),
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y")
        ).withName("translation")
    ).withName("RprIsometry"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_local_frame2$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_local_frame2",
        constants$41.RprGenericJoint_local_frame2$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_lock_axes$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle RprGenericJoint_lock_axes$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_lock_axes",
        constants$41.RprGenericJoint_lock_axes$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_locked_axes$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_locked_axes$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_locked_axes",
        constants$41.RprGenericJoint_locked_axes$FUNC
    );
}


