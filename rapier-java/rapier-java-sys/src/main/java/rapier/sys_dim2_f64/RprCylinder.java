// Generated by jextract

package rapier.sys_dim2_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class RprCylinder {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("half_height"),
        Constants$root.C_DOUBLE$LAYOUT.withName("radius")
    ).withName("RprCylinder");
    public static MemoryLayout $LAYOUT() {
        return RprCylinder.$struct$LAYOUT;
    }
    static final VarHandle half_height$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("half_height"));
    public static VarHandle half_height$VH() {
        return RprCylinder.half_height$VH;
    }
    public static double half_height$get(MemorySegment seg) {
        return (double)RprCylinder.half_height$VH.get(seg);
    }
    public static void half_height$set( MemorySegment seg, double x) {
        RprCylinder.half_height$VH.set(seg, x);
    }
    public static double half_height$get(MemorySegment seg, long index) {
        return (double)RprCylinder.half_height$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void half_height$set(MemorySegment seg, long index, double x) {
        RprCylinder.half_height$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle radius$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("radius"));
    public static VarHandle radius$VH() {
        return RprCylinder.radius$VH;
    }
    public static double radius$get(MemorySegment seg) {
        return (double)RprCylinder.radius$VH.get(seg);
    }
    public static void radius$set( MemorySegment seg, double x) {
        RprCylinder.radius$VH.set(seg, x);
    }
    public static double radius$get(MemorySegment seg, long index) {
        return (double)RprCylinder.radius$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void radius$set(MemorySegment seg, long index, double x) {
        RprCylinder.radius$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


