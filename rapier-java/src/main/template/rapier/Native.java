package rapier;

import java.lang.foreign.MemorySegment;

public abstract class Native {
    protected final MemorySegment self;

    protected Native(MemorySegment memory) {
        this.self = memory;
    }

    public MemorySegment memory() {
        return self;
    }
}
