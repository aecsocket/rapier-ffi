package rapier.pipeline;

import rapier.math.Vector;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record PhysicsHooks(
        Fn fn
) {
    public interface Fn {
        default int filterContactPair(PairFilterContext context) {
            return SolverFlags.COMPUTE_IMPULSES;
        }

        default boolean filterIntersectionPair(PairFilterContext context) {
            return true;
        }

        default void modifySolverContacts(ContactModificationContext context) {}
    }

    public static long sizeof() {
        return rapier.sys.RprPhysicsHooks.sizeof();
    }

    public static MemorySegment alloc(SegmentAllocator alloc) {
        return rapier.sys.RprPhysicsHooks.allocate(alloc);
    }

    public static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return rapier.sys.RprPhysicsHooks.allocateArray(len, alloc);
    }

    public void into(MemorySegment memory) {
        rapier.sys.RprPhysicsHooks.filter_contact_pair$set(memory, rapier.sys.RprPhysicsHooks.filter_contact_pair.allocate(
                (context) -> fn.filterContactPair(
                        PairFilterContext.at(context)
                ), memory.session()).address()
        );
        rapier.sys.RprPhysicsHooks.filter_intersection_pair$set(memory, rapier.sys.RprPhysicsHooks.filter_intersection_pair.allocate(
                (context) -> fn.filterIntersectionPair(
                        PairFilterContext.at(context)
                ), memory.session()).address()
        );
        rapier.sys.RprPhysicsHooks.modify_solver_contacts$set(memory, rapier.sys.RprPhysicsHooks.modify_solver_contacts.allocate(
                (context) -> fn.modifySolverContacts(
                        ContactModificationContext.at(context)
                ), memory.session()).address()
        );
    }

    public MemorySegment allocInto(SegmentAllocator alloc) {
        var memory = alloc(alloc);
        into(memory);
        return memory;
    }

    public static MemorySegment allocIntoSlice(SegmentAllocator alloc, PhysicsHooks... objs) {
        var memory = allocSlice(alloc, objs.length);
        for (int i = 0; i < objs.length; i++) {
            objs[i].into(memory.asSlice(sizeof() * i));
        }
        return memory;
    }
}
