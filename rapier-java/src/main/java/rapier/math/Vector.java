package rapier.math;

import io.github.aecsocket.varmat.TypeAlias;
import rapier.Native;

@TypeAlias(key = "dimension", value = "dim2", to = Vector2.class)
@TypeAlias(key = "dimension", value = "dim3", to = Vector3.class)
public interface Vector extends Native {}
