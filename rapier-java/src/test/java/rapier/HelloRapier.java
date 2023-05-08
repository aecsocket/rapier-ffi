package rapier;

import org.junit.jupiter.api.Test;
import rapier.dynamics.*;
import rapier.geometry.*;
import rapier.math.Vector3;
import rapier.pipeline.PhysicsPipeline;

import java.lang.foreign.Arena;

public final class HelloRapier {
    @Test
    public void helloRapier() {
        Rapier.load();

        try (var arena = Arena.openConfined()) {
            var rigidBodySet = RigidBodySet.create();
            var colliderSet = ColliderSet.create();

            var floorCollider = ColliderBuilder.cuboid(100.0, 0.1, 100.0).build();
            colliderSet.insert(floorCollider);

            var rigidBody = RigidBodyBuilder.dynamic()
                    .translation(Vector3.create(arena, 0.0, 10.0, 0.0))
                    .build();
            var ballCollider = ColliderBuilder.ball(0.5).restitution(0.7).build();
            long ballBodyHandle = rigidBodySet.insert(rigidBody);
            colliderSet.insertWithParent(ballCollider, ballBodyHandle, rigidBodySet);

            var gravity = Vector3.create(arena, 0.0, -9.81, 0.0);
            var integrationParameters = IntegrationParameters.ofDefault();
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

                Vector3 translation = Vector3.create(arena);
                rigidBodySet.get(ballBodyHandle).getTranslation(translation);
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
            // gravity is allocated on the Java side, not the native side
            // so it gets deallocated when we exit the arena's scope
        }
    }
}
