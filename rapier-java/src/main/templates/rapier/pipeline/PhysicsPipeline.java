package rapier.pipeline;

import rapier.BaseNative;
import rapier.DropFlag;
import rapier.Droppable;
import rapier.Native;
import rapier.dynamics.IntegrationParameters;
import rapier.dynamics.IslandManager;
import rapier.dynamics.RigidBodySet;
import rapier.dynamics.ImpulseJointSet;
import rapier.dynamics.MultibodyJointSet;
import rapier.dynamics.CCDSolver;
import rapier.geometry.BroadPhase;
import rapier.geometry.NarrowPhase;
import rapier.geometry.ColliderSet;
import rapier.math.*;

import javax.annotation.Nullable;
import java.lang.foreign.MemorySegment;

import static rapier.sys.RapierC.*;

public final class PhysicsPipeline extends BaseNative implements Droppable {
    private final DropFlag dropped = new DropFlag();

    @Override
    public void drop() {
        dropped.drop(() -> RprPhysicsPipeline_drop(self));
    }

    protected PhysicsPipeline(MemorySegment memory) {
        super(memory);
    }

    public static PhysicsPipeline at(MemorySegment memory) {
        return new PhysicsPipeline(memory);
    }

    public static PhysicsPipeline create() {
        return at(RprPhysicsPipeline_new());
    }

    public void step(
            Vector gravity,
            IntegrationParameters integrationParameters,
            IslandManager islands,
            BroadPhase broadPhase,
            NarrowPhase narrowPhase,
            RigidBodySet bodies,
            ColliderSet colliders,
            ImpulseJointSet impulseJoints,
            MultibodyJointSet multibodyJoints,
            CCDSolver ccdSolver,
            @Nullable QueryPipeline queryPipeline
    ) {
        {{ sys }}.RapierC.RprPhysicsPipeline_step(
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
                Native.memoryOrNull(queryPipeline)
        );
    }
}
