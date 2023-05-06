package rapier;

import java.lang.foreign.MemorySegment;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class DroppableNative extends Native implements Droppable {
    private final AtomicBoolean dropped = new AtomicBoolean();

    protected DroppableNative(MemorySegment memory) {
        super(memory);
    }

    protected abstract void dropInternal();

    @Override
    public void drop() {
        if (dropped.getAndSet(true))
            throw new IllegalStateException("Native resource is already dropped");
        dropInternal();
    }
}
