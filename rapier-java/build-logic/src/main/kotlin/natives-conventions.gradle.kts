import org.gradle.internal.os.OperatingSystem

plugins {
    id("java-conventions")
}

val nativesExt = extensions.create("natives", NativesExtension::class)

afterEvaluate {
    val os = OperatingSystem.current()
    if (!nativesExt.platformPredicate.get().test(os)) {
        return@afterEvaluate
    }

    // only publish if we can actually build the artifact
    apply(plugin = "publishing-conventions")

    tasks {
        val generateNatives = register<Exec>("generateNatives") {
            workingDir = file(nativeDir)
            commandLine = listOf(
                "cargo",
                "build",
            )
        }
    }
}
