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
}
