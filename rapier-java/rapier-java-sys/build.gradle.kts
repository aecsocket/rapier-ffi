import io.github.krakowski.jextract.JextractTask
import io.github.krakowski.jextract.LibraryDefinition

plugins {
    id("java-conventions")
}

tasks {
    register<JextractTask>("generateHeaders") {
        toolchain.convention(org.gradle.internal.jvm.Jvm.current().javaHome.absolutePath)

        fun addHeader(pkg: String, vararg macros: String) {
            header("$nativeDir/target/librapier.h") {
                className.set("RapierC")
                targetPackage.set("rapier.$pkg")
                definedMacros.addAll(*macros)
            }
        }

        addHeader("sys")
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
