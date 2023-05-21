// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class pthread_mutex_t {

    static final  GroupLayout $union$LAYOUT = MemoryLayout.unionLayout(
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("__lock"),
            Constants$root.C_INT$LAYOUT.withName("__count"),
            Constants$root.C_INT$LAYOUT.withName("__owner"),
            Constants$root.C_INT$LAYOUT.withName("__nusers"),
            Constants$root.C_INT$LAYOUT.withName("__kind"),
            Constants$root.C_SHORT$LAYOUT.withName("__spins"),
            Constants$root.C_SHORT$LAYOUT.withName("__elision"),
            MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("__prev"),
                Constants$root.C_POINTER$LAYOUT.withName("__next")
            ).withName("__list")
        ).withName("__data"),
        MemoryLayout.sequenceLayout(40, Constants$root.C_CHAR$LAYOUT).withName("__size"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("__align")
    );
    public static MemoryLayout $LAYOUT() {
        return pthread_mutex_t.$union$LAYOUT;
    }
    public static MemorySegment __data$slice(MemorySegment seg) {
        return seg.asSlice(0, 40);
    }
    public static MemorySegment __size$slice(MemorySegment seg) {
        return seg.asSlice(0, 40);
    }
    static final VarHandle __align$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__align"));
    public static VarHandle __align$VH() {
        return pthread_mutex_t.__align$VH;
    }
    public static long __align$get(MemorySegment seg) {
        return (long)pthread_mutex_t.__align$VH.get(seg);
    }
    public static void __align$set( MemorySegment seg, long x) {
        pthread_mutex_t.__align$VH.set(seg, x);
    }
    public static long __align$get(MemorySegment seg, long index) {
        return (long)pthread_mutex_t.__align$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __align$set(MemorySegment seg, long index, long x) {
        pthread_mutex_t.__align$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


