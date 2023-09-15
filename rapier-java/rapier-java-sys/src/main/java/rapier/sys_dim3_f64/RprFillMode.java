// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct RprFillMode {
 *     enum RprFillMode_Tag tag;
 *     union union (anonymous at /home/socket/Projects/rapier-ffi/rapier-java/rapier-java-sys/build/librapier.h:1334:3) {
 *         struct FloodFill_Body flood_fill;
 *     };
 * };
 * }
 */
public class RprFillMode {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("tag"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_BOOL$LAYOUT.withName("detect_cavities")
            ).withName("flood_fill")
        ).withName("union (anonymous at /home/socket/Projects/rapier-ffi/rapier-java/rapier-java-sys/build/librapier.h:1334:3)"),
        MemoryLayout.paddingLayout(24)
    ).withName("RprFillMode");
    public static MemoryLayout $LAYOUT() {
        return RprFillMode.$struct$LAYOUT;
    }
    static final VarHandle tag$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tag"));
    public static VarHandle tag$VH() {
        return RprFillMode.tag$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum RprFillMode_Tag tag;
     * }
     */
    public static int tag$get(MemorySegment seg) {
        return (int)RprFillMode.tag$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum RprFillMode_Tag tag;
     * }
     */
    public static void tag$set(MemorySegment seg, int x) {
        RprFillMode.tag$VH.set(seg, x);
    }
    public static int tag$get(MemorySegment seg, long index) {
        return (int)RprFillMode.tag$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tag$set(MemorySegment seg, long index, int x) {
        RprFillMode.tag$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


