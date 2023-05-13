import templating.GenerateTemplates

plugins {
    id("java-conventions")
}

publishCore()

val variantExt = extensions.create("variant", VariantExtension::class)

afterEvaluate {
    val dim = variantExt.dim.get()

    sourceSets.forEach { sourceSet ->
        val source = rootProject.projectDir.resolve("src/${sourceSet.name}/templates")
        if (!source.exists()) return@forEach

        val output = buildDir.resolve("generated/sources/${sourceSet.name}-templates")
        val taskName = sourceSet.getTaskName("generate", "templates")

        val generateTask = tasks.register<GenerateTemplates>(taskName) {
            sourceDir.set(source)
            outputDir.set(output)
            context.putAll(mapOf(
                "sys" to variantExt.sys.get(),
                "dim2" to (dim == Dimension.DIM2),
                "dim3" to (dim == Dimension.DIM3),
                "real" to variantExt.real.get(),
                "realZero" to variantExt.realZero.get(),
                "realLayout" to variantExt.realLayout.get(),
                "realVec" to variantExt.realVec.get(),
                "realAngVec" to variantExt.realAngVec.get(),
                "realRot" to variantExt.realRot.get(),
            ))
        }

        sourceSet.java.srcDir(generateTask.map { it.outputs })
    }
}
