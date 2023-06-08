// Generated by jextract

package rapier.sys_dim2_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class RprSimplePointProject {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("collider"),
        Constants$root.C_BOOL$LAYOUT.withName("is_inside"),
        MemoryLayout.paddingLayout(24),
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y")
        ).withName("point")
    ).withName("RprSimplePointProject");
    public static MemoryLayout $LAYOUT() {
        return RprSimplePointProject.$struct$LAYOUT;
    }
    public static MemorySegment collider$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle is_inside$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("is_inside"));
    public static VarHandle is_inside$VH() {
        return RprSimplePointProject.is_inside$VH;
    }
    public static boolean is_inside$get(MemorySegment seg) {
        return (boolean)RprSimplePointProject.is_inside$VH.get(seg);
    }
    public static void is_inside$set( MemorySegment seg, boolean x) {
        RprSimplePointProject.is_inside$VH.set(seg, x);
    }
    public static boolean is_inside$get(MemorySegment seg, long index) {
        return (boolean)RprSimplePointProject.is_inside$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void is_inside$set(MemorySegment seg, long index, boolean x) {
        RprSimplePointProject.is_inside$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment point$slice(MemorySegment seg) {
        return seg.asSlice(12, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


