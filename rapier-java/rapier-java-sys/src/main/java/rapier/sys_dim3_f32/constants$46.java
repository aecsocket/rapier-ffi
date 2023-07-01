// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$46 {

    static final FunctionDescriptor RprGenericJoint_set_local_anchor1$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y"),
            Constants$root.C_FLOAT$LAYOUT.withName("z")
        ).withName("RprVector")
    );
    static final MethodHandle RprGenericJoint_set_local_anchor1$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_local_anchor1",
        constants$46.RprGenericJoint_set_local_anchor1$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_set_local_anchor2$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y"),
            Constants$root.C_FLOAT$LAYOUT.withName("z")
        ).withName("RprVector")
    );
    static final MethodHandle RprGenericJoint_set_local_anchor2$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_local_anchor2",
        constants$46.RprGenericJoint_set_local_anchor2$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_set_local_axis1$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y"),
            Constants$root.C_FLOAT$LAYOUT.withName("z")
        ).withName("RprVector")
    );
    static final MethodHandle RprGenericJoint_set_local_axis1$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_local_axis1",
        constants$46.RprGenericJoint_set_local_axis1$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_set_local_axis2$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y"),
            Constants$root.C_FLOAT$LAYOUT.withName("z")
        ).withName("RprVector")
    );
    static final MethodHandle RprGenericJoint_set_local_axis2$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_local_axis2",
        constants$46.RprGenericJoint_set_local_axis2$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_set_local_frame1$FUNC = FunctionDescriptor.ofVoid(
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
    static final MethodHandle RprGenericJoint_set_local_frame1$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_local_frame1",
        constants$46.RprGenericJoint_set_local_frame1$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_set_local_frame2$FUNC = FunctionDescriptor.ofVoid(
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
    static final MethodHandle RprGenericJoint_set_local_frame2$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_local_frame2",
        constants$46.RprGenericJoint_set_local_frame2$FUNC
    );
}


