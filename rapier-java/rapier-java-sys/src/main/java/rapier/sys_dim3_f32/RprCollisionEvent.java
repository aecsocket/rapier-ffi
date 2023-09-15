// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct RprCollisionEvent {
 *     enum RprCollisionEvent_Tag tag;
 *     union union (anonymous at /home/socket/Projects/rapier-ffi/rapier-java/rapier-java-sys/build/librapier.h:1089:3) {
 *         struct Started_Body started;
 *         struct Stopped_Body stopped;
 *     };
 * };
 * }
 */
public class RprCollisionEvent {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("tag"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_INT$LAYOUT.withName("index"),
                    Constants$root.C_INT$LAYOUT.withName("generation")
                ).withName("coll1"),
                MemoryLayout.structLayout(
                    Constants$root.C_INT$LAYOUT.withName("index"),
                    Constants$root.C_INT$LAYOUT.withName("generation")
                ).withName("coll2"),
                Constants$root.C_INT$LAYOUT.withName("flags")
            ).withName("started"),
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_INT$LAYOUT.withName("index"),
                    Constants$root.C_INT$LAYOUT.withName("generation")
                ).withName("coll1"),
                MemoryLayout.structLayout(
                    Constants$root.C_INT$LAYOUT.withName("index"),
                    Constants$root.C_INT$LAYOUT.withName("generation")
                ).withName("coll2"),
                Constants$root.C_INT$LAYOUT.withName("flags")
            ).withName("stopped")
        ).withName("union (anonymous at /home/socket/Projects/rapier-ffi/rapier-java/rapier-java-sys/build/librapier.h:1089:3)")
    ).withName("RprCollisionEvent");
    public static MemoryLayout $LAYOUT() {
        return RprCollisionEvent.$struct$LAYOUT;
    }
    static final VarHandle tag$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tag"));
    public static VarHandle tag$VH() {
        return RprCollisionEvent.tag$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum RprCollisionEvent_Tag tag;
     * }
     */
    public static int tag$get(MemorySegment seg) {
        return (int)RprCollisionEvent.tag$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum RprCollisionEvent_Tag tag;
     * }
     */
    public static void tag$set(MemorySegment seg, int x) {
        RprCollisionEvent.tag$VH.set(seg, x);
    }
    public static int tag$get(MemorySegment seg, long index) {
        return (int)RprCollisionEvent.tag$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tag$set(MemorySegment seg, long index, int x) {
        RprCollisionEvent.tag$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


