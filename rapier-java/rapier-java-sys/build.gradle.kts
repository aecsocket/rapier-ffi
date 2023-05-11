import io.github.krakowski.jextract.JextractTask

plugins {
    id("java-conventions")
}

publishCore()

val headerPath = buildDir.resolve("librapier.h").absolutePath

tasks {
    // Generates a C header file from the Rust source code
    register<Exec>("generateHeaders") {
        workingDir = nativeDir
        commandLine = listOf(
            "cbindgen",                  // runs the Rust tool `cbindgen`, makes Rust to C bindings
            "--config", "cbindgen.toml", // config file at `rapier_ffi/cbindgen.toml`
            "--output", headerPath,      // output the C header here
        )
    }

    // Generates Java source files for the C header file
    register<JextractTask>("generateSys") {
        toolchain.convention(org.gradle.internal.jvm.Jvm.current().javaHome.absolutePath)

        fun addHeader(pkg: String, vararg macros: String) {
            header(headerPath) {
                className.set("RapierC")
                targetPackage.set("rapier.$pkg")
                definedMacros.addAll(*macros)
            }
        }

        addHeader("sys")
        // one set of sources for each variant
        addHeader("sys_dim2_f32", "RAPIER_DIM2", "RAPIER_F32")
        addHeader("sys_dim2_f64", "RAPIER_DIM2", "RAPIER_F64")
        addHeader("sys_dim3_f32", "RAPIER_DIM3", "RAPIER_F32")
        addHeader("sys_dim3_f64", "RAPIER_DIM3", "RAPIER_F64")

        doLast {
            copy {
                from("${outputDir.get()}")
                into("$projectDir/src/main/java")
            }
        }
    }
}
