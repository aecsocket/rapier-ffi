import templating.GenerateTemplates

plugins {
    id("java-conventions")
}

publishCore()

val variantExt = extensions.create("variant", VariantExtension::class)

afterEvaluate {
    val dimension = variantExt.dimension.get()
    val precision = variantExt.precision.get()

    sourceSets.forEach { sourceSet ->
        val source = rootProject.projectDir.resolve("src/${sourceSet.name}/templates")
        if (!source.exists()) return@forEach

        val output = buildDir.resolve("generated/sources/${sourceSet.name}-templates")
        val taskName = sourceSet.getTaskName("generate", "templates")

        val generateTask = tasks.register<GenerateTemplates>(taskName) {
            sourceDir.set(source)
            outputDir.set(output)
            context.putAll(mapOf(
                "sys" to "rapier.sys_${dimension.key}_${precision.key}",
                "dim2" to (dimension == Dimension.DIM2),
                "dim3" to (dimension == Dimension.DIM3),
                "real" to precision.type,
                "realZero" to precision.zero,
                "realLayout" to precision.layout,
            ))
        }

        sourceSet.java.srcDir(generateTask.map { it.outputs })
    }
}
