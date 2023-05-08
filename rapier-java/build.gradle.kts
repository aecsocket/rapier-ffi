import org.gradle.internal.os.OperatingSystem

plugins {
    id("parent-conventions")
    id("java-conventions")
}

group = "io.github.aecsocket"
version = "0.1.0-SNAPSHOT"
description = "Java bindings for the Rapier physics engine"

dependencies {
    implementation(projects.rapierJavaSys) // for IDE autocompletion

    testImplementation(libs.junit.jupiter.api)
    testImplementation(libs.junit.jupiter.engine)

    testImplementation(projects.rapierJavaDim3F64)

    val os = OperatingSystem.current()
    when {
        os.isLinux -> testRuntimeOnly(projects.rapierJavaNativesLinuxX86)
        os.isWindows -> testRuntimeOnly(projects.rapierJavaNativesWindowsX86)
        os.isMacOsX -> testRuntimeOnly(projects.rapierJavaNativesMacosX86)
    }
}
