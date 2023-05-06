enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        gradlePluginPortal()
    }
    includeBuild("build-logic")
}

rootProject.name = "rapier-java"

include("rapier-java-sys")
include("rapier-java-dim2-f32")
include("rapier-java-dim2-f64")
include("rapier-java-dim3-f32")
include("rapier-java-dim3-f64")
