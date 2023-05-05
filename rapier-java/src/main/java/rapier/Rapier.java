package rapier;

import java.util.concurrent.atomic.AtomicBoolean;

public final class Rapier {
    private static final AtomicBoolean loaded = new AtomicBoolean();

    public static void load() {
        if (loaded.getAndSet(true)) return;

        System.loadLibrary("rapier_ffi");
    }
}
