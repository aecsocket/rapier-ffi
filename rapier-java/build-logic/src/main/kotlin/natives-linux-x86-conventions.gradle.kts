plugins {
    id("natives-linux-conventions")
}

extensions.getByType<NativesExtension>().apply {
    buildTarget.set("x86_64-unknown-linux-gnu")
    archName.set("x86")
}
