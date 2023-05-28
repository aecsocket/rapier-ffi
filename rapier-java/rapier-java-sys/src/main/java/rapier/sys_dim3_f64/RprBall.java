// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class RprBall {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("radius")
    ).withName("RprBall");
    public static MemoryLayout $LAYOUT() {
        return RprBall.$struct$LAYOUT;
    }
    static final VarHandle radius$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("radius"));
    public static VarHandle radius$VH() {
        return RprBall.radius$VH;
    }
    public static double radius$get(MemorySegment seg) {
        return (double)RprBall.radius$VH.get(seg);
    }
    public static void radius$set( MemorySegment seg, double x) {
        RprBall.radius$VH.set(seg, x);
    }
    public static double radius$get(MemorySegment seg, long index) {
        return (double)RprBall.radius$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void radius$set(MemorySegment seg, long index, double x) {
        RprBall.radius$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


