package rapier.dynamics;

import rapier.ValNative;
import rapier.sys.RprIntegrationParametersDesc;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public final class IntegrationParametersDesc extends ValNative {
    private IntegrationParametersDesc(MemorySegment memory) {
        super(memory);
    }

    private static IntegrationParametersDesc at(MemorySegment memory) {
        return new IntegrationParametersDesc(memory);
    }

    public static IntegrationParametersDesc ofDefault(SegmentAllocator alloc) {
        return at({{ sys }}.RapierC.RprIntegrationParametersDesc_default(alloc));
    }

    public {{ real }} getDt() {
        return {{ sys }}.RprIntegrationParametersDesc.dt$get(self);
    }

    public void setDt({{ real }} dt) {
        {{ sys }}.RprIntegrationParametersDesc.dt$set(self, dt);
    }

    public {{ real }} getMinCcdDt() {
        return {{ sys }}.RprIntegrationParametersDesc.min_ccd_dt$get(self);
    }

    public void setMinCcdDt({{ real }} minCcdDt) {
        {{ sys }}.RprIntegrationParametersDesc.min_ccd_dt$set(self, minCcdDt);
    }

    public {{ real }} getErp() {
        return {{ sys }}.RprIntegrationParametersDesc.erp$get(self);
    }

    public void setErp({{ real }} erp) {
        {{ sys }}.RprIntegrationParametersDesc.erp$set(self, erp);
    }

    public {{ real }} getDampingRatio() {
        return {{ sys }}.RprIntegrationParametersDesc.damping_ratio$get(self);
    }

    public void setDampingRatio({{ real }} dampingRatio) {
        {{ sys }}.RprIntegrationParametersDesc.damping_ratio$set(self, dampingRatio);
    }

    public {{ real }} getJointErp() {
        return {{ sys }}.RprIntegrationParametersDesc.joint_erp$get(self);
    }

    public void setJointErp({{ real }} jointErp) {
        {{ sys }}.RprIntegrationParametersDesc.joint_erp$set(self, jointErp);
    }

    public {{ real }} getJointDampingRatio() {
        return {{ sys }}.RprIntegrationParametersDesc.joint_damping_ratio$get(self);
    }

    public void setJointDampingRatio({{ real }} jointDampingRatio) {
        {{ sys }}.RprIntegrationParametersDesc.joint_damping_ratio$set(self, jointDampingRatio);
    }

    public {{ real }} getAllowedLinearError() {
        return {{ sys }}.RprIntegrationParametersDesc.allowed_linear_error$get(self);
    }

    public void setAllowedLinearError({{ real }} allowedLinearError) {
        {{ sys }}.RprIntegrationParametersDesc.allowed_linear_error$set(self, allowedLinearError);
    }

    public {{ real }} getMaxPenetrationCorrection() {
        return {{ sys }}.RprIntegrationParametersDesc.max_penetration_correction$get(self);
    }

    public void setMaxPenetrationCorrection({{ real }} maxPenetrationCorrection) {
        {{ sys }}.RprIntegrationParametersDesc.max_penetration_correction$set(self, maxPenetrationCorrection);
    }

    public {{ real }} getPredictionDistance() {
        return {{ sys }}.RprIntegrationParametersDesc.prediction_distance$get(self);
    }

    public void setPredictionDistance({{ real }} predictionDistance) {
        {{ sys }}.RprIntegrationParametersDesc.prediction_distance$set(self, predictionDistance);
    }

    public long getMaxVelocityIterations() {
        return {{ sys }}.RprIntegrationParametersDesc.max_velocity_iterations$get(self);
    }

    public void setMaxVelocityIterations(long maxVelocityIterations) {
        {{ sys }}.RprIntegrationParametersDesc.max_velocity_iterations$set(self, maxVelocityIterations);
    }

    public long getMaxVelocityFrictionIterations() {
        return {{ sys }}.RprIntegrationParametersDesc.max_velocity_friction_iterations$get(self);
    }

    public void setMaxVelocityFrictionIterations(long maxVelocityFrictionIterations) {
        {{ sys }}.RprIntegrationParametersDesc.max_velocity_friction_iterations$set(self, maxVelocityFrictionIterations);
    }

    public long getMaxStabilizationIterations() {
        return {{ sys }}.RprIntegrationParametersDesc.max_stabilization_iterations$get(self);
    }

    public void setMaxStabilizationIterations(long maxStabilizationIterations) {
        {{ sys }}.RprIntegrationParametersDesc.max_stabilization_iterations$set(self, maxStabilizationIterations);
    }

    public boolean getInterleaveRestitutionAndFrictionResolution() {
        return {{ sys }}.RprIntegrationParametersDesc.interleave_restitution_and_friction_resolution$get(self);
    }

    public void setInterleaveRestitutionAndFrictionResolution(boolean interleaveRestitutionAndFrictionResolution) {
        {{ sys }}.RprIntegrationParametersDesc.interleave_restitution_and_friction_resolution$set(self, interleaveRestitutionAndFrictionResolution);
    }

    public long getMinIslandSize() {
        return {{ sys }}.RprIntegrationParametersDesc.min_island_size$get(self);
    }

    public void setMinIslandSize(long minIslandSize) {
        {{ sys }}.RprIntegrationParametersDesc.min_island_size$set(self, minIslandSize);
    }

    public long getMaxCcdSubsteps() {
        return {{ sys }}.RprIntegrationParametersDesc.max_ccd_substeps$get(self);
    }

    public void setMaxCcdSubsteps(long maxCcdSubsteps) {
        {{ sys }}.RprIntegrationParametersDesc.max_ccd_substeps$set(self, maxCcdSubsteps);
    }

    public IntegrationParameters build() {
        return IntegrationParameters.at({{ sys }}.RapierC.RprIntegrationParameters_new(self));
    }
}
