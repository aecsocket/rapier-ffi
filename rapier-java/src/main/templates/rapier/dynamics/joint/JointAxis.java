package rapier.dynamics.joint;

public enum JointAxis {
    X,
    Y,
/*{% if dim3 %}*/
    Z,
/*{% endif %}*/

    ANG_X,
/*{% if dim3 %}*/
    ANG_Y,
    ANG_Z,
/*{% endif %}*/
}
