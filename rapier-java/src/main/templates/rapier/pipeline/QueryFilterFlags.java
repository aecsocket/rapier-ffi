package rapier.pipeline;

import static rapier.sys.RapierC.*;

public final class QueryFilterFlags {
    private QueryFilterFlags() {}

    public static final int EXCLUDE_FIXED = RprQueryFilterFlags_EXCLUDE_FIXED();

    public static final int EXCLUDE_KINEMATIC = RprQueryFilterFlags_EXCLUDE_KINEMATIC();

    public static final int EXCLUDE_DYNAMIC = RprQueryFilterFlags_EXCLUDE_DYNAMIC();

    public static final int EXCLUDE_SENSORS = RprQueryFilterFlags_EXCLUDE_SENSORS();

    public static final int ONLY_DYNAMIC = RprQueryFilterFlags_ONLY_DYNAMIC();

    public static final int ONLY_KINEMATIC = RprQueryFilterFlags_ONLY_KINEMATIC();

    public static final int ONLY_FIXED = RprQueryFilterFlags_ONLY_FIXED();
}
