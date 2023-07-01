package rapier.geometry;

public final class ActiveCollisionTypes {
    private ActiveCollisionTypes() {}

    public static final int DYNAMIC_DYNAMIC = rapier.sys.RapierC.RprActiveCollisionTypes_DYNAMIC_DYNAMIC();

    public static final int DYNAMIC_KINEMATIC = rapier.sys.RapierC.RprActiveCollisionTypes_DYNAMIC_KINEMATIC();

    public static final int DYNAMIC_FIXED = rapier.sys.RapierC.RprActiveCollisionTypes_DYNAMIC_FIXED();

    public static final int KINEMATIC_KINEMATIC = rapier.sys.RapierC.RprActiveCollisionTypes_KINEMATIC_KINEMATIC();

    public static final int KINEMATIC_FIXED = rapier.sys.RapierC.RprActiveCollisionTypes_KINEMATIC_FIXED();

    public static final int FIXED_FIXED = rapier.sys.RapierC.RprActiveCollisionTypes_FIXED_FIXED();
}
