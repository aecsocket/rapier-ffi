
package rapier.geometry;

import rapier.DroppableNative;

import java.lang.foreign.MemorySegment;

import static rapier.sys.RapierC.*;

public final class Collider extends DroppableNative {
    protected Collider(MemorySegment memory) {
        super(memory);
    }

    public static Collider at(MemorySegment memory) {
        return new Collider(memory);
    }

    @Override
    protected void dropInternal() {
        RprCollider_drop(self);
    }
}
