package rapier.geometry;

import rapier.DropFlag;
import rapier.Droppable;
import rapier.RefNative;
import rapier.math.*;
import rapier.shape.SharedShape;
import rapier.sys.RapierC;

import java.lang.foreign.MemoryAddress;

import static rapier.sys.RapierC.*;

public final class ColliderBuilder extends RefNative implements Droppable {
    private final DropFlag dropped = new DropFlag();

    @Override
    public void drop() {
        dropped.drop(() -> RprColliderBuilder_drop(self));
    }

    private ColliderBuilder(MemoryAddress memory) {
        super(memory);
    }

    public static ColliderBuilder at(MemoryAddress memory) {
        return new ColliderBuilder(memory);
    }

    public static ColliderBuilder of(SharedShape shape) {
        return ColliderBuilder.at(RprColliderBuilder_new(shape.memory()));
    }

    public Collider.Mut build() {
        return Collider.atMut(RprColliderBuilder_build(self));
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

    public ColliderBuilder translation(Vector translation) {
        {{ sys }}.RapierC.RprColliderBuilder_translation(self, translation.memory());
        return this;
    }

    public ColliderBuilder rotation(AngVector rotation) {
        {{ sys }}.RapierC.RprColliderBuilder_rotation(self, rotation.memory());
        return this;
    }

    public ColliderBuilder position(Isometry pos) {
        {{ sys }}.RapierC.RprColliderBuilder_position(self, pos.memory());
        return this;
    }

    public ColliderBuilder enabled(boolean enabled) {
        {{ sys }}.RapierC.RprColliderBuilder_enabled(self, enabled);
        return this;
    }
}
