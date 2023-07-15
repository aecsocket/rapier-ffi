plugins {
    id("natives-conventions")
}

extensions.getByType<NativesExtension>().apply {
    platformPredicate.set { it.isLinux }
    libraryFileName.set("librapier_ffi.so")
    platformName.set("linux")
}
