// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class Face_Body {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("id")
    ).withName("Face_Body");
    public static MemoryLayout $LAYOUT() {
        return Face_Body.$struct$LAYOUT;
    }
    static final VarHandle id$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("id"));
    public static VarHandle id$VH() {
        return Face_Body.id$VH;
    }
    public static int id$get(MemorySegment seg) {
        return (int)Face_Body.id$VH.get(seg);
    }
    public static void id$set( MemorySegment seg, int x) {
        Face_Body.id$VH.set(seg, x);
    }
    public static int id$get(MemorySegment seg, long index) {
        return (int)Face_Body.id$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void id$set(MemorySegment seg, long index, int x) {
        Face_Body.id$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


