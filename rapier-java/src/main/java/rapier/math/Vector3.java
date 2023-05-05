package rapier.math;

import io.github.aecsocket.varmat.TypeAlias;
import rapier.Native;

@TypeAlias(key = "precision", value = "f32", to = Vector3F.class)
@TypeAlias(key = "precision", value = "f64", to = Vector3D.class)
public interface Vector3 extends Native {}
