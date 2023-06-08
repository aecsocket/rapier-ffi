package rapier.pipeline;

import static rapier.sys.RapierC.*;

public final class CollisionEventFlags {
    private CollisionEventFlags() {}

    public static final int SENSOR = RprCollisionEventFlags_SENSOR();

    public static final int REMOVED = RprCollisionEventFlags_REMOVED();
}
