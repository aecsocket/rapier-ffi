// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class RprFeatureId {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
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
    ).withName("RprFeatureId");
    public static MemoryLayout $LAYOUT() {
        return RprFeatureId.$struct$LAYOUT;
    }
    static final VarHandle tag$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tag"));
    public static VarHandle tag$VH() {
        return RprFeatureId.tag$VH;
    }
    public static int tag$get(MemorySegment seg) {
        return (int)RprFeatureId.tag$VH.get(seg);
    }
    public static void tag$set( MemorySegment seg, int x) {
        RprFeatureId.tag$VH.set(seg, x);
    }
    public static int tag$get(MemorySegment seg, long index) {
        return (int)RprFeatureId.tag$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tag$set(MemorySegment seg, long index, int x) {
        RprFeatureId.tag$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment vertex$slice(MemorySegment seg) {
        return seg.asSlice(4, 4);
    }
    public static MemorySegment edge$slice(MemorySegment seg) {
        return seg.asSlice(4, 4);
    }
    public static MemorySegment face$slice(MemorySegment seg) {
        return seg.asSlice(4, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


