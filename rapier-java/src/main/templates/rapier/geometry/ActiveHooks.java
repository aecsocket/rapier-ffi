package rapier.geometry;

public final class ActiveHooks {
    private ActiveHooks() {}

    public static final int FILTER_CONTACT_PAIRS = rapier.sys.RapierC.RprActiveHooks_FILTER_CONTACT_PAIRS();

    public static final int FILTER_INTERSECTION_PAIR = rapier.sys.RapierC.RprActiveHooks_FILTER_INTERSECTION_PAIR();

    public static final int MODIFY_SOLVER_CONTACTS = rapier.sys.RapierC.RprActiveHooks_MODIFY_SOLVER_CONTACTS();
}
