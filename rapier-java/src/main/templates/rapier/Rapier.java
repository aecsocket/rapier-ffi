package rapier;

import javax.annotation.Nullable;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;

public final class Rapier {
    public static final String VERSION = "0.17.2";

    private static final AtomicBoolean loaded = new AtomicBoolean();

    public static void load() {
        if (loaded.getAndSet(true)) return;

        var arch = switch (CpuArchitecture.get()) {
            case AARCH64 -> "aarch64";
            case ARM -> "arm";
            case X86 -> "x86";
        };
        var resourcePath = "rapier/" + switch (CpuPlatform.get()) {
            case LINUX -> "linux_" + arch + "/librapier_ffi.so";
            case WINDOWS -> "windows_" + arch + "/rapier_ffi.dll";
            case MACOS -> "macos_" + arch + "/librapier_ffi.dylib";
        };

        try (@Nullable var resourceIn = Rapier.class.getClassLoader().getResourceAsStream(resourcePath)) {
            if (resourceIn == null) {
                throw new RuntimeException("No native library in JAR at " + resourcePath);
            }
            var libFile = Files.createTempFile("rapier", null);
            Files.copy(resourceIn, libFile, StandardCopyOption.REPLACE_EXISTING);
            System.load(libFile.toAbsolutePath().toString());
        } catch (RuntimeException | IOException ex) {
            throw new RuntimeException("Could not load native library from " + resourcePath, ex);
        }
    }

    public static <T extends Droppable, R> R use(T obj, Function<T, R> fn) {
        R res;
        try {
            res = fn.apply(obj);
        } finally {
            obj.drop();
        }
        return res;
    }

    public enum CpuPlatform {
        LINUX,
        WINDOWS,
        MACOS;

        public static CpuPlatform get() {
            var os = System.getProperty("os.name").toLowerCase(Locale.ROOT);

            if (os.contains("linux")) return LINUX;
            if (os.contains("windows")) return WINDOWS;
            if (os.contains("mac os x") || os.contains("darwin")) return MACOS;

            throw new RuntimeException("Unsupported OS '" + System.getProperty("os.name") + "'");
        }
    }

    public enum CpuArchitecture {
        AARCH64,
        ARM,
        X86;

        public static CpuArchitecture get() {
            var arch = System.getProperty("os.arch")
                    .toLowerCase(Locale.ROOT)
                    .replaceAll("[^a-z0-9]+", "");

            return switch (arch) {
                case "aarch64" -> AARCH64;
                case "arm", "arm32" -> ARM;
                case "x8664", "amd64", "ia32e", "em64t", "x64" -> X86;
                default -> throw new RuntimeException("Unsupported architecture '" + System.getProperty("os.arch") + "'");
            };
        }
    }
}
