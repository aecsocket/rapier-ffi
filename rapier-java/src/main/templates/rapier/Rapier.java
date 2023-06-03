package rapier;

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

        var platform = CpuPlatform.get();
        var resourcePath = "rapier/" + switch (platform) {
            case LINUX -> "linux_x86/librapier_ffi.so";
            case WINDOWS -> "windows_x86/rapier_ffi.dll";
            case MACOS -> "macos_x86/librapier_ffi.dylib";
        };

        try (var resourceIn = Rapier.class.getClassLoader().getResourceAsStream(resourcePath)) {
            if (resourceIn == null) {
                throw new RuntimeException("No native library in JAR at " + resourcePath);
            }
            var libFile = Files.createTempFile("rapier", null);
            Files.copy(resourceIn, libFile, StandardCopyOption.REPLACE_EXISTING);
            System.load(libFile.toAbsolutePath().toString());
        } catch (IOException ex) {
            throw new RuntimeException("Could not load native library", ex);
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
}
