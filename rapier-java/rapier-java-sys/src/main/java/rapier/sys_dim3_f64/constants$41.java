// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$41 {

    static final FunctionDescriptor RprGenericJoint_local_anchor1$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("x"),
        Constants$root.C_DOUBLE$LAYOUT.withName("y"),
        Constants$root.C_DOUBLE$LAYOUT.withName("z")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_local_anchor1$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_local_anchor1",
        constants$41.RprGenericJoint_local_anchor1$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_local_anchor2$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("x"),
        Constants$root.C_DOUBLE$LAYOUT.withName("y"),
        Constants$root.C_DOUBLE$LAYOUT.withName("z")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_local_anchor2$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_local_anchor2",
        constants$41.RprGenericJoint_local_anchor2$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_local_axis1$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("x"),
        Constants$root.C_DOUBLE$LAYOUT.withName("y"),
        Constants$root.C_DOUBLE$LAYOUT.withName("z")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_local_axis1$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_local_axis1",
        constants$41.RprGenericJoint_local_axis1$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_local_axis2$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("x"),
        Constants$root.C_DOUBLE$LAYOUT.withName("y"),
        Constants$root.C_DOUBLE$LAYOUT.withName("z")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_local_axis2$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_local_axis2",
        constants$41.RprGenericJoint_local_axis2$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_local_frame1$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y"),
            Constants$root.C_DOUBLE$LAYOUT.withName("z"),
            Constants$root.C_DOUBLE$LAYOUT.withName("w")
        ).withName("rotation"),
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y"),
            Constants$root.C_DOUBLE$LAYOUT.withName("z")
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
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y"),
            Constants$root.C_DOUBLE$LAYOUT.withName("z"),
            Constants$root.C_DOUBLE$LAYOUT.withName("w")
        ).withName("rotation"),
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y"),
            Constants$root.C_DOUBLE$LAYOUT.withName("z")
        ).withName("translation")
    ).withName("RprIsometry"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprGenericJoint_local_frame2$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_local_frame2",
        constants$41.RprGenericJoint_local_frame2$FUNC
    );
}


