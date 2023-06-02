// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class RprVHACDParameters {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("concavity"),
        Constants$root.C_DOUBLE$LAYOUT.withName("alpha"),
        Constants$root.C_DOUBLE$LAYOUT.withName("beta"),
        Constants$root.C_INT$LAYOUT.withName("resolution"),
        Constants$root.C_INT$LAYOUT.withName("plane_downsampling"),
        Constants$root.C_INT$LAYOUT.withName("convex_hull_downsampling"),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("tag"),
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_BOOL$LAYOUT.withName("detect_cavities")
                ).withName("flood_fill")
            ).withName("$anon$0"),
            MemoryLayout.paddingLayout(24)
        ).withName("fill_mode"),
        Constants$root.C_BOOL$LAYOUT.withName("convex_hull_approximation"),
        MemoryLayout.paddingLayout(24),
        Constants$root.C_INT$LAYOUT.withName("max_convex_hulls"),
        MemoryLayout.paddingLayout(32)
    ).withName("RprVHACDParameters");
    public static MemoryLayout $LAYOUT() {
        return RprVHACDParameters.$struct$LAYOUT;
    }
    static final VarHandle concavity$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("concavity"));
    public static VarHandle concavity$VH() {
        return RprVHACDParameters.concavity$VH;
    }
    public static double concavity$get(MemorySegment seg) {
        return (double)RprVHACDParameters.concavity$VH.get(seg);
    }
    public static void concavity$set( MemorySegment seg, double x) {
        RprVHACDParameters.concavity$VH.set(seg, x);
    }
    public static double concavity$get(MemorySegment seg, long index) {
        return (double)RprVHACDParameters.concavity$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void concavity$set(MemorySegment seg, long index, double x) {
        RprVHACDParameters.concavity$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle alpha$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("alpha"));
    public static VarHandle alpha$VH() {
        return RprVHACDParameters.alpha$VH;
    }
    public static double alpha$get(MemorySegment seg) {
        return (double)RprVHACDParameters.alpha$VH.get(seg);
    }
    public static void alpha$set( MemorySegment seg, double x) {
        RprVHACDParameters.alpha$VH.set(seg, x);
    }
    public static double alpha$get(MemorySegment seg, long index) {
        return (double)RprVHACDParameters.alpha$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void alpha$set(MemorySegment seg, long index, double x) {
        RprVHACDParameters.alpha$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle beta$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("beta"));
    public static VarHandle beta$VH() {
        return RprVHACDParameters.beta$VH;
    }
    public static double beta$get(MemorySegment seg) {
        return (double)RprVHACDParameters.beta$VH.get(seg);
    }
    public static void beta$set( MemorySegment seg, double x) {
        RprVHACDParameters.beta$VH.set(seg, x);
    }
    public static double beta$get(MemorySegment seg, long index) {
        return (double)RprVHACDParameters.beta$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void beta$set(MemorySegment seg, long index, double x) {
        RprVHACDParameters.beta$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle resolution$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("resolution"));
    public static VarHandle resolution$VH() {
        return RprVHACDParameters.resolution$VH;
    }
    public static int resolution$get(MemorySegment seg) {
        return (int)RprVHACDParameters.resolution$VH.get(seg);
    }
    public static void resolution$set( MemorySegment seg, int x) {
        RprVHACDParameters.resolution$VH.set(seg, x);
    }
    public static int resolution$get(MemorySegment seg, long index) {
        return (int)RprVHACDParameters.resolution$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void resolution$set(MemorySegment seg, long index, int x) {
        RprVHACDParameters.resolution$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle plane_downsampling$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("plane_downsampling"));
    public static VarHandle plane_downsampling$VH() {
        return RprVHACDParameters.plane_downsampling$VH;
    }
    public static int plane_downsampling$get(MemorySegment seg) {
        return (int)RprVHACDParameters.plane_downsampling$VH.get(seg);
    }
    public static void plane_downsampling$set( MemorySegment seg, int x) {
        RprVHACDParameters.plane_downsampling$VH.set(seg, x);
    }
    public static int plane_downsampling$get(MemorySegment seg, long index) {
        return (int)RprVHACDParameters.plane_downsampling$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void plane_downsampling$set(MemorySegment seg, long index, int x) {
        RprVHACDParameters.plane_downsampling$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle convex_hull_downsampling$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("convex_hull_downsampling"));
    public static VarHandle convex_hull_downsampling$VH() {
        return RprVHACDParameters.convex_hull_downsampling$VH;
    }
    public static int convex_hull_downsampling$get(MemorySegment seg) {
        return (int)RprVHACDParameters.convex_hull_downsampling$VH.get(seg);
    }
    public static void convex_hull_downsampling$set( MemorySegment seg, int x) {
        RprVHACDParameters.convex_hull_downsampling$VH.set(seg, x);
    }
    public static int convex_hull_downsampling$get(MemorySegment seg, long index) {
        return (int)RprVHACDParameters.convex_hull_downsampling$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void convex_hull_downsampling$set(MemorySegment seg, long index, int x) {
        RprVHACDParameters.convex_hull_downsampling$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment fill_mode$slice(MemorySegment seg) {
        return seg.asSlice(36, 8);
    }
    static final VarHandle convex_hull_approximation$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("convex_hull_approximation"));
    public static VarHandle convex_hull_approximation$VH() {
        return RprVHACDParameters.convex_hull_approximation$VH;
    }
    public static boolean convex_hull_approximation$get(MemorySegment seg) {
        return (boolean)RprVHACDParameters.convex_hull_approximation$VH.get(seg);
    }
    public static void convex_hull_approximation$set( MemorySegment seg, boolean x) {
        RprVHACDParameters.convex_hull_approximation$VH.set(seg, x);
    }
    public static boolean convex_hull_approximation$get(MemorySegment seg, long index) {
        return (boolean)RprVHACDParameters.convex_hull_approximation$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void convex_hull_approximation$set(MemorySegment seg, long index, boolean x) {
        RprVHACDParameters.convex_hull_approximation$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle max_convex_hulls$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("max_convex_hulls"));
    public static VarHandle max_convex_hulls$VH() {
        return RprVHACDParameters.max_convex_hulls$VH;
    }
    public static int max_convex_hulls$get(MemorySegment seg) {
        return (int)RprVHACDParameters.max_convex_hulls$VH.get(seg);
    }
    public static void max_convex_hulls$set( MemorySegment seg, int x) {
        RprVHACDParameters.max_convex_hulls$VH.set(seg, x);
    }
    public static int max_convex_hulls$get(MemorySegment seg, long index) {
        return (int)RprVHACDParameters.max_convex_hulls$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void max_convex_hulls$set(MemorySegment seg, long index, int x) {
        RprVHACDParameters.max_convex_hulls$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


