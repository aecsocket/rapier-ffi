package rapier;

import java.lang.foreign.MemorySegment;

public non-sealed abstract class RefNative extends BaseNative {
    protected final MemorySegment self;

    protected RefNative(MemorySegment memory) {
        this.self = memory;
    }

    @Override
    public MemorySegment memory() {
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
