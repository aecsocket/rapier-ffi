// Generated by jextract

package rapier.sys_dim2_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class RprCharacterAutostep {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("tag"),
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_FLOAT$LAYOUT.withName("relative")
                ).withName("$anon$0"),
                MemoryLayout.structLayout(
                    Constants$root.C_FLOAT$LAYOUT.withName("absolute")
                ).withName("$anon$1")
            ).withName("$anon$0")
        ).withName("max_height"),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("tag"),
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_FLOAT$LAYOUT.withName("relative")
                ).withName("$anon$0"),
                MemoryLayout.structLayout(
                    Constants$root.C_FLOAT$LAYOUT.withName("absolute")
                ).withName("$anon$1")
            ).withName("$anon$0")
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
    public static boolean include_dynamic_bodies$get(MemorySegment seg) {
        return (boolean)RprCharacterAutostep.include_dynamic_bodies$VH.get(seg);
    }
    public static void include_dynamic_bodies$set( MemorySegment seg, boolean x) {
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
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


