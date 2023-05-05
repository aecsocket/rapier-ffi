package rapier.math;

import io.github.aecsocket.varmat.TypeAlias;

import java.lang.foreign.MemorySegment;

@TypeAlias(key = "precision", value = "f32", to = float.class)
@TypeAlias(key = "precision", value = "f64", to = double.class)
public interface Real {
    MemorySegment value();
}
