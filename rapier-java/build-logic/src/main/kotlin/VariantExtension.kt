import org.gradle.api.provider.Property

enum class Dimension(val key: String) {
    DIM2    ("dim2"),
    DIM3    ("dim3"),
}

enum class Precision(val key: String, val type: String, val zero: String, val layout: String) {
    F32 ("f32", type = "float",  zero = "0.0f", layout = "ValueLayout.JAVA_FLOAT"),
    F64 ("f64", type = "double", zero = "0.0",  layout = "ValueLayout.JAVA_DOUBLE"),
}

abstract class VariantExtension {
    abstract val name: Property<String>

    abstract val dimension: Property<Dimension>

    abstract val precision: Property<Precision>
}
