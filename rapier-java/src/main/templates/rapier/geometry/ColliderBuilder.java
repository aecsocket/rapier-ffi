package rapier.geometry;

import rapier.DroppableNative;
import rapier.math.*;
import rapier.shape.SharedShape;
import rapier.sys.RapierC;

import java.lang.foreign.MemorySegment;

import static rapier.sys.RapierC.*;

public final class ColliderBuilder extends DroppableNative {
    protected ColliderBuilder(MemorySegment memory) {
        super(memory);
    }

    public static ColliderBuilder at(MemorySegment memory) {
        return new ColliderBuilder(memory);
    }

    public static ColliderBuilder of(SharedShape shape) {
        return ColliderBuilder.at(RprColliderBuilder_new(shape.memory()));
    }

    @Override
    protected void dropInternal() {
        RprColliderBuilder_drop(self);
    }

    public Collider build() {
        return Collider.at(RprColliderBuilder_build(self));
    }

    public ColliderBuilder sensor(boolean sensor) {
        RprColliderBuilder_sensor(self, sensor);
        return this;
    }

    public ColliderBuilder friction({{ real }} friction) {
        {{ sys }}.RapierC.RprColliderBuilder_friction(self, friction);
        return this;
    }

    public ColliderBuilder frictionCombineRule(CoefficientCombineRule rule) {
        RprColliderBuilder_friction_combine_rule(self, rule.ordinal());
        return this;
    }

    public ColliderBuilder restitution({{ real }} restitution) {
        {{ sys }}.RapierC.RprColliderBuilder_restitution(self, restitution);
        return this;
    }

    public ColliderBuilder restitutionCombineRule(CoefficientCombineRule rule) {
        RprColliderBuilder_restitution_combine_rule(self, rule.ordinal());
        return this;
    }

    public ColliderBuilder density({{ real }} density) {
        {{ sys }}.RapierC.RprColliderBuilder_density(self, density);
        return this;
    }

    public ColliderBuilder mass({{ real }} mass) {
        {{ sys }}.RapierC.RprColliderBuilder_mass(self, mass);
        return this;
    }

    public ColliderBuilder contactForceEventThreshold({{ real }} threshold) {
        {{ sys }}.RapierC.RprColliderBuilder_contact_force_event_threshold(self, threshold);
        return this;
    }

    public ColliderBuilder translation({{ realVec }} translation) {
        {{ sys }}.RapierC.RprColliderBuilder_translation(self, translation.memory());
        return this;
    }

    public ColliderBuilder rotation({{ realAngVec }} rotation) {
        {{ sys }}.RapierC.RprColliderBuilder_rotation(self, rotation.memory());
        return this;
    }
}
