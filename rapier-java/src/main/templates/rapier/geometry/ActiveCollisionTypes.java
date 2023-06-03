package rapier.geometry;

import static rapier.sys.RapierC.*;

public final class ActiveCollisionTypes {
    private ActiveCollisionTypes() {}

    public static final int DYNAMIC_DYNAMIC = RprActiveCollisionTypes_DYNAMIC_DYNAMIC();

    public static final int DYNAMIC_KINEMATIC = RprActiveCollisionTypes_DYNAMIC_KINEMATIC();

    public static final int DYNAMIC_FIXED = RprActiveCollisionTypes_DYNAMIC_FIXED();

    public static final int KINEMATIC_KINEMATIC = RprActiveCollisionTypes_KINEMATIC_KINEMATIC();

    public static final int KINEMATIC_FIXED = RprActiveCollisionTypes_KINEMATIC_FIXED();

    public static final int FIXED_FIXED = RprActiveCollisionTypes_FIXED_FIXED();
}
