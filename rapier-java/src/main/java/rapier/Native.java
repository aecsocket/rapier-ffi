package rapier;

import io.github.aecsocket.varmat.VariantMatrix;
import io.github.aecsocket.varmat.VariantVar;

import java.lang.foreign.MemorySegment;

@VariantMatrix({
        @VariantVar(key = "dimension", values = { "dim2", "dim3" }),
        @VariantVar(key = "precision", values = { "f32", "f64" })
})
public interface Native {
    MemorySegment memory();
}
