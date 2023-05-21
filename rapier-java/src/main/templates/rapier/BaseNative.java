package rapier;

import java.lang.foreign.MemoryAddress;

public abstract class BaseNative implements Native {
    protected final MemoryAddress self;

    protected BaseNative(MemoryAddress memory) {
        this.self = memory;
    }

    @Override
    public MemoryAddress memory() {
        return self;
    }

    @Override
    public String toString() {
        return "%s@0x%x".formatted(getClass().getSimpleName(), memory().toRawLongValue());
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof BaseNative nt)) return false;
        return self.equals(nt.self);
    }

    @Override
    public int hashCode() {
        return self.hashCode();
    }
}
