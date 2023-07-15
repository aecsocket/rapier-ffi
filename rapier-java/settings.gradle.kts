enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
  repositories { gradlePluginPortal() }
  includeBuild("build-logic")
}

plugins { id("org.gradle.toolchains.foojay-resolver-convention") version ("0.4.0") }

rootProject.name = "rapier-java"

include("rapier-java-sys")

listOf("dim2", "dim3").forEach { dimension ->
  listOf("f32", "f64").forEach { precision ->
    val variantProject = "rapier-java-$dimension-$precision"
    include(variantProject)

    listOf("linux-x86", "linux-aarch64", "windows-x86", "macos-x86").forEach { native ->
      val nativesProject = "$variantProject:$variantProject-$native"
      include(nativesProject)
      project(":$nativesProject").projectDir = file("rapier-java-$dimension-$precision/$native")
    }
  }
}
