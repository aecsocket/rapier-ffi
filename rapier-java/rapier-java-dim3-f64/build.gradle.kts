plugins {
    id("variant-conventions")
}

dependencies {
    implementation(projects.rapierJavaSys)
    implementation(libs.findbugs)
    implementation(libs.checker.qual)
}

variant {
    name.set("dim3-f64")
    dimension.set(Dimension.DIM3)
    precision.set(Precision.F64)
}
