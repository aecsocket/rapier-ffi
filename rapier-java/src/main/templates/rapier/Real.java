package rapier;

import java.lang.foreign.ValueLayout;

public final class Real {
    private Real() {}

/*{% if f32 %}*/
    public static ValueLayout.OfFloat layout() {
        return ValueLayout.JAVA_FLOAT;
    }
/*{% else %}*/
    public static ValueLayout.OfDouble layout() {
        return ValueLayout.JAVA_DOUBLE;
    }
/*{% endif %}*/

    public static int angDim() {
/*{% if dim2 %}*/
        return 1;
/*{% else %}*/
        return 3;
/*{% endif %}*/
    }

    public static int spatialDim() {
/*{% if dim2 %}*/
        return 3;
/*{% else %}*/
        return 6;
/*{% endif %}*/
    }
}
