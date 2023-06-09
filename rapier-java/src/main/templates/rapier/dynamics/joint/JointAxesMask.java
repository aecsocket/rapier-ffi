package rapier.dynamics.joint;

public final class JointAxesMask {
    private JointAxesMask() {}

    public static final int X = rapier.sys.RapierC.RprJointAxesMask_X();

    public static final int Y = rapier.sys.RapierC.RprJointAxesMask_Y();

/*{% if dim3 %}*/
    public static final int Z = rapier.sys_dim3.RapierC.RprJointAxesMask_Z();
/*{% endif %}*/

    public static final int ANG_X = rapier.sys.RapierC.RprJointAxesMask_ANG_X();

/*{% if dim3 %}*/
    public static final int ANG_Y = rapier.sys_dim3.RapierC.RprJointAxesMask_ANG_Y();

    public static final int ANG_Z = rapier.sys_dim3.RapierC.RprJointAxesMask_ANG_Z();
/*{% endif %}*/

    public static final int LOCKED_REVOLUTE_AXES = rapier.sys.RapierC.RprJointAxesMask_LOCKED_REVOLUTE_AXES();

    public static final int LOCKED_PRISMATIC_AXES = rapier.sys.RapierC.RprJointAxesMask_LOCKED_PRISMATIC_AXES();

    public static final int LOCKED_FIXED_AXES = rapier.sys.RapierC.RprJointAxesMask_LOCKED_FIXED_AXES();

/*{% if dim3 %}*/
    public static final int LOCKED_SPHERICAL_AXES = rapier.sys_dim3.RapierC.RprJointAxesMask_LOCKED_SPHERICAL_AXES();
/*{% endif %}*/

    public static final int FREE_REVOLUTE_AXES = rapier.sys.RapierC.RprJointAxesMask_FREE_REVOLUTE_AXES();

    public static final int FREE_PRISMATIC_AXES = rapier.sys.RapierC.RprJointAxesMask_FREE_PRISMATIC_AXES();

    public static final int FREE_FIXED_AXES = rapier.sys.RapierC.RprJointAxesMask_FREE_FIXED_AXES();

/*{% if dim3 %}*/
    public static final int FREE_SPHERICAL_AXES = rapier.sys_dim3.RapierC.RprJointAxesMask_FREE_SPHERICAL_AXES();
/*{% endif %}*/

    public static final int LIN_AXES = rapier.sys.RapierC.RprJointAxesMask_LIN_AXES();

    public static final int ANG_AXES = rapier.sys.RapierC.RprJointAxesMask_ANG_AXES();
}
