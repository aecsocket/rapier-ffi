import org.gradle.internal.os.OperatingSystem
import org.gradle.plugins.ide.idea.model.IdeaModel

plugins {
  id("parent-conventions")
  id("java-conventions")
  id("idea")
}

group = "io.github.aecsocket"

version = "0.3.0-SNAPSHOT"

description = "Java bindings for the Rapier physics engine"

val testVariant = "dim3-f64"

dependencies {
  // for IDE autocompletion
  implementation(projects.rapierJavaSys)
  implementation(libs.findbugs) // todo legacy

  testImplementation(libs.junit.jupiter.api)
  testImplementation(libs.junit.jupiter.engine)

  val variantProject = "rapier-java-$testVariant"
  testImplementation(project(variantProject))
  val os = OperatingSystem.current()
  val nativeProject =
      when {
        os.isLinux -> "linux-x86"
        os.isWindows -> "windows-x86"
        os.isMacOsX -> "macos-x86"
        else -> throw IllegalStateException("Unsupported OS $os")
      }
  testRuntimeOnly(project("$variantProject:$variantProject-$nativeProject"))
}

// for IDE autocompletion
extensions.configure<IdeaModel> {
  module {
    sourceDirs.addAll(
        listOf(
            file("$projectDir/src/main/templates"),
            file("${project(":rapier-java-sys").projectDir}/src/main/templates"),
        ))
  }
}
