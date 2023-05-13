import org.gradle.api.tasks.testing.logging.TestExceptionFormat

plugins {
    id("base-conventions")
    id("java-library")
    id("net.kyori.indra")
}

indra {
    javaVersions {
        target(20)
        previewFeaturesEnabled(true)
    }
}

repositories {
    mavenCentral()
}

tasks {
    test {
        jvmArgs(
            "--enable-preview",
            "--enable-native-access=ALL-UNNAMED",
        )
        testLogging.exceptionFormat = TestExceptionFormat.FULL
        environment["RUST_BACKTRACE"] = "full"
    }
}
