package rapier.pipeline;

public final class QueryFilterFlags {
    private QueryFilterFlags() {}

    public static final int EXCLUDE_FIXED = rapier.sys.RapierC.RprQueryFilterFlags_EXCLUDE_FIXED();

    public static final int EXCLUDE_KINEMATIC = rapier.sys.RapierC.RprQueryFilterFlags_EXCLUDE_KINEMATIC();

    public static final int EXCLUDE_DYNAMIC = rapier.sys.RapierC.RprQueryFilterFlags_EXCLUDE_DYNAMIC();

    public static final int EXCLUDE_SENSORS = rapier.sys.RapierC.RprQueryFilterFlags_EXCLUDE_SENSORS();

    public static final int ONLY_DYNAMIC = rapier.sys.RapierC.RprQueryFilterFlags_ONLY_DYNAMIC();

    public static final int ONLY_KINEMATIC = rapier.sys.RapierC.RprQueryFilterFlags_ONLY_KINEMATIC();

    public static final int ONLY_FIXED = rapier.sys.RapierC.RprQueryFilterFlags_ONLY_FIXED();
}
