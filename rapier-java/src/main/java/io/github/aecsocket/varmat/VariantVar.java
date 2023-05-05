package io.github.aecsocket.varmat;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({})
@Retention(RetentionPolicy.SOURCE)
public @interface VariantVar {
    String key();

    String[] values();
}
