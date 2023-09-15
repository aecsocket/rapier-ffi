// Generated by jextract

package rapier.sys;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct __pthread_mutex_s {
 *     int __lock;
 *     unsigned int __count;
 *     int __owner;
 *     unsigned int __nusers;
 *     int __kind;
 *     short __spins;
 *     short __elision;
 *     struct __pthread_internal_list __list;
 * };
 * }
 */
public class __pthread_mutex_s {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
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
    ).withName("__pthread_mutex_s");
    public static MemoryLayout $LAYOUT() {
        return __pthread_mutex_s.$struct$LAYOUT;
    }
    static final VarHandle __lock$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__lock"));
    public static VarHandle __lock$VH() {
        return __pthread_mutex_s.__lock$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int __lock;
     * }
     */
    public static int __lock$get(MemorySegment seg) {
        return (int)__pthread_mutex_s.__lock$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int __lock;
     * }
     */
    public static void __lock$set(MemorySegment seg, int x) {
        __pthread_mutex_s.__lock$VH.set(seg, x);
    }
    public static int __lock$get(MemorySegment seg, long index) {
        return (int)__pthread_mutex_s.__lock$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __lock$set(MemorySegment seg, long index, int x) {
        __pthread_mutex_s.__lock$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __count$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__count"));
    public static VarHandle __count$VH() {
        return __pthread_mutex_s.__count$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int __count;
     * }
     */
    public static int __count$get(MemorySegment seg) {
        return (int)__pthread_mutex_s.__count$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int __count;
     * }
     */
    public static void __count$set(MemorySegment seg, int x) {
        __pthread_mutex_s.__count$VH.set(seg, x);
    }
    public static int __count$get(MemorySegment seg, long index) {
        return (int)__pthread_mutex_s.__count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __count$set(MemorySegment seg, long index, int x) {
        __pthread_mutex_s.__count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __owner$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__owner"));
    public static VarHandle __owner$VH() {
        return __pthread_mutex_s.__owner$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int __owner;
     * }
     */
    public static int __owner$get(MemorySegment seg) {
        return (int)__pthread_mutex_s.__owner$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int __owner;
     * }
     */
    public static void __owner$set(MemorySegment seg, int x) {
        __pthread_mutex_s.__owner$VH.set(seg, x);
    }
    public static int __owner$get(MemorySegment seg, long index) {
        return (int)__pthread_mutex_s.__owner$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __owner$set(MemorySegment seg, long index, int x) {
        __pthread_mutex_s.__owner$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __nusers$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__nusers"));
    public static VarHandle __nusers$VH() {
        return __pthread_mutex_s.__nusers$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int __nusers;
     * }
     */
    public static int __nusers$get(MemorySegment seg) {
        return (int)__pthread_mutex_s.__nusers$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int __nusers;
     * }
     */
    public static void __nusers$set(MemorySegment seg, int x) {
        __pthread_mutex_s.__nusers$VH.set(seg, x);
    }
    public static int __nusers$get(MemorySegment seg, long index) {
        return (int)__pthread_mutex_s.__nusers$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __nusers$set(MemorySegment seg, long index, int x) {
        __pthread_mutex_s.__nusers$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __kind$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__kind"));
    public static VarHandle __kind$VH() {
        return __pthread_mutex_s.__kind$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int __kind;
     * }
     */
    public static int __kind$get(MemorySegment seg) {
        return (int)__pthread_mutex_s.__kind$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int __kind;
     * }
     */
    public static void __kind$set(MemorySegment seg, int x) {
        __pthread_mutex_s.__kind$VH.set(seg, x);
    }
    public static int __kind$get(MemorySegment seg, long index) {
        return (int)__pthread_mutex_s.__kind$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __kind$set(MemorySegment seg, long index, int x) {
        __pthread_mutex_s.__kind$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __spins$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__spins"));
    public static VarHandle __spins$VH() {
        return __pthread_mutex_s.__spins$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * short __spins;
     * }
     */
    public static short __spins$get(MemorySegment seg) {
        return (short)__pthread_mutex_s.__spins$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * short __spins;
     * }
     */
    public static void __spins$set(MemorySegment seg, short x) {
        __pthread_mutex_s.__spins$VH.set(seg, x);
    }
    public static short __spins$get(MemorySegment seg, long index) {
        return (short)__pthread_mutex_s.__spins$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __spins$set(MemorySegment seg, long index, short x) {
        __pthread_mutex_s.__spins$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __elision$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__elision"));
    public static VarHandle __elision$VH() {
        return __pthread_mutex_s.__elision$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * short __elision;
     * }
     */
    public static short __elision$get(MemorySegment seg) {
        return (short)__pthread_mutex_s.__elision$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * short __elision;
     * }
     */
    public static void __elision$set(MemorySegment seg, short x) {
        __pthread_mutex_s.__elision$VH.set(seg, x);
    }
    public static short __elision$get(MemorySegment seg, long index) {
        return (short)__pthread_mutex_s.__elision$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __elision$set(MemorySegment seg, long index, short x) {
        __pthread_mutex_s.__elision$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment __list$slice(MemorySegment seg) {
        return seg.asSlice(24, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


