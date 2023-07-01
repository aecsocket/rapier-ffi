package rapier;

import org.junit.jupiter.api.Test;
import rapier.data.ArenaKey;
import rapier.dynamics.*;
import rapier.dynamics.joint.impulse.ImpulseJointSet;
import rapier.dynamics.joint.multibody.MultibodyJointSet;
import rapier.geometry.*;
import rapier.math.Vector;
import rapier.pipeline.PhysicsPipeline;
import rapier.shape.SharedShape;

import java.util.Objects;

public final class HelloRapier {
    @Test
    public void helloRapier() {
        // load native libraries from the JAR, as provided by the various natives subprojects
        Rapier.load();

        // create some Rapier structs on the heap
        var rigidBodySet = RigidBodySet.create();
        var colliderSet = ColliderSet.create();

        // this floorShape has a ref count of 1
        var floorShape = SharedShape.cuboid(100.0, 0.1, 100.0);
        // we pass the shape ref into the collider *without* incrementing it, so the collider owns it now
        // if the collider is destroyed, the ref is decremented to 0 and the shape is freed
        var floorCollider = Rapier.use(ColliderBuilder.of(floorShape), ColliderBuilder::build);
        colliderSet.insert(floorCollider);

        // use `Rapier.use` to drop this object after we're done with it
        // (after `RigidBodyBuilder::build` is called, or whatever function you pass in there)
        var rigidBody = Rapier.use(RigidBodyBuilder.dynamic()
                .translation(new Vector(0.0, 10.0, 0.0)),
                RigidBodyBuilder::build);
        var ballShape = SharedShape.ball(0.5);
        var ballCollider = Rapier.use(ColliderBuilder.of(ballShape).restitution(0.7), ColliderBuilder::build);
        ArenaKey ballBodyHandle = rigidBodySet.insert(rigidBody);
        colliderSet.insertWithParent(ballCollider, ballBodyHandle, rigidBodySet);

        // Vectors are managed on the Java side, and are converted to/from native objects when they need to be
        var gravity = new Vector(0.0, -9.81, 0.0);
        // set up a bunch more Rapier structures
        var integrationParameters = IntegrationParameters.fromDefault();
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

        // make sure to clean up after ourselves
        physicsPipeline.drop();
        ccdSolver.drop();
        multibodyJointSet.drop();
        impulseJointSet.drop();
        narrowPhase.drop();
        broadPhase.drop();
        islandManager.drop();

        // will automatically drop its contents
        colliderSet.drop();
        rigidBodySet.drop();
    }
}
