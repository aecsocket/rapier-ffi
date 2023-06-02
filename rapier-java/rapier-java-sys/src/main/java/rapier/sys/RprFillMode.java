// Generated by jextract

package rapier.sys;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class RprFillMode {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("tag"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_BOOL$LAYOUT.withName("detect_cavities"),
                Constants$root.C_BOOL$LAYOUT.withName("detect_self_intersections")
            ).withName("flood_fill")
        ).withName("$anon$0"),
        MemoryLayout.paddingLayout(16)
    ).withName("RprFillMode");
    public static MemoryLayout $LAYOUT() {
        return RprFillMode.$struct$LAYOUT;
    }
    static final VarHandle tag$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tag"));
    public static VarHandle tag$VH() {
        return RprFillMode.tag$VH;
    }
    public static int tag$get(MemorySegment seg) {
        return (int)RprFillMode.tag$VH.get(seg);
    }
    public static void tag$set( MemorySegment seg, int x) {
        RprFillMode.tag$VH.set(seg, x);
    }
    public static int tag$get(MemorySegment seg, long index) {
        return (int)RprFillMode.tag$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tag$set(MemorySegment seg, long index, int x) {
        RprFillMode.tag$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment flood_fill$slice(MemorySegment seg) {
        return seg.asSlice(4, 2);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


