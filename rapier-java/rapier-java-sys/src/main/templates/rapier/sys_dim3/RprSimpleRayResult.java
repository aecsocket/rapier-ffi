// Generated by jextract

package rapier.sys_dim3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class RprSimpleRayResult {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("collider"),
        Constants$root.C_FLOAT$LAYOUT.withName("toi")
    ).withName("RprSimpleRayResult");
    public static MemoryLayout $LAYOUT() {
        return RprSimpleRayResult.$struct$LAYOUT;
    }
    public static MemorySegment collider$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle toi$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("toi"));
    public static VarHandle toi$VH() {
        return RprSimpleRayResult.toi$VH;
    }
    public static float toi$get(MemorySegment seg) {
        return (float)RprSimpleRayResult.toi$VH.get(seg);
    }
    public static void toi$set( MemorySegment seg, float x) {
        RprSimpleRayResult.toi$VH.set(seg, x);
    }
    public static float toi$get(MemorySegment seg, long index) {
        return (float)RprSimpleRayResult.toi$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void toi$set(MemorySegment seg, long index, float x) {
        RprSimpleRayResult.toi$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


