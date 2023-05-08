plugins {
    id("variant-conventions")
}

dependencies {
    implementation(projects.rapierJavaSys)
    compileOnlyApi(libs.findbugs)
}

variant {
    context("sys", "rapier.sys_dim2_f32")
    context("real", "float")
    context("realZero", "0.0f")
    context("realLayout", "ValueLayout.JAVA_FLOAT")
    context("realVector", "Vector2")
}
