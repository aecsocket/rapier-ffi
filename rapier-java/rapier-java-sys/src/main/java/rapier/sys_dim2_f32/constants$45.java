// Generated by jextract

package rapier.sys_dim2_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$45 {

    static final FunctionDescriptor RprGenericJoint_set_local_frame1$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("re"),
                Constants$root.C_FLOAT$LAYOUT.withName("im")
            ).withName("rotation"),
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("x"),
                Constants$root.C_FLOAT$LAYOUT.withName("y")
            ).withName("translation")
        ).withName("RprIsometry")
    );
    static final MethodHandle RprGenericJoint_set_local_frame1$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_local_frame1",
        constants$45.RprGenericJoint_set_local_frame1$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_set_local_frame2$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("re"),
                Constants$root.C_FLOAT$LAYOUT.withName("im")
            ).withName("rotation"),
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("x"),
                Constants$root.C_FLOAT$LAYOUT.withName("y")
            ).withName("translation")
        ).withName("RprIsometry")
    );
    static final MethodHandle RprGenericJoint_set_local_frame2$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_local_frame2",
        constants$45.RprGenericJoint_set_local_frame2$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_set_locked_axes$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle RprGenericJoint_set_locked_axes$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_locked_axes",
        constants$45.RprGenericJoint_set_locked_axes$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_set_motor$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprGenericJoint_set_motor$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_motor",
        constants$45.RprGenericJoint_set_motor$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_set_motor_axes$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle RprGenericJoint_set_motor_axes$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_motor_axes",
        constants$45.RprGenericJoint_set_motor_axes$FUNC
    );
    static final FunctionDescriptor RprGenericJoint_set_motor_max_force$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprGenericJoint_set_motor_max_force$MH = RuntimeHelper.downcallHandle(
        "RprGenericJoint_set_motor_max_force",
        constants$45.RprGenericJoint_set_motor_max_force$FUNC
    );
}


