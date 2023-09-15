// Generated by jextract

package rapier.sys_dim3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct RprComplexPointProject {
 *     struct RprArenaKey collider;
 *     _Bool is_inside;
 *     struct RprVector point;
 *     struct RprFeatureId feature;
 * };
 * }
 */
public class RprComplexPointProject {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("collider"),
        Constants$root.C_BOOL$LAYOUT.withName("is_inside"),
        MemoryLayout.paddingLayout(24),
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y"),
            Constants$root.C_FLOAT$LAYOUT.withName("z")
        ).withName("point"),
        MemoryLayout.structLayout(
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
            ).withName("union (anonymous at /home/socket/Projects/rapier-ffi/rapier-java/rapier-java-sys/build/librapier.h:1142:3)")
        ).withName("feature")
    ).withName("RprComplexPointProject");
    public static MemoryLayout $LAYOUT() {
        return RprComplexPointProject.$struct$LAYOUT;
    }
    public static MemorySegment collider$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle is_inside$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("is_inside"));
    public static VarHandle is_inside$VH() {
        return RprComplexPointProject.is_inside$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * _Bool is_inside;
     * }
     */
    public static boolean is_inside$get(MemorySegment seg) {
        return (boolean)RprComplexPointProject.is_inside$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * _Bool is_inside;
     * }
     */
    public static void is_inside$set(MemorySegment seg, boolean x) {
        RprComplexPointProject.is_inside$VH.set(seg, x);
    }
    public static boolean is_inside$get(MemorySegment seg, long index) {
        return (boolean)RprComplexPointProject.is_inside$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void is_inside$set(MemorySegment seg, long index, boolean x) {
        RprComplexPointProject.is_inside$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment point$slice(MemorySegment seg) {
        return seg.asSlice(12, 12);
    }
    public static MemorySegment feature$slice(MemorySegment seg) {
        return seg.asSlice(24, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


