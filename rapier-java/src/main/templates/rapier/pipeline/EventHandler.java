package rapier.pipeline;

import rapier.ValNative;
import rapier.dynamics.RigidBodySet;
import rapier.geometry.ColliderSet;
import rapier.sys.RprEventHandler;
import rapier.sys.RprPhysicsHooks;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemorySession;
import java.lang.foreign.SegmentAllocator;

public final class EventHandler extends ValNative {
    public interface Fn {
        void handleCollisionEvent(
                RigidBodySet bodies,
                ColliderSet colliders,
                CollisionEvent event,
                ContactPair contactPair
        );

        void handleContactForceEvent(
                {{ real }} dt,
                RigidBodySet bodies,
                ColliderSet colliders,
                ContactPair contactPair,
                {{ real }} totalForceMagnitude
        );
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
        {{ sys }}.RprEventHandler.handle_collision_event$set(memory, RprEventHandler.handle_collision_event.allocate((bodies, colliders, event, contactPair) -> {
            fn.handleCollisionEvent(RigidBodySet.at(bodies), ColliderSet.at(colliders), CollisionEvent.at(event), ContactPair.at(contactPair));
        }, alloc).address());
        {{ sys }}.RprEventHandler.handle_contact_force_event$set(memory, RprEventHandler.handle_contact_force_event.allocate((dt, bodies, colliders, contactPair, totalForceMagnitude) -> {
            fn.handleContactForceEvent(dt, RigidBodySet.at(bodies), ColliderSet.at(colliders), ContactPair.at(contactPair), totalForceMagnitude);
        }, alloc).address());
         return at(memory);
    }
}
