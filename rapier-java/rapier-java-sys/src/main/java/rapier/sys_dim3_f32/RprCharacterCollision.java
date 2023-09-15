// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct RprCharacterCollision {
 *     struct RprArenaKey handle;
 *     struct RprIsometry character_pos;
 *     struct RprVector translation_applied;
 *     struct RprVector translation_remaining;
 *     struct RprTOI toi;
 * };
 * }
 */
public class RprCharacterCollision {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("handle"),
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
        ).withName("character_pos"),
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y"),
            Constants$root.C_FLOAT$LAYOUT.withName("z")
        ).withName("translation_applied"),
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y"),
            Constants$root.C_FLOAT$LAYOUT.withName("z")
        ).withName("translation_remaining"),
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("toi"),
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("x"),
                Constants$root.C_FLOAT$LAYOUT.withName("y"),
                Constants$root.C_FLOAT$LAYOUT.withName("z")
            ).withName("witness1"),
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("x"),
                Constants$root.C_FLOAT$LAYOUT.withName("y"),
                Constants$root.C_FLOAT$LAYOUT.withName("z")
            ).withName("witness2"),
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("x"),
                Constants$root.C_FLOAT$LAYOUT.withName("y"),
                Constants$root.C_FLOAT$LAYOUT.withName("z")
            ).withName("normal1"),
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("x"),
                Constants$root.C_FLOAT$LAYOUT.withName("y"),
                Constants$root.C_FLOAT$LAYOUT.withName("z")
            ).withName("normal2"),
            Constants$root.C_INT$LAYOUT.withName("status")
        ).withName("toi")
    ).withName("RprCharacterCollision");
    public static MemoryLayout $LAYOUT() {
        return RprCharacterCollision.$struct$LAYOUT;
    }
    public static MemorySegment handle$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment character_pos$slice(MemorySegment seg) {
        return seg.asSlice(8, 28);
    }
    public static MemorySegment translation_applied$slice(MemorySegment seg) {
        return seg.asSlice(36, 12);
    }
    public static MemorySegment translation_remaining$slice(MemorySegment seg) {
        return seg.asSlice(48, 12);
    }
    public static MemorySegment toi$slice(MemorySegment seg) {
        return seg.asSlice(60, 56);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


