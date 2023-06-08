package rapier.pipeline;

import rapier.ValNative;
import rapier.sys.RprPhysicsHooks;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemorySession;

public final class PhysicsHooks extends ValNative {
    public interface Fn {
        default int filterContactPair(PairFilterContext context) {
            return SolverFlags.COMPUTE_IMPULSES;
        }

        default boolean filterIntersectionPair(PairFilterContext context) {
            return true;
        }

        default void modifySolverContacts(ContactModificationContext context) {}
    }

    private PhysicsHooks(MemorySegment memory) {
        super(memory);
    }

    public static PhysicsHooks at(MemorySegment memory) {
        return new PhysicsHooks(memory);
    }

    // todo MemorySession -> SegmentAllocator
    public static PhysicsHooks of(MemorySession alloc, Fn fn) {
        var memory = RprPhysicsHooks.allocate(alloc);
        RprPhysicsHooks.filter_contact_pair$set(memory, RprPhysicsHooks.filter_contact_pair.allocate(context -> {
            return fn.filterContactPair(PairFilterContext.at(context));
        }, alloc).address());
        RprPhysicsHooks.filter_intersection_pair$set(memory, RprPhysicsHooks.filter_intersection_pair.allocate(context -> {
            return fn.filterIntersectionPair(PairFilterContext.at(context));
        }, alloc).address());
        RprPhysicsHooks.modify_solver_contacts$set(memory, RprPhysicsHooks.modify_solver_contacts.allocate(context -> {
            fn.modifySolverContacts(ContactModificationContext.at(context));
        }, alloc).address());
        return at(memory);
    }
}
