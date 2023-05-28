package rapier;

import java.util.concurrent.atomic.AtomicBoolean;

public final class DropFlag {
    private final AtomicBoolean dropped = new AtomicBoolean();

    public void drop(Runnable onDrop) {
        if (dropped.getAndSet(true))
            throw new IllegalStateException("Native resource is already dropped");
        onDrop.run();
    }
}
