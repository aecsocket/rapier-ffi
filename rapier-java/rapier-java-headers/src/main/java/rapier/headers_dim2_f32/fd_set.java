// Generated by jextract

package rapier.headers_dim2_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct fd_set {
 *     long __fds_bits[16];
 * };
 * }
 */
public class fd_set {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(16, Constants$root.C_LONG_LONG$LAYOUT).withName("__fds_bits")
    ).withName("fd_set");
    public static MemoryLayout $LAYOUT() {
        return fd_set.$struct$LAYOUT;
    }
    public static MemorySegment __fds_bits$slice(MemorySegment seg) {
        return seg.asSlice(0, 128);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


