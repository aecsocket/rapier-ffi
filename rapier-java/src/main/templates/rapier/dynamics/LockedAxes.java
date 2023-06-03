package rapier.dynamics;

import static rapier.sys.RapierC.*;

public final class LockedAxes {
    private LockedAxes() {}

    public static final int TRANSLATION_LOCKED_X = RprLockedAxes_TRANSLATION_LOCKED_X();

    public static final int TRANSLATION_LOCKED_Y = RprLockedAxes_TRANSLATION_LOCKED_Y();

    public static final int TRANSLATION_LOCKED_Z = RprLockedAxes_TRANSLATION_LOCKED_Z();

    public static final int TRANSLATION_LOCKED = RprLockedAxes_TRANSLATION_LOCKED();

    public static final int ROTATION_LOCKED_X = RprLockedAxes_ROTATION_LOCKED_X();

    public static final int ROTATION_LOCKED_Y = RprLockedAxes_ROTATION_LOCKED_Y();

    public static final int ROTATION_LOCKED_Z = RprLockedAxes_ROTATION_LOCKED_Z();

    public static final int ROTATION_LOCKED = RprLockedAxes_ROTATION_LOCKED();
}
