// Generated by jextract

package rapier.sys_dim2;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class __pthread_internal_list {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("__prev"),
        Constants$root.C_POINTER$LAYOUT.withName("__next")
    ).withName("__pthread_internal_list");
    public static MemoryLayout $LAYOUT() {
        return __pthread_internal_list.$struct$LAYOUT;
    }
    static final VarHandle __prev$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__prev"));
    public static VarHandle __prev$VH() {
        return __pthread_internal_list.__prev$VH;
    }
    public static MemoryAddress __prev$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)__pthread_internal_list.__prev$VH.get(seg);
    }
    public static void __prev$set( MemorySegment seg, MemoryAddress x) {
        __pthread_internal_list.__prev$VH.set(seg, x);
    }
    public static MemoryAddress __prev$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)__pthread_internal_list.__prev$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __prev$set(MemorySegment seg, long index, MemoryAddress x) {
        __pthread_internal_list.__prev$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __next$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__next"));
    public static VarHandle __next$VH() {
        return __pthread_internal_list.__next$VH;
    }
    public static MemoryAddress __next$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)__pthread_internal_list.__next$VH.get(seg);
    }
    public static void __next$set( MemorySegment seg, MemoryAddress x) {
        __pthread_internal_list.__next$VH.set(seg, x);
    }
    public static MemoryAddress __next$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)__pthread_internal_list.__next$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __next$set(MemorySegment seg, long index, MemoryAddress x) {
        __pthread_internal_list.__next$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


