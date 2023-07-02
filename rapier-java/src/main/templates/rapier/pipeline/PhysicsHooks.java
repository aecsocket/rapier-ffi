package rapier.pipeline;

import rapier.math.Vector;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public interface PhysicsHooks {
    default int filterContactPair(PairFilterContext context) {
        return SolverFlags.COMPUTE_IMPULSES;
    }

    default boolean filterIntersectionPair(PairFilterContext context) {
        return true;
    }

    default void modifySolverContacts(ContactModificationContext context) {}

    static long sizeof() {
        return rapier.sys.RprPhysicsHooks.sizeof();
    }

    static MemorySegment alloc(SegmentAllocator alloc) {
        return rapier.sys.RprPhysicsHooks.allocate(alloc);
    }

    static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return rapier.sys.RprPhysicsHooks.allocateArray(len, alloc);
    }

    static void into(PhysicsHooks self, MemorySegment memory) {
        rapier.sys.RprPhysicsHooks.filter_contact_pair$set(memory, rapier.sys.RprPhysicsHooks.filter_contact_pair.allocate(
                (context) -> self.filterContactPair(
                        PairFilterContext.at(context)
                ), memory.session()).address()
        );
        rapier.sys.RprPhysicsHooks.filter_intersection_pair$set(memory, rapier.sys.RprPhysicsHooks.filter_intersection_pair.allocate(
                (context) -> self.filterIntersectionPair(
                        PairFilterContext.at(context)
                ), memory.session()).address()
        );
        rapier.sys.RprPhysicsHooks.modify_solver_contacts$set(memory, rapier.sys.RprPhysicsHooks.modify_solver_contacts.allocate(
                (context) -> self.modifySolverContacts(
                        ContactModificationContext.at(context)
                ), memory.session()).address()
        );
    }

    static MemorySegment allocInto(PhysicsHooks self, SegmentAllocator alloc) {
        var memory = alloc(alloc);
        into(self, memory);
        return memory;
    }

    static MemorySegment allocIntoSlice(SegmentAllocator alloc, PhysicsHooks... objs) {
        var memory = allocSlice(alloc, objs.length);
        for (int i = 0; i < objs.length; i++) {
            into(objs[i], memory.asSlice(sizeof() * i));
        }
        return memory;
    }
}
