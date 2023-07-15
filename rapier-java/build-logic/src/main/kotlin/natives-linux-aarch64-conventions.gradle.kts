plugins {
    id("natives-linux-conventions")
}

extensions.getByType<NativesExtension>().apply {
    buildTarget.set("aarch64-unknown-linux-gnu")
    archName.set("aarch64")
}
