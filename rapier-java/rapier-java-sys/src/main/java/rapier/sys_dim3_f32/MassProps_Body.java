// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct MassProps_Body {
 *     struct RprMassProperties props;
 * };
 * }
 */
public class MassProps_Body {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("x"),
                Constants$root.C_FLOAT$LAYOUT.withName("y"),
                Constants$root.C_FLOAT$LAYOUT.withName("z")
            ).withName("local_com"),
            Constants$root.C_FLOAT$LAYOUT.withName("inv_mass"),
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("x"),
                Constants$root.C_FLOAT$LAYOUT.withName("y"),
                Constants$root.C_FLOAT$LAYOUT.withName("z")
            ).withName("inv_principal_inertia_sqrt"),
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("x"),
                Constants$root.C_FLOAT$LAYOUT.withName("y"),
                Constants$root.C_FLOAT$LAYOUT.withName("z"),
                Constants$root.C_FLOAT$LAYOUT.withName("w")
            ).withName("principal_inertia_local_frame")
        ).withName("props")
    ).withName("MassProps_Body");
    public static MemoryLayout $LAYOUT() {
        return MassProps_Body.$struct$LAYOUT;
    }
    public static MemorySegment props$slice(MemorySegment seg) {
        return seg.asSlice(0, 44);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


