package io.github.aecsocket.varmat;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
@Repeatable(TypeAliasSet.class)
@Documented
public @interface TypeAlias {
    String key();

    String value();

    Class<?> to();
}
