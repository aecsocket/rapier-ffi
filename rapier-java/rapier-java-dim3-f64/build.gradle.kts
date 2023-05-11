plugins {
    id("variant-conventions")
}

dependencies {
    implementation(projects.rapierJavaSys)
    implementation(libs.findbugs)
}

variant {
    name.set("dim3-f64")
    context("sys", "rapier.sys_dim3_f64")
    context("real", "double")
    context("realZero", "0.0")
    context("realLayout", "ValueLayout.JAVA_DOUBLE")
    context("realVector", "Vector3")
}
