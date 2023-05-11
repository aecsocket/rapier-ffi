plugins {
    id("natives-conventions")
}

extensions.getByType<NativesExtension>().apply {
    platformPredicate.set { it.isLinux }
    libraryFileName.set("librapier_ffi.so")
    outputDirName.set("linux_x86")
}
