package rapier.dynamics;

public final class LockedAxes {
    private LockedAxes() {}

    public static final int TRANSLATION_LOCKED_X = rapier.sys.RapierC.RprLockedAxes_TRANSLATION_LOCKED_X();

    public static final int TRANSLATION_LOCKED_Y = rapier.sys.RapierC.RprLockedAxes_TRANSLATION_LOCKED_Y();

    public static final int TRANSLATION_LOCKED_Z = rapier.sys.RapierC.RprLockedAxes_TRANSLATION_LOCKED_Z();

    public static final int TRANSLATION_LOCKED = rapier.sys.RapierC.RprLockedAxes_TRANSLATION_LOCKED();

    public static final int ROTATION_LOCKED_X = rapier.sys.RapierC.RprLockedAxes_ROTATION_LOCKED_X();

    public static final int ROTATION_LOCKED_Y = rapier.sys.RapierC.RprLockedAxes_ROTATION_LOCKED_Y();

    public static final int ROTATION_LOCKED_Z = rapier.sys.RapierC.RprLockedAxes_ROTATION_LOCKED_Z();

    public static final int ROTATION_LOCKED = rapier.sys.RapierC.RprLockedAxes_ROTATION_LOCKED();
}
