import org.gradle.api.Project
import org.gradle.api.provider.Provider
import java.io.File

val Project.ci: Provider<Boolean>
    get() = providers.environmentVariable("CI").map { it.toBoolean() }.orElse(false)

val Project.nativeDir: File
    get() = rootDir.resolve("rapier-ffi")

enum class BuildProfile(val cargoName: String, val outputName: String) {
    DEV     ("dev", "debug"),
    RELEASE ("release", "release"),
}

val Project.buildProfile: BuildProfile
    get() = (findProperty("buildProfile")?.toString())?.uppercase()?.let {
        BuildProfile.valueOf(it)
    } ?: BuildProfile.DEV
