plugins {
    id("natives-conventions")
}

natives {
    platformPredicate.set { it.isLinux }
    libraryFileName.set("librapier_ffi.so")
    outputDirName.set("linux_x86")
}
