// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class RprComplexRayResult {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("collider"),
        Constants$root.C_DOUBLE$LAYOUT.withName("toi"),
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y"),
            Constants$root.C_DOUBLE$LAYOUT.withName("z")
        ).withName("normal"),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("tag"),
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_INT$LAYOUT.withName("id")
                ).withName("vertex"),
                MemoryLayout.structLayout(
                    Constants$root.C_INT$LAYOUT.withName("id")
                ).withName("edge"),
                MemoryLayout.structLayout(
                    Constants$root.C_INT$LAYOUT.withName("id")
                ).withName("face")
            ).withName("$anon$0")
        ).withName("feature")
    ).withName("RprComplexRayResult");
    public static MemoryLayout $LAYOUT() {
        return RprComplexRayResult.$struct$LAYOUT;
    }
    public static MemorySegment collider$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle toi$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("toi"));
    public static VarHandle toi$VH() {
        return RprComplexRayResult.toi$VH;
    }
    public static double toi$get(MemorySegment seg) {
        return (double)RprComplexRayResult.toi$VH.get(seg);
    }
    public static void toi$set( MemorySegment seg, double x) {
        RprComplexRayResult.toi$VH.set(seg, x);
    }
    public static double toi$get(MemorySegment seg, long index) {
        return (double)RprComplexRayResult.toi$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void toi$set(MemorySegment seg, long index, double x) {
        RprComplexRayResult.toi$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment normal$slice(MemorySegment seg) {
        return seg.asSlice(16, 24);
    }
    public static MemorySegment feature$slice(MemorySegment seg) {
        return seg.asSlice(40, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


