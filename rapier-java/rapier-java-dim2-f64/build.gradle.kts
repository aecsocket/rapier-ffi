plugins {
    id("variant-conventions")
}

dependencies {
    implementation(projects.rapierJavaSys)
    implementation(libs.findbugs)
}

variant {
    name.set("dim2-f64")
    dim.set(Dimension.DIM2)
    sys.set("rapier.sys_dim2_f64")
    real.set("double")
    realZero.set("0.0")
    realLayout.set("ValueLayout.JAVA_DOUBLE")
    realVec.set("Vec2")
    realAngVec.set("Vec1")
    realRot.set("Vec2")
}
