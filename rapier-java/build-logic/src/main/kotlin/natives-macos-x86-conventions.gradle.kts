plugins {
    id("natives-conventions")
}

extensions.getByType<NativesExtension>().apply {
    platformPredicate.set { it.isMacOsX }
    libraryFileName.set("librapier_ffi.dylib")
    outputDirName.set("macos_x86")
}
