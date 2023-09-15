// Generated by jextract

package rapier.sys_dim2_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct RprCharacterLength {
 *     enum RprCharacterLength_Tag tag;
 *     union union (anonymous at /home/socket/Projects/rapier-ffi/rapier-java/rapier-java-sys/build/librapier.h:954:3) {
 *         struct struct (anonymous at /home/socket/Projects/rapier-ffi/rapier-java/rapier-java-sys/build/librapier.h:955:5) {
 *             double relative;
 *         };
 *         struct struct (anonymous at /home/socket/Projects/rapier-ffi/rapier-java/rapier-java-sys/build/librapier.h:958:5) {
 *             double absolute;
 *         };
 *     };
 * };
 * }
 */
public class RprCharacterLength {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("tag"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_DOUBLE$LAYOUT.withName("relative")
            ).withName("struct (anonymous at /home/socket/Projects/rapier-ffi/rapier-java/rapier-java-sys/build/librapier.h:955:5)"),
            MemoryLayout.structLayout(
                Constants$root.C_DOUBLE$LAYOUT.withName("absolute")
            ).withName("struct (anonymous at /home/socket/Projects/rapier-ffi/rapier-java/rapier-java-sys/build/librapier.h:958:5)")
        ).withName("union (anonymous at /home/socket/Projects/rapier-ffi/rapier-java/rapier-java-sys/build/librapier.h:954:3)")
    ).withName("RprCharacterLength");
    public static MemoryLayout $LAYOUT() {
        return RprCharacterLength.$struct$LAYOUT;
    }
    static final VarHandle tag$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tag"));
    public static VarHandle tag$VH() {
        return RprCharacterLength.tag$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum RprCharacterLength_Tag tag;
     * }
     */
    public static int tag$get(MemorySegment seg) {
        return (int)RprCharacterLength.tag$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum RprCharacterLength_Tag tag;
     * }
     */
    public static void tag$set(MemorySegment seg, int x) {
        RprCharacterLength.tag$VH.set(seg, x);
    }
    public static int tag$get(MemorySegment seg, long index) {
        return (int)RprCharacterLength.tag$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tag$set(MemorySegment seg, long index, int x) {
        RprCharacterLength.tag$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


