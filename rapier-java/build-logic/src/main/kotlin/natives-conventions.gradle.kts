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
        // build into this directory
        val targetDir = "$projectDir/.gradle/cargo/"

        val assembleNatives = register<Exec>("assembleNatives") {
            doFirst {
                println("Assembling natives $buildProfile")
            }

            workingDir = file(nativeDir)
            commandLine = listOf(
                "cargo",                             // build tool for Rust
                "build",                             // build this project (incl. native libraries because of `Cargo.toml`)
                "--features", featureName,           // select the current variant as a crate feature
                "--profile", buildProfile.cargoName, // profile to build with (determines optimizations, asserts etc.)
                "--target-dir", targetDir,
            )
        }.get()

        jar {
            dependsOn(assembleNatives)
            from("$targetDir/${buildProfile.outputName}/${nativesExt.libraryFileName.get()}") {
                into("rapier/${nativesExt.outputDirName.get()}")
            }
        }
    }
}
