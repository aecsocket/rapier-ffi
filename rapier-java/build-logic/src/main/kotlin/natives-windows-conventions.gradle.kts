plugins {
    id("natives-conventions")
}

extensions.getByType<NativesExtension>().apply {
    platformPredicate.set { it.isWindows }
    libraryFileName.set("rapier_ffi.dll")
    platformName.set("windows")
}
