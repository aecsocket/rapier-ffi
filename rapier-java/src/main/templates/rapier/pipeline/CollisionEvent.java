package rapier.pipeline;

import rapier.ValNative;

import java.lang.foreign.MemorySegment;

public final class CollisionEvent extends ValNative {
    private CollisionEvent(MemorySegment memory) {
        super(memory);
    }

    public static CollisionEvent at(MemorySegment memory) {
        return new CollisionEvent(memory);
    }
}
