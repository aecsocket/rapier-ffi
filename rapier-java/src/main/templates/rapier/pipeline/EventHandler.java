package rapier.pipeline;

import rapier.__real;
import rapier.dynamics.RigidBodySet;
import rapier.geometry.ColliderSet;

import javax.annotation.Nullable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record EventHandler(
        Fn fn
) {
    public interface Fn {
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
    }

    public static long sizeof() {
        return rapier.sys.RprEventHandler.sizeof();
    }

    public static MemorySegment alloc(SegmentAllocator alloc) {
        return rapier.sys.RprEventHandler.allocate(alloc);
    }

    public static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return rapier.sys.RprEventHandler.allocateArray(len, alloc);
    }

    public void into(MemorySegment memory) {
        rapier.sys.RprEventHandler.handle_collision_event$set(memory, rapier.sys.RprEventHandler.handle_collision_event.allocate(
                (bodies,
                 colliders,
                 event,
                 contactPair
                ) -> fn.handleCollisionEvent(
                        RigidBodySet.at(bodies),
                        ColliderSet.at(colliders),
                        CollisionEvent.from(event),
                        contactPair.equals(MemoryAddress.NULL) ? null : ContactPair.at(contactPair)
                ), memory.session()).address()
        );
        rapier.sys.RprEventHandler.handle_contact_force_event$set(memory, rapier.sys.RprEventHandler.handle_contact_force_event.allocate(
                (dt,
                 bodies,
                 colliders,
                 contactPair,
                 totalForceMagnitude
                ) -> fn.handleContactForceEvent(
                    dt,
                    RigidBodySet.at(bodies),
                    ColliderSet.at(colliders),
                    ContactPair.at(contactPair),
                    totalForceMagnitude
                ), memory.session()).address()
        );
    }

    public MemorySegment allocInto(SegmentAllocator alloc) {
        var memory = alloc(alloc);
        into(memory);
        return memory;
    }

    public static MemorySegment allocIntoSlice(SegmentAllocator alloc, EventHandler... objs) {
        var memory = allocSlice(alloc, objs.length);
        for (int i = 0; i < objs.length; i++) {
            objs[i].into(memory.asSlice(sizeof() * i));
        }
        return memory;
    }
}
