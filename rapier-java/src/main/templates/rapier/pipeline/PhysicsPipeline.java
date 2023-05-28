package rapier.pipeline;

import rapier.*;
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
            var nPipeline = Native.allocateArray(arena, pipeline);
            var nGravity = Vector.allocateArray(arena, gravity);
            var nIntegrationParameters = Native.allocateArray(arena, integrationParameters);
            var nIslands = Native.allocateArray(arena, islands);
            var nBroadPhase = Native.allocateArray(arena, broadPhase);
            var nNarrowPhase = Native.allocateArray(arena, narrowPhase);
            var nBodies = Native.allocateArray(arena, bodies);
            var nColliders = Native.allocateArray(arena, colliders);
            var nImpulseJoints = Native.allocateArray(arena, impulseJoints);
            var nMultibodyJoints = Native.allocateArray(arena, multibodyJoints);
            var nCcdSolver = Native.allocateArray(arena, ccdSolver);
            var nQueryPipeline = Native.allocateArray(arena, queryPipeline);
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
