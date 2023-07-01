import org.gradle.api.provider.Property
import java.io.Serializable

enum class Dimension(val key: String) {
    DIM2    ("dim2"),
    DIM3    ("dim3"),
}

enum class Precision(val key: String, val type: String) {
    F32 ("f32", type = "float"),
    F64 ("f64", type = "double"),
}

data class BuildVariant(
    val dimension: Dimension,
    val precision: Precision,
) : Serializable

abstract class VariantExtension {
    abstract val name: Property<String>

    abstract val dimension: Property<Dimension>

    abstract val precision: Property<Precision>
}
