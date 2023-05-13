plugins {
    id("variant-conventions")
}

dependencies {
    implementation(projects.rapierJavaSys)
    implementation(libs.findbugs)
}

variant {
    name.set("dim3-f64")
    dim.set(Dimension.DIM3)
    sys.set("rapier.sys_dim3_f64")
    real.set("double")
    realZero.set("0.0")
    realLayout.set("ValueLayout.JAVA_DOUBLE")
    realVec.set("Vec3")
    realAngVec.set("Vec3")
    realRot.set("Vec4")
}
