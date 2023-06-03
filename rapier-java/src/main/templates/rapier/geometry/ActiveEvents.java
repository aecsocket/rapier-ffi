package rapier.geometry;

import static rapier.sys.RapierC.*;

public final class ActiveEvents {
    private ActiveEvents() {}

    public static final int COLLISION_EVENTS = RprActiveEvents_COLLISION_EVENTS();

    public static final int CONTACT_FORCE_EVENTS = RprActiveEvents_CONTACT_FORCE_EVENTS();
}
