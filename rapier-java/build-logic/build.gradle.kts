plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

dependencies {
    implementation(libs.indra.common)
    implementation(libs.indra.publishing.sonatype)
    implementation(libs.jextract)
    implementation(libs.pebble)
}
