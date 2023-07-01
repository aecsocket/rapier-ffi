import templating.GenerateTemplates

plugins {
    id("java-conventions")
}

publishCore()

val variantExt = extensions.create("variant", VariantExtension::class)

afterEvaluate {
    val thisVariant = BuildVariant(
        dimension = variantExt.dimension.get(),
        precision = variantExt.precision.get(),
    )

    sourceSets.forEach { sourceSet ->
        val source = rootProject.projectDir.resolve("src/${sourceSet.name}/templates")
        if (!source.exists()) return@forEach

        val output = buildDir.resolve("generated/sources/${sourceSet.name}-templates")
        val taskName = sourceSet.getTaskName("generate", "templates")

        val generateTask = tasks.register<GenerateTemplates>(taskName) {
            sourceDir.set(source)
            outputDir.set(output)
            variant.set(thisVariant)
        }

        sourceSet.java.srcDir(generateTask.map { it.outputs })
    }
}
