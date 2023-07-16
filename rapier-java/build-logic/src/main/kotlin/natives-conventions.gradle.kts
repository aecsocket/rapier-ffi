import org.gradle.internal.os.OperatingSystem

plugins {
    id("java-conventions")
}

val nativesExt = extensions.create("natives", NativesExtension::class)

afterEvaluate {
    val featureName = (parent ?: throw IllegalStateException("Native project must be a child of a variant project"))
        .extensions.getByType<VariantExtension>().name.get()

    val os = OperatingSystem.current()
    if (!nativesExt.platformPredicate.get().test(os)) {
        return@afterEvaluate
    }

    // only publish if we can actually build the artifact
    apply(plugin = "publishing-conventions")

    tasks {
        val buildTarget = nativesExt.buildTarget.get()
        // build into this directory
        val targetDir = "$projectDir/.gradle/cargo"

        val assembleNatives = register<Exec>("assembleNatives") {
            doFirst {
                println("Assembling natives $buildProfile")
            }

            workingDir = file(nativeDir)
            commandLine = listOf(
                // build tool for Rust
                "cargo",
                // build this project (into native shared libraries because of `Cargo.toml`)
                "build",
                // select the current variant as a crate feature
                "--features", featureName,
                // profile to build with (determines optimizations, asserts etc.)
                "--profile", buildProfile.cargoName,
                // build using this as the workspace folder
                "--target-dir", targetDir,
                // (cross-)compile to this target platform + CPU architecture
                "--target", buildTarget,
            )
        }.get()

        jar {
            dependsOn(assembleNatives)
            from("$targetDir/$buildTarget/${buildProfile.outputName}/${nativesExt.libraryFileName.get()}") {
                into("rapier/${nativesExt.platformName.get()}_${nativesExt.archName.get()}")
            }
        }
    }
}
