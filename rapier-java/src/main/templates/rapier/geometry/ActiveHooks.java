package rapier.geometry;

import static rapier.sys.RapierC.*;

public final class ActiveHooks {
    private ActiveHooks() {}

    public static final int FILTER_CONTACT_PAIRS = RprActiveHooks_FILTER_CONTACT_PAIRS();

    public static final int FILTER_INTERSECTION_PAIR = RprActiveHooks_FILTER_INTERSECTION_PAIR();

    public static final int MODIFY_SOLVER_CONTACTS = RprActiveHooks_MODIFY_SOLVER_CONTACTS();
}
