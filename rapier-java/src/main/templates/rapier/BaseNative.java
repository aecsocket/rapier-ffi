package rapier;

import java.lang.foreign.MemorySegment;

public abstract class BaseNative implements Native {
    protected final MemorySegment self;

    protected BaseNative(MemorySegment memory) {
        this.self = memory;
    }

    @Override
    public MemorySegment memory() {
        return self;
    }

    @Override
    public String toString() {
        return "%s@0x%x".formatted(getClass().getSimpleName(), memory().address());
    }
}
