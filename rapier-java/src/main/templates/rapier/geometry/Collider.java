
package rapier.geometry;

import rapier.BaseNative;
import rapier.DropFlag;
import rapier.Droppable;
import rapier.RefNative;
import rapier.data.ArenaKey;
import rapier.math.*;
import rapier.shape.SharedShape;
import rapier.sys.RapierC;

import javax.annotation.Nullable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static rapier.sys.RapierC.*;

public sealed class Collider extends RefNative permits Collider.Mut {
    protected Collider(MemoryAddress memory) {
        super(memory);
    }

    public static Collider at(MemoryAddress memory) {
        return new Collider(memory);
    }

    public static Mut atMut(MemoryAddress memory) {
        return new Mut(memory);
    }

    public @Nullable ArenaKey getParent() {
        try (var arena = MemorySession.openConfined()) {
            var res = ArenaKey.from(RprCollider_parent(arena, self));
            return res.isValid() ? res : null;
        }
    }

    public boolean isSensor() {
        return RprCollider_is_sensor(self);
    }

    public int getActiveHooks() {
        return RprCollider_active_hooks(self);
    }

    public int getActiveEvents() {
        return RprCollider_active_events(self);
    }

    public short getActiveCollisionTypes() {
        return RprCollider_active_collision_types(self);
    }

    public {{ real }} getFriction() {
        return {{ sys }}.RapierC.RprCollider_friction(self);
    }

    public CoefficientCombineRule getFrictionCombineRule() {
        return CoefficientCombineRule.values()[RprCollider_friction_combine_rule(self)];
    }

    public {{ real }} getRestitution() {
        return {{ sys }}.RapierC.RprCollider_restitution(self);
    }

    public CoefficientCombineRule getRestitutionCombineRule() {
        return CoefficientCombineRule.values()[RprCollider_restitution_combine_rule(self)];
    }

    public {{ real }} getContactForceEventThreshold() {
        return {{ sys }}.RapierC.RprCollider_contact_force_event_threshold(self);
    }

    public boolean isEnabled() {
        return {{ sys }}.RapierC.RprCollider_is_enabled(self);
    }

    public Vector getTranslation() {
        try (var arena = MemorySession.openConfined()) {
            return Vector.from({{ sys }}.RapierC.RprCollider_translation(arena, self));
        }
    }

    public Rotation getRotation() {
        try (var arena = MemorySession.openConfined()) {
            return Rotation.from({{ sys }}.RapierC.RprCollider_rotation(arena, self));
        }
    }

    public Isometry getPosition() {
        try (var arena = MemorySession.openConfined()) {
            return Isometry.from({{ sys }}.RapierC.RprCollider_position(arena, self));
        }
    }

    public @Nullable Isometry getPositionWrtParent() {
        if (getParent() == null) return null;
        try (var arena = MemorySession.openConfined()) {
            return Isometry.from({{sys}}.RapierC.RprCollider_position_wrt_parent(arena, self));
        }
    }

    public InteractionGroups getCollisionGroups() {
        try (var arena = MemorySession.openConfined()) {
            return InteractionGroups.from(RprCollider_collision_groups(arena, self));
        }
    }

    public InteractionGroups getSolverGroups() {
        try (var arena = MemorySession.openConfined()) {
            return InteractionGroups.from(RprCollider_solver_groups(arena, self));
        }
    }

    public {{ real }} getVolume() {
        return {{ sys }}.RapierC.RprCollider_volume(self);
    }

    public ColliderMaterial getMaterial() {
        try (var arena = MemorySession.openConfined()) {
            return ColliderMaterial.from({{ sys }}.RapierC.RprCollider_material(arena, self));
        }
    }

    public {{ real }} getDensity() {
        return {{ sys }}.RapierC.RprCollider_density(self);
    }

    public {{ real }} getMass() {
        return {{ sys }}.RapierC.RprCollider_mass(self);
    }

    public SharedShape getShape() {
        return SharedShape.at({{ sys }}.RapierC.RprCollider_shape(self));
    }

    public Aabb computeAabb() {
        try (var arena = MemorySession.openConfined()) {
            return Aabb.from({{ sys }}.RapierC.RprCollider_compute_aabb(arena, self));
        }
    }

    public Aabb computeSweptAabb(Isometry nextPosition) {
        try (var arena = MemorySession.openConfined()) {
            return Aabb.from({{ sys }}.RapierC.RprCollider_compute_swept_aabb(arena, self, nextPosition.allocate(arena)));
        }
    }

    public static final class Mut extends Collider implements Droppable {
        private final DropFlag dropped = new DropFlag();

        @Override
        public void drop() {
            dropped.drop(() -> RprCollider_drop(self));
        }

        private Mut(MemoryAddress memory) {
            super(memory);
        }

        public void setSensor(boolean isSensor) {
            RprCollider_set_sensor(self, isSensor);
        }

        public void setActiveHooks(int activeHooks) {
            RprCollider_set_active_hooks(self, activeHooks);
        }

        public void setActiveEvents(int activeEvents) {
            RprCollider_set_active_events(self, activeEvents);
        }

        public void setActiveCollisionTypes(short activeCollisionTypes) {
            RprCollider_set_active_collision_types(self, activeCollisionTypes);
        }

        public void setFriction({{ real }} coefficient) {
            {{ sys }}.RapierC.RprCollider_set_friction(self, coefficient);
        }

        public void setFrictionCombineRule(CoefficientCombineRule rule) {
            RprCollider_set_friction_combine_rule(self, rule.ordinal());
        }

        public void setRestitution({{ real }} coefficient) {
            {{ sys }}.RapierC.RprCollider_set_restitution(self, coefficient);
        }

        public void setRestitutionCombineRule(CoefficientCombineRule rule) {
            RprCollider_set_restitution_combine_rule(self, rule.ordinal());
        }

        public void setContactForceEventThreshold({{ real }} threshold) {
            {{ sys }}.RapierC.RprCollider_set_contact_force_event_threshold(self, threshold);
        }

        public void setEnabled(boolean enabled) {
            RprCollider_set_enabled(self, enabled);
        }

        public void setTranslation(Vector translation) {
            try (var arena = MemorySession.openConfined()) {
                {{ sys }}.RapierC.RprCollider_set_translation(self, translation.allocate(arena));
            }
        }

        public void setRotation(AngVector rotation) {
            try (var arena = MemorySession.openConfined()) {
                {{ sys }}.RapierC.RprCollider_set_rotation(self, rotation.allocate(arena));
            }
        }

        public void setPosition(Isometry position) {
            try (var arena = MemorySession.openConfined()) {
                {{ sys }}.RapierC.RprCollider_set_position(self, position.allocate(arena));
            }
        }

        public void setTranslationWrtParent(Vector translation) {
            try (var arena = MemorySession.openConfined()) {
                {{ sys }}.RapierC.RprCollider_set_translation_wrt_parent(self, translation.allocate(arena));
            }
        }

        public void setRotationWrtParent(AngVector rotation) {
            try (var arena = MemorySession.openConfined()) {
                {{ sys }}.RapierC.RprCollider_set_rotation_wrt_parent(self, rotation.allocate(arena));
            }
        }

        public void setPositionWrtParent(Isometry posWrtParent) {
            try (var arena = MemorySession.openConfined()) {
                {{ sys }}.RapierC.RprCollider_set_position_wrt_parent(self, posWrtParent.allocate(arena));
            }
        }

        public void setCollisionGroups(InteractionGroups groups) {
            try (var arena = MemorySession.openConfined()) {
                RprCollider_set_collision_groups(self, groups.allocate(arena));
            }
        }

        public void setSolverGroups(InteractionGroups groups) {
            try (var arena = MemorySession.openConfined()) {
                RprCollider_set_solver_groups(self, groups.allocate(arena));
            }
        }

        public void setDensity({{ real }} density) {
            {{ sys }}.RapierC.RprCollider_set_density(self, density);
        }

        public void setMass({{ real }} mass) {
            {{ sys }}.RapierC.RprCollider_set_mass(self, mass);
        }

        public void setShape(SharedShape shape) {
            RprCollider_set_shape(self, shape.memory());
        }
    }
}
