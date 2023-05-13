// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct RprCylinder {
 *     float half_height;
 *     float radius;
 * };
 * }
 */
public class RprCylinder {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("half_height"),
        Constants$root.C_FLOAT$LAYOUT.withName("radius")
    ).withName("RprCylinder");
    public static MemoryLayout $LAYOUT() {
        return RprCylinder.$struct$LAYOUT;
    }
    static final VarHandle half_height$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("half_height"));
    public static VarHandle half_height$VH() {
        return RprCylinder.half_height$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * float half_height;
     * }
     */
    public static float half_height$get(MemorySegment seg) {
        return (float)RprCylinder.half_height$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * float half_height;
     * }
     */
    public static void half_height$set(MemorySegment seg, float x) {
        RprCylinder.half_height$VH.set(seg, x);
    }
    public static float half_height$get(MemorySegment seg, long index) {
        return (float)RprCylinder.half_height$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void half_height$set(MemorySegment seg, long index, float x) {
        RprCylinder.half_height$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle radius$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("radius"));
    public static VarHandle radius$VH() {
        return RprCylinder.radius$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * float radius;
     * }
     */
    public static float radius$get(MemorySegment seg) {
        return (float)RprCylinder.radius$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * float radius;
     * }
     */
    public static void radius$set(MemorySegment seg, float x) {
        RprCylinder.radius$VH.set(seg, x);
    }
    public static float radius$get(MemorySegment seg, long index) {
        return (float)RprCylinder.radius$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void radius$set(MemorySegment seg, long index, float x) {
        RprCylinder.radius$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


