package io.github.aecsocket.varmat;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
@Documented
public @interface TypeAliasSet {
    TypeAlias[] value();
}
