plugins {
    id("parent-conventions")
    id("java-conventions")
}

group = "io.github.aecsocket"
version = "0.1.0-SNAPSHOT"
description = "API abstraction layer for physics engines for Minecraft servers"

dependencies {
    implementation(projects.rapierJavaHeaders)
    compileOnlyApi(libs.findBugs)

    testImplementation(libs.jUnitJupiterApi)
    testImplementation(libs.jUnitJupiterEngine)
    testImplementation(libs.findBugs)
}
