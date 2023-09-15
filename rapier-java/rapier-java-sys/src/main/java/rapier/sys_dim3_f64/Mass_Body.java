// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct Mass_Body {
 *     double mass;
 * };
 * }
 */
public class Mass_Body {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("mass")
    ).withName("Mass_Body");
    public static MemoryLayout $LAYOUT() {
        return Mass_Body.$struct$LAYOUT;
    }
    static final VarHandle mass$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mass"));
    public static VarHandle mass$VH() {
        return Mass_Body.mass$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double mass;
     * }
     */
    public static double mass$get(MemorySegment seg) {
        return (double)Mass_Body.mass$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double mass;
     * }
     */
    public static void mass$set(MemorySegment seg, double x) {
        Mass_Body.mass$VH.set(seg, x);
    }
    public static double mass$get(MemorySegment seg, long index) {
        return (double)Mass_Body.mass$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mass$set(MemorySegment seg, long index, double x) {
        Mass_Body.mass$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


