package rapier.pipeline;

public final class CollisionEventFlags {
    private CollisionEventFlags() {}

    public static final int SENSOR = rapier.sys.RapierC.RprCollisionEventFlags_SENSOR();

    public static final int REMOVED = rapier.sys.RapierC.RprCollisionEventFlags_REMOVED();
}
