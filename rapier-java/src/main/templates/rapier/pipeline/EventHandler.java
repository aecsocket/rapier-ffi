package rapier.pipeline;

import rapier.__real;
import rapier.dynamics.RigidBodySet;
import rapier.geometry.ColliderSet;

import javax.annotation.Nullable;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public interface EventHandler {
    default void handleCollisionEvent(
            RigidBodySet bodies,
            ColliderSet colliders,
            CollisionEvent event,
            @Nullable ContactPair contactPair
    ) {}

    default void handleContactForceEvent(
            __real dt,
            RigidBodySet bodies,
            ColliderSet colliders,
            ContactPair contactPair,
            __real totalForceMagnitude
    ) {}

    static long sizeof() {
        return rapier.sys.RprEventHandler.sizeof();
    }

    static MemorySegment alloc(SegmentAllocator alloc) {
        return rapier.sys.RprEventHandler.allocate(alloc);
    }

    static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return rapier.sys.RprEventHandler.allocateArray(len, alloc);
    }

    static void into(EventHandler self, MemorySegment memory) {
        rapier.sys.RprEventHandler.handle_collision_event$set(memory, rapier.sys.RprEventHandler.handle_collision_event.allocate(
                (bodies,
                 colliders,
                 event,
                 contactPair
                ) -> self.handleCollisionEvent(
                        RigidBodySet.at(bodies),
                        ColliderSet.at(colliders),
                        CollisionEvent.from(event),
                        contactPair.equals(MemorySegment.NULL) ? null : ContactPair.at(contactPair)
                ), memory.scope())
        );
        rapier.sys.RprEventHandler.handle_contact_force_event$set(memory, rapier.sys.RprEventHandler.handle_contact_force_event.allocate(
                (dt,
                 bodies,
                 colliders,
                 contactPair,
                 totalForceMagnitude
                ) -> self.handleContactForceEvent(
                    dt,
                    RigidBodySet.at(bodies),
                    ColliderSet.at(colliders),
                    ContactPair.at(contactPair),
                    totalForceMagnitude
                ), memory.scope())
        );
    }

    static MemorySegment allocInto(EventHandler self, SegmentAllocator alloc) {
        var memory = alloc(alloc);
        into(self, memory);
        return memory;
    }

    static MemorySegment allocIntoSlice(SegmentAllocator alloc, EventHandler... objs) {
        var memory = allocSlice(alloc, objs.length);
        for (int i = 0; i < objs.length; i++) {
            into(objs[i], memory.asSlice(sizeof() * i));
        }
        return memory;
    }
}
