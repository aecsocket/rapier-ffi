package rapier;

import org.junit.jupiter.api.Test;
import rapier.dynamics.*;
import rapier.dynamics.joint.impulse.ImpulseJointSet;
import rapier.dynamics.joint.multibody.MultibodyJointSet;
import rapier.geometry.*;
import rapier.math.Vector;
import rapier.pipeline.PhysicsPipeline;
import rapier.shape.SharedShape;

import java.lang.foreign.MemorySession;
import java.util.Objects;

public final class HelloRapier {
    @Test
    public void helloRapier() {
        Rapier.load();

        try (var arena = MemorySession.openConfined()) {
            var rigidBodySet = RigidBodySet.create();
            var colliderSet = ColliderSet.create();

            // this floorShape has a ref count of 1
            var floorShape = SharedShape.cuboid(100.0, 0.1, 100.0);
            // we pass the shape ref into the collider *without* incrementing it, so the collider owns it now
            // if the collider is destroyed, the ref is decremented to 0 and the shape is freed
            var floorCollider = Rapier.use(ColliderBuilder.of(floorShape), ColliderBuilder::build);
            colliderSet.insert(floorCollider);

            // use `.use` to drop this object after we're done with it
            var rigidBody = Rapier.use(RigidBodyBuilder.dynamic()
                    .translation(new Vector(0.0, 10.0, 0.0)),
                    RigidBodyBuilder::build);
            var ballShape = SharedShape.ball(0.5);
            var ballCollider = Rapier.use(ColliderBuilder.of(ballShape).restitution(0.7), ColliderBuilder::build);
            long ballBodyHandle = rigidBodySet.insert(rigidBody);
            colliderSet.insertWithParent(ballCollider, ballBodyHandle, rigidBodySet);

            var gravity = new Vector(0.0, -9.81, 0.0);
            var integrationParameters = IntegrationParametersDesc.create(arena).build();
            var islandManager = IslandManager.create();
            var broadPhase = BroadPhase.create();
            var narrowPhase = NarrowPhase.create();
            var impulseJointSet = ImpulseJointSet.create();
            var multibodyJointSet = MultibodyJointSet.create();
            var ccdSolver = CCDSolver.create();
            var physicsPipeline = PhysicsPipeline.create();

            for (int i = 0; i < 200; i++) {
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
                        null
                );

                Vector translation = Objects.requireNonNull(rigidBodySet.get(ballBodyHandle)).getTranslation();
                System.out.printf("Ball altitude: %f\n", translation.y());
            }
            
            physicsPipeline.drop();
            ccdSolver.drop();
            multibodyJointSet.drop();
            impulseJointSet.drop();
            narrowPhase.drop();
            broadPhase.drop();
            islandManager.drop();
            integrationParameters.drop();

            // will automatically drop its contents
            colliderSet.drop();
            rigidBodySet.drop();
            // gravity is allocated on the Java side, not the native side
            // so it gets deallocated when we exit the arena's scope
        }
    }
}
