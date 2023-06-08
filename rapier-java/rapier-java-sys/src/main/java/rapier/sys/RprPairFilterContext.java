// Generated by jextract

package rapier.sys;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class RprPairFilterContext {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("bodies"),
        Constants$root.C_POINTER$LAYOUT.withName("colliders"),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("collider1"),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("collider2"),
        Constants$root.C_BOOL$LAYOUT.withName("has_rigid_body1"),
        MemoryLayout.paddingLayout(24),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("rigid_body1"),
        Constants$root.C_BOOL$LAYOUT.withName("has_rigid_body2"),
        MemoryLayout.paddingLayout(24),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("rigid_body2")
    ).withName("RprPairFilterContext");
    public static MemoryLayout $LAYOUT() {
        return RprPairFilterContext.$struct$LAYOUT;
    }
    static final VarHandle bodies$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bodies"));
    public static VarHandle bodies$VH() {
        return RprPairFilterContext.bodies$VH;
    }
    public static MemoryAddress bodies$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)RprPairFilterContext.bodies$VH.get(seg);
    }
    public static void bodies$set( MemorySegment seg, MemoryAddress x) {
        RprPairFilterContext.bodies$VH.set(seg, x);
    }
    public static MemoryAddress bodies$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)RprPairFilterContext.bodies$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bodies$set(MemorySegment seg, long index, MemoryAddress x) {
        RprPairFilterContext.bodies$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle colliders$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("colliders"));
    public static VarHandle colliders$VH() {
        return RprPairFilterContext.colliders$VH;
    }
    public static MemoryAddress colliders$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)RprPairFilterContext.colliders$VH.get(seg);
    }
    public static void colliders$set( MemorySegment seg, MemoryAddress x) {
        RprPairFilterContext.colliders$VH.set(seg, x);
    }
    public static MemoryAddress colliders$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)RprPairFilterContext.colliders$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void colliders$set(MemorySegment seg, long index, MemoryAddress x) {
        RprPairFilterContext.colliders$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment collider1$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    public static MemorySegment collider2$slice(MemorySegment seg) {
        return seg.asSlice(24, 8);
    }
    static final VarHandle has_rigid_body1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("has_rigid_body1"));
    public static VarHandle has_rigid_body1$VH() {
        return RprPairFilterContext.has_rigid_body1$VH;
    }
    public static boolean has_rigid_body1$get(MemorySegment seg) {
        return (boolean)RprPairFilterContext.has_rigid_body1$VH.get(seg);
    }
    public static void has_rigid_body1$set( MemorySegment seg, boolean x) {
        RprPairFilterContext.has_rigid_body1$VH.set(seg, x);
    }
    public static boolean has_rigid_body1$get(MemorySegment seg, long index) {
        return (boolean)RprPairFilterContext.has_rigid_body1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void has_rigid_body1$set(MemorySegment seg, long index, boolean x) {
        RprPairFilterContext.has_rigid_body1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment rigid_body1$slice(MemorySegment seg) {
        return seg.asSlice(36, 8);
    }
    static final VarHandle has_rigid_body2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("has_rigid_body2"));
    public static VarHandle has_rigid_body2$VH() {
        return RprPairFilterContext.has_rigid_body2$VH;
    }
    public static boolean has_rigid_body2$get(MemorySegment seg) {
        return (boolean)RprPairFilterContext.has_rigid_body2$VH.get(seg);
    }
    public static void has_rigid_body2$set( MemorySegment seg, boolean x) {
        RprPairFilterContext.has_rigid_body2$VH.set(seg, x);
    }
    public static boolean has_rigid_body2$get(MemorySegment seg, long index) {
        return (boolean)RprPairFilterContext.has_rigid_body2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void has_rigid_body2$set(MemorySegment seg, long index, boolean x) {
        RprPairFilterContext.has_rigid_body2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment rigid_body2$slice(MemorySegment seg) {
        return seg.asSlice(48, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


