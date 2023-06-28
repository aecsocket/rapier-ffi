// Generated by jextract

package rapier.sys;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class RprMassProperties {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y")
        ).withName("local_com"),
        Constants$root.C_FLOAT$LAYOUT.withName("inv_mass"),
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x")
        ).withName("inv_principal_inertia_sqrt")
    ).withName("RprMassProperties");
    public static MemoryLayout $LAYOUT() {
        return RprMassProperties.$struct$LAYOUT;
    }
    public static MemorySegment local_com$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle inv_mass$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("inv_mass"));
    public static VarHandle inv_mass$VH() {
        return RprMassProperties.inv_mass$VH;
    }
    public static float inv_mass$get(MemorySegment seg) {
        return (float)RprMassProperties.inv_mass$VH.get(seg);
    }
    public static void inv_mass$set( MemorySegment seg, float x) {
        RprMassProperties.inv_mass$VH.set(seg, x);
    }
    public static float inv_mass$get(MemorySegment seg, long index) {
        return (float)RprMassProperties.inv_mass$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void inv_mass$set(MemorySegment seg, long index, float x) {
        RprMassProperties.inv_mass$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment inv_principal_inertia_sqrt$slice(MemorySegment seg) {
        return seg.asSlice(12, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

