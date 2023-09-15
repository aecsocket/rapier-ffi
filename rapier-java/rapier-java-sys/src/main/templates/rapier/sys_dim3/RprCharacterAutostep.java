// Generated by jextract

package rapier.sys_dim3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct RprCharacterAutostep {
 *     struct RprCharacterLength max_height;
 *     struct RprCharacterLength min_width;
 *     _Bool include_dynamic_bodies;
 * };
 * }
 */
public class RprCharacterAutostep {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("tag"),
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_FLOAT$LAYOUT.withName("relative")
                ).withName("struct (anonymous at /home/socket/Projects/rapier-ffi/rapier-java/rapier-java-sys/build/librapier.h:955:5)"),
                MemoryLayout.structLayout(
                    Constants$root.C_FLOAT$LAYOUT.withName("absolute")
                ).withName("struct (anonymous at /home/socket/Projects/rapier-ffi/rapier-java/rapier-java-sys/build/librapier.h:958:5)")
            ).withName("union (anonymous at /home/socket/Projects/rapier-ffi/rapier-java/rapier-java-sys/build/librapier.h:954:3)")
        ).withName("max_height"),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("tag"),
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_FLOAT$LAYOUT.withName("relative")
                ).withName("struct (anonymous at /home/socket/Projects/rapier-ffi/rapier-java/rapier-java-sys/build/librapier.h:955:5)"),
                MemoryLayout.structLayout(
                    Constants$root.C_FLOAT$LAYOUT.withName("absolute")
                ).withName("struct (anonymous at /home/socket/Projects/rapier-ffi/rapier-java/rapier-java-sys/build/librapier.h:958:5)")
            ).withName("union (anonymous at /home/socket/Projects/rapier-ffi/rapier-java/rapier-java-sys/build/librapier.h:954:3)")
        ).withName("min_width"),
        Constants$root.C_BOOL$LAYOUT.withName("include_dynamic_bodies"),
        MemoryLayout.paddingLayout(24)
    ).withName("RprCharacterAutostep");
    public static MemoryLayout $LAYOUT() {
        return RprCharacterAutostep.$struct$LAYOUT;
    }
    public static MemorySegment max_height$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment min_width$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    static final VarHandle include_dynamic_bodies$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("include_dynamic_bodies"));
    public static VarHandle include_dynamic_bodies$VH() {
        return RprCharacterAutostep.include_dynamic_bodies$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * _Bool include_dynamic_bodies;
     * }
     */
    public static boolean include_dynamic_bodies$get(MemorySegment seg) {
        return (boolean)RprCharacterAutostep.include_dynamic_bodies$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * _Bool include_dynamic_bodies;
     * }
     */
    public static void include_dynamic_bodies$set(MemorySegment seg, boolean x) {
        RprCharacterAutostep.include_dynamic_bodies$VH.set(seg, x);
    }
    public static boolean include_dynamic_bodies$get(MemorySegment seg, long index) {
        return (boolean)RprCharacterAutostep.include_dynamic_bodies$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void include_dynamic_bodies$set(MemorySegment seg, long index, boolean x) {
        RprCharacterAutostep.include_dynamic_bodies$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


