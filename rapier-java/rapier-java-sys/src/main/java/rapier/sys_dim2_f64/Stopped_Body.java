// Generated by jextract

package rapier.sys_dim2_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct Stopped_Body {
 *     struct RprArenaKey coll1;
 *     struct RprArenaKey coll2;
 *     unsigned int flags;
 * };
 * }
 */
public class Stopped_Body {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("coll1"),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("coll2"),
        Constants$root.C_INT$LAYOUT.withName("flags")
    ).withName("Stopped_Body");
    public static MemoryLayout $LAYOUT() {
        return Stopped_Body.$struct$LAYOUT;
    }
    public static MemorySegment coll1$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment coll2$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    static final VarHandle flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    public static VarHandle flags$VH() {
        return Stopped_Body.flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)Stopped_Body.flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        Stopped_Body.flags$VH.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)Stopped_Body.flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        Stopped_Body.flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


