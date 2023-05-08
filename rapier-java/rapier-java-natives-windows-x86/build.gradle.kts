plugins {
    id("natives-conventions")
}

natives {
    platformPredicate.set { it.isWindows }
    libraryFileName.set("rapier_ffi.dll")
    outputDirName.set("windows_x86")
}
