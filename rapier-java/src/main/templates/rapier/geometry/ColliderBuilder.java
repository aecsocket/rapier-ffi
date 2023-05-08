package rapier.geometry;

import rapier.DroppableNative;

import java.lang.foreign.MemorySegment;

import static rapier.sys.RapierC.*;

public final class ColliderBuilder extends DroppableNative {
    protected ColliderBuilder(MemorySegment memory) {
        super(memory);
    }

    public static ColliderBuilder at(MemorySegment memory) {
        return new ColliderBuilder(memory);
    }

    public static ColliderBuilder ball({{ real }} radius) {
        return ColliderBuilder.at({{ sys }}.RapierC.RprColliderBuilder_ball(radius));
    }

    public static ColliderBuilder cuboid({{ real }} hx, {{ real }} hy, {{ real }} hz) {
        return ColliderBuilder.at({{ sys }}.RapierC.RprColliderBuilder_cuboid(hx, hy, hz));
    }

    @Override
    protected void dropInternal() {
        RprColliderBuilder_drop(self);
    }

    public Collider build() {
        return Collider.at(RprColliderBuilder_build(self));
    }

    public ColliderBuilder restitution({{ real }} restitution) {
        {{ sys }}.RapierC.RprColliderBuilder_restitution(self, restitution);
        return this;
    }
}
