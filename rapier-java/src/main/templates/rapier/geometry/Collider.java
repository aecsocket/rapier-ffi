
package rapier.geometry;

import rapier.DropFlag;
import rapier.Droppable;
import rapier.RefNative;
import rapier.__real;
import rapier.data.ArenaKey;
import rapier.math.*;
import rapier.shape.SharedShape;

import javax.annotation.Nullable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;

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
            var res = ArenaKey.from(rapier.sys.RapierC.RprCollider_parent(arena, self));
            return res.isValid() ? res : null;
        }
    }

    public boolean isSensor() {
        return rapier.sys.RapierC.RprCollider_is_sensor(self);
    }

    public int getActiveHooks() {
        return rapier.sys.RapierC.RprCollider_active_hooks(self);
    }

    public int getActiveEvents() {
        return rapier.sys.RapierC.RprCollider_active_events(self);
    }

    public short getActiveCollisionTypes() {
        return rapier.sys.RapierC.RprCollider_active_collision_types(self);
    }

    public __real getFriction() {
        return rapier.sys.RapierC.RprCollider_friction(self);
    }

    public CoefficientCombineRule getFrictionCombineRule() {
        return CoefficientCombineRule.values()[rapier.sys.RapierC.RprCollider_friction_combine_rule(self)];
    }

    public __real getRestitution() {
        return rapier.sys.RapierC.RprCollider_restitution(self);
    }

    public CoefficientCombineRule getRestitutionCombineRule() {
        return CoefficientCombineRule.values()[rapier.sys.RapierC.RprCollider_restitution_combine_rule(self)];
    }

    public __real getContactForceEventThreshold() {
        return rapier.sys.RapierC.RprCollider_contact_force_event_threshold(self);
    }

    public boolean isEnabled() {
        return rapier.sys.RapierC.RprCollider_is_enabled(self);
    }

    public Vector getTranslation() {
        try (var arena = MemorySession.openConfined()) {
            return Vector.from(rapier.sys.RapierC.RprCollider_translation(arena, self));
        }
    }

    public Rotation getRotation() {
        try (var arena = MemorySession.openConfined()) {
            return Rotation.from(rapier.sys.RapierC.RprCollider_rotation(arena, self));
        }
    }

    public Isometry getPosition() {
        try (var arena = MemorySession.openConfined()) {
            return Isometry.from(rapier.sys.RapierC.RprCollider_position(arena, self));
        }
    }

    public @Nullable Isometry getPositionWrtParent() {
        if (getParent() == null) return null;
        try (var arena = MemorySession.openConfined()) {
            return Isometry.from(rapier.sys.RapierC.RprCollider_position_wrt_parent(arena, self));
        }
    }

    public InteractionGroups getCollisionGroups() {
        try (var arena = MemorySession.openConfined()) {
            return InteractionGroups.from(rapier.sys.RapierC.RprCollider_collision_groups(arena, self));
        }
    }

    public InteractionGroups getSolverGroups() {
        try (var arena = MemorySession.openConfined()) {
            return InteractionGroups.from(rapier.sys.RapierC.RprCollider_solver_groups(arena, self));
        }
    }

    public __real getVolume() {
        return rapier.sys.RapierC.RprCollider_volume(self);
    }

    public ColliderMaterial getMaterial() {
        try (var arena = MemorySession.openConfined()) {
            return ColliderMaterial.from(rapier.sys.RapierC.RprCollider_material(arena, self));
        }
    }

    public __real getDensity() {
        return rapier.sys.RapierC.RprCollider_density(self);
    }

    public __real getMass() {
        return rapier.sys.RapierC.RprCollider_mass(self);
    }

    public SharedShape getShape() {
        return SharedShape.at(rapier.sys.RapierC.RprCollider_shape(self));
    }

    public Aabb computeAabb() {
        try (var arena = MemorySession.openConfined()) {
            return Aabb.from(rapier.sys.RapierC.RprCollider_compute_aabb(arena, self));
        }
    }

    public Aabb computeSweptAabb(Isometry nextPosition) {
        try (var arena = MemorySession.openConfined()) {
            return Aabb.from(rapier.sys.RapierC.RprCollider_compute_swept_aabb(arena, self, nextPosition.allocInto(arena)));
        }
    }

    public static final class Mut extends Collider implements Droppable {
        private final DropFlag dropped = new DropFlag();

        @Override
        public void drop() {
            dropped.drop(() -> rapier.sys.RapierC.RprCollider_drop(self));
        }

        private Mut(MemoryAddress memory) {
            super(memory);
        }

        public void setSensor(boolean isSensor) {
            rapier.sys.RapierC.RprCollider_set_sensor(self, isSensor);
        }

        public void setActiveHooks(int activeHooks) {
            rapier.sys.RapierC.RprCollider_set_active_hooks(self, activeHooks);
        }

        public void setActiveEvents(int activeEvents) {
            rapier.sys.RapierC.RprCollider_set_active_events(self, activeEvents);
        }

        public void setActiveCollisionTypes(short activeCollisionTypes) {
            rapier.sys.RapierC.RprCollider_set_active_collision_types(self, activeCollisionTypes);
        }

        public void setFriction(__real coefficient) {
            rapier.sys.RapierC.RprCollider_set_friction(self, coefficient);
        }

        public void setFrictionCombineRule(CoefficientCombineRule rule) {
            rapier.sys.RapierC.RprCollider_set_friction_combine_rule(self, rule.ordinal());
        }

        public void setRestitution(__real coefficient) {
            rapier.sys.RapierC.RprCollider_set_restitution(self, coefficient);
        }

        public void setRestitutionCombineRule(CoefficientCombineRule rule) {
            rapier.sys.RapierC.RprCollider_set_restitution_combine_rule(self, rule.ordinal());
        }

        public void setContactForceEventThreshold(__real threshold) {
            rapier.sys.RapierC.RprCollider_set_contact_force_event_threshold(self, threshold);
        }

        public void setEnabled(boolean enabled) {
            rapier.sys.RapierC.RprCollider_set_enabled(self, enabled);
        }

        public void setTranslation(Vector translation) {
            try (var arena = MemorySession.openConfined()) {
                rapier.sys.RapierC.RprCollider_set_translation(self, translation.allocInto(arena));
            }
        }

        public void setRotation(AngVector rotation) {
            try (var arena = MemorySession.openConfined()) {
                rapier.sys.RapierC.RprCollider_set_rotation(self, rotation.allocInto(arena));
            }
        }

        public void setPosition(Isometry position) {
            try (var arena = MemorySession.openConfined()) {
                rapier.sys.RapierC.RprCollider_set_position(self, position.allocInto(arena));
            }
        }

        public void setTranslationWrtParent(Vector translation) {
            try (var arena = MemorySession.openConfined()) {
                rapier.sys.RapierC.RprCollider_set_translation_wrt_parent(self, translation.allocInto(arena));
            }
        }

        public void setRotationWrtParent(AngVector rotation) {
            try (var arena = MemorySession.openConfined()) {
                rapier.sys.RapierC.RprCollider_set_rotation_wrt_parent(self, rotation.allocInto(arena));
            }
        }

        public void setPositionWrtParent(Isometry posWrtParent) {
            try (var arena = MemorySession.openConfined()) {
                rapier.sys.RapierC.RprCollider_set_position_wrt_parent(self, posWrtParent.allocInto(arena));
            }
        }

        public void setCollisionGroups(InteractionGroups groups) {
            try (var arena = MemorySession.openConfined()) {
                rapier.sys.RapierC.RprCollider_set_collision_groups(self, groups.allocInto(arena));
            }
        }

        public void setSolverGroups(InteractionGroups groups) {
            try (var arena = MemorySession.openConfined()) {
                rapier.sys.RapierC.RprCollider_set_solver_groups(self, groups.allocInto(arena));
            }
        }

        public void setDensity(__real density) {
            rapier.sys.RapierC.RprCollider_set_density(self, density);
        }

        public void setMass(__real mass) {
            rapier.sys.RapierC.RprCollider_set_mass(self, mass);
        }

        public void setShape(SharedShape shape) {
            rapier.sys.RapierC.RprCollider_set_shape(self, shape.memory());
        }
    }
}
