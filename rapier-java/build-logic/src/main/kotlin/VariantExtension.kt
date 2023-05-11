import org.gradle.api.provider.MapProperty
import org.gradle.api.provider.Property

abstract class VariantExtension {
    abstract val name: Property<String>

    abstract val context: MapProperty<String, Any>

    fun context(key: String, value: Any) {
        context.put(key, value)
    }
}
