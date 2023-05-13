// Generated by jextract

package rapier.sys_dim2_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct RprIso {
 *     struct RprRot rotation;
 *     struct RprVec translation;
 * };
 * }
 */
public class RprIso {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(2, Constants$root.C_DOUBLE$LAYOUT).withName("_0")
        ).withName("rotation"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(2, Constants$root.C_DOUBLE$LAYOUT).withName("_0")
        ).withName("translation")
    ).withName("RprIso");
    public static MemoryLayout $LAYOUT() {
        return RprIso.$struct$LAYOUT;
    }
    public static MemorySegment rotation$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static MemorySegment translation$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


