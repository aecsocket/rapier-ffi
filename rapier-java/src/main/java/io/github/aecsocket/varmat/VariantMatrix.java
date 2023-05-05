package io.github.aecsocket.varmat;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
@Inherited
public @interface VariantMatrix {
    VariantVar[] value();
}
