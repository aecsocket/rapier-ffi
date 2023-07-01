package rapier.dynamics;

import rapier.__real;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemorySession;
import java.lang.foreign.SegmentAllocator;

public record IntegrationParameters(
        __real dt,
        __real minCcdDt,
        __real erp,
        __real dampingRatio,
        __real jointErp,
        __real jointDampingRatio,
        __real allowedLinearError,
        __real maxPenetrationCorrection,
        __real predictionDistance,
        long maxVelocityIterations,
        long maxVelocityFrictionIterations,
        long maxStabilizationIterations,
        boolean interleaveRestitutionAndFrictionResolution,
        long minIslandSize,
        long maxCcdSubsteps
) {
    public static long sizeof() {
        return rapier.sys.RprIntegrationParameters.sizeof();
    }

    public static MemorySegment alloc(SegmentAllocator alloc) {
        return rapier.sys.RprIntegrationParameters.allocate(alloc);
    }

    public static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return rapier.sys.RprIntegrationParameters.allocateArray(len, alloc);
    }

    public void into(MemorySegment memory) {
        rapier.sys.RprIntegrationParameters.dt$set(memory, dt);
        rapier.sys.RprIntegrationParameters.min_ccd_dt$set(memory, minCcdDt);
        rapier.sys.RprIntegrationParameters.erp$set(memory, erp);
        rapier.sys.RprIntegrationParameters.damping_ratio$set(memory, dampingRatio);
        rapier.sys.RprIntegrationParameters.joint_erp$set(memory, jointErp);
        rapier.sys.RprIntegrationParameters.joint_damping_ratio$set(memory, jointDampingRatio);
        rapier.sys.RprIntegrationParameters.allowed_linear_error$set(memory, allowedLinearError);
        rapier.sys.RprIntegrationParameters.max_penetration_correction$set(memory, maxPenetrationCorrection);
        rapier.sys.RprIntegrationParameters.prediction_distance$set(memory, predictionDistance);
        rapier.sys.RprIntegrationParameters.max_velocity_iterations$set(memory, maxVelocityIterations);
        rapier.sys.RprIntegrationParameters.max_velocity_friction_iterations$set(memory, maxVelocityFrictionIterations);
        rapier.sys.RprIntegrationParameters.max_stabilization_iterations$set(memory, maxStabilizationIterations);
        rapier.sys.RprIntegrationParameters.interleave_restitution_and_friction_resolution$set(memory, interleaveRestitutionAndFrictionResolution);
        rapier.sys.RprIntegrationParameters.min_island_size$set(memory, minIslandSize);
        rapier.sys.RprIntegrationParameters.max_ccd_substeps$set(memory, maxCcdSubsteps);
    }

    public MemorySegment allocInto(SegmentAllocator alloc) {
        var memory = alloc(alloc);
        into(memory);
        return memory;
    }

    public static MemorySegment allocIntoSlice(SegmentAllocator alloc, IntegrationParameters... objs) {
        var memory = allocSlice(alloc, objs.length);
        for (int i = 0; i < objs.length; i++) {
            objs[i].into(memory.asSlice(sizeof() * i));
        }
        return memory;
    }

    public static IntegrationParameters from(MemorySegment memory) {
        return new IntegrationParameters(
                rapier.sys.RprIntegrationParameters.dt$get(memory),
                rapier.sys.RprIntegrationParameters.min_ccd_dt$get(memory),
                rapier.sys.RprIntegrationParameters.erp$get(memory),
                rapier.sys.RprIntegrationParameters.damping_ratio$get(memory),
                rapier.sys.RprIntegrationParameters.joint_erp$get(memory),
                rapier.sys.RprIntegrationParameters.joint_damping_ratio$get(memory),
                rapier.sys.RprIntegrationParameters.allowed_linear_error$get(memory),
                rapier.sys.RprIntegrationParameters.max_penetration_correction$get(memory),
                rapier.sys.RprIntegrationParameters.prediction_distance$get(memory),
                rapier.sys.RprIntegrationParameters.max_velocity_iterations$get(memory),
                rapier.sys.RprIntegrationParameters.max_velocity_friction_iterations$get(memory),
                rapier.sys.RprIntegrationParameters.max_stabilization_iterations$get(memory),
                rapier.sys.RprIntegrationParameters.interleave_restitution_and_friction_resolution$get(memory),
                rapier.sys.RprIntegrationParameters.min_island_size$get(memory),
                rapier.sys.RprIntegrationParameters.max_ccd_substeps$get(memory)
        );
    }

    public static IntegrationParameters defaults() {
        try (var arena = MemorySession.openConfined()) {
            return from(rapier.sys.RapierC.RprIntegrationParameters_default(arena));
        }
    }
}
