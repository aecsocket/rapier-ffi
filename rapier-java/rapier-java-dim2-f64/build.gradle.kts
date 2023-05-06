plugins {
    id("variant-conventions")
}

dependencies {
    implementation(projects.rapierJavaSys)
    compileOnlyApi(libs.findbugs)
}

variant {
    context("sys", "rapier.sys_dim2_f64")
    context("real", "double")
    context("realLayout", "ValueLayout.JAVA_DOUBLE")
    context("realVector", "Vector2")
}
