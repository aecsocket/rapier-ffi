plugins {
    id("natives-macos-conventions")
}

extensions.getByType<NativesExtension>().apply {
    buildTarget.set("aarch64-apple-darwin")
    archName.set("aarch64")
}
