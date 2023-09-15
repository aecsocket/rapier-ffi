// Generated by jextract

package rapier.sys_dim2_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct FloodFill_Body {
 *     _Bool detect_cavities;
 *     _Bool detect_self_intersections;
 * };
 * }
 */
public class FloodFill_Body {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_BOOL$LAYOUT.withName("detect_cavities"),
        Constants$root.C_BOOL$LAYOUT.withName("detect_self_intersections")
    ).withName("FloodFill_Body");
    public static MemoryLayout $LAYOUT() {
        return FloodFill_Body.$struct$LAYOUT;
    }
    static final VarHandle detect_cavities$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("detect_cavities"));
    public static VarHandle detect_cavities$VH() {
        return FloodFill_Body.detect_cavities$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * _Bool detect_cavities;
     * }
     */
    public static boolean detect_cavities$get(MemorySegment seg) {
        return (boolean)FloodFill_Body.detect_cavities$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * _Bool detect_cavities;
     * }
     */
    public static void detect_cavities$set(MemorySegment seg, boolean x) {
        FloodFill_Body.detect_cavities$VH.set(seg, x);
    }
    public static boolean detect_cavities$get(MemorySegment seg, long index) {
        return (boolean)FloodFill_Body.detect_cavities$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void detect_cavities$set(MemorySegment seg, long index, boolean x) {
        FloodFill_Body.detect_cavities$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle detect_self_intersections$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("detect_self_intersections"));
    public static VarHandle detect_self_intersections$VH() {
        return FloodFill_Body.detect_self_intersections$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * _Bool detect_self_intersections;
     * }
     */
    public static boolean detect_self_intersections$get(MemorySegment seg) {
        return (boolean)FloodFill_Body.detect_self_intersections$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * _Bool detect_self_intersections;
     * }
     */
    public static void detect_self_intersections$set(MemorySegment seg, boolean x) {
        FloodFill_Body.detect_self_intersections$VH.set(seg, x);
    }
    public static boolean detect_self_intersections$get(MemorySegment seg, long index) {
        return (boolean)FloodFill_Body.detect_self_intersections$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void detect_self_intersections$set(MemorySegment seg, long index, boolean x) {
        FloodFill_Body.detect_self_intersections$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


