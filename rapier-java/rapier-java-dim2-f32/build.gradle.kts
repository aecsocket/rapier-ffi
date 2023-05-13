plugins {
    id("variant-conventions")
}

dependencies {
    implementation(projects.rapierJavaSys)
    implementation(libs.findbugs)
}

variant {
    name.set("dim2-f32")
    dim.set(Dimension.DIM2)
    sys.set("rapier.sys_dim2_f32")
    real.set("float")
    realZero.set("0.0f")
    realLayout.set("ValueLayout.JAVA_FLOAT")
    realVec.set("Vec2")
    realAngVec.set("Vec1")
    realRot.set("Vec2")
}
