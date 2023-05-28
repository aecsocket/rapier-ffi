package templating

import com.mitchellbosecke.pebble.PebbleEngine
import com.mitchellbosecke.pebble.loader.FileLoader
import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.provider.MapProperty
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction
import java.io.IOException
import java.nio.file.FileVisitResult
import java.nio.file.FileVisitor
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.attribute.BasicFileAttributes
import java.util.Locale
import kotlin.io.path.absolutePathString
import kotlin.io.path.relativeTo

abstract class GenerateTemplates : DefaultTask() {
    @get:InputDirectory
    abstract val sourceDir: DirectoryProperty

    @get:Input
    abstract val context: MapProperty<String, Any>

    @get:OutputDirectory
    abstract val outputDir: DirectoryProperty

    @TaskAction
    fun generate() {
        val sourceDir: Path = sourceDir.get().asFile.toPath()
        val outputDir: Path = outputDir.get().asFile.toPath()
        val context: Map<String, Any> = context.get()

        val loader = FileLoader()
        val engine: PebbleEngine = PebbleEngine.Builder()
            .loader(loader)
            .strictVariables(true)
            .defaultLocale(Locale.ROOT)
            .autoEscaping(false)
            .build()

        Files.walkFileTree(sourceDir, object : FileVisitor<Path> {
            override fun preVisitDirectory(dir: Path, attrs: BasicFileAttributes) = FileVisitResult.CONTINUE

            override fun visitFileFailed(file: Path, exc: IOException) = FileVisitResult.CONTINUE

            override fun postVisitDirectory(dir: Path, exc: IOException?) = FileVisitResult.CONTINUE

            override fun visitFile(file: Path, attrs: BasicFileAttributes): FileVisitResult {
                val template = engine.getTemplate(file.absolutePathString())
                val relative = file.relativeTo(sourceDir)
                val output = outputDir.resolve(relative)

                Files.createDirectories(output.parent)
                Files.newBufferedWriter(output).use { writer ->
                    template.evaluate(writer, context)
                }

                return FileVisitResult.CONTINUE
            }
        })
    }
}
