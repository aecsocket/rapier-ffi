plugins {
    id("natives-conventions")
}

natives {
    platformPredicate.set { it.isMacOsX }
    libraryFileName.set("librapier_ffi.dylib")
    outputDirName.set("macos_x86")
}
