package rapier.geometry;

import rapier.DropFlag;
import rapier.Droppable;
import rapier.RefNative;
import rapier.__real;
import rapier.math.*;
import rapier.shape.SharedShape;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.Arena;

public final class ColliderBuilder extends RefNative implements Droppable {
    private final DropFlag dropped = new DropFlag();

    @Override
    public void drop() {
        dropped.drop(() -> rapier.sys.RapierC.RprColliderBuilder_drop(self));
    }

    private ColliderBuilder(MemorySegment memory) {
        super(memory);
    }

    public static ColliderBuilder at(MemorySegment memory) {
        return new ColliderBuilder(memory);
    }

    public static ColliderBuilder of(SharedShape shape) {
        return ColliderBuilder.at(rapier.sys.RapierC.RprColliderBuilder_new(shape.memory()));
    }

    public Collider.Mut build() {
        return Collider.atMut(rapier.sys.RapierC.RprColliderBuilder_build(self));
    }

    public ColliderBuilder collisionGroups(InteractionGroups groups) {
        try (var arena = Arena.openConfined()) {
            rapier.sys.RapierC.RprColliderBuilder_collision_groups(self, groups.allocInto(arena));
        }
        return this;
    }

    public ColliderBuilder solverGroups(InteractionGroups groups) {
        try (var arena = Arena.openConfined()) {
            rapier.sys.RapierC.RprColliderBuilder_solver_groups(self, groups.allocInto(arena));
        }
        return this;
    }

    public ColliderBuilder sensor(boolean sensor) {
        rapier.sys.RapierC.RprColliderBuilder_sensor(self, sensor);
        return this;
    }

    public ColliderBuilder activeHooks(int activeHooks) {
        rapier.sys.RapierC.RprColliderBuilder_active_hooks(self, activeHooks);
        return this;
    }

    public ColliderBuilder activeEvents(int activeEvents) {
        rapier.sys.RapierC.RprColliderBuilder_active_events(self, activeEvents);
        return this;
    }

    public ColliderBuilder activeCollisionTypes(short activeCollisionTypes) {
        rapier.sys.RapierC.RprColliderBuilder_active_collision_types(self, activeCollisionTypes);
        return this;
    }

    public ColliderBuilder friction(__real friction) {
        rapier.sys.RapierC.RprColliderBuilder_friction(self, friction);
        return this;
    }

    public ColliderBuilder frictionCombineRule(CoefficientCombineRule rule) {
        rapier.sys.RapierC.RprColliderBuilder_friction_combine_rule(self, rule.ordinal());
        return this;
    }

    public ColliderBuilder restitution(__real restitution) {
        rapier.sys.RapierC.RprColliderBuilder_restitution(self, restitution);
        return this;
    }

    public ColliderBuilder restitutionCombineRule(CoefficientCombineRule rule) {
        rapier.sys.RapierC.RprColliderBuilder_restitution_combine_rule(self, rule.ordinal());
        return this;
    }

    public ColliderBuilder density(__real density) {
        rapier.sys.RapierC.RprColliderBuilder_density(self, density);
        return this;
    }

    public ColliderBuilder mass(__real mass) {
        rapier.sys.RapierC.RprColliderBuilder_mass(self, mass);
        return this;
    }

    public ColliderBuilder contactForceEventThreshold(__real threshold) {
        rapier.sys.RapierC.RprColliderBuilder_contact_force_event_threshold(self, threshold);
        return this;
    }

    public ColliderBuilder translation(Vector translation) {
        try (var arena = Arena.openConfined()) {
            rapier.sys.RapierC.RprColliderBuilder_translation(self, translation.allocInto(arena));
        }
        return this;
    }

    public ColliderBuilder rotation(AngVector rotation) {
        try (var arena = Arena.openConfined()) {
            rapier.sys.RapierC.RprColliderBuilder_rotation(self, rotation.allocInto(arena));
        }
        return this;
    }

    public ColliderBuilder position(Isometry pos) {
        try (var arena = Arena.openConfined()) {
            rapier.sys.RapierC.RprColliderBuilder_position(self, pos.allocInto(arena));
        }
        return this;
    }

    public ColliderBuilder enabled(boolean enabled) {
        rapier.sys.RapierC.RprColliderBuilder_enabled(self, enabled);
        return this;
    }
}
