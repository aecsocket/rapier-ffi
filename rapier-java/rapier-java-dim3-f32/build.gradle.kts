plugins {
    id("variant-conventions")
}

dependencies {
    implementation(projects.rapierJavaSys)
    implementation(libs.findbugs)
    implementation(libs.checker.qual)
}

variant {
    name.set("dim3-f32")
    dimension.set(Dimension.DIM3)
    precision.set(Precision.F32)
}
