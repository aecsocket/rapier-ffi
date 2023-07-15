plugins {
    id("natives-windows-conventions")
}

extensions.getByType<NativesExtension>().apply {
    buildTarget.set("x86_64-pc-windows-gnu")
    archName.set("x86")
}
