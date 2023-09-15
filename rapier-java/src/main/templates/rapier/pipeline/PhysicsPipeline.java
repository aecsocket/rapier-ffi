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

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.Arena;
import java.lang.foreign.ValueLayout;

public final class PhysicsPipeline extends RefNative implements Droppable {
    private final DropFlag dropped = new DropFlag();

    @Override
    public void drop() {
        dropped.drop(() -> rapier.sys.RapierC.RprPhysicsPipeline_drop(self));
    }

    private PhysicsPipeline(MemorySegment memory) {
        super(memory);
    }

    public static PhysicsPipeline at(MemorySegment memory) {
        return new PhysicsPipeline(memory);
    }

    public static PhysicsPipeline create() {
        return at(rapier.sys.RapierC.RprPhysicsPipeline_new());
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
            @Nullable QueryPipeline queryPipeline,
            @Nullable PhysicsHooks hooks,
            @Nullable EventHandler events
    ) {
        try (var arena = Arena.openConfined()) {
            var hooksPtr = hooks == null ? MemorySegment.NULL : PhysicsHooks.allocInto(hooks, arena);
            var eventsPtr = events == null ? MemorySegment.NULL : EventHandler.allocInto(events, arena);
            rapier.sys.RapierC.RprPhysicsPipeline_step(
                    self,
                    gravity.allocInto(arena),
                    integrationParameters.allocInto(arena),
                    islands.memory(),
                    broadPhase.memory(),
                    narrowPhase.memory(),
                    bodies.memory(),
                    colliders.memory(),
                    impulseJoints.memory(),
                    multibodyJoints.memory(),
                    ccdSolver.memory(),
                    Native.memoryOrNull(queryPipeline),
                    hooksPtr.address(),
                    eventsPtr.address()
            );
        }
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
            @Nonnull QueryPipeline[] queryPipeline, // non-null array, nullable contents
            @Nonnull PhysicsHooks[] hooks,
            @Nonnull EventHandler[] events
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
                || queryPipeline.length != hooks.length
                || hooks.length != events.length
        ) {
            throw new IllegalArgumentException("All arrays must be of the same length");
        }
        try (var arena = Arena.openConfined()) {
            var nPipeline = Native.allocPtrSlice(arena, pipeline);
            var nGravity = Vector.allocIntoSlice(arena, gravity);
            var nIntegrationParameters = IntegrationParameters.allocIntoSlice(arena, integrationParameters);
            var nIslands = Native.allocPtrSlice(arena, islands);
            var nBroadPhase = Native.allocPtrSlice(arena, broadPhase);
            var nNarrowPhase = Native.allocPtrSlice(arena, narrowPhase);
            var nBodies = Native.allocPtrSlice(arena, bodies);
            var nColliders = Native.allocPtrSlice(arena, colliders);
            var nImpulseJoints = Native.allocPtrSlice(arena, impulseJoints);
            var nMultibodyJoints = Native.allocPtrSlice(arena, multibodyJoints);
            var nCcdSolver = Native.allocPtrSlice(arena, ccdSolver);
            var nQueryPipeline = Native.allocPtrSlice(arena, queryPipeline);
            var nHooks = PhysicsHooks.allocIntoSlice(arena, hooks);
            var nEvents = EventHandler.allocIntoSlice(arena, events);

            var hooksPtr = arena.allocate(ValueLayout.ADDRESS, nHooks);
            var eventsPtr = arena.allocate(ValueLayout.ADDRESS, nEvents);
            rapier.sys.RapierC.RprPhysicsPipeline_step_all(
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
                    nQueryPipeline,
                    hooksPtr.address(),
                    eventsPtr.address()
            );
        }
    }
}
