package rapier.dynamics;

import rapier.sys.RprIntegrationParameters;

import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemorySession;
import java.lang.foreign.SegmentAllocator;

public record IntegrationParameters(
        {{ real }} dt,
        {{ real }} minCcdDt,
        {{ real }} erp,
        {{ real }} dampingRatio,
        {{ real }} jointErp,
        {{ real }} jointDampingRatio,
        {{ real }} allowedLinearError,
        {{ real }} maxPenetrationCorrection,
        {{ real }} predictionDistance,
        long maxVelocityIterations,
        long maxVelocityFrictionIterations,
        long maxStabilizationIterations,
        boolean interleaveRestitutionAndFrictionResolution,
        long minIslandSize,
        long maxCcdSubsteps
) {
    public static long sizeof() {
        return {{ sys }}.RprIntegrationParameters.sizeof();
    }

    public static MemorySegment alloc(SegmentAllocator alloc) {
        return {{ sys }}.RprIntegrationParameters.allocate(alloc);
    }

    public static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return {{ sys }}.RprIntegrationParameters.allocateArray(len, alloc);
    }

    public void into(MemorySegment memory) {
        {{ sys }}.RprIntegrationParameters.dt$set(memory, dt);
        {{ sys }}.RprIntegrationParameters.min_ccd_dt$set(memory, minCcdDt);
        {{ sys }}.RprIntegrationParameters.erp$set(memory, erp);
        {{ sys }}.RprIntegrationParameters.damping_ratio$set(memory, dampingRatio);
        {{ sys }}.RprIntegrationParameters.joint_erp$set(memory, jointErp);
        {{ sys }}.RprIntegrationParameters.joint_damping_ratio$set(memory, jointDampingRatio);
        {{ sys }}.RprIntegrationParameters.allowed_linear_error$set(memory, allowedLinearError);
        {{ sys }}.RprIntegrationParameters.max_penetration_correction$set(memory, maxPenetrationCorrection);
        {{ sys }}.RprIntegrationParameters.prediction_distance$set(memory, predictionDistance);
        {{ sys }}.RprIntegrationParameters.max_velocity_iterations$set(memory, maxVelocityIterations);
        {{ sys }}.RprIntegrationParameters.max_velocity_friction_iterations$set(memory, maxVelocityFrictionIterations);
        {{ sys }}.RprIntegrationParameters.max_stabilization_iterations$set(memory, maxStabilizationIterations);
        {{ sys }}.RprIntegrationParameters.interleave_restitution_and_friction_resolution$set(memory, interleaveRestitutionAndFrictionResolution);
        {{ sys }}.RprIntegrationParameters.min_island_size$set(memory, minIslandSize);
        {{ sys }}.RprIntegrationParameters.max_ccd_substeps$set(memory, maxCcdSubsteps);
    }

    public MemorySegment allocInto(SegmentAllocator alloc) {
        var memory = alloc(alloc);
        into(memory);
        return memory;
    }

    public static MemorySegment allocIntoSlice(SegmentAllocator alloc, IntegrationParameters... objs) {
        var memory = allocSlice(objs.length, alloc);
        for (int i = 0; i < objs.length; i++) {
            objs[i].into(memory.asSlice(sizeof() * i));
        }
        return memory;
    }

    public static IntegrationParameters from(MemorySegment memory) {
        return new IntegrationParameters(
                {{ sys }}.RprIntegrationParameters.dt$get(memory),
                {{ sys }}.RprIntegrationParameters.min_ccd_dt$get(memory),
                {{ sys }}.RprIntegrationParameters.erp$get(memory),
                {{ sys }}.RprIntegrationParameters.damping_ratio$get(memory),
                {{ sys }}.RprIntegrationParameters.joint_erp$get(memory),
                {{ sys }}.RprIntegrationParameters.joint_damping_ratio$get(memory),
                {{ sys }}.RprIntegrationParameters.allowed_linear_error$get(memory),
                {{ sys }}.RprIntegrationParameters.max_penetration_correction$get(memory),
                {{ sys }}.RprIntegrationParameters.prediction_distance$get(memory),
                {{ sys }}.RprIntegrationParameters.max_velocity_iterations$get(memory),
                {{ sys }}.RprIntegrationParameters.max_velocity_friction_iterations$get(memory),
                {{ sys }}.RprIntegrationParameters.max_stabilization_iterations$get(memory),
                {{ sys }}.RprIntegrationParameters.interleave_restitution_and_friction_resolution$get(memory),
                {{ sys }}.RprIntegrationParameters.min_island_size$get(memory),
                {{ sys }}.RprIntegrationParameters.max_ccd_substeps$get(memory)
        );
    }

    public static IntegrationParameters fromDefault() {
        try (var arena = MemorySession.openConfined()) {
            var memory = {{ sys }}.RapierC.RprIntegrationParameters_default(arena);
            return from(memory);
        }
    }
}
