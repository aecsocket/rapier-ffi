package rapier.pipeline;

import rapier.DroppableNative;
import rapier.dynamics.IntegrationParameters;
import rapier.dynamics.IslandManager;
import rapier.dynamics.RigidBodySet;
import rapier.geometry.BroadPhase;
import rapier.geometry.NarrowPhase;
import rapier.math.*;

import java.lang.foreign.MemorySegment;

import static rapier.sys.RapierC.*;

public abstract class PhysicsPipeline extends DroppableNative {
    protected PhysicsPipeline(MemorySegment memory) {
        super(memory);
    }

    @Override
    protected void dropInternal() {
        RprPhysicsPipeline_drop(self);
    }

    public void step(
            Vector2 gravity,
            IntegrationParameters integrationParameters,
            IslandManager islands,
            BroadPhase broadPhase,
            NarrowPhase narrowPhase,
            RigidBodySet bodies,
            ColliderSet colliders,
            ImpulseJointSet impulseJoints,
            MultibodyJointSet multibodyJoints,
            CCDSolver ccdSolver,
            QueryPipeline queryPipeline
    ) {
        RprPhysicsPipeline_step(
                self,
                gravity.memory(),
                integrationParameters.memory(),
                islands.memory(),
                broadPhase.memory(),
                narrowPhase.memory(),
                bodies.memory(),
                colliders.memory(),
                impulseJoints.memory(),
                multibodyJoints.memory(),
                ccdSolver.memory(),
                queryPipeline.memory()
        );
    }
}
