package rapier.pipeline;

import rapier.ValNative;
import rapier.dynamics.RigidBodySet;
import rapier.geometry.ColliderSet;
import rapier.sys.RprEventHandler;
import rapier.sys.RprPhysicsHooks;

import javax.annotation.Nullable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemorySession;
import java.lang.foreign.SegmentAllocator;

public final class EventHandler extends ValNative {
    public interface Fn {
        default void handleCollisionEvent(
                RigidBodySet bodies,
                ColliderSet colliders,
                CollisionEvent event,
                @Nullable ContactPair contactPair
        ) {}

        default void handleContactForceEvent(
                {{ real }} dt,
                RigidBodySet bodies,
                ColliderSet colliders,
                ContactPair contactPair,
                {{ real }} totalForceMagnitude
        ) {}
    }

    private EventHandler(MemorySegment memory) {
        super(memory);
    }

    public static EventHandler at(MemorySegment memory) {
        return new EventHandler(memory);
    }

    // todo MemorySession -> SegmentAllocator
    public static EventHandler of(MemorySession alloc, Fn fn) {
        var memory = RprEventHandler.allocate(alloc);
        {{ sys }}.RprEventHandler.handle_collision_event$set(memory, {{ sys }}.RprEventHandler.handle_collision_event.allocate((bodies, colliders, event, contactPair) -> {
            fn.handleCollisionEvent(
                    RigidBodySet.at(bodies),
                    ColliderSet.at(colliders),
                    CollisionEvent.from(event),
                    contactPair.equals(MemoryAddress.NULL) ? null : ContactPair.at(contactPair)
            );
        }, alloc).address());
        {{ sys }}.RprEventHandler.handle_contact_force_event$set(memory, {{ sys }}.RprEventHandler.handle_contact_force_event.allocate((dt, bodies, colliders, contactPair, totalForceMagnitude) -> {
            fn.handleContactForceEvent(
                    dt,
                    RigidBodySet.at(bodies),
                    ColliderSet.at(colliders),
                    ContactPair.at(contactPair),
                    totalForceMagnitude
            );
        }, alloc).address());
        return at(memory);
    }
}
