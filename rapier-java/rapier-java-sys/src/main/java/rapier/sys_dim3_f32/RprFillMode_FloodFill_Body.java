// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class RprFillMode_FloodFill_Body {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_BOOL$LAYOUT.withName("detect_cavities")
    ).withName("RprFillMode_FloodFill_Body");
    public static MemoryLayout $LAYOUT() {
        return RprFillMode_FloodFill_Body.$struct$LAYOUT;
    }
    static final VarHandle detect_cavities$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("detect_cavities"));
    public static VarHandle detect_cavities$VH() {
        return RprFillMode_FloodFill_Body.detect_cavities$VH;
    }
    public static boolean detect_cavities$get(MemorySegment seg) {
        return (boolean)RprFillMode_FloodFill_Body.detect_cavities$VH.get(seg);
    }
    public static void detect_cavities$set( MemorySegment seg, boolean x) {
        RprFillMode_FloodFill_Body.detect_cavities$VH.set(seg, x);
    }
    public static boolean detect_cavities$get(MemorySegment seg, long index) {
        return (boolean)RprFillMode_FloodFill_Body.detect_cavities$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void detect_cavities$set(MemorySegment seg, long index, boolean x) {
        RprFillMode_FloodFill_Body.detect_cavities$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


