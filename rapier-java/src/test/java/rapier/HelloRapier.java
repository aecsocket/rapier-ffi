package rapier;

import org.junit.jupiter.api.Test;
import rapier.data.ArenaKey;
import rapier.dynamics.*;
import rapier.dynamics.joint.impulse.ImpulseJointSet;
import rapier.dynamics.joint.multibody.MultibodyJointSet;
import rapier.geometry.*;
import rapier.math.Vector;
import rapier.pipeline.*;
import rapier.shape.SharedShape;

import javax.annotation.Nullable;
import java.util.Objects;

public final class HelloRapier {
    @Test
    public void helloRapier() {
        // Load native libraries from the JAR, as provided by the various natives subprojects
        Rapier.load();

        // - Using `.create` or `.of` will allocate objects on the native application's heap, not managed by Java.
        //   You must deallocate (drop) these objects manually using `.drop()`.
        // - All other types which can be `new`ed are managed by Java.
        //   These are automatically converted to/from native types by rapier-java, so you do not have to manage
        //   de/allocation yourself.

        // Create some Rapier physics structures on the heap
        var rigidBodySet = RigidBodySet.create();
        var colliderSet = ColliderSet.create();

        // Create a floor shape, with a reference count of 1
        // Calling `.acquire()` increases the ref count by 1; calling `.release()` decreases it by 1
        // When the ref count reaches 0, the shape is dropped and this object is no longer allowed to be used by Java
        var floorShape = SharedShape.cuboid(100.0, 0.1, 100.0);
        // We pass the shape ref into the collider *without* incrementing it, so the collider owns it now
        // When the collider is dropped, it will automatically remove 1 from the ref
        var floorCollider = Rapier.use(ColliderBuilder.of(floorShape), ColliderBuilder::build);
        colliderSet.insert(floorCollider);

        // Use `Rapier.use` to drop this heap-allocated object after we're done with it
        // (after `RigidBodyBuilder::build` is called, or whatever function you pass in there)
        var rigidBody = Rapier.use(
                RigidBodyBuilder.dynamic()
                    .translation(new Vector(0.0, 10.0, 0.0)),
                RigidBodyBuilder::build
        );
        var ballShape = SharedShape.ball(0.5);
        var ballCollider = Rapier.use(
                ColliderBuilder.of(ballShape)
                    .restitution(0.7) // bounciness
                    .activeEvents(ActiveEvents.COLLISION_EVENTS), // will call `handleCollisionEvent` below
                ColliderBuilder::build
        );
        // Use ArenaKey's to read/write/remove structures which have been added to a Set
        // After this line, you are NO LONGER ALLOWED to access `rigidBody`! Use `.read` and `.write` on the set instead
        ArenaKey ballBodyHandle = rigidBodySet.insert(rigidBody);
        colliderSet.insertWithParent(ballCollider, ballBodyHandle, rigidBodySet);

        var gravity = new Vector(0.0, -9.81, 0.0);
        // Set up a bunch more Rapier structures
        var integrationParameters = IntegrationParameters.defaults();
        var islandManager = IslandManager.create();
        var broadPhase = BroadPhase.create();
        var narrowPhase = NarrowPhase.create();
        var impulseJointSet = ImpulseJointSet.create();
        var multibodyJointSet = MultibodyJointSet.create();
        var ccdSolver = CCDSolver.create();
        var physicsPipeline = PhysicsPipeline.create();

        // Define callbacks by implementing an interface
        var events = new EventHandler() {
            @Override
            public void handleCollisionEvent(RigidBodySet bodies, ColliderSet colliders, CollisionEvent event, @Nullable ContactPair contactPair) {
                System.out.printf("Collision event: %s\n", event.getClass().getSimpleName());
            }
        };

        for (int i = 0; i < 100; i++) {
            // Use `.step` to step a single pipeline at a time
            physicsPipeline.step(
                    gravity,
                    integrationParameters,
                    islandManager,
                    broadPhase,
                    narrowPhase,
                    rigidBodySet,
                    colliderSet,
                    impulseJointSet,
                    multibodyJointSet,
                    ccdSolver,
                    null,
                    null,
                    events
            );

            // Access the body that was previously added to the rigid-body set by using `.get`
            // This will get the structure for reading ONLY - if you want to write to it, use `.getMut`
            // Note that this must all be externally synchronized!
            Vector translation = Objects.requireNonNull(rigidBodySet.get(ballBodyHandle)).getTranslation();
            System.out.printf("Ball altitude: %f\n", translation.y());
        }

        for (int i = 0; i < 100; i++) {
            // Use `.stepAll` to step multiple pipelines in parallel (here, only 1 is stepped)
            PhysicsPipeline.stepAll(
                    new PhysicsPipeline[]{ physicsPipeline },
                    new Vector[]{ gravity },
                    new IntegrationParameters[]{ integrationParameters },
                    new IslandManager[]{ islandManager },
                    new BroadPhase[]{ broadPhase },
                    new NarrowPhase[]{ narrowPhase },
                    new RigidBodySet[]{ rigidBodySet },
                    new ColliderSet[]{ colliderSet },
                    new ImpulseJointSet[]{ impulseJointSet },
                    new MultibodyJointSet[]{ multibodyJointSet },
                    new CCDSolver[]{ ccdSolver },
                    new QueryPipeline[]{ null },
                    new PhysicsHooks[]{ null },
                    new EventHandler[]{ events }
            );

            Vector translation = Objects.requireNonNull(rigidBodySet.get(ballBodyHandle)).getTranslation();
            System.out.printf("Ball altitude: %f\n", translation.y());
        }

        // Make sure to clean up after ourselves
        physicsPipeline.drop();
        ccdSolver.drop();
        multibodyJointSet.drop();
        impulseJointSet.drop();
        narrowPhase.drop();
        broadPhase.drop();
        islandManager.drop();

        // Will automatically drop its contents, such as contained rigid bodies and colliders
        // This means their owned shapes are also dropped automatically (that is, their ref count is decreased by 1)
        colliderSet.drop();
        rigidBodySet.drop();
    }
}
