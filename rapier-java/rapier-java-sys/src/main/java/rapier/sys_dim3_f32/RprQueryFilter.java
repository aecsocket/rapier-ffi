// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class RprQueryFilter {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("flags"),
        Constants$root.C_BOOL$LAYOUT.withName("has_groups"),
        MemoryLayout.paddingLayout(24),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("memberships"),
            Constants$root.C_INT$LAYOUT.withName("filter")
        ).withName("groups"),
        Constants$root.C_BOOL$LAYOUT.withName("has_exclude_collider"),
        MemoryLayout.paddingLayout(24),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("exclude_collider"),
        Constants$root.C_BOOL$LAYOUT.withName("has_exclude_rigid_body"),
        MemoryLayout.paddingLayout(24),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("exclude_rigid_body"),
        Constants$root.C_POINTER$LAYOUT.withName("predicate")
    ).withName("RprQueryFilter");
    public static MemoryLayout $LAYOUT() {
        return RprQueryFilter.$struct$LAYOUT;
    }
    static final VarHandle flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    public static VarHandle flags$VH() {
        return RprQueryFilter.flags$VH;
    }
    public static int flags$get(MemorySegment seg) {
        return (int)RprQueryFilter.flags$VH.get(seg);
    }
    public static void flags$set( MemorySegment seg, int x) {
        RprQueryFilter.flags$VH.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)RprQueryFilter.flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        RprQueryFilter.flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle has_groups$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("has_groups"));
    public static VarHandle has_groups$VH() {
        return RprQueryFilter.has_groups$VH;
    }
    public static boolean has_groups$get(MemorySegment seg) {
        return (boolean)RprQueryFilter.has_groups$VH.get(seg);
    }
    public static void has_groups$set( MemorySegment seg, boolean x) {
        RprQueryFilter.has_groups$VH.set(seg, x);
    }
    public static boolean has_groups$get(MemorySegment seg, long index) {
        return (boolean)RprQueryFilter.has_groups$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void has_groups$set(MemorySegment seg, long index, boolean x) {
        RprQueryFilter.has_groups$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment groups$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    static final VarHandle has_exclude_collider$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("has_exclude_collider"));
    public static VarHandle has_exclude_collider$VH() {
        return RprQueryFilter.has_exclude_collider$VH;
    }
    public static boolean has_exclude_collider$get(MemorySegment seg) {
        return (boolean)RprQueryFilter.has_exclude_collider$VH.get(seg);
    }
    public static void has_exclude_collider$set( MemorySegment seg, boolean x) {
        RprQueryFilter.has_exclude_collider$VH.set(seg, x);
    }
    public static boolean has_exclude_collider$get(MemorySegment seg, long index) {
        return (boolean)RprQueryFilter.has_exclude_collider$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void has_exclude_collider$set(MemorySegment seg, long index, boolean x) {
        RprQueryFilter.has_exclude_collider$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment exclude_collider$slice(MemorySegment seg) {
        return seg.asSlice(20, 8);
    }
    static final VarHandle has_exclude_rigid_body$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("has_exclude_rigid_body"));
    public static VarHandle has_exclude_rigid_body$VH() {
        return RprQueryFilter.has_exclude_rigid_body$VH;
    }
    public static boolean has_exclude_rigid_body$get(MemorySegment seg) {
        return (boolean)RprQueryFilter.has_exclude_rigid_body$VH.get(seg);
    }
    public static void has_exclude_rigid_body$set( MemorySegment seg, boolean x) {
        RprQueryFilter.has_exclude_rigid_body$VH.set(seg, x);
    }
    public static boolean has_exclude_rigid_body$get(MemorySegment seg, long index) {
        return (boolean)RprQueryFilter.has_exclude_rigid_body$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void has_exclude_rigid_body$set(MemorySegment seg, long index, boolean x) {
        RprQueryFilter.has_exclude_rigid_body$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment exclude_rigid_body$slice(MemorySegment seg) {
        return seg.asSlice(32, 8);
    }
    static final FunctionDescriptor predicate$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle predicate$MH = RuntimeHelper.downcallHandle(
        RprQueryFilter.predicate$FUNC
    );
    public interface predicate {

        boolean apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(predicate fi, MemorySession session) {
            return RuntimeHelper.upcallStub(predicate.class, fi, RprQueryFilter.predicate$FUNC, session);
        }
        static predicate ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (boolean)RprQueryFilter.predicate$MH.invokeExact((Addressable)symbol, __x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle predicate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("predicate"));
    public static VarHandle predicate$VH() {
        return RprQueryFilter.predicate$VH;
    }
    public static MemoryAddress predicate$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)RprQueryFilter.predicate$VH.get(seg);
    }
    public static void predicate$set( MemorySegment seg, MemoryAddress x) {
        RprQueryFilter.predicate$VH.set(seg, x);
    }
    public static MemoryAddress predicate$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)RprQueryFilter.predicate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void predicate$set(MemorySegment seg, long index, MemoryAddress x) {
        RprQueryFilter.predicate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static predicate predicate (MemorySegment segment, MemorySession session) {
        return predicate.ofAddress(predicate$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


