// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class RprAngularInertia {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("m11"),
        Constants$root.C_DOUBLE$LAYOUT.withName("m12"),
        Constants$root.C_DOUBLE$LAYOUT.withName("m13"),
        Constants$root.C_DOUBLE$LAYOUT.withName("m22"),
        Constants$root.C_DOUBLE$LAYOUT.withName("m23"),
        Constants$root.C_DOUBLE$LAYOUT.withName("m33")
    ).withName("RprAngularInertia");
    public static MemoryLayout $LAYOUT() {
        return RprAngularInertia.$struct$LAYOUT;
    }
    static final VarHandle m11$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m11"));
    public static VarHandle m11$VH() {
        return RprAngularInertia.m11$VH;
    }
    public static double m11$get(MemorySegment seg) {
        return (double)RprAngularInertia.m11$VH.get(seg);
    }
    public static void m11$set( MemorySegment seg, double x) {
        RprAngularInertia.m11$VH.set(seg, x);
    }
    public static double m11$get(MemorySegment seg, long index) {
        return (double)RprAngularInertia.m11$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m11$set(MemorySegment seg, long index, double x) {
        RprAngularInertia.m11$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m12$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m12"));
    public static VarHandle m12$VH() {
        return RprAngularInertia.m12$VH;
    }
    public static double m12$get(MemorySegment seg) {
        return (double)RprAngularInertia.m12$VH.get(seg);
    }
    public static void m12$set( MemorySegment seg, double x) {
        RprAngularInertia.m12$VH.set(seg, x);
    }
    public static double m12$get(MemorySegment seg, long index) {
        return (double)RprAngularInertia.m12$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m12$set(MemorySegment seg, long index, double x) {
        RprAngularInertia.m12$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m13$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m13"));
    public static VarHandle m13$VH() {
        return RprAngularInertia.m13$VH;
    }
    public static double m13$get(MemorySegment seg) {
        return (double)RprAngularInertia.m13$VH.get(seg);
    }
    public static void m13$set( MemorySegment seg, double x) {
        RprAngularInertia.m13$VH.set(seg, x);
    }
    public static double m13$get(MemorySegment seg, long index) {
        return (double)RprAngularInertia.m13$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m13$set(MemorySegment seg, long index, double x) {
        RprAngularInertia.m13$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m22$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m22"));
    public static VarHandle m22$VH() {
        return RprAngularInertia.m22$VH;
    }
    public static double m22$get(MemorySegment seg) {
        return (double)RprAngularInertia.m22$VH.get(seg);
    }
    public static void m22$set( MemorySegment seg, double x) {
        RprAngularInertia.m22$VH.set(seg, x);
    }
    public static double m22$get(MemorySegment seg, long index) {
        return (double)RprAngularInertia.m22$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m22$set(MemorySegment seg, long index, double x) {
        RprAngularInertia.m22$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m23$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m23"));
    public static VarHandle m23$VH() {
        return RprAngularInertia.m23$VH;
    }
    public static double m23$get(MemorySegment seg) {
        return (double)RprAngularInertia.m23$VH.get(seg);
    }
    public static void m23$set( MemorySegment seg, double x) {
        RprAngularInertia.m23$VH.set(seg, x);
    }
    public static double m23$get(MemorySegment seg, long index) {
        return (double)RprAngularInertia.m23$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m23$set(MemorySegment seg, long index, double x) {
        RprAngularInertia.m23$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m33$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m33"));
    public static VarHandle m33$VH() {
        return RprAngularInertia.m33$VH;
    }
    public static double m33$get(MemorySegment seg) {
        return (double)RprAngularInertia.m33$VH.get(seg);
    }
    public static void m33$set( MemorySegment seg, double x) {
        RprAngularInertia.m33$VH.set(seg, x);
    }
    public static double m33$get(MemorySegment seg, long index) {
        return (double)RprAngularInertia.m33$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m33$set(MemorySegment seg, long index, double x) {
        RprAngularInertia.m33$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


