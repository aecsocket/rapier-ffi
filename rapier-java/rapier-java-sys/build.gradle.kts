import io.github.krakowski.jextract.JextractTask

plugins { id("java-conventions") }

publishCore()

val headerPath = buildDir.resolve("librapier.h").absolutePath

private enum class Stage(val dir: String) {
  COMPILE("templates"),
  RUNTIME("java"),
}

tasks {
  // Generates a C header file from the Rust source code
  register<Exec>("generateHeaders") {
    workingDir = nativeDir
    commandLine =
        listOf(
            "cbindgen", // runs the Rust tool `cbindgen`, makes Rust to C bindings
            "--config",
            "cbindgen.toml", // config file at `rapier_ffi/cbindgen.toml`
            "--output",
            headerPath, // output the C header here
        )
  }

  // Generates Java source files for the C header file
  register<JextractTask>("generateSys") {
    toolchain.convention(org.gradle.internal.jvm.Jvm.current().javaHome.absolutePath)

    fun addHeader(stage: Stage, pkg: String, vararg macros: String) {
      header(headerPath) {
        className.set("RapierC")
        targetPackage.set("rapier.$pkg")
        definedMacros.addAll(*macros)
      }

      doLast {
        copy {
          from("${outputDir.get()}/rapier/$pkg")
          into("$projectDir/src/main/${stage.dir}/rapier/$pkg")
        }
      }
    }

    addHeader(Stage.COMPILE, "sys", "RAPIER_DIM2", "RAPIER_F32")
    addHeader(Stage.COMPILE, "sys_dim2", "RAPIER_DIM2", "RAPIER_F32")
    addHeader(Stage.COMPILE, "sys_dim3", "RAPIER_DIM3", "RAPIER_F32")

    addHeader(Stage.RUNTIME, "sys_dim2_f32", "RAPIER_DIM2", "RAPIER_F32")
    addHeader(Stage.RUNTIME, "sys_dim2_f64", "RAPIER_DIM2", "RAPIER_F64")
    addHeader(Stage.RUNTIME, "sys_dim3_f32", "RAPIER_DIM3", "RAPIER_F32")
    addHeader(Stage.RUNTIME, "sys_dim3_f64", "RAPIER_DIM3", "RAPIER_F64")
  }
}
