// Generated by jextract

package rapier.sys_dim2_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class RprEventHandler {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
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
            ).withName("$anon$0")
        ).withName("RprCollisionEvent"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle handle_collision_event$MH = RuntimeHelper.downcallHandle(
        RprEventHandler.handle_collision_event$FUNC
    );
    public interface handle_collision_event {

        void apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemoryAddress _x3);
        static MemorySegment allocate(handle_collision_event fi, MemorySession session) {
            return RuntimeHelper.upcallStub(handle_collision_event.class, fi, RprEventHandler.handle_collision_event$FUNC, session);
        }
        static handle_collision_event ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemoryAddress __x3) -> {
                try {
                    RprEventHandler.handle_collision_event$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, __x2, (java.lang.foreign.Addressable)__x3);
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
    public static MemoryAddress handle_collision_event$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)RprEventHandler.handle_collision_event$VH.get(seg);
    }
    public static void handle_collision_event$set( MemorySegment seg, MemoryAddress x) {
        RprEventHandler.handle_collision_event$VH.set(seg, x);
    }
    public static MemoryAddress handle_collision_event$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)RprEventHandler.handle_collision_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void handle_collision_event$set(MemorySegment seg, long index, MemoryAddress x) {
        RprEventHandler.handle_collision_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static handle_collision_event handle_collision_event (MemorySegment segment, MemorySession session) {
        return handle_collision_event.ofAddress(handle_collision_event$get(segment), session);
    }
    static final FunctionDescriptor handle_contact_force_event$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle handle_contact_force_event$MH = RuntimeHelper.downcallHandle(
        RprEventHandler.handle_contact_force_event$FUNC
    );
    public interface handle_contact_force_event {

        void apply(double _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, java.lang.foreign.MemoryAddress _x3, double _x4);
        static MemorySegment allocate(handle_contact_force_event fi, MemorySession session) {
            return RuntimeHelper.upcallStub(handle_contact_force_event.class, fi, RprEventHandler.handle_contact_force_event$FUNC, session);
        }
        static handle_contact_force_event ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (double __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, java.lang.foreign.MemoryAddress __x3, double __x4) -> {
                try {
                    RprEventHandler.handle_contact_force_event$MH.invokeExact((Addressable)symbol, __x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, (java.lang.foreign.Addressable)__x3, __x4);
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
    public static MemoryAddress handle_contact_force_event$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)RprEventHandler.handle_contact_force_event$VH.get(seg);
    }
    public static void handle_contact_force_event$set( MemorySegment seg, MemoryAddress x) {
        RprEventHandler.handle_contact_force_event$VH.set(seg, x);
    }
    public static MemoryAddress handle_contact_force_event$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)RprEventHandler.handle_contact_force_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void handle_contact_force_event$set(MemorySegment seg, long index, MemoryAddress x) {
        RprEventHandler.handle_contact_force_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static handle_contact_force_event handle_contact_force_event (MemorySegment segment, MemorySession session) {
        return handle_contact_force_event.ofAddress(handle_contact_force_event$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


