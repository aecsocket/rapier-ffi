
package rapier.geometry;

import rapier.BaseNative;
import rapier.DropFlag;
import rapier.Droppable;
import rapier.data.ArenaKey;
import rapier.math.*;
import rapier.shape.SharedShape;
import rapier.sys.RapierC;

import javax.annotation.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static rapier.sys.RapierC.*;

public sealed class Collider extends BaseNative permits Collider.Mut {
    protected Collider(MemorySegment memory) {
        super(memory);
    }

    public static Collider at(MemorySegment memory) {
        return new Collider(memory);
    }

    public static Mut atMut(MemorySegment memory) {
        return new Mut(memory);
    }

    public @Nullable Long getParent() {
        try (var arena = Arena.openConfined()) {
            var res = ArenaKey.pack(RprCollider_parent(arena, self));
            return ArenaKey.isValid(res) ? res : null;
        }
    }

    public boolean isSensor() {
        return RprCollider_is_sensor(self);
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

    public Vector getTranslation(SegmentAllocator alloc) {
        return Vector.at({{ sys }}.RapierC.RprCollider_translation(alloc, self));
    }

    public Rotation getRotation(SegmentAllocator alloc) {
        return Rotation.at({{ sys }}.RapierC.RprCollider_rotation(alloc, self));
    }

    public Isometry getPosition(SegmentAllocator alloc) {
        return Isometry.at({{ sys }}.RapierC.RprCollider_position(alloc, self));
    }

    public @Nullable Isometry getPositionWrtParent(SegmentAllocator alloc) {
        if (getParent() == null) return null;
        return Isometry.at({{ sys }}.RapierC.RprCollider_position_wrt_parent(alloc, self));
    }

    public {{ real }} getVolume() {
        return {{ sys }}.RapierC.RprCollider_volume(self);
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

    public Aabb computeAabb(SegmentAllocator alloc) {
        return Aabb.at({{ sys }}.RapierC.RprCollider_compute_aabb(alloc, self));
    }

    public Aabb computeSweptAabb(SegmentAllocator alloc, Isometry nextPosition) {
        return Aabb.at({{ sys }}.RapierC.RprCollider_compute_swept_aabb(alloc, self, nextPosition.memory()));
    }

    public static final class Mut extends Collider implements Droppable {
        private final DropFlag dropped = new DropFlag();

        @Override
        public void drop() {
            dropped.drop(() -> RprCollider_drop(self));
        }

        protected Mut(MemorySegment memory) {
            super(memory);
        }

        public void setSensor(boolean isSensor) {
            RprCollider_set_sensor(self, isSensor);
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
            {{ sys }}.RapierC.RprCollider_set_translation(self, translation.memory());
        }

        public void setRotation(AngVector rotation) {
            {{ sys }}.RapierC.RprCollider_set_rotation(self, rotation.memory());
        }

        public void setPosition(Isometry position) {
            {{ sys }}.RapierC.RprCollider_set_position(self, position.memory());
        }

        public void setTranslationWrtParent(Vector translation) {
            {{ sys }}.RapierC.RprCollider_set_translation_wrt_parent(self, translation.memory());
        }

        public void setRotationWrtParent(AngVector rotation) {
            {{ sys }}.RapierC.RprCollider_set_rotation_wrt_parent(self, rotation.memory());
        }

        public void setPositionWrtParent(Isometry posWrtParent) {
            {{ sys }}.RapierC.RprCollider_set_position_wrt_parent(self, posWrtParent.memory());
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
