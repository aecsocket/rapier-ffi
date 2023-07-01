package templating

import BuildVariant
import com.mitchellbosecke.pebble.PebbleEngine
import com.mitchellbosecke.pebble.loader.FileLoader
import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.provider.MapProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction
import java.io.IOException
import java.io.StringWriter
import java.nio.file.FileVisitResult
import java.nio.file.FileVisitor
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.attribute.BasicFileAttributes
import java.util.Locale
import kotlin.io.path.absolutePathString
import kotlin.io.path.name
import kotlin.io.path.relativeTo

abstract class GenerateTemplates : DefaultTask() {
    @get:InputDirectory
    abstract val sourceDir: DirectoryProperty

    @get:Input
    abstract val variant: Property<BuildVariant>

    @get:OutputDirectory
    abstract val outputDir: DirectoryProperty

    @TaskAction
    fun generate() {
        val sourceDir = sourceDir.get().asFile.toPath()
        val outputDir = outputDir.get().asFile.toPath()
        val variant = variant.get()

        val dimension = variant.dimension
        val precision = variant.precision
        val real = precision.type
        val sysPkg = "rapier.sys_${dimension.key}_${precision.key}."

        val context: Map<String, Any> = mapOf(
            "dim2" to (dimension == Dimension.DIM2),
            "dim3" to (dimension == Dimension.DIM3),
            "f32" to (precision == Precision.F32),
            "f64" to (precision == Precision.F64),
        )

        val loader = FileLoader()
        val engine: PebbleEngine = PebbleEngine.Builder()
            .loader(loader)
            //.strictVariables(true)
            .defaultLocale(Locale.ROOT)
            .autoEscaping(false)
            .build()

        Files.walkFileTree(sourceDir, object : FileVisitor<Path> {
            override fun preVisitDirectory(dir: Path, attrs: BasicFileAttributes) = FileVisitResult.CONTINUE

            override fun visitFileFailed(file: Path, exc: IOException) = FileVisitResult.CONTINUE

            override fun postVisitDirectory(dir: Path, exc: IOException?) = FileVisitResult.CONTINUE

            override fun visitFile(file: Path, attrs: BasicFileAttributes): FileVisitResult {
                // is this all insanely hacky? yes
                // does it work? yes
                // do I care? no
                if (file.name == "__real.java") {
                    return FileVisitResult.CONTINUE
                }

                val template = engine.getTemplate(file.absolutePathString())
                val relative = file.relativeTo(sourceDir)
                val output = outputDir.resolve(relative)

                Files.createDirectories(output.parent)
                val text = StringWriter().use { writer ->
                    template.evaluate(writer, context)
                    writer.toString()
                }
                Files.writeString(output, text
                    .replace("import rapier.__real;", "// using real = $real")
                    .replace("__real", real)
                    .replace("rapier.sys_dim2.", sysPkg)
                    .replace("rapier.sys_dim3.", sysPkg)
                    .replace("rapier.sys.", sysPkg)
                    .replace("import rapier.sys_", "[ERROR!]")
                    .replace("import static rapier.sys_", "[ERROR!]"))

                return FileVisitResult.CONTINUE
            }
        })
    }
}
