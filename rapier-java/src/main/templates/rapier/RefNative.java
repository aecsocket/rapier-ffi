package rapier;

import java.lang.foreign.MemoryAddress;

public non-sealed abstract class RefNative extends BaseNative {
    protected final MemoryAddress self;

    protected RefNative(MemoryAddress memory) {
        this.self = memory;
    }

    @Override
    public MemoryAddress memory() {
        return self;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof RefNative nt)) return false;
        return self.equals(nt.self);
    }

    @Override
    public int hashCode() {
        return self.hashCode();
    }
}
