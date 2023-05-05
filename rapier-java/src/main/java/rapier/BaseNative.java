package rapier;

import java.lang.foreign.MemorySegment;

public class BaseNative implements Native {
    protected final MemorySegment self;

    protected BaseNative(MemorySegment memory) {
        this.self = memory;
    }

    @Override
    public MemorySegment memory() {
        return self;
    }
}
