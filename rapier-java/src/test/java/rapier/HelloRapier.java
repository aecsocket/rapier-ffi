package rapier;

import org.junit.jupiter.api.Test;
import rapier.dynamics.*;
import rapier.geometry.*;
import rapier.math.Vector;
import rapier.pipeline.PhysicsPipeline;
import rapier.shape.Ball;
import rapier.shape.Cuboid;
import rapier.shape.SharedShape;
import rapier.sys.RapierC;

import java.lang.foreign.Arena;

public final class HelloRapier {
    @Test
    public void helloRapier() {
        Rapier.load();

        try (var arena = Arena.openConfined()) {
            var rigidBodySet = RigidBodySet.create();
            var colliderSet = ColliderSet.create();

            var floorShape = SharedShape.of(Cuboid.of(arena, Vector.of(arena, 100.0, 0.1, 100.0)));
            var floorCollider = Rapier.use(ColliderBuilder.of(floorShape), ColliderBuilder::build);
            colliderSet.insert(floorCollider);

            var rigidBody = Rapier.use(RigidBodyBuilder.dynamic()
                    .translation(Vector.of(arena, 0.0, 10.0, 0.0)),
                    RigidBodyBuilder::build);
            var ballShape = SharedShape.of(Ball.of(arena, 0.5));
            var ballCollider = Rapier.use(ColliderBuilder.of(ballShape).restitution(0.7), ColliderBuilder::build);
            long ballBodyHandle = rigidBodySet.insert(rigidBody);
            colliderSet.insertWithParent(ballCollider, ballBodyHandle, rigidBodySet);

            var gravity = Vector.of(arena, 0.0, -9.81, 0.0);
            var integrationParameters = IntegrationParametersDesc.ofDefault(arena).build();
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
                        null
                );

                Vector translation = rigidBodySet.index(ballBodyHandle).getTranslation(arena);
                System.out.printf("Ball altitude: %f\n", translation.getY());
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
