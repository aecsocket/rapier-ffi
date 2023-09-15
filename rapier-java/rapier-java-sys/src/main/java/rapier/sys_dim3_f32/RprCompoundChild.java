// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct RprCompoundChild {
 *     struct RprIsometry delta;
 *     struct RprSharedShape* shape;
 * };
 * }
 */
public class RprCompoundChild {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("x"),
                Constants$root.C_FLOAT$LAYOUT.withName("y"),
                Constants$root.C_FLOAT$LAYOUT.withName("z"),
                Constants$root.C_FLOAT$LAYOUT.withName("w")
            ).withName("rotation"),
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("x"),
                Constants$root.C_FLOAT$LAYOUT.withName("y"),
                Constants$root.C_FLOAT$LAYOUT.withName("z")
            ).withName("translation")
        ).withName("delta"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("shape")
    ).withName("RprCompoundChild");
    public static MemoryLayout $LAYOUT() {
        return RprCompoundChild.$struct$LAYOUT;
    }
    public static MemorySegment delta$slice(MemorySegment seg) {
        return seg.asSlice(0, 28);
    }
    static final VarHandle shape$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("shape"));
    public static VarHandle shape$VH() {
        return RprCompoundChild.shape$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct RprSharedShape* shape;
     * }
     */
    public static MemorySegment shape$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)RprCompoundChild.shape$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct RprSharedShape* shape;
     * }
     */
    public static void shape$set(MemorySegment seg, MemorySegment x) {
        RprCompoundChild.shape$VH.set(seg, x);
    }
    public static MemorySegment shape$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)RprCompoundChild.shape$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void shape$set(MemorySegment seg, long index, MemorySegment x) {
        RprCompoundChild.shape$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


