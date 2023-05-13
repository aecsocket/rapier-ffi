// Generated by jextract

package rapier.sys;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct RprVector {
 *     float _0[2];
 * };
 * }
 */
public class RprVector {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(2, Constants$root.C_FLOAT$LAYOUT).withName("_0")
    ).withName("RprVector");
    public static MemoryLayout $LAYOUT() {
        return RprVector.$struct$LAYOUT;
    }
    public static MemorySegment _0$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


