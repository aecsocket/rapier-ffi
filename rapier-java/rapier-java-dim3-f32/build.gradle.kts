plugins {
    id("variant-conventions")
}

dependencies {
    implementation(projects.rapierJavaSys)
    implementation(libs.findbugs)
}

variant {
    name.set("dim3-f32")
    context("sys", "rapier.sys_dim3_f32")
    context("real", "float")
    context("realZero", "0.0f")
    context("realLayout", "ValueLayout.JAVA_FLOAT")
    context("realVector", "Vector3")
}
