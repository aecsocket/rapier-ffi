enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        gradlePluginPortal()
    }
    includeBuild("build-logic")
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version("0.4.0")
}

rootProject.name = "rapier-java"

include("rapier-java-sys")

include("rapier-java-dim2-f32")
include("rapier-java-dim2-f64")
include("rapier-java-dim3-f32")
include("rapier-java-dim3-f64")

include("rapier-java-natives-linux-x86")
include("rapier-java-natives-windows-x86")
include("rapier-java-natives-macos-x86")
