// Generated by jextract

package rapier.sys_dim2;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class RprJointMotor {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("target_vel"),
        Constants$root.C_FLOAT$LAYOUT.withName("target_pos"),
        Constants$root.C_FLOAT$LAYOUT.withName("stiffness"),
        Constants$root.C_FLOAT$LAYOUT.withName("damping"),
        Constants$root.C_FLOAT$LAYOUT.withName("max_force"),
        Constants$root.C_FLOAT$LAYOUT.withName("impulse"),
        Constants$root.C_INT$LAYOUT.withName("model")
    ).withName("RprJointMotor");
    public static MemoryLayout $LAYOUT() {
        return RprJointMotor.$struct$LAYOUT;
    }
    static final VarHandle target_vel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("target_vel"));
    public static VarHandle target_vel$VH() {
        return RprJointMotor.target_vel$VH;
    }
    public static float target_vel$get(MemorySegment seg) {
        return (float)RprJointMotor.target_vel$VH.get(seg);
    }
    public static void target_vel$set( MemorySegment seg, float x) {
        RprJointMotor.target_vel$VH.set(seg, x);
    }
    public static float target_vel$get(MemorySegment seg, long index) {
        return (float)RprJointMotor.target_vel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void target_vel$set(MemorySegment seg, long index, float x) {
        RprJointMotor.target_vel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle target_pos$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("target_pos"));
    public static VarHandle target_pos$VH() {
        return RprJointMotor.target_pos$VH;
    }
    public static float target_pos$get(MemorySegment seg) {
        return (float)RprJointMotor.target_pos$VH.get(seg);
    }
    public static void target_pos$set( MemorySegment seg, float x) {
        RprJointMotor.target_pos$VH.set(seg, x);
    }
    public static float target_pos$get(MemorySegment seg, long index) {
        return (float)RprJointMotor.target_pos$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void target_pos$set(MemorySegment seg, long index, float x) {
        RprJointMotor.target_pos$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle stiffness$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("stiffness"));
    public static VarHandle stiffness$VH() {
        return RprJointMotor.stiffness$VH;
    }
    public static float stiffness$get(MemorySegment seg) {
        return (float)RprJointMotor.stiffness$VH.get(seg);
    }
    public static void stiffness$set( MemorySegment seg, float x) {
        RprJointMotor.stiffness$VH.set(seg, x);
    }
    public static float stiffness$get(MemorySegment seg, long index) {
        return (float)RprJointMotor.stiffness$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void stiffness$set(MemorySegment seg, long index, float x) {
        RprJointMotor.stiffness$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle damping$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("damping"));
    public static VarHandle damping$VH() {
        return RprJointMotor.damping$VH;
    }
    public static float damping$get(MemorySegment seg) {
        return (float)RprJointMotor.damping$VH.get(seg);
    }
    public static void damping$set( MemorySegment seg, float x) {
        RprJointMotor.damping$VH.set(seg, x);
    }
    public static float damping$get(MemorySegment seg, long index) {
        return (float)RprJointMotor.damping$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void damping$set(MemorySegment seg, long index, float x) {
        RprJointMotor.damping$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle max_force$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("max_force"));
    public static VarHandle max_force$VH() {
        return RprJointMotor.max_force$VH;
    }
    public static float max_force$get(MemorySegment seg) {
        return (float)RprJointMotor.max_force$VH.get(seg);
    }
    public static void max_force$set( MemorySegment seg, float x) {
        RprJointMotor.max_force$VH.set(seg, x);
    }
    public static float max_force$get(MemorySegment seg, long index) {
        return (float)RprJointMotor.max_force$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void max_force$set(MemorySegment seg, long index, float x) {
        RprJointMotor.max_force$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle impulse$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("impulse"));
    public static VarHandle impulse$VH() {
        return RprJointMotor.impulse$VH;
    }
    public static float impulse$get(MemorySegment seg) {
        return (float)RprJointMotor.impulse$VH.get(seg);
    }
    public static void impulse$set( MemorySegment seg, float x) {
        RprJointMotor.impulse$VH.set(seg, x);
    }
    public static float impulse$get(MemorySegment seg, long index) {
        return (float)RprJointMotor.impulse$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void impulse$set(MemorySegment seg, long index, float x) {
        RprJointMotor.impulse$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle model$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("model"));
    public static VarHandle model$VH() {
        return RprJointMotor.model$VH;
    }
    public static int model$get(MemorySegment seg) {
        return (int)RprJointMotor.model$VH.get(seg);
    }
    public static void model$set( MemorySegment seg, int x) {
        RprJointMotor.model$VH.set(seg, x);
    }
    public static int model$get(MemorySegment seg, long index) {
        return (int)RprJointMotor.model$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void model$set(MemorySegment seg, long index, int x) {
        RprJointMotor.model$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


