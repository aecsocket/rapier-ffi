import org.gradle.api.provider.Property
import org.gradle.internal.os.OperatingSystem
import java.util.function.Predicate

abstract class NativesExtension {
    abstract val platformPredicate: Property<Predicate<OperatingSystem>>

    abstract val libraryFileName: Property<String>

    abstract val buildTarget: Property<String>

    abstract val platformName: Property<String>

    abstract val archName: Property<String>
}
