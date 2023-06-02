package rapier.pipeline;

import rapier.*;
import rapier.dynamics.IntegrationParameters;
import rapier.dynamics.IslandManager;
import rapier.dynamics.RigidBodySet;
import rapier.dynamics.joint.impulse.ImpulseJointSet;
import rapier.dynamics.joint.multibody.MultibodyJointSet;
import rapier.dynamics.CCDSolver;
import rapier.geometry.BroadPhase;
import rapier.geometry.NarrowPhase;
import rapier.geometry.ColliderSet;
import rapier.math.*;
import rapier.sys.RapierC;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;

import static rapier.sys.RapierC.*;

public final class PhysicsPipeline extends RefNative implements Droppable {
    private final DropFlag dropped = new DropFlag();

    @Override
    public void drop() {
        dropped.drop(() -> RprPhysicsPipeline_drop(self));
    }

    private PhysicsPipeline(MemoryAddress memory) {
        super(memory);
    }

    public static PhysicsPipeline at(MemoryAddress memory) {
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

    public static void stepAll(
            PhysicsPipeline[] pipeline,
            Vector[] gravity,
            IntegrationParameters[] integrationParameters,
            IslandManager[] islands,
            BroadPhase[] broadPhase,
            NarrowPhase[] narrowPhase,
            RigidBodySet[] bodies,
            ColliderSet[] colliders,
            ImpulseJointSet[] impulseJoints,
            MultibodyJointSet[] multibodyJoints,
            CCDSolver[] ccdSolver,
            @Nonnull QueryPipeline[] queryPipeline // non-null array, nullable contents
    ) {
        if (
                pipeline.length != gravity.length
                || gravity.length != integrationParameters.length
                || integrationParameters.length != islands.length
                || islands.length != broadPhase.length
                || broadPhase.length != narrowPhase.length
                || narrowPhase.length != bodies.length
                || bodies.length != colliders.length
                || colliders.length != impulseJoints.length
                || impulseJoints.length != multibodyJoints.length
                || multibodyJoints.length != ccdSolver.length
                || ccdSolver.length != queryPipeline.length
        ) {
            throw new IllegalArgumentException("All arrays must be of the same length");
        }
        try (var arena = MemorySession.openConfined()) {
            var nPipeline = Native.allocatePtrArray(arena, pipeline);
            var nGravity = Vector.allocateArray(arena, gravity);
            var nIntegrationParameters = Native.allocatePtrArray(arena, integrationParameters);
            var nIslands = Native.allocatePtrArray(arena, islands);
            var nBroadPhase = Native.allocatePtrArray(arena, broadPhase);
            var nNarrowPhase = Native.allocatePtrArray(arena, narrowPhase);
            var nBodies = Native.allocatePtrArray(arena, bodies);
            var nColliders = Native.allocatePtrArray(arena, colliders);
            var nImpulseJoints = Native.allocatePtrArray(arena, impulseJoints);
            var nMultibodyJoints = Native.allocatePtrArray(arena, multibodyJoints);
            var nCcdSolver = Native.allocatePtrArray(arena, ccdSolver);
            var nQueryPipeline = Native.allocatePtrArray(arena, queryPipeline);
            {{ sys }}.RapierC.RprPhysicsPipeline_step_all(
                    pipeline.length,
                    nPipeline,
                    nGravity,
                    nIntegrationParameters,
                    nIslands,
                    nBroadPhase,
                    nNarrowPhase,
                    nBodies,
                    nColliders,
                    nImpulseJoints,
                    nMultibodyJoints,
                    nCcdSolver,
                    nQueryPipeline
            );
        }
    }
}
