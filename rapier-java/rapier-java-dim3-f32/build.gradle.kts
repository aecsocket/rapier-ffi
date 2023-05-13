plugins {
    id("variant-conventions")
}

dependencies {
    implementation(projects.rapierJavaSys)
    implementation(libs.findbugs)
}

variant {
    name.set("dim3-f32")
    dim.set(Dimension.DIM3)
    sys.set("rapier.sys_dim3_f32")
    real.set("float")
    realZero.set("0.0f")
    realLayout.set("ValueLayout.JAVA_FLOAT")
    realVec.set("Vec3")
    realAngVec.set("Vec3")
    realRot.set("Vec4")
}
