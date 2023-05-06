import org.gradle.kotlin.dsl.get

dependencyResolutionManagement {
    versionCatalogs {
        create("libs").from(files("../gradle/libs.versions.toml"))
    }
}

rootProject.name = "build-logic"
