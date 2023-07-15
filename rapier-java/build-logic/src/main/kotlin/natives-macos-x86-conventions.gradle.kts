plugins {
    id("natives-macos-conventions")
}

extensions.getByType<NativesExtension>().apply {
    buildTarget.set("x86_64-apple-darwin")
    archName.set("x86")
}
