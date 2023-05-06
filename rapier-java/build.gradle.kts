plugins {
    id("parent-conventions")
    id("java-conventions")
}

group = "io.github.aecsocket"
version = "0.1.0-SNAPSHOT"
description = "API abstraction layer for physics engines for Minecraft servers"

dependencies {
    testImplementation(projects.rapierJavaDim3F64)
    testImplementation(libs.junit.jupiter.api)
    testImplementation(libs.junit.jupiter.engine)
    testImplementation(libs.findbugs)
}
