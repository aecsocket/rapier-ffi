// Generated by jextract

package rapier.sys_dim3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct RprInteractionGroups {
 *     unsigned int memberships;
 *     unsigned int filter;
 * };
 * }
 */
public class RprInteractionGroups {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("memberships"),
        Constants$root.C_INT$LAYOUT.withName("filter")
    ).withName("RprInteractionGroups");
    public static MemoryLayout $LAYOUT() {
        return RprInteractionGroups.$struct$LAYOUT;
    }
    static final VarHandle memberships$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("memberships"));
    public static VarHandle memberships$VH() {
        return RprInteractionGroups.memberships$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int memberships;
     * }
     */
    public static int memberships$get(MemorySegment seg) {
        return (int)RprInteractionGroups.memberships$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int memberships;
     * }
     */
    public static void memberships$set(MemorySegment seg, int x) {
        RprInteractionGroups.memberships$VH.set(seg, x);
    }
    public static int memberships$get(MemorySegment seg, long index) {
        return (int)RprInteractionGroups.memberships$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void memberships$set(MemorySegment seg, long index, int x) {
        RprInteractionGroups.memberships$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle filter$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("filter"));
    public static VarHandle filter$VH() {
        return RprInteractionGroups.filter$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int filter;
     * }
     */
    public static int filter$get(MemorySegment seg) {
        return (int)RprInteractionGroups.filter$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int filter;
     * }
     */
    public static void filter$set(MemorySegment seg, int x) {
        RprInteractionGroups.filter$VH.set(seg, x);
    }
    public static int filter$get(MemorySegment seg, long index) {
        return (int)RprInteractionGroups.filter$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void filter$set(MemorySegment seg, long index, int x) {
        RprInteractionGroups.filter$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


