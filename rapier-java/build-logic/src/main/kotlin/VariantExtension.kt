import org.gradle.api.provider.Property

enum class Dimension {
    DIM2,
    DIM3,
}

abstract class VariantExtension {
    abstract val name: Property<String>

    abstract val dim: Property<Dimension>

    abstract val sys: Property<String>

    abstract val real: Property<String>

    abstract val realZero: Property<String>

    abstract val realLayout: Property<String>

    abstract val realVec: Property<String>

    abstract val realAngVec: Property<String>

    abstract val realRot: Property<String>
}
