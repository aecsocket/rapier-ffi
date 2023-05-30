// Generated by jextract

package rapier.sys_dim2_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class RprColliderMaterial {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("friction"),
        Constants$root.C_FLOAT$LAYOUT.withName("restitution"),
        Constants$root.C_INT$LAYOUT.withName("friction_combine_rule"),
        Constants$root.C_INT$LAYOUT.withName("restitution_combine_rule")
    ).withName("RprColliderMaterial");
    public static MemoryLayout $LAYOUT() {
        return RprColliderMaterial.$struct$LAYOUT;
    }
    static final VarHandle friction$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("friction"));
    public static VarHandle friction$VH() {
        return RprColliderMaterial.friction$VH;
    }
    public static float friction$get(MemorySegment seg) {
        return (float)RprColliderMaterial.friction$VH.get(seg);
    }
    public static void friction$set( MemorySegment seg, float x) {
        RprColliderMaterial.friction$VH.set(seg, x);
    }
    public static float friction$get(MemorySegment seg, long index) {
        return (float)RprColliderMaterial.friction$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void friction$set(MemorySegment seg, long index, float x) {
        RprColliderMaterial.friction$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle restitution$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("restitution"));
    public static VarHandle restitution$VH() {
        return RprColliderMaterial.restitution$VH;
    }
    public static float restitution$get(MemorySegment seg) {
        return (float)RprColliderMaterial.restitution$VH.get(seg);
    }
    public static void restitution$set( MemorySegment seg, float x) {
        RprColliderMaterial.restitution$VH.set(seg, x);
    }
    public static float restitution$get(MemorySegment seg, long index) {
        return (float)RprColliderMaterial.restitution$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void restitution$set(MemorySegment seg, long index, float x) {
        RprColliderMaterial.restitution$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle friction_combine_rule$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("friction_combine_rule"));
    public static VarHandle friction_combine_rule$VH() {
        return RprColliderMaterial.friction_combine_rule$VH;
    }
    public static int friction_combine_rule$get(MemorySegment seg) {
        return (int)RprColliderMaterial.friction_combine_rule$VH.get(seg);
    }
    public static void friction_combine_rule$set( MemorySegment seg, int x) {
        RprColliderMaterial.friction_combine_rule$VH.set(seg, x);
    }
    public static int friction_combine_rule$get(MemorySegment seg, long index) {
        return (int)RprColliderMaterial.friction_combine_rule$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void friction_combine_rule$set(MemorySegment seg, long index, int x) {
        RprColliderMaterial.friction_combine_rule$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle restitution_combine_rule$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("restitution_combine_rule"));
    public static VarHandle restitution_combine_rule$VH() {
        return RprColliderMaterial.restitution_combine_rule$VH;
    }
    public static int restitution_combine_rule$get(MemorySegment seg) {
        return (int)RprColliderMaterial.restitution_combine_rule$VH.get(seg);
    }
    public static void restitution_combine_rule$set( MemorySegment seg, int x) {
        RprColliderMaterial.restitution_combine_rule$VH.set(seg, x);
    }
    public static int restitution_combine_rule$get(MemorySegment seg, long index) {
        return (int)RprColliderMaterial.restitution_combine_rule$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void restitution_combine_rule$set(MemorySegment seg, long index, int x) {
        RprColliderMaterial.restitution_combine_rule$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


