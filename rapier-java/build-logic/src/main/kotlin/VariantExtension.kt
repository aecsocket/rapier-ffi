import org.gradle.api.provider.MapProperty

abstract class VariantExtension {
    abstract val context: MapProperty<String, Any>

    fun context(key: String, value: Any) {
        context.put(key, value)
    }
}
