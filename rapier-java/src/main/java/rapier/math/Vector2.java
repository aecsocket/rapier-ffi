package rapier.math;

import io.github.aecsocket.varmat.TypeAlias;
import rapier.Native;

@TypeAlias(key = "precision", value = "f32", to = Vector2F.class)
@TypeAlias(key = "precision", value = "f64", to = Vector2D.class)
public interface Vector2 extends Native {}
