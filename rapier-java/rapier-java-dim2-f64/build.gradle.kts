plugins {
    id("variant-conventions")
}

dependencies {
    implementation(projects.rapierJavaSys)
    implementation(libs.findbugs)
}

variant {
    name.set("dim2-f64")
    dimension.set(Dimension.DIM2)
    precision.set(Precision.F64)
}
