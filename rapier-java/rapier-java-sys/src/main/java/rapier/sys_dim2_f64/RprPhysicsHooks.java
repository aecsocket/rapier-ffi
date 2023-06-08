// Generated by jextract

package rapier.sys_dim2_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class RprPhysicsHooks {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("filter_contact_pair"),
        Constants$root.C_POINTER$LAYOUT.withName("filter_intersection_pair"),
        Constants$root.C_POINTER$LAYOUT.withName("modify_solver_contacts")
    ).withName("RprPhysicsHooks");
    public static MemoryLayout $LAYOUT() {
        return RprPhysicsHooks.$struct$LAYOUT;
    }
    static final FunctionDescriptor filter_contact_pair$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle filter_contact_pair$MH = RuntimeHelper.downcallHandle(
        RprPhysicsHooks.filter_contact_pair$FUNC
    );
    public interface filter_contact_pair {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(filter_contact_pair fi, MemorySession session) {
            return RuntimeHelper.upcallStub(filter_contact_pair.class, fi, RprPhysicsHooks.filter_contact_pair$FUNC, session);
        }
        static filter_contact_pair ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)RprPhysicsHooks.filter_contact_pair$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle filter_contact_pair$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("filter_contact_pair"));
    public static VarHandle filter_contact_pair$VH() {
        return RprPhysicsHooks.filter_contact_pair$VH;
    }
    public static MemoryAddress filter_contact_pair$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)RprPhysicsHooks.filter_contact_pair$VH.get(seg);
    }
    public static void filter_contact_pair$set( MemorySegment seg, MemoryAddress x) {
        RprPhysicsHooks.filter_contact_pair$VH.set(seg, x);
    }
    public static MemoryAddress filter_contact_pair$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)RprPhysicsHooks.filter_contact_pair$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void filter_contact_pair$set(MemorySegment seg, long index, MemoryAddress x) {
        RprPhysicsHooks.filter_contact_pair$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static filter_contact_pair filter_contact_pair (MemorySegment segment, MemorySession session) {
        return filter_contact_pair.ofAddress(filter_contact_pair$get(segment), session);
    }
    static final FunctionDescriptor filter_intersection_pair$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle filter_intersection_pair$MH = RuntimeHelper.downcallHandle(
        RprPhysicsHooks.filter_intersection_pair$FUNC
    );
    public interface filter_intersection_pair {

        boolean apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(filter_intersection_pair fi, MemorySession session) {
            return RuntimeHelper.upcallStub(filter_intersection_pair.class, fi, RprPhysicsHooks.filter_intersection_pair$FUNC, session);
        }
        static filter_intersection_pair ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (boolean)RprPhysicsHooks.filter_intersection_pair$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle filter_intersection_pair$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("filter_intersection_pair"));
    public static VarHandle filter_intersection_pair$VH() {
        return RprPhysicsHooks.filter_intersection_pair$VH;
    }
    public static MemoryAddress filter_intersection_pair$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)RprPhysicsHooks.filter_intersection_pair$VH.get(seg);
    }
    public static void filter_intersection_pair$set( MemorySegment seg, MemoryAddress x) {
        RprPhysicsHooks.filter_intersection_pair$VH.set(seg, x);
    }
    public static MemoryAddress filter_intersection_pair$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)RprPhysicsHooks.filter_intersection_pair$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void filter_intersection_pair$set(MemorySegment seg, long index, MemoryAddress x) {
        RprPhysicsHooks.filter_intersection_pair$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static filter_intersection_pair filter_intersection_pair (MemorySegment segment, MemorySession session) {
        return filter_intersection_pair.ofAddress(filter_intersection_pair$get(segment), session);
    }
    static final FunctionDescriptor modify_solver_contacts$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle modify_solver_contacts$MH = RuntimeHelper.downcallHandle(
        RprPhysicsHooks.modify_solver_contacts$FUNC
    );
    public interface modify_solver_contacts {

        void apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(modify_solver_contacts fi, MemorySession session) {
            return RuntimeHelper.upcallStub(modify_solver_contacts.class, fi, RprPhysicsHooks.modify_solver_contacts$FUNC, session);
        }
        static modify_solver_contacts ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    RprPhysicsHooks.modify_solver_contacts$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle modify_solver_contacts$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("modify_solver_contacts"));
    public static VarHandle modify_solver_contacts$VH() {
        return RprPhysicsHooks.modify_solver_contacts$VH;
    }
    public static MemoryAddress modify_solver_contacts$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)RprPhysicsHooks.modify_solver_contacts$VH.get(seg);
    }
    public static void modify_solver_contacts$set( MemorySegment seg, MemoryAddress x) {
        RprPhysicsHooks.modify_solver_contacts$VH.set(seg, x);
    }
    public static MemoryAddress modify_solver_contacts$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)RprPhysicsHooks.modify_solver_contacts$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void modify_solver_contacts$set(MemorySegment seg, long index, MemoryAddress x) {
        RprPhysicsHooks.modify_solver_contacts$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static modify_solver_contacts modify_solver_contacts (MemorySegment segment, MemorySession session) {
        return modify_solver_contacts.ofAddress(modify_solver_contacts$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


