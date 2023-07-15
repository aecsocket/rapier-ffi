plugins {
    id("natives-conventions")
}

extensions.getByType<NativesExtension>().apply {
    platformPredicate.set { true }
    libraryFileName.set("rapier_ffi.dll")
    platformName.set("windows")
}
