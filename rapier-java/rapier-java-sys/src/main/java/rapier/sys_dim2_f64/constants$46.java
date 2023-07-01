// Generated by jextract

package rapier.sys_dim2_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$46 {

    static final FunctionDescriptor RprGenericJoint_set_local_anchor1$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y")
        ).withName("RprVector")
    );
    static final MethodHandle RprGenericJoint_set_local_anchor1$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_local_anchor1",
        constants$46.RprGenericJoint_set_local_anchor1$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_set_local_anchor2$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y")
        ).withName("RprVector")
    );
    static final MethodHandle RprGenericJoint_set_local_anchor2$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_local_anchor2",
        constants$46.RprGenericJoint_set_local_anchor2$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_set_local_axis1$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y")
        ).withName("RprVector")
    );
    static final MethodHandle RprGenericJoint_set_local_axis1$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_local_axis1",
        constants$46.RprGenericJoint_set_local_axis1$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_set_local_axis2$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y")
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
                Constants$root.C_DOUBLE$LAYOUT.withName("re"),
                Constants$root.C_DOUBLE$LAYOUT.withName("im")
            ).withName("rotation"),
            MemoryLayout.structLayout(
                Constants$root.C_DOUBLE$LAYOUT.withName("x"),
                Constants$root.C_DOUBLE$LAYOUT.withName("y")
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
                Constants$root.C_DOUBLE$LAYOUT.withName("re"),
                Constants$root.C_DOUBLE$LAYOUT.withName("im")
            ).withName("rotation"),
            MemoryLayout.structLayout(
                Constants$root.C_DOUBLE$LAYOUT.withName("x"),
                Constants$root.C_DOUBLE$LAYOUT.withName("y")
            ).withName("translation")
        ).withName("RprIsometry")
    );
    static final MethodHandle RprGenericJoint_set_local_frame2$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_local_frame2",
        constants$46.RprGenericJoint_set_local_frame2$FUNC
    );
}


