// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$36 {

    static final FunctionDescriptor RprImpulseJointSet_remove$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprImpulseJointSet_remove$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJointSet_remove",
        constants$36.RprImpulseJointSet_remove$FUNC
    );
    static final FunctionDescriptor RprImpulseJoint_body1$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("index"),
        Constants$root.C_INT$LAYOUT.withName("generation")
    ).withName("RprArenaKey"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprImpulseJoint_body1$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJoint_body1",
        constants$36.RprImpulseJoint_body1$FUNC
    );
    static final FunctionDescriptor RprImpulseJoint_body2$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("index"),
        Constants$root.C_INT$LAYOUT.withName("generation")
    ).withName("RprArenaKey"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprImpulseJoint_body2$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJoint_body2",
        constants$36.RprImpulseJoint_body2$FUNC
    );
    static final FunctionDescriptor RprImpulseJoint_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprImpulseJoint_data$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJoint_data",
        constants$36.RprImpulseJoint_data$FUNC
    );
    static final FunctionDescriptor RprImpulseJoint_impulses$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("x"),
        Constants$root.C_DOUBLE$LAYOUT.withName("y"),
        Constants$root.C_DOUBLE$LAYOUT.withName("z"),
        Constants$root.C_DOUBLE$LAYOUT.withName("w"),
        Constants$root.C_DOUBLE$LAYOUT.withName("a"),
        Constants$root.C_DOUBLE$LAYOUT.withName("b")
    ).withName("RprSpacialVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprImpulseJoint_impulses$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJoint_impulses",
        constants$36.RprImpulseJoint_impulses$FUNC
    );
    static final FunctionDescriptor RprImpulseJoint_set_body1$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey")
    );
    static final MethodHandle RprImpulseJoint_set_body1$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJoint_set_body1",
        constants$36.RprImpulseJoint_set_body1$FUNC
    );
}


