package rapier.geometry;

public final class ActiveEvents {
    private ActiveEvents() {}

    public static final int COLLISION_EVENTS = rapier.sys.RapierC.RprActiveEvents_COLLISION_EVENTS();

    public static final int CONTACT_FORCE_EVENTS = rapier.sys.RapierC.RprActiveEvents_CONTACT_FORCE_EVENTS();
}
