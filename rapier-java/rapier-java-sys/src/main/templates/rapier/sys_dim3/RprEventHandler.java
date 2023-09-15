// Generated by jextract

package rapier.sys_dim3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct RprEventHandler {
 *     void (*handle_collision_event)(struct RprRigidBodySet*,struct RprColliderSet*,struct RprCollisionEvent,struct RprContactPair*);
 *     void (*handle_contact_force_event)(float,struct RprRigidBodySet*,struct RprColliderSet*,struct RprContactPair*,float);
 * };
 * }
 */
public class RprEventHandler {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("handle_collision_event"),
        Constants$root.C_POINTER$LAYOUT.withName("handle_contact_force_event")
    ).withName("RprEventHandler");
    public static MemoryLayout $LAYOUT() {
        return RprEventHandler.$struct$LAYOUT;
    }
    static final FunctionDescriptor handle_collision_event$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
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
        ).withName("RprCollisionEvent"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle handle_collision_event$MH = RuntimeHelper.downcallHandle(
        RprEventHandler.handle_collision_event$FUNC
    );
    /**
     * {@snippet :
 * void (*handle_collision_event)(struct RprRigidBodySet*,struct RprColliderSet*,struct RprCollisionEvent,struct RprContactPair*);
     * }
     */
    public interface handle_collision_event {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3);
        static MemorySegment allocate(handle_collision_event fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(handle_collision_event.class, fi, RprEventHandler.handle_collision_event$FUNC, scope);
        }
        static handle_collision_event ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3) -> {
                try {
                    RprEventHandler.handle_collision_event$MH.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle handle_collision_event$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("handle_collision_event"));
    public static VarHandle handle_collision_event$VH() {
        return RprEventHandler.handle_collision_event$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*handle_collision_event)(struct RprRigidBodySet*,struct RprColliderSet*,struct RprCollisionEvent,struct RprContactPair*);
     * }
     */
    public static MemorySegment handle_collision_event$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)RprEventHandler.handle_collision_event$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*handle_collision_event)(struct RprRigidBodySet*,struct RprColliderSet*,struct RprCollisionEvent,struct RprContactPair*);
     * }
     */
    public static void handle_collision_event$set(MemorySegment seg, MemorySegment x) {
        RprEventHandler.handle_collision_event$VH.set(seg, x);
    }
    public static MemorySegment handle_collision_event$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)RprEventHandler.handle_collision_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void handle_collision_event$set(MemorySegment seg, long index, MemorySegment x) {
        RprEventHandler.handle_collision_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static handle_collision_event handle_collision_event(MemorySegment segment, SegmentScope scope) {
        return handle_collision_event.ofAddress(handle_collision_event$get(segment), scope);
    }
    static final FunctionDescriptor handle_contact_force_event$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle handle_contact_force_event$MH = RuntimeHelper.downcallHandle(
        RprEventHandler.handle_contact_force_event$FUNC
    );
    /**
     * {@snippet :
 * void (*handle_contact_force_event)(float,struct RprRigidBodySet*,struct RprColliderSet*,struct RprContactPair*,float);
     * }
     */
    public interface handle_contact_force_event {

        void apply(float _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3, float _x4);
        static MemorySegment allocate(handle_contact_force_event fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(handle_contact_force_event.class, fi, RprEventHandler.handle_contact_force_event$FUNC, scope);
        }
        static handle_contact_force_event ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (float __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3, float __x4) -> {
                try {
                    RprEventHandler.handle_contact_force_event$MH.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle handle_contact_force_event$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("handle_contact_force_event"));
    public static VarHandle handle_contact_force_event$VH() {
        return RprEventHandler.handle_contact_force_event$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*handle_contact_force_event)(float,struct RprRigidBodySet*,struct RprColliderSet*,struct RprContactPair*,float);
     * }
     */
    public static MemorySegment handle_contact_force_event$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)RprEventHandler.handle_contact_force_event$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*handle_contact_force_event)(float,struct RprRigidBodySet*,struct RprColliderSet*,struct RprContactPair*,float);
     * }
     */
    public static void handle_contact_force_event$set(MemorySegment seg, MemorySegment x) {
        RprEventHandler.handle_contact_force_event$VH.set(seg, x);
    }
    public static MemorySegment handle_contact_force_event$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)RprEventHandler.handle_contact_force_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void handle_contact_force_event$set(MemorySegment seg, long index, MemorySegment x) {
        RprEventHandler.handle_contact_force_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static handle_contact_force_event handle_contact_force_event(MemorySegment segment, SegmentScope scope) {
        return handle_contact_force_event.ofAddress(handle_contact_force_event$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


